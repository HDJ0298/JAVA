package chap02;

public class Ex3 {

	public static void main(String[] args) {
		int num = 100;
		
		System.out.println("num: " + num);
		
		num = 123;
		
		System.out.println("num: " + num); //변경가능
		
		//final double PI = 3.141592;  final변수는 한번만 저장가능, 한번저장하면 변경x
		final double PI; //사용하기전에 초기화해주기
		PI = 3.14;
		
		System.out.println("PI: " + PI);
		
		System.out.println("PI: " + 3.141592);

	}

}
