package com.shadowerli;

import java.util.ArrayList;

public class Data {
	int sum;
	Data(int sum){
		this.sum=sum;
	}
	public ArrayList<String> create() {
		ArrayList<String> data=new ArrayList<String>();
		//�Զ������ڿ�
		String datasort[]= {"2018-1-1","2018-1-2","2018-1-3","2018-1-4","2018-1-5","2018-1-6"};
		try {
			int  avg=sum/6;                        //����һ������ƽ����������
			for(int a=0,i=-1;a<=sum-1;a++){       //��Ϊ0�Ǳض����Ա�����������i��ʼֵΪ-1
				if(a%avg==0) {
					i++;
				}
			if(i>5){i=5;}
			data.add(String.valueOf(datasort[i]));	//���ڿ��0��ʼ
		    }
		} 
		catch (Exception e) {
			System.out.println(e.getMessage()+"sum��ֵ����Ϊ6");
		}
		
		return data;
	}
}
