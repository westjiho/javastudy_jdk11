// 1. ���� Ÿ��
//  a) �⺻ Ÿ��
//    - ������ (byte[1byte], short[2], int[4], long[8], char[2])
//    - �Ǽ��� (float[4byte], double[8])
//    - ���� (boolean[1byte])

//******************************************************



public class VarDataType {
	public static void main(String[] args) {
		
		int age = 10;
		float f1 = 2.01f; // double�� �⺻������ Ÿ���̱� ������ f�� float�� ���� ǥ���Ѵ�.)
		char name = 'a';
		
		System.out.println(age);
		System.out.println(f1);

		
		System.out.println(name);
		System.out.println(name+1);
		System.out.println((int)name);
		
		System.out.println(name-32);
		System.out.println((char)(name-32));
		
				
	}
}
