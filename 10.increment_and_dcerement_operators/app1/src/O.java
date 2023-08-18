class O 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = ++i;
		
		System.out.println("final i value = "+ i);
        System.out.println("final j value = "+ j);

		int a = 0;
		//        1 +   2 +   3 + 3
		int b = ++a + ++a + ++a + a;
		
		System.out.println("final i value = "+ a);
        System.out.println("final j value = "+ b);
	}
}
// ========== V.java ==========
// 4
// 1 +  0 + -1 + -1 = -1
// 0 +  0 +  0 +  0 = 0
//-1 + -1 + -1 + -2 = -5 (last calc mistake here)
//-1 + -2 + -1 + -1 = -5
//-2 + -2 + -3 + -3 = -10
//-2 + -2 + -2 + -2 = -8
//-2 + -3 + -3 + -4 = -12

// i final = -4
//  j total = 4 -1 + 0 -3 +3 -2 +0 -4 = -3