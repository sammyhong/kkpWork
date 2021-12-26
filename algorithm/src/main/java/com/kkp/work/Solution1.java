package com.kkp.work;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution1 {
	// 1. 시작 ~ 종료 시간 입력 받아 시간 차이 분으로 출력하기
	public long Solution1() throws Exception {
		System.out.println("시작 시간 입력 (ex - 10:00)");
		Scanner sc = new Scanner(System.in);
	    String start_time = sc.nextLine();
	     
	    System.out.println("종료 시간 입력 (ex - 10:00)");
	    String end_time = sc.nextLine();
		
		// Date 형태로 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date staT = sdf.parse(start_time);
		Date endT = sdf.parse(end_time);

		// 1000 밀리세컨즈 단위로 연산
		long timeDifferent = endT.getTime() - staT.getTime();
		long result = 0;

		// 하루가 지난 경우 판단
		if (staT.compareTo(endT) > 0) {
			result = timeDifferent/60000 + 1440;
		} else {
			result = timeDifferent/60000;
		}
		
		System.out.println(result + "분");
		return result;
	}
}
