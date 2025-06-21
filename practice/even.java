class even
{
	public static void main(String[] args) 
	{
		String str="javamava";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
			ch=str.charAt(i);
				System.out.println(ch);
	         }
         }
	}
}