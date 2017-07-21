package com.tacademy.data;

public class Data {

	private String name;
	private int age;
	private String masterAddress;
	private String hotfix;
	public Data() {
		// TODO Auto-generated constructor stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMasterAddress() {
		return masterAddress;
	}

	public void setMasterAddress(String masterAddress) {
		this.masterAddress = masterAddress;
	}

	public String getHotfix() {
		return hotfix;
	}

	public void setHotfix(String hotfix) {
		this.hotfix = hotfix;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", masterAddress=" + masterAddress + ", hotfix=" + hotfix + "]";
	}





}
