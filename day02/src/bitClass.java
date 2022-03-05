
public class bitClass {
	
	public static void main(String[] args) {
		
		// 비트연산 : 논리 연산과 동일
		
		byte a = 10; // 0000 1010
		byte b = 1; // 0000 0001
		System.out.println("a\t: "+Integer.toBinaryString(a)); // 2진수 변환
		System.out.println("b\t: "+Integer.toBinaryString(b)); // 2진수 변환
		System.out.println("a & b\t: "+Integer.toBinaryString(a&b)); // 0000 0000 : 0
		System.out.println("a | b\t: "+Integer.toBinaryString(a|b)); // 0000 1011 : 11
		System.out.println("a ^ b\t: "+Integer.toBinaryString(a^b)); // 0000 1011	: 11
		byte z = 0;
		System.out.println("z\t: "+Integer.toBinaryString(z)); // 0000 0000 : 0
		System.out.println("~z\t: "+Integer.toBinaryString(~z)); // 1111 1111 1111 1111 1111 1111 1111 1111	: -1
		System.out.println("~z\t: "+~z); // 1111 1111 1111 1111 1111 1111 1111 1111	: -1

		System.out.println("-1\t: "+Integer.toBinaryString(-1)); // 1111 1111 1111 1111 1111 1111 1111 1111	: -1

		// 1. 양수를 2진수로 변환
		// 2. 보수를 취하고 (1의 보수)
		// 3. 1을 더한다 (2의 보수)
		
		
		// 비트연산의 쉬프트 연산
		byte y = 56; // 0011 1000
		byte m = -10; // 11111111111111111111111111110110
		System.out.println("y << 2\t: "+Integer.toBinaryString(y<<2)); // 1110 0000 : 56
		System.out.println("y >> 1\t: "+Integer.toBinaryString(y>>1)); // 0001 1100 : 28
		System.out.println("y >>> 3\t: "+Integer.toBinaryString(y>>>3)); // 0000 0111 : 7

		System.out.println("m << 2\t: "+Integer.toBinaryString(m<<2)); // 1111 1111 1111 1111 1111 1111 1101 1000 : -40
		System.out.println("m >> 1\t: "+Integer.toBinaryString(m>>1)); // 1111 1111 1111 1111 1111 1111 1111 1011 : -5
		System.out.println("m >>> 3\t: "+Integer.toBinaryString(m>>>3)); // 0001 1111 1111 1111 1111 1111 1111 1110 : 536870910

	}
}
