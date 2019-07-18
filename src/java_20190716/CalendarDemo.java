package java_20190716;

public class CalendarDemo {
	public static void main(String[] args) {
        /*
		
		- 달력 만들기
        1. 1년 1월 1일 월요일
        2. 1년 365일 이고, 윤년일때에는 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고, 그 중에서 100의 배수는 제외하며 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일 무슨 요일일까요?
		5. 2018년 까지의 총 일수, 11월 까지의 총 일수를 구한다. 25일을 더해서 7로 나눈 나머지가 1일이면 월요일 2이면 화요일
		*/

	    int year = 2020;
	    int month = 3;
	    int day = 15;
	    // preyear => 2018년도
	    int preyear = year - 1;
	    // premonth => 2019년 11월 
	    int premonth = month -1;
	    int totalcount = 0;
	    System.out.println(totalcount);
	    
	    //2018년도까지의 총 일수 구하기 
	    totalcount = preyear * 365 +(preyear/4 - preyear/100 + preyear/400);
	    
	    // 2019년도 11월 까지의 합 구하기
	    totalcount += 31 + 29;
	   
	    totalcount += day;
	    
	    int dayofweek = totalcount % 7;
		String message = null;
		if (dayofweek == 1) {
			message = "월요일";
		} else if (dayofweek == 2) {
			message = "화요일";
		} else if (dayofweek == 3) {
			message = "수요일";
		} else if (dayofweek == 4) {
			message = "목요일";
		} else if (dayofweek == 5) {
			message = "금요일";
		} else if (dayofweek == 6) {
			message = "토요일";
		} else if (dayofweek == 0) {
			message = "일요일";
		}
		System.out.println(year + "년 " + month + "월" + day + "일" + message);

	}
}
