class Laptop
{
String Laptop_name;
int Laptop_cost;
String Laptop_brand;
Laptop(String a,int b,String c)
{
laptop_name=a;
laptop_cost=b;
laptop_brand=c;
return;
}
public static void main(String[] args)
{
Laptop L1=new Laptop("HP",500000,"intel i7");
System.out.println(L1.Laptop_name);
System.out.println(L1.Laptop_cost);
System.out.println(L1.Laptop_brand);
}
}
