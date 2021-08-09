class VarEx2 {
	public static void main(String[] args) {
		int x = 10;	// 값을 서로 바꿀려면은 임의의 하나의 변수가 필요하다.	
		int y = 20;	// 헷갈릴시 물을 옮기는거 생각하기
		int tmp = 0;	// 물이 차 있는 2겁을 서로 물을 바꿀려면 다른 하나의 빈컵이 필요 ..
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x;
		// x = y 이므로 x 의 값이 20으로 바뀐다.
		x = y;	// 왼쪽에 있는 변수에 값이 대입이 된다. 즉 x 의 값이 사라지고 y 의 값이 들어옴 
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
}
