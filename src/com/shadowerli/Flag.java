package com.shadowerli;

import java.util.ArrayList;

public class Flag {
	int flagnum;
	int sum;
	String nameid;
	Flag(int flagnum,int sum){
		this.flagnum=flagnum;
		this.sum=sum;
	}
	
	public ArrayList<String> create() {
		ArrayList<String> list=new ArrayList<String>();
		//存放生成的名字
	    String name[]=new String[flagnum];
	    for(int a=0;a<=flagnum-1;a++) {
	    	//从0开始定义flag
	    	nameid=String.valueOf(a);
	    	name[a]=nameid;
	    }
		//根据名字组合随机生成id  
		for(int a=0;a<=sum-1;a++) {
			list.add(name[(int)(Math.random()*flagnum)]);
		}
		return  list;
	}
}
