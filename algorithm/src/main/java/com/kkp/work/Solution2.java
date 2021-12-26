package com.kkp.work;

import java.util.Scanner;

public class Solution2 {
	// 2.배열 탐색 대각선으로 출력하기
	public String Solution2() {
		
		System.out.println("세로 길이 입력(ex-3)");
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.nextLine());
		
		System.out.println("가로 길이 입력(ex-3)");
		int h = Integer.parseInt(sc.nextLine());
		
		System.out.println("배열 입력(ex-1,2,3,4,5,6,7,8,9)");
		String[] strArr = sc.nextLine().split(",");
		
		int[][] arr = new int[h][w];
		
		// 배열 저장
		int count = 0;
		for (int i = 0 ; i < h ; i++) {
			for (int j = 0 ; j < w ; j++) {
				count += 1;
				arr[i][j] = Integer.parseInt(strArr[count-1]);
			}
		};
		
		// group 생성
		// 세로 길이 * 세로+가로-1 대각선으로 묶은 최대 그룹 수
		int[][] Group = new int[h+w-1][h];
		
		// 대각선으로 그룹 만들기
		for( int i = 0 ; i < h ; i++ ) {
			int cnt = i;
			for( int j = 0 ; j < w ; j++ ) {
				Group[cnt++][j] = arr[i][j];
			}
		} 
		
		String result = "";
		
		for( int i = 0 ; i < h+w-1 ; i++ ) {
			for( int j = 0 ; j < h ; j++ ) {
				// 홀수 그룹만 뒤집어서 문자열 저장
				if(i%2 != 0) {
					if ( Group[i][h-j-1] != 0 ) result += Group[i][h-j-1];
				}else {
					if (Group[i][j] != 0) result += Group[i][j];
				}
			}
		}
		
		System.out.println(result);
		return result;
		
	}
}
