// class 클래스명 {
//   .. 클래스 블럭
// }

// 1. 속성(필드)는 변수/상수 이다.
// 2. 행위(메소드/함수)
//    - 리턴타입 메소드/함수명(매개변수)
// 3. 생성자
//    - 클래스명(매개변수){ }
      
      
class PersonClass {
	String name;
	public PersonClass() { } // 기본생성자
	
	// PersonClass는 name 속성을 가진다
	public PersonClass(String name) {
		this.name = name;
	}
	void sayName() {
		System.out.println(name);
	}	
}


//각 클래스가 PersonClass를 상솟받게 하겠다.
//상속의 키워드는 extends
//class 자식클래스명 extends 부모클래스명

class PersonClassA extends PersonClass{
	public PersonClassA(String name) {
		super(name);
		
	}
	void sayName() {
		System.out.println("PersonClassA : "+name+"입니다");
	}
}

class PersonClassB extends PersonClass{
	public PersonClassB(String name) {
		super(name);
}
	void sayName() {
		System.out.println("PersonClassB : "+name+"입니다");
	}
}



// ######### 실행부 #########
// 자바에서는 객체를 생상한다 할 때, new 키워드를 사용한다.
// 클래스 데이터타입 변수명 = new 생성자();

public class Person {
	public static void main(String[] args) {
		
//		PersonClass p = new PersonClass("홍길동");
//		p.sayName();
//		PersonClass p1 = new PersonClass("홍길동");
//		if(p==p1) {
//			System.out.println("p와 p1은 같은 객체");
//		} else {
//			System.out.println("p와 p1은 다른 객체");
//		}
//		
//		String abc = new String("홍길동");
//		String abc_1 = new String("홍길동");
//		if(abc==abc_1) {
//			System.out.println("abc와 abc_1은 같다");
//		} else {
//			System.out.println("abc와 abc_1은 다르다");
//		}
		
		
//		String a = "홍길동";
//		String b = "홍길동";
//		if(a==b) {
//			System.out.println("a와 b는 같다");
//		} else {
//			System.out.println("a와 b는 다르다");
//		}
		
		
		PersonClassA pa = new PersonClassA("홍길동");
		pa.sayName();		
		PersonClassB pb = new PersonClassB("홍길동");
		pb.name = "길동홍";
		pb.sayName();
	}
}
