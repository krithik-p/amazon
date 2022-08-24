package com.example.model;

import java.util.List;

public class Devices {
	List<Device> devices;
	String brandName = "Samsung";
	
	
	public Devices() {
		super();
	}
	public Devices(List<Device> devices, String brandName) {
		super();
		this.devices = devices;
		this.brandName = brandName;
	}
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@Override
	public String toString() {
		return "Devices [devices=" + devices + ", brandName=" + brandName + "]";
	}
	
	
	
}
