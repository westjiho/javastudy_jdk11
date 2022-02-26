// 1. 주석문
// 컴파일러는 해석을 안하고 넘어가는 문장들
// 사용목적 : 개발자(사람)이 읽고 참고하도록 써넣은 정보.
// a) 한 줄 주석 : //
// b) 여러 줄 주석 : /* ~ */

//******************************************************

// 2. 자바 소스코드의 기본 구조
// a) 클래스 블록 (필수)
// b) 메소드 블록 (옵션)

//******************************************************

// 3. 기본 문법
// a) 문장의 끝은 무조건 ";"
// b) class명의 시작은 대문자로 한다 (옵션)
// c) 메소드명, 변수명의 시작은 소문자로 한다 (옵션)

//******************************************************

// 4. 자바의 명명규칙 (옵션)

// a) 클래스 명명 규칙 CamelCase(쌍봉낙타) / PascalCase
// Hello + World -> HelloWorld
// I + am + a + boy -> IAmABoy

// b) 변수/메소드 명명규칙은 CamelCase(단봉낙타)
// Hello + World -> helloWorld
// I + am + a + boy -> iAmABoy

// c) 자바는 대소문자를 구분합니다.

//******************************************************




public class HelloWorld { // 클래스 블록
	
	public static void main(String args[]) { // 메소드 블록
		System.out.println("HelloWorld");
	}

}
