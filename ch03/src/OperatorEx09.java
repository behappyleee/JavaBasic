class OperatorEx09 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000;	// l 을 붙이지 않을 시 에러가 발생함 
		long b = 1000000 * 1000000L;

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
