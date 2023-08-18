class L 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i-- + i +
			i-- + i++ + i-- + i +
			i++ + i-- + i + i++;

		System.out.println("final i value = "+ i);
        System.out.println("final j value = "+ j);
	}
}
