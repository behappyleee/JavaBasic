class ArrayEx04 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, length);
		// src --> 복사할 배열, srcPos --> 원배열에서 어디서부터 복사 시작 할지, dest --> 복사할 배열 명(복사를 할 배열 이름), destPos --> 복사할 배열의 어디서부터 인덱스를 넣을것인지
		// length 복사할 원래 배열에 인데스 어디까지 복사할 것인지 (카피되는 배열의 요소 수)
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);

		// 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);	
		System.out.println(num);

	     // number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
