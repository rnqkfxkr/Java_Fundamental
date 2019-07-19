package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		//Customer 객체생성
		//Customer => Object type
		//c1 => reference
		//c1 = new Customer() => c1을 customer클래스의  새로운 Object객체로 생성
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 30;
		c1.email= "syh@hbilab.org";
		c1.phone= "010-3204-1703";
		c1.balance = 23_000_000_000.23;
		c1.isReleased = false;
		
		//c2는 인스턴스 변수
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email= "son@softbank.com";
		c2.phone= "010-9999-0000";
		c2.balance = 45_000_000_000.24;
		c2.isReleased = true;
		
		Customer c3=c2; // 동일한 인스턴스 객체로 인식
		c3.age = 61;
		
		// $%,.2f 달러표시, 천단위마다 콤마 표시, 소숫점 2자리까지 표시
		// %n 줄 넘기기
		System.out.printf("%s,%d,%s,%s,$%,.2f,%s%n", 
				c1.name, c1.age, c1.email, c1.phone,c1.balance, c1.isReleased);
		System.out.printf("%s,%d,%s,%s,$%,.2f,%s", 
				c2.name, c2.age, c2.email, c2.phone,c2.balance, c2.isReleased);
		
	}
}
