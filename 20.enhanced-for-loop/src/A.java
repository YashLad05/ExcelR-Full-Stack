class A 
{
	public static void main(String[] args) 
	{
		int[] x = {10, 20, 30, 40};
		for(int i : x) // to hold int values
		{
			System.out.println("Num is " + i);
		}

		double[] y = {10.2, 20.3, 30.4, 40.5};
		for(double i : y) // to hold double values
		{
			System.out.println("double value is " + i);
		}

		String[] z = {"abc", "xyz", "exclR", "classroom"};
		for(String i : z) // to hold string values
		{
			System.out.println("String value is " + i);
		}

		boolean[] a = {true, false, true, false};
		for(boolean i : a) // to hold string values
		{
			System.out.println("Boolean value is " + i);
		}
	}
}
// for-each or enhanced for loop intriduced in JDK 1.5
