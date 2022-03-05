
public class tripleClass {
	public static void main(String[] args) {
		// 3항 연산자
		// 조건식 ? 값1 : 값2
		
		int score = 60;
		String pass = score>70 ? "합격" : "불합격" ;
		
		System.out.println(pass);
		
		
		
		
		
		
		int colorPen=5*12;
		int studentCount=27;
		int divColorPen=colorPen/studentCount;
		System.out.println("학생당 나눠가지는 색연필 수 : "+divColorPen);
		int remainColorPen=colorPen%studentCount;
		System.out.println("똑같이 나눠가지고 남은 볼펜 수 : "+remainColorPen);
	}
}
