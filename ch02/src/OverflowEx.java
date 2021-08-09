class OverflowEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;	// short 범위 -32767 ~ 32767 
		char  cMin = 0;
		char  cMax = 65535;

		System.out.println("sMin  = " + sMin);
		System.out.println("sMin-1= " + (short)(sMin-1));	// 32767 출력
		System.out.println("sMax  = " + sMax);
		System.out.println("sMax+1= " + (short)(sMax+1));	// -32768 출력
		System.out.println("cMin  = " + (int)cMin);	// 0
		System.out.println("cMin-1= " + (int)--cMin);	// 65535
		System.out.println("cMax  = " + (int)cMax);		// 65535
		System.out.println("cMax+1= " + (int)++cMax);	// 0
	}
}
