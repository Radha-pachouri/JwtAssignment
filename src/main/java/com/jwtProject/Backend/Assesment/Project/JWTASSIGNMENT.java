package com.jwtProject.Backend.Assesment.Project;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class JWTASSIGNMENT {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(JWTASSIGNMENT.class, args);

		URL url = null;
		HttpURLConnection connection = null;
		Integer responseCode = 0;

		String urlString = "https://api.publicapis.org/entries";

		try{
			url = new URL(urlString);
		}catch (Exception e){
			System.out.println("problem in url");
		}
//  connection

		try {
			connection = (HttpURLConnection) url.openConnection();
			responseCode = connection.getResponseCode();
		}catch (Exception e){
			System.out.println("problem in connection");
		}

		if(responseCode == 200){
			InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
			BufferedReader reader = new BufferedReader(inputStreamReader);
			StringBuilder stringBuilder = new StringBuilder();
			String readData = null;

			while ((readData = reader.readLine()) != null){
				stringBuilder.append(readData);
			}
			System.out.println(stringBuilder.toString());
			JSONObject jsonObject = new JSONObject(stringBuilder.toString());

			System.out.println(jsonObject.toString());

		}else{
			System.out.println("server problem");
		}
	}



}
