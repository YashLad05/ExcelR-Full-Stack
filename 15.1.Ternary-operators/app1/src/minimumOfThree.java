class minimumOfThree
{
	public static void main(String[] args) 
	{
		// Get minimum of 3 nmbers using if-else
		int i = 100, j = 200, k = 300;
		if(i < j && j < k){
			System.out.println("smallest num is " + i);
		}else if(j < i && j < k){
			System.out.println("smallest num is " + j);
		}else if(k < i && k < j){
			System.out.println("smallest num is " + k);
		}else{
			System.out.println("Please check numbers again !!");
		}

		System.out.println("main end");
	}
}
