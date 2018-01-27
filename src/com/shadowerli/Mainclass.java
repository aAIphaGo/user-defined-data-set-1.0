package com.shadowerli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

public class Mainclass {
	
	static int idnum ;   	//定义不同id的个数
	static int flagnum ; 	//定义不同行为标记的个数
	static int sum ;      	//定义数据集的总行数

	//初始化成员变量
	static {
		ResourceBundle set=ResourceBundle.getBundle("setting");
		idnum=Integer.parseInt(set.getString("idnum"));
		flagnum=Integer.parseInt(set.getString("flagnum"));
		sum=Integer.parseInt(set.getString("sum"));
		}
	

	public static void main(String[] args) throws Exception{
	
		ArrayList<String> flager= new Flag(flagnum,sum).create();
		ArrayList<String> dater= new Data(sum).create();
		ArrayList<String> ider= new Id(idnum,sum).create();
		ArrayList<String> result= new ArrayList<String>();
		
		//将所有结果进行横向组合
		for(int i=0;i<=sum-1;i++) {
			result.add(dater.get(i)+"    "+ider.get(i)+"    "+flager.get(i));
		}

		//在相对路径下生成结果文件
		BufferedWriter bw=new BufferedWriter(new FileWriter("result.txt"));
		Iterator<String> it = result.iterator();  
	        while(it.hasNext()){  
	            bw.write(it.next());
	            bw.newLine();
	            bw.flush();
	        } 
        bw.close();
	}

}
