package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerDeatils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Enter required no.of customers:" + i );
          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          try {
			int i=br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("Enter name:");
          try {
			String name=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("Enter mailID:");
          try {
			String email=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("Enter phonenNo:");
         try {
			int phone= br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         /* System.out.println("Entered details are:");
          System.out.println("name:" + name);
          System.out.println("Email:" + email);
          System.out.println("Phone:" + phone);*/
	
	
	
	
	
	
	}

}
