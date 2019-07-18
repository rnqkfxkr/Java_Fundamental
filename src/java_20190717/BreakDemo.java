package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
        int sum = 0;
		for(int i = 1 ; i<=10 ; i++ ) {
	        if(i == 6) continue; // 기재된 숫자를 제외
	        { 
			sum = sum + i ;
	        }    
	    }
		System.out.printf("6을 제외한 1부터 10까지의 합은 %d 입니다" , sum );
	


        outter: for(int first =2; first <= 9; first++ ) {
           for(int second = 1; second <=9;second++ ) {
        	   if(second ==8) continue outter; // outter 끼면 그 이상의 숫자는 전부 배제, outter 지우면 해당 숫자만 제외 
        	   System.out.printf("%d * %d = %d%n", first, second, first*second );
           }
        }
	}
}