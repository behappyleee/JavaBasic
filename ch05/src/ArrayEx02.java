import java.util.*;  // Arrays.toString()을 사용하기 위해 추가

class ArrayEx02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		int [] iArr4 = {30, 40, 50, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
		}

		// 배열에 저장된 값들을 출력한다.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));	// Arrays.toString 을 사용시 for 문을 사용하지 않고 배열 전체 출력 가능
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);	// iArr3 의 주소값이 출력 이 됨 
		System.out.println(chArr);	// char 는 그대로 배열 원소들을 그대로 출력
		System.out.println(iArr4);	// 주소값이 출력이 됨
	}
}
