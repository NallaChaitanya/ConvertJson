package com.sel.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJsonString2 {

	public static void main(String[] args) throws IOException {
		
		
		/*
		 * Kid Done
		 */
		//firends
		Friends f=new Friends();
		f.setName("Kriss|John|Martin|Steven");
		
		//Kid 
		Kid k=new Kid();
		k.setName("Steve JR");
		List<Friends> f1=new ArrayList<>();
		f1.add(f);
		k.setFriends(f1);
		
		//GFKID
		GrandFathersKid gfk=new GrandFathersKid();
		gfk.setgFKName("Steve JR");
		
		List<Kid> kid=new ArrayList<>();
		kid.add(k);
		gfk.setKid(kid);
		
		
		//GrandFathers
		GrandFathers gf=new GrandFathers();
		
		gf.setgFName("Steve");
		
		List<GrandFathersKid> gfkL=new ArrayList<>();
		
		gfkL.add(gfk);
		gf.setGrandfathersKid(gfkL);
		
		
		//Countries;
		Countries cs=new Countries();
		cs.setName("USA");
		List<GrandFathers> gfsKL=new ArrayList<>();
		gfsKL.add(gf);
		cs.setGrandfathers(gfsKL);
		
		
		//Countires Parent
		
		CountiresParent cp=new CountiresParent();
		List<Countries> c=new ArrayList<>();
		c.add(cs);
		cp.setCountries(c);
		
		
		
		//JSon
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonInString = objectMapper.writeValueAsString(cp);
		System.out.println(jsonInString);
		objectMapper.writeValue(new File("G:\\countires.json"), cp);
		
		System.out.println("JSON SUCCESSFULLY CREATED");
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
