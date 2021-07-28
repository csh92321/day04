package day04if_if;

import java.util.Scanner;

public class Qiuz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//등급 출력
		System.out.println("점수를 입력하세요 : ");
		int score = input.nextInt();
		if (100>=score) {
			if (score>=0) {
				if (score >= 90) {
					System.out.println("A");
				} else if (score >= 80){
					System.out.println("B");
				} else if (score >= 70) {
					System.out.println("C");
				} else if (score >= 60) {
					System.out.println("D");
				} else {
					System.out.println("f");
				}
			}else {
				System.out.println("점수를 잘못 입력하였습니다.");
			}
		}else {
		System.out.println("점수를 잘못 입력하였습니다.");
	}


//짝수홀수
		System.out.println("수를 입력하세요 :");
		int num = input.nextInt();
		if (num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}


//계절
		System.out.println("월을 입력하세요 : ");
		int season = input.nextInt();
		if (13>season && 0<season) {
			if (3<= season && 5 >=season) {
				System.out.println("봄");
			} else if (6<= season && 8>= season) {
				System.out.println("여름");
			} else if (9<= season && 11>= season) {
				System.out.println("가을");
			} else {
				System.out.println("겨울");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

//BMI
		System.out.print("키를 입력하세요 : ");
		double height = input.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = input.nextDouble();
		
		double bmi = weight/(height*height/10000);
		
		if (bmi<18.5) {
			System.out.println("저체중");
		}else if (bmi>=18.5 && bmi<=24.9) {
			System.out.println("정상");
		}else {
			System.out.println("비만");
		}
		
//나이
		System.out.println("나이를 입력하세요 : ");
		int age = input.nextInt();
		
		if (age<=8) {
			System.out.println("1000원");
		} else if (age <= 14) {
			System.out.println("1500원");
		} else if (age <= 17) {
			System.out.println("3000원");
		} else {
			System.out.println("5000원");
		}

	}

}
