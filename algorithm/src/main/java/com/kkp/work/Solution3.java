package com.kkp.work;

import java.util.Scanner;

public class Solution3 {
	
	// 3. 조건을 입력 받아 회전
	public int Solution3() {
		
		System.out.println("가로열 입력 ex-3");
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.nextLine());
		
		System.out.println("세로 입력 ex-3");
		int h = Integer.parseInt(sc.nextLine());
		
		System.out.println("배열 데이터 입력 ex-1,2,3,4,5,6,7,8,9");
		String str_arr = sc.nextLine();
		String[] init_arr = str_arr.split(",");
		
		System.out.println("회전명령어 ex-RLT");
		String order = sc.nextLine();
		String[] ord = order.split("");
		
		System.out.println("출력할 배열 위치 ex-1,3");
		String loc = sc.nextLine();
		String[] lo = loc.split(",");
		
		int[][] arr = new int[h][w];
		
		int count = 0;
		for (int i = 0 ; i < h ; i++) {
			for (int j = 0 ; j < w ; j++) {
				count += 1;
				arr[i][j] = Integer.parseInt(init_arr[count-1]);
			}
		};
		
		int[][] tempArr = arr;
		for ( int i = 0 ; i < ord.length ; i++ ) {
			tempArr = getRotation(arr, ord[i]);
			arr = tempArr;
		}
		
		int sta = Integer.parseInt(lo[1])-1;
		int end = Integer.parseInt(lo[0])-1;
		
		// 결과값 출력
		System.out.println(arr[sta][end]);
		return arr[sta][end];
	   
	};
	
	// 회전 명령 수행 메소드 
	public static int[][] getRotation(int[][] arr, String ord) {
		int[][] lotation = new int [arr[0].length][arr.length];
		
		if ( ord.equals("R") ) {
			lotation = new int [arr[0].length][arr.length];
		    int n = arr.length;
		    
		    for(int i=0; i<arr[0].length; i++){ // 오른쪽 회전
		        for(int j = 0; j<arr.length; j++){
		        	lotation[i][j] = arr[n-j-1][i];
		        }
		    }
		}
		else if ( ord.equals("L") ) { // 왼쪽 회전
		    lotation = new int [arr[0].length][arr.length];
		    int n = arr[0].length;
		    
		    for(int i=0; i<arr[0].length; i++){
		        for(int j = 0; j<arr.length; j++){
		        	lotation[i][j] = arr[j][n-i-1];
		        }
		    }
		}
		else if ( ord.equals("T") ) { // 뒤집기
		    lotation = new int [arr.length][arr[0].length];
		    int n = arr[0].length;
		    for(int i=0; i < arr.length; i++){
		        for(int j = 0; j < arr[0].length; j++){  
	                lotation[i][j] = arr[i][n-j-1];
	            }
	        }
		}
		
		return lotation;
		
	};
	
}
