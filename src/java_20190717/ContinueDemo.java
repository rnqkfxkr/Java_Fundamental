package java_20190717;
//성영한
public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		
		test:for(int i = 1 ; i<=10 ; i++) {
			if(i==6) ;
			sum = sum + i;
		}
		System.out.printf("1부터 10까지  합은 %d 입니다.%n", sum);
		
		//if(true) return;
		
		outter:for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9;second++) {
				if(second==5) continue ; // outter 사용시 해당 숫자가 데드라인,   outter 제거시 해당 숫자만 제외
				System.out.printf("%d * %d = %d%n", 
						first, second, first*second);
			}
		}
	
		
		
	
	}
}
