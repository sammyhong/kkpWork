package com.kkp.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {
	
	// 4. 마지막 남는 사람 구하기
	public int Solution4() {
		
		System.out.println("총 인원 수 입력");
		Scanner sc = new Scanner(System.in);
		int people = Integer.parseInt(sc.nextLine());
		
		System.out.println("이동할 자리수");
		int mov = Integer.parseInt(sc.nextLine());
		
		int result = 0;
		ArrayList<Integer> arrList = new ArrayList<>();
		
		// 총 인원 수 배열에 담기
		for(int i = 1; i <= people; i++) {
			arrList.add(i);
		}
		// 한 명 남을 때까지 loop
		while(arrList.size() > 1) {
			int offset = 0;

			if(mov%arrList.size() < 1) {
				offset = arrList.size()-1;
			} else {
				offset = mov%arrList.size()-1;
			}

			for(int j = 0 ; j < offset; j++) {
				arrList.add(arrList.size(), arrList.get(0));
				arrList.remove(0);
			}

			arrList.remove(0);
		};
		
		if (!arrList.isEmpty()) {
			result = arrList.get(0); 
		};
		
		System.out.println(result);
		return result;
	};
	
}
