package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		String name;
		int math_score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next(); //string은 그냥 next만 해두됨
		
		
		System.out.print("수학 점수를입력하세요: ");
		math_score = sc.nextInt();

		
		System.out.println("이름: "+name + ", 수학점수: "+math_score);
		
		sc.close();
		

	}

}
