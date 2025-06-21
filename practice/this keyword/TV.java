class TV
{
int tv_cost;
String tv_brand;
String tv_type;
TV(int tv_cost,String tv_brand,String tv_type)
{
this.tv_cost=tv_cost;
this.tv_brand=tv_brand;
this.tv_type=tv_type;
return;
}
public static void main(String[] args)
{
TV T1=new TV(50000,"SONY HD","color 3D");
System.out.println(T1.tv_cost);
System.out.println(T1.tv_brand);
System.out.println(T1.tv_type);
}
}

//tv_cost
//tv_brand
//tv_type