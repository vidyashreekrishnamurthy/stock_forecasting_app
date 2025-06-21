class odd
{
	public static void main(String[] args) 
	{
		String str="javamava";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(i%2!=0)
			{
				System.out.println(ch);
	         }
         }
	}
}