class mobile
{
int mobile_cost;
String mobile_model_name;
String mobile_color;
mobile(int a, String b, String c)
{
mobile_cost=a;
mobile_model_name=b;
mobile_color=c;
}
public static void main(String[] args)
{
mobile m1=new mobile(100000,"IPHONE 13 pro max","black");
System.out.println(m1.mobile_cost);
System.out.println(m1.mobile_model_name);
System.out.println(m1.mobile_color);
}
}
