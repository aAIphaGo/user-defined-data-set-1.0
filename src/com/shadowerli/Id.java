package com.shadowerli;

import java.util.ArrayList;


public class Id {
	int idnum;//不同名字的数量
	int sum;
	String nameid;
	Id(int idnum,int sum){
		this.idnum=idnum;
		this.sum=sum;		
	}
	public ArrayList<String> create() {
		ArrayList<String> list=new ArrayList<String>();
		//存放生成的名字
	    String name[]=new String[idnum];
	    for(int a=0;a<=idnum-1;a++) {
	    	//生成随机生成的名字组合
	    	nameid=String.valueOf((char)(int)(97+Math.random()*26))+
	    	String.valueOf((char)(int)(97+Math.random()*26))+
	    	String.valueOf((char)(int)(97+Math.random()*26));
	    	name[a]=nameid;
	    }
		//根据名字组合随机生成id  
		for(int a=0;a<=sum-1;a++) {
			list.add(name[(int)(Math.random()*idnum)]);
		}
		return  list;
	}
}
