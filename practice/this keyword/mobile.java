class mobile
{
int mobile_cost;
String mobile_model_name;
String mobile_color;
mobile(int mobile_cost, String mobile_model_name, String mobile_color)
{
this.mobile_cost=mobile_cost;
this.mobile_model_name=mobile_model_name;
this.mobile_color=mobile_color;
}
public static void main(String[] args)
{
mobile m1=new mobile(100000,"IPHONE 13 pro max","black");
System.out.println(m1.mobile_cost);
System.out.println(m1.mobile_model_name);
System.out.println(m1.mobile_color);
}
}
