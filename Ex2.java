package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		String name;
		int math_score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next(); //string�� �׳� next�� �صε�
		
		
		System.out.print("���� �������Է��ϼ���: ");
		math_score = sc.nextInt();

		
		System.out.println("�̸�: "+name + ", ��������: "+math_score);
		
		sc.close();
		

	}

}
