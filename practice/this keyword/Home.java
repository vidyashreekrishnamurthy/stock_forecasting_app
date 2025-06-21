class Home
{
String Home_name;
int Home_cost;
String Home_color;
Home(String Home_name,int Home_cost,String Home_color)
{
this.Home_name=Home_name;
this.Home_cost=Home_cost;
this.Home_color=Home_color;
return;
}
public static void main(String[] args)
{
Home H1=new Home("vidya",10000000,"lavendar");
System.out.println(H1.Home_name);
System.out.println(H1.Home_cost);
System.out.println(H1.Home_color);
}
}
