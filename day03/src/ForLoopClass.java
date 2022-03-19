
public class ForLoopClass {
	public static void main(String[] args) {
		for(int y=1;y<=9;y++) {
			for(int x=2;x<=9;x++) {
				System.out.print(x + "x" + y + "=" + (x*y) + "\t");
			}
			System.out.print("\n");
		}
	}
}