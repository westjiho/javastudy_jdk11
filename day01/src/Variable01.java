// 1. 변수
// [선언] 데이터타입 변수이름;
// [초기화] 데이터타입 변수이름=초기값;

// 변수명은 숫자로 시작할 수 없고, - 와 $를 제외한 모든 특수문자는 사용할 수 없다.
// _(언더바)는 사용할 수 있으나 -(대쉬)는 사용할 수 없다.

//******************************************************



public class Variable01 {
//	public static int total(int a, int b) {
//		return a+b;
//	}
	public static void main(String args[]) {
		int a=1;
		int b=2;
		int c;
		
		c = a+b;
		
		System.out.println(c);
		
		System.out.println(c*20);
		
//		System.out.println(total(a,c));
	}
}
