class L
{
	public static void main(String[] args) 
	{
		System.out.println("While Loop");
		
		int i = 0;
		while(i < 4){
			i++;
			System.out.println("begin " + i);
			if(i > 2){
				continue;
			}
			System.out.println("end " + i);
		}
	}
}
/*
While Loop
begin 1
end 1
begin 2
end 2
begin 3
begin 4
*/