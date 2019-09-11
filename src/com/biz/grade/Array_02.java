package com.biz.grade;

public class Array_02 {

	public static void main(String[] args) {
		
		int[] intKor = new int[50];
		int[] intEng = new int[50];
		
	    Random rnd = new Random();
	    
	    for(int i = 0 ; i < intEng.length ; i++) {
	    	rnd.nextInt(100);
	    	
	    	int num = rnd.nextInt(100) + 1;
	    	
	    	
	    	// 51 ~ 100까지 숫자 1개를 생성하라
	    	intKor[i] = rnd.nextInt(51) + 1;
	    	
	    	// 1 ~ 100까지 숫자 1개를 생성
	    	intEng[i] = rnd.nextInt(100) + 1;
	    	
	    	
	    	
	    }
	    
	    System.out.println("===================");
	    System.out.println("   kor|t   ENG");
	    System.out.println("-------------------");
	    
	    int intKorTotal = 0;
	    int intEngTotal = 0;
	    for(int i = 0 ; i < intKor.length ; i++) {
	    	System.out.println(intKor[i] + "|t + intEng[i]);"
	        // intKorTotal 변수에 intKor 배열의 모든 값을
	    	// 더하라
	    	// intKorTotal = intKor[0] +	
	    }
	}

}
