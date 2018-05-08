package com.jcp.objs.main;

import java.util.List;

import com.jcp.objs.BlindsNShades;
import com.jcp.objs.CurtainsNDaipers;

public class Windows {

	private List<CurtainsNDaipers> CurtainsNDaipers;
	
	private List<BlindsNShades> BlindsNShades;

	public List<CurtainsNDaipers> getCurtainsNDaipers() {
		return CurtainsNDaipers;
	}

	public void setCurtainsNDaipers(List<CurtainsNDaipers> curtainsNDaipers) {
		CurtainsNDaipers = curtainsNDaipers;
	}

	public List<BlindsNShades> getBlindsNShades() {
		return BlindsNShades;
	}

	public void setBlindsNShades(List<BlindsNShades> blindsNShades) {
		BlindsNShades = blindsNShades;
	}
	
	
}
