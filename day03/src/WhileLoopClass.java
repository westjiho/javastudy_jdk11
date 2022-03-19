
public class WhileLoopClass {
	public static void main(String[] args) {
//		int i = 1 ;
//		while(i<=10) {
//			System.out.println(i);
//			i++;

		int x=2;
		int y=1;
		
		while(y<=9) {
			while(x<=9) {
				System.out.print(x + "x" + y + "=" + x*y + "\t");
				x++;
			}
			y++;
			x=2;
			System.out.println();
		}
		
	}
}