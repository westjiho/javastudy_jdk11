// 1. 변수 타입
//  a) 기본 타입
//    - 정수형 (byte[1byte], short[2], int[4], long[8], char[2])
//    - 실수형 (float[4byte], double[8])
//    - 논리형 (boolean[1byte])

//******************************************************



public class VarDataType {
	public static void main(String[] args) {
		
		int age = 10;
		float f1 = 2.01f; // double이 기본데이터 타입이기 때문에 f로 float인 것을 표시한다.)
		char name = 'a';
		
		System.out.println(age);
		System.out.println(f1);

		
		System.out.println(name);
		System.out.println(name+1);
		System.out.println((int)name);
		
		System.out.println(name-32);
		System.out.println((char)(name-32));
		
				
	}
}
