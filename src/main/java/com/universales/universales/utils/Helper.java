package com.universales.universales.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Helper {
    public ResponseEntity<?> sendResponse(int code, Object p) {

		String error = "ERROR";
		Map<String, Object> r = new HashMap<>();

		switch (code) {
		case 400:
			r.put("code", 400);
			r.put("msg", "Sintaxis incorrecta");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.BAD_REQUEST);
		case 401:
			r.put("code", 401);
			r.put("msg", "Falta Autorización");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.UNAUTHORIZED);
		case 403:
			r.put("code", 403);
			r.put("msg", "Forbidden");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.FORBIDDEN);
		case 404:
			r.put("code", 404);
			r.put("msg", "Not found");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.NOT_FOUND);
		case 204:
			r.put("code", 204);
			r.put("msg", "No content");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.NO_CONTENT);
		case 200:
			r.put("code", 200);
			r.put("msg", "Ok");
			r.put("data", p);
			r.put("type", "SUCCES");
			return new ResponseEntity<>(r, HttpStatus.OK);
		default:
			r.put("code", 500);
			r.put("msg", "Server Error");
			r.put("data", null);
			r.put("type", error);
			return new ResponseEntity<>(r, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
