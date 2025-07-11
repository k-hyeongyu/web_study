package com.app.controller.study.side_conception;

import java.util.*;

public class MyModel {

	Map<String, Object> model;
	
	public MyModel() {
		model = new HashMap<String, Object>();
	}
	
	public void addAttribute(String key, Object value) {
		model.put(key, value);
	}
}
