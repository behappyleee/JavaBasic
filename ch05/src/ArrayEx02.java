import java.util.*;  // Arrays.toString()�� ����ϱ� ���� �߰�

class ArrayEx02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		int [] iArr4 = {30, 40, 50, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};

		for (int i=0; i < iArr1.length ; i++ ) {
			iArr1[i] = i + 1; // 1~10�� ���ڸ� ������� �迭�� �ִ´�.
		}

		for (int i=0; i < iArr2.length ; i++ ) {
			iArr2[i] = (int)(Math.random()*10) + 1; // 1~10�� ���� �迭�� ����
		}

		// �迭�� ����� ������ ����Ѵ�.
		for(int i=0; i < iArr1.length;i++) {
			System.out.print(iArr1[i]+",");	
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));	// Arrays.toString �� ���� for ���� ������� �ʰ� �迭 ��ü ��� ����
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);	// iArr3 �� �ּҰ��� ��� �� �� 
		System.out.println(chArr);	// char �� �״�� �迭 ���ҵ��� �״�� ���
		System.out.println(iArr4);	// �ּҰ��� ����� ��
	}
}
