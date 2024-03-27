package com.gl.dsa.assessment1.domain;

import java.util.List;

public class FloorBuilder {

	private int totalFloors;
	private List<Integer> floorList;

	public FloorBuilder() {
		super();
	}

	public int getTotalFloors() {
		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public List<Integer> getFloorList() {
		return floorList;
	}

	public void setFloorList(List<Integer> floorList) {
		this.floorList = floorList;
	}

}
