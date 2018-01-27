package com.shadowerli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

public class Mainclass {
	
	static int idnum ;   	//���岻ͬid�ĸ���
	static int flagnum ; 	//���岻ͬ��Ϊ��ǵĸ���
	static int sum ;      	//�������ݼ���������

	//��ʼ����Ա����
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
		
		//�����н�����к������
		for(int i=0;i<=sum-1;i++) {
			result.add(dater.get(i)+"    "+ider.get(i)+"    "+flager.get(i));
		}

		//�����·�������ɽ���ļ�
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
