package com.shadowerli;

import java.util.ArrayList;


public class Id {
	int idnum;//��ͬ���ֵ�����
	int sum;
	String nameid;
	Id(int idnum,int sum){
		this.idnum=idnum;
		this.sum=sum;		
	}
	public ArrayList<String> create() {
		ArrayList<String> list=new ArrayList<String>();
		//������ɵ�����
	    String name[]=new String[idnum];
	    for(int a=0;a<=idnum-1;a++) {
	    	//����������ɵ��������
	    	nameid=String.valueOf((char)(int)(97+Math.random()*26))+
	    	String.valueOf((char)(int)(97+Math.random()*26))+
	    	String.valueOf((char)(int)(97+Math.random()*26));
	    	name[a]=nameid;
	    }
		//������������������id  
		for(int a=0;a<=sum-1;a++) {
			list.add(name[(int)(Math.random()*idnum)]);
		}
		return  list;
	}
}
