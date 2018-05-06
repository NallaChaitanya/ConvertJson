package com.sel.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertString {
	
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		User u=new User();
		Employee ee=new Employee();
		ee.setId("11");
		ee.setName("ME");
		u.setAge(15);
		u.setName("Chaitanya");
		List<String> ls=new ArrayList<String>();
		ls.add("HAI");
		ls.add("BOSS");
		u.setMessages(ls);
		u.setEmployee(ee);
		
		String jsonInString = objectMapper.writeValueAsString(u);
		System.out.println(jsonInString);
		objectMapper.writeValue(new File("G:\\user.json"), u);
		
		System.out.println("JSON SUCCESSFULLY CREATED");
	}

}
