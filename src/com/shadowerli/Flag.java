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
		//������ɵ�����
	    String name[]=new String[flagnum];
	    for(int a=0;a<=flagnum-1;a++) {
	    	//��0��ʼ����flag
	    	nameid=String.valueOf(a);
	    	name[a]=nameid;
	    }
		//������������������id  
		for(int a=0;a<=sum-1;a++) {
			list.add(name[(int)(Math.random()*flagnum)]);
		}
		return  list;
	}
}
