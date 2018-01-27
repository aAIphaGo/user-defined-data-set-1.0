package com.shadowerli;

import java.io.File;
import java.io.FileWriter;

public class Test {

	public static void main(String[] args) throws Exception{
	    File a=new File(System.getProperty("user.dir"));
	    System.out.println(a);
        FileWriter m=new FileWriter(a+"result.txt");
        m.write("df");
        m.close();

}
}