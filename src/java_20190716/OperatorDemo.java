package java_20190716;

// ctl + shift + f => 자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		d = (double) b / (double) a;
		System.out.println(d);

		c = b % a;
		System.out.println(c);

		a += b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		++a;
		++b;
		System.out.println(c);

		c = a++;
		
		//대입 후 증가 
		a++;
		b++;
        
		//증가 후 대입
		c = ++b;
		System.out.println(c);

		System.out.println(++a);
		System.out.println(++b);
		
	
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a > b;
        System.out.println(isSuccess);
        
        isSuccess = a < b;
        System.out.println(isSuccess);
        
        isSuccess = a >=b;
        System.out.println(isSuccess);
	
        isSuccess  = a == b;
        System.out.println(isSuccess);
        
        isSuccess = a != b; 
        System.out.println(isSuccess);

        // a && b => a가 false일 때 B는 연산을 실시 하지 않는다 (short circuit) 어차피 거짓이니까
        // a || b => a가 true일 경우 B 연산을 실시하지 않는다 (short circuit) 어차피 참이니까
        
        isSuccess = (a==b) && (a++ == b ++);

        System.out.println(!isSuccess);
        System.out.println(a);
        System.out.println(b);
        
	}
}



