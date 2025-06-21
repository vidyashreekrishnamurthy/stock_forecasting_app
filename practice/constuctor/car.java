class car
{
int carcost;
String car_model_name;
String car_type;
car(int a,String b,String c)
{
carcost=a;
car_model_name=b;
car_type=c;
}
public static void main(String[] args)
{
car c1=new car(1000000,"Audi","Petrol");
System.out.println(c1.carcost);
System.out.println(c1.car_model_name);
System.out.println(c1.car_type);
}
}
