
public class ExerciseP104_No6_Class {
	public static void main(String[] args) {
		for(int y=0;y<5;y++){
			for(int x=0;x<4-y;x++){
				System.out.print(" "); 
			}
			for(int x=0;x<2*y+1;x++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
	}
}
