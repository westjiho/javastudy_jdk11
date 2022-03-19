
public class ExerciseP104_No4_Class {
	public static void main(String[] args) {
		for(int y=1; y<6; y++) {
			for(int x=1; x<=y; x++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		for(int y=6; y>1; y--) {
			for(int x=1; x<y; x++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
	
}
