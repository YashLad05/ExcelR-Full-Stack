class G 
{
	public static void main(String[] args) 
	{
		// Requirement - find smaller b/w 2 numbers
		int i = 200, j = 300;
		// Adding Hard coded values
		System.out.println("find smaller b/w 2 numbers");

		/*if(i < j){
			System.out.println("i value "+ i + "is smaller");
			}
		else{
			System.out.println("j value "+ j + "is smaller");
		}*/

		int min  = i > j ? j : i;
		System.out.println("Minimum b/w " + i + " and " + j + " is " + min);
	}
}
