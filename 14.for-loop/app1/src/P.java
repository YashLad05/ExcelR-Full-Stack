class K
{
    public static void main(String[] args)
    {
        int i;
		for (i = 0, System.out.println("INITIALIZER"); 
			i < 5; 
			i++, System.out.println("INCREMENT"))
		{
				System.out.println("BODY");
		}
		// INITIALIZER will execute only once
		// 0th iteration i = 0
	//	BODY i = 0
	//	INCREMENT // i = 1
	// 1st increment i= 1<5
	//	BODY i = 1
	//	INCREMENT // i = 2
	// 2nd increment i= 1<5
	//	BODY i = 2
	//	INCREMENT i = 3

	//	BODY i = 3
	//	INCREMENT i = 4

	//	BODY
	//	INCREMENT
    }
}
