class p1
{
	static void reverseString()
	{
		String str="hello";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
}
	public static void main(String[] args) 
	{
		reverseString();
	}
}
//ip:hello
//op:olleh