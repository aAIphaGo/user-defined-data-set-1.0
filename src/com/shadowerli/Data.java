package com.shadowerli;

import java.util.ArrayList;

public class Data {
	int sum;
	Data(int sum){
		this.sum=sum;
	}
	public ArrayList<String> create() {
		ArrayList<String> data=new ArrayList<String>();
		//自定义日期库
		String datasort[]= {"2018-1-1","2018-1-2","2018-1-3","2018-1-4","2018-1-5","2018-1-6"};
		try {
			int  avg=sum/6;                        //定义一个数来平均分配日期
			for(int a=0,i=-1;a<=sum-1;a++){       //因为0是必定可以被整除的所以i初始值为-1
				if(a%avg==0) {
					i++;
				}
			if(i>5){i=5;}
			data.add(String.valueOf(datasort[i]));	//日期库从0开始
		    }
		} 
		catch (Exception e) {
			System.out.println(e.getMessage()+"sum的值至少为6");
		}
		
		return data;
	}
}
