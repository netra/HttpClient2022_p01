package com.apex.core;

import java.io.StringWriter;
import java.util.List;

import org.apache.http.NameValuePair;

import com.apex.User_Test.bean.User;
import com.apex.samples.Staff;
import com.google.gson.Gson;

public class ApexJSONUtil {

	public static String getJSONFromJavaObject(List<NameValuePair> urlParameters1) {

		Gson gson = new Gson();

		// 1. Java object to JSON file
		gson.toJson(urlParameters1, new StringWriter());

		// 2. Java object to JSON string
		String jsonInString = gson.toJson(urlParameters1);
		System.out.println("Java Object to JSON mashalling : "+jsonInString);
		return jsonInString;
	}

	public static User getJavaObjectFromJSON(String jsonstring) {

		Gson gson = new Gson();
		User user = gson.fromJson(jsonstring, User.class);

		return user;

	}

}
