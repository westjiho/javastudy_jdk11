import java.util.Scanner;

public class SwitchExClass {
	public static void main(String[] args) {
		
		do {
			System.out.print("점수를 입력하세요: ");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			
			if(score<0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(score>100) {
				System.out.println("점수는 0점부터 100점 까지입니다.\n");
				continue;
			}
			
			String grade = "";
			switch (score/10) {
				case 10 :
					grade = "A+";
					break;
				case 9 :
					grade = "A";
					break;
				case 8 :
					grade = "B";
					break;
				case 7 :
					grade = "C";
					break;
				case 6 :
					grade = "D";
					break;
				default :
					grade = "F";
					break;
			}	 
			System.out.println("학점 : " + grade);
			System.out.println();		
		}
		while(true);
		
	}		
}
