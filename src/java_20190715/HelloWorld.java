package java_20190715;
//파일 새로만들기 => ctl + n
//편집기 확장 => ctl + m
//한줄 복사후 아래로 붙여넣기 => ctl + alt + ↓
//한줄 지우기 => ctl + d
//현재 줄 내리기 => alt + ↓
public class HelloWorld {
	public static void main(String[] args) {
		String a = "Hi";
		String b = "Hello World";
		String c = a+b;
		System.out.println(c);
		
		Man mano = new Man(30,175,65);
		mano.age = 30;
		System.out.println(mano.ch());
		mano.h = 165;
		System.out.println(mano.ch());
		
		
		Man mant = new Man();
		mant.age = 28;
	}
}

class Man{
	int age;
	int h;
	int w;
	
	Man()
	{
		age = 1;
		h = 0;
		w = 0;		
		System.out.println("age, h, w");
	}
	
	
	public Man(int age, int h, int w)
	{
		this.age =age;
		this.h = h;
		this.w = w;
		System.out.println("초기화2");
	}
	
	String ch(){
		if(h-w>=105)
			return "ok";
		else
			return "hmm";
	}
}