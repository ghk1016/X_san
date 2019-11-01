package com.bawei.day1031lx.er_san;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadThread  extends Thread{
	public static void main(String[] args) {
		File f = new File("E:\\hahaha.txt");
		try {
			FileReader fr = new FileReader(f);
			int b=0;
			String str="";
			while((b=fr.read())!=-1){
				str+=(char)b;
			}
			System.out.println(str);
			fr.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
		
		File f = new File("E:\\hahaha.txt");
	
		try {
			FileWriter fw= new FileWriter(f);
			
			fw.write(toString());
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}
