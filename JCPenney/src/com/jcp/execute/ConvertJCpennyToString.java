package com.jcp.execute;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcp.objs.AirMattresses;
import com.jcp.objs.Bases;
import com.jcp.objs.BlindsNShades;
import com.jcp.objs.ChairsNRecliners;
import com.jcp.objs.CurtainsNDaipers;
import com.jcp.objs.JCPenney;
import com.jcp.objs.Serene;
import com.jcp.objs.Sofas;
import com.jcp.objs.WaterColorFloral;
import com.jcp.objs.main.ForTheHome;
import com.jcp.objs.main.Furniture;
import com.jcp.objs.main.HomeInspiration;
import com.jcp.objs.main.Mattresses;
import com.jcp.objs.main.Windows;

public class ConvertJCpennyToString {

	
	public static JCPenney buildObjects() {
		
		JCPenney jp=new JCPenney();
		ForTheHome fr=new ForTheHome();
		Furniture fur=new Furniture();
		Mattresses mar=new Mattresses();
		Windows ws=new Windows();
		HomeInspiration hm=new HomeInspiration();
		
		//For Furniture
		List<Sofas> sofas=new ArrayList<>();
		Sofas sf1=new Sofas();
		Sofas sf2=new Sofas();
		sf1.setName("sofa1");
		sf2.setName("sofa2");
		sofas.add(sf1);
		sofas.add(sf2);
		
		List<ChairsNRecliners> chairsNRecliners=new ArrayList<>();
		ChairsNRecliners cf1=new ChairsNRecliners();
		ChairsNRecliners cf2=new ChairsNRecliners();
		cf1.setName("CN1");
		cf2.setName("CN2");
		chairsNRecliners.add(cf1);
		chairsNRecliners.add(cf2);
		fur.setSofas(sofas);
		fur.setChairsNRecliners(chairsNRecliners);
		
		//For Mattresses
		List<AirMattresses> airMattresses=new ArrayList<>();
		
		AirMattresses a1=new AirMattresses();
		AirMattresses a2=new AirMattresses();
		a1.setName("AR1");
		a2.setName("AR2");
		airMattresses.add(a1);
		airMattresses.add(a2);
		
		List<Bases> bases=new ArrayList<>();
		
		Bases b1=new Bases();
		Bases b2=new Bases();
		b1.setName("B1");
		b2.setName("B2");
		bases.add(b1);
		bases.add(b2);
		mar.setAirMattresses(airMattresses);
		mar.setBases(bases);
		
		
		//For Windows
		 List<CurtainsNDaipers> curtainsNDaipers=new ArrayList<>();
		 CurtainsNDaipers c1=new CurtainsNDaipers();
		 CurtainsNDaipers c2=new CurtainsNDaipers();
		 
		c1.setName("C1");
		c2.setName("C2");
		
		curtainsNDaipers.add(c1);
		curtainsNDaipers.add(c2);
		
		 List<BlindsNShades> blindsNShades=new ArrayList<>();
		 BlindsNShades bb1=new BlindsNShades();
		 BlindsNShades bb2=new BlindsNShades();
		 bb1.setName("BS1");
		 bb2.setName("BS2");
		 blindsNShades.add(bb1);
		 blindsNShades.add(bb2);
		 
		 ws.setBlindsNShades(blindsNShades);
		 ws.setCurtainsNDaipers(curtainsNDaipers);
		 
		 //For HomeInspiration
		 List<Serene> serenes=new ArrayList<>();
		 
		 Serene s1=new Serene();
		 Serene s2=new Serene();
		 s1.setName("SREN1");
		 s2.setName("SEREN2");
		 
		 serenes.add(s1);
		 serenes.add(s2);
		 
		 List<WaterColorFloral> colorFlorals=new ArrayList<>();
		 
		 WaterColorFloral w1=new WaterColorFloral();
		 w1.setName("WATERC1");
		 WaterColorFloral w2=new WaterColorFloral();
		 w2.setName("WATERC12");
		 colorFlorals.add(w1);
		 colorFlorals.add(w2);
		 
		 hm.setSerene(serenes);
		 hm.setWaterColorFloral(colorFlorals);
		 
		 //forthehome
		 
		 fr.setFurniture(fur);
		 fr.setHomeInspiration(hm);
		 fr.setWindows(ws);
		 fr.setMattresses(mar);
		 
		 jp.setForTheHome(fr);
		 
		return jp;
	}
	
	public static void main(String[] args) throws IOException {
		
		JCPenneyParent jjp=new JCPenneyParent();
		
		JCPenney jc=ConvertJCpennyToString.buildObjects();
		
		jjp.setJCPenney(jc);
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonInString = objectMapper.writeValueAsString(jjp);
		System.out.println(jsonInString);
		objectMapper.writeValue(new File("G:\\jcPenny.json"), jjp);
		
		System.out.println("JSON SUCCESSFULLY CREATED");

	}
}
