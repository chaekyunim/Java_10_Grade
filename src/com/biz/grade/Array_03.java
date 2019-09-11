package com.biz.grade;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {
		
		int[] intNum = new int[50];	
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = 50;
			
		// 1번
	    // 임의 수를 생성해서
	    // num 변수에 저장했다가
		// num 변수에 저장된 값을
		// 다시 intNum의 i번째 요소에 복사
		intNum[i] = rnd.nextInt(50) + 1;
		
		// 2번
		// 임의 수를 생성해서
		// 직접 intNum에 
		
		int intSum = 0;
		for(int i1 = 0 ; i1 < intNum.length ; i1++) {
			intSum += intNum[i1];
			
			System.out.print("====================");
			System.out.print(i);
			
			// 배열에 저장된 요소들 중에
			// 짝수들의 합은 얼마?
			int intSum = 0;
			for(int i = 0 ; i < intNum.length ; i++) {
				intSum += intNum[i];
			
			}
			System.out.println("짝수들의 합:" + intSum);
		}
		
		
		
		
			
		}
		
		

	}

}
