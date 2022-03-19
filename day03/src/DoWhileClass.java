
public class DoWhileClass {
	public static void main(String[] args) {
		int z=0;
		for(;z<=10;z++) {
			if(z>5) break;
			System.out.println(z);
		}
		System.out.println("연산수 : " +z);
		
		
		int z1 = 1;
		for(;z1<=100;z1++) {
//			if(z1%2==0) {
//				System.out.println(z1);
//			} else {
//				System.out.println(z1+"는 2의 배수가 아닙니다.");
//			}
			if(z1%2==0) {
				System.out.println(z1);
				continue;
			}
			System.out.println(z1+"는 2의 배수가 아닙니다.");
		}
	}		
}
