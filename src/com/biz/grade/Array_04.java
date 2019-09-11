package com.biz.grade;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
		    intNum[i] = 100;
		    
		    intNum[i] = rnd.nextInt(100) + 1;
		    
		    
		 System.out.println(intNum[i]);
		 
		for(int j = 0 ; j < intNum.length; j++) {
			
			int[] intNums;
			
		}
			
			int r;
			
			if(r < 2) {
				continue;
			}	
				
			for(int i = 2 ; i < intNum.length ; i++) {
				if(r % i == 0);
				break;
			}
			 
			if(i >= r) {
				System.out.println(i + "2번재 소수 : " + r);
				System.out.println(i + "3번재 소수 : " + r);
				System.out.println(i + "4번재 소수 : " + r);
		 }	
			
		  
		  
		  
			
			  
		}
		  
	
		  
	
					
	
		
		
		

	}

}
