package com.jcp.objs.main;

import java.util.List;

import com.jcp.objs.ChairsNRecliners;
import com.jcp.objs.Sofas;

public class Furniture {

	
	private List<Sofas> Sofas;
	
	private List<ChairsNRecliners> ChairsNRecliners;

	public List<Sofas> getSofas() {
		return Sofas;
	}

	public void setSofas(List<Sofas> sofas) {
		Sofas = sofas;
	}

	public List<ChairsNRecliners> getChairsNRecliners() {
		return ChairsNRecliners;
	}

	public void setChairsNRecliners(List<ChairsNRecliners> chairsNRecliners) {
		ChairsNRecliners = chairsNRecliners;
	}
	
	
}
