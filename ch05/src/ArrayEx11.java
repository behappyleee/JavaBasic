import javax.sql.rowset.serial.SQLOutputImpl;

class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr  = new int[10];
		int[] counter = new int[10];

		for (int i=0; i < numArr.length ; i++) {
			numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
			// System.out.println("numArr[" + i + "]= " + numArr[i]);	// numArr 은 난수로 0 ~ 9 까지의 수가 저장이 됨 
		}
		
		System.out.println();

		for (int i=0; i < numArr.length; i++) {
			counter[ numArr[i] ]++;	
			System.out.print( counter[i] );
			// System.out.println("counter[" + i + "]= " + counter[i]);
		}
		System.out.println();
		for (int i=0; i < numArr.length ; i++) {
			System.out.println( i +"의 개수 :"+ counter[i]);
		}
	} // main의 끝
}
