class R 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 2; i++)
		{
		System.out.println("loop1 begin " + "i:" + i);
		for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin " + "i:" + i + " j: " + j);
				if(j > 2)
				{
					continue;
				}
				System.out.println("loop2 end " + "i:" + i + " j: " + j);
			}
			System.out.println("loop1 end " + "i:" + i);
		}
		System.out.println("main end");
	}
}

/*
output :
i = 0, 
j = 0, 1, 2, 3, 4, 5

loop1 begin i:0
loop2 begin i:0 j: 0
loop2 end i:0 j: 0
loop2 begin i:0 j: 1
loop2 end i:0 j: 1
loop2 begin i:0 j: 2
loop2 end i:0 j: 2
loop2 begin i:0 j: 3
loop2 begin i:0 j: 4
loop1 end i:0
loop1 begin i:1
loop2 begin i:1 j: 0
loop2 end i:1 j: 0
loop2 begin i:1 j: 1
loop2 end i:1 j: 1
loop2 begin i:1 j: 2
loop2 end i:1 j: 2
loop2 begin i:1 j: 3
loop2 begin i:1 j: 4
loop1 end i:1
main end
*/