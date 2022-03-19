
public class LottoClass {
	public static void main(String[] args) {
		
		int lotNums[] = new int[45];
		for(int i=0;i<lotNums.length;i++) {
			lotNums[i]=i+1;
		}
		
//		for(int i=0;i<lotNums.length;i++) {
//			System.out.println(lotNums[i]);
//		}
		
	
//		int random_num = 0;
//		int num_of_printed = 0;
//		System.out.println("#### 이번 주 로또 번호 ####");
//		System.out.print("번호 : ");
//		for(int i=0;i<lotNums.length && num_of_printed < 6;i++) {			
//			random_num = (int)(Math.random()*100) + 1;
//			if(	random_num % 9 == 0 ) {
//				System.out.print(lotNums[i] + " ");
//				num_of_printed ++;
//			}
////			if ( num_of_printed == 6) break;
//		}

		
		int i = 0;
		int random_num = 0;
		int num_of_printed = 0;
		System.out.println("#### 이번 주 로또 번호 ####");
		System.out.print("번호 : ");
		while(true) {
			if ( i > lotNums.length -1 ) { i = 0; continue; }
			
			random_num = (int)(Math.random()*100) + 1;
			
			if(	random_num % 9 == 0 && lotNums[i] != 0) {
				System.out.print(lotNums[i] + " ");
				lotNums[i]=0;
				num_of_printed ++;
			}
			i++;
			if ( num_of_printed == 6) break;
		}
		
	}
}
