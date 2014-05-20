package com.simple.scheduler.util;

import java.io.Reader;

import com.google.gson.Gson;

/**
 * 
 * @author loneranger
 * 
 */
public class JsonUtils {
	private static Gson GSON = new Gson();

	public static String convertToJson(Object obj, Class<?> clazz)
			throws JsonUtilsException {
		String jsonString;
		try {
			jsonString = GSON.toJson(obj, clazz);
		} catch (Exception e) {
			throw new JsonUtilsException(e);
		}
		return jsonString;
	}

	public static <T> T convertFromJson(String json, Class<T> clazz)
			throws JsonUtilsException {
		try {
			T obj = GSON.fromJson(json, clazz);
			return obj;
		} catch (Exception e) {
			throw new JsonUtilsException(e);
		}
	}

	public static <T> T convertFromJson(Reader jsonStream, Class<T> clazz)
			throws JsonUtilsException {
		try {
			T obj = GSON.fromJson(jsonStream, clazz);
			return obj;
		} catch (Exception e) {
			throw new JsonUtilsException(e);
		}
	}
	public static String convertToJson(Object obj) throws JsonUtilsException {
		String jsonString;
		try {
			jsonString = GSON.toJson(obj);
		} catch (Exception e) {
			throw new JsonUtilsException(e);
		}
		return jsonString;
	}

}
