package com.sel.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertString {
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		User u=new User();
		u.setAge(15);
		u.setName("Chaitanya");
		List<String> ls=new ArrayList<String>();
		ls.add("HAI");
		ls.add("BOSS");
		u.setMessages(ls);
		
		String jsonInString = objectMapper.writeValueAsString(u);
		System.out.println(jsonInString);
	}

}
