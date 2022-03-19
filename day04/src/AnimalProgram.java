
// 생성자 심화
// 생성자는 리턴타입이 없는 메소드
// 이름은 클래스명과 같아야 한다.
// ex) public Animal(String name){ }
class Animal {
	String strBark;
	
	public Animal() {} // 생성자 오버로딩
	public Animal(String bark) {
		this.strBark = bark;
	}
	
	void bark() {
		System.out.println("짖는행위");
	}
}

class Human extends Animal {
	String name;
	int age;
	
	public Human() {}
	
	Human(String n, int a) {
		name = n;
		age = a;
	}
	
	void bark() {
		System.out.println("난 짐승이 아니야.");
		System.out.println("난 "+age+"살 "+name+"이야.");
	}
}


public class AnimalProgram {

		public static void main(String args[]) {
			Animal a = new Animal();
			a.bark();
			
			Human h = new Human("홍길동",18);
			h.bark();
			
			Human h1 = new Human();
			h1.name = "홍길동";
			h1.age = 18;
			
			System.out.println(h1.name);
	}
}
