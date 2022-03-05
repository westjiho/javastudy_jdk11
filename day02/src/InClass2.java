
public class InClass2 {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		// 예제
		int x = 10;
		int y = x++;
		System.out.println("x: "+x);
		System.out.println("y: "+y);		
		
		// 논리연산
		int b_1 = 10;
		int b_2 = 9;
//		System.out.println((b_1<b_2) & (b_1++ > b_2));
		System.out.println((b_1<b_2) && (b_1++ > b_2));
		System.out.println("비교연산");
		System.out.println(b_1);
		
		b_1 = 10;
		b_2 = 9;
//		System.out.println((b_1>b_2) | (b_1++ > b_2));
		System.out.println((b_1>b_2) || (b_1++ > b_2));	
		System.out.println("비교연산");
		System.out.println(b_1);
		
		// XOR : 두 항이 같으면 TRUE, 다르면 FALSE
		System.out.println("XOR TEST");
		System.out.println(true^true); // false
		System.out.println(true^false); // true
		System.out.println(false^true); // true
		System.out.println(false^false); // false

		// NOT : TREU ↔ FALSE 반전
		int c_1 = 100;
		System.out.println("NOT");
		System.out.println( !(10>5) ); // false
		System.out.println( !(10>5) && (c_1++ > 100) ); // true
		System.out.println(c_1);
		
	}
}
