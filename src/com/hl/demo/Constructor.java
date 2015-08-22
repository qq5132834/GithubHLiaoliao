package com.hl.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Constructor {
	private String str = "";  
	private int i = -1;    
	private List<String> list = new ArrayList<String>();  
	private Set<String> sets=new HashSet<String>();  
	private Properties properties=new Properties();  
    private Map<String, String> maps=new HashMap<String, String>();
    
	public Constructor(String str,int i,List<String> list,Set<String> set, Properties prop , Map<String, String> maps){
    	this.str = str;
    	this.i = i;
    	this.list = list;
    	this.sets = set;
    	this.properties = prop;
    	this.maps = maps;
    }
    
    public void setStr(String str) {
		this.str = str;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getStr() {
		return str;
	}

	public int getI() {
		return i;
	}

	public List<String> getList() {
		return list;
	}

	public Set<String> getSets() {
		return sets;
	}

	public Properties getProperties() {
		return properties;
	}

	public Map<String, String> getMaps() {
		return maps;
	}


    
}
