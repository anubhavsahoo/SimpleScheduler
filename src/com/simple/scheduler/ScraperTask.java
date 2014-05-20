/**
 * 
 */
package com.simple.scheduler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.simple.scheduler.dm.LandingResults;
import com.simple.scheduler.util.JsonUtils;
import com.simple.scheduler.util.JsonUtilsException;

/**
 * @author loneranger
 * 
 */
public class ScraperTask<T> implements Runnable {
	private String url;
	Class<T> clazz;

	public ScraperTask(String url, Class<T> jsonClazz) {
		super();
		this.url = url;
		this.clazz = jsonClazz;
	}

	@Override
	public void run() {
		System.out.println("Running task at: " + System.currentTimeMillis());
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(this.url);
			HttpResponse response = client.execute(request);
			InputStreamReader inputStream = new InputStreamReader(response
					.getEntity().getContent());
			T obj = JsonUtils.convertFromJson(inputStream, clazz);
			System.out.println(obj.toString());
		} catch (IOException | JsonUtilsException e) {
			e.printStackTrace();
		}
	}

}
