import javax.sql.rowset.serial.SQLOutputImpl;

class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr  = new int[10];
		int[] counter = new int[10];

		for (int i=0; i < numArr.length ; i++) {
			numArr[i] = (int)(Math.random() * 10); // 0~9�� ������ ���� �迭�� ����
			System.out.print(numArr[i]);
			// System.out.println("numArr[" + i + "]= " + numArr[i]);	// numArr �� ������ 0 ~ 9 ������ ���� ������ �� 
		}
		
		System.out.println();

		for (int i=0; i < numArr.length; i++) {
			counter[ numArr[i] ]++;	
			System.out.print( counter[i] );
			// System.out.println("counter[" + i + "]= " + counter[i]);
		}
		System.out.println();
		for (int i=0; i < numArr.length ; i++) {
			System.out.println( i +"�� ���� :"+ counter[i]);
		}
	} // main�� ��
}
