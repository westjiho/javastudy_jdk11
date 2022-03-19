
// [배열 선언]
// char a
// 1. 데이터타입[] 변수명;
// 2. 데이터타입 변수명[];

// [데이터 초기화]
// 1. int[] age = {10,20,30}; // 선언과 동시에 초기화
// 2. int[] age = new int[3]; // 선언과 방만 만들어 놓음
//    age[0] = 10;
//    age[1] = 20;
//    age[2] = 30;

public class ArrayClass {
	public static void main (String[] args) {
		
		String week_1[]= {"월","화","수","목","금","토","일"};
		for(int i=0;i<7;i++) {
			System.out.print(week_1[i]);
		}
		
		System.out.println();
		
		String[] week_2 = new String[7];
		week_2[0] = "월";
		week_2[1] = "화";
		week_2[2] = "수";
		week_2[3] = "목";
		week_2[4] = "금";
		week_2[5] = "토";
		week_2[6] = "일";
		int j=6;		
		for(int i=0;i<7;i++) {
			System.out.print(week_2[i]+"요일");
			System.out.println("\t"+week_2[j]+"요일");
			j -= 1;
		}
		
		System.out.println("배열변수 week_1의 길이 : " + week_1.length);
		System.out.println("배열변수 week_2의 길이 : " + week_2.length);

		for(int i=0;i<week_1.length;i++) {
			System.out.print(week_1[i]);
			
		}
		System.out.println();
		
		for(int i=week_1.length-1;i>=0;i--) {
			System.out.print(week_1[i]);
		}
	}
}
