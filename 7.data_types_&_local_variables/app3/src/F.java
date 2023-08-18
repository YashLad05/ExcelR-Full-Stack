class F 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 2) + i;
		System.out.println(i); // 2
		System.out.println(j); // 14

		int a;
		int b = 10 + a + (a = 2);
		System.out.println(a); // 2
		System.out.println(b); // 1

		// Execution happens sequentially
		// a do not have a value
		// error: variable a might not have been initialized
	}
}
