class OperatorEx07 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);	
		// 원래 계산은 300이 맞지만 
		System.out.println(c);	// 바이트형의 표현 범위는 -127 ~ 127 임 
	}
}
