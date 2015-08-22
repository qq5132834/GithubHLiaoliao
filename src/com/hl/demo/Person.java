package com.hl.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Administrator
 * 个人基本信息
 * */
public  class Person{

	private String name ="";//名字
	private String sex = "";//性别
	private String id = ""; //身份证
	private int age = -1;   //年龄
	private List<String> address = new ArrayList<String>(); //联系地址
	private List<String> telphone = new ArrayList<String>();//常用电话
	
	private Set<String> sets=new HashSet<String>();  
	private Properties properties=new Properties();  
    private Map<String, String> maps=new HashMap<String, String>();  

    
    
	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<String> getTelphone() {
		return telphone;
	}

	public void setTelphone(List<String> telphone) {
		this.telphone = telphone;
	}
}
