package com.apex.User_Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.core.ApexBaseTest;
import com.apex.core.ApexHttpUtil;
import com.apex.core.ApexJSONUtil;
import com.apex.core.ApexXLSUtil;
import com.apex.data.NewUser;
import com.apex.data.User;

import com.google.gson.Gson;

public class UserPostAPITest extends ApexBaseTest implements UserConstant{
	
	@Test
	public void testWithCorrectUserID() throws ClientProtocolException, IOException {
		String url = Base_URL + "2";
		
		 List<NameValuePair> urlParameters1 = new ArrayList<NameValuePair>();
		  urlParameters1.add(new BasicNameValuePair("name", "abc"));
		  urlParameters1.add(new BasicNameValuePair("job", "leader"));
		  
			
		HttpResponse response = ApexHttpUtil.sendAndReceivePOSTMessage(url, urlParameters1);
		String result = ApexHttpUtil.getResponseString(response);
		
		ApexJSONUtil.getJSONFromJavaObject(urlParameters1);
		
		String jsonstring =ApexJSONUtil.getJSONFromJavaObject(urlParameters1);
		
		ApexXLSUtil.performBasicValidations(response,201,"Created");
		
		 	
	}
	
	@Test// 
	public void testWithRegisterSuccessful() throws ClientProtocolException, IOException {
		String url = Base_URL + "register";
		
		List<NameValuePair> urlParameters1 = new ArrayList<NameValuePair>();
		  urlParameters1.add(new BasicNameValuePair("email", "eve.holt@reqres.in"));
		  urlParameters1.add(new BasicNameValuePair("password", "pistol"));
		  
         
		HttpResponse response = ApexHttpUtil.sendAndReceivePOSTMessage(url, urlParameters1);
		String result = ApexHttpUtil.getResponseString(response);
		
		ApexXLSUtil.performBasicValidations(response,201,"Created");

	}

}
