class VarEx2 {
	public static void main(String[] args) {
		int x = 10;	// ���� ���� �ٲܷ����� ������ �ϳ��� ������ �ʿ��ϴ�.	
		int y = 20;	// �򰥸��� ���� �ű�°� �����ϱ�
		int tmp = 0;	// ���� �� �ִ� 2���� ���� ���� �ٲܷ��� �ٸ� �ϳ��� ������ �ʿ� ..
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x;
		// x = y �̹Ƿ� x �� ���� 20���� �ٲ��.
		x = y;	// ���ʿ� �ִ� ������ ���� ������ �ȴ�. �� x �� ���� ������� y �� ���� ���� 
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
}
