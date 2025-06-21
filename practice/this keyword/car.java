class car
{
int car_cost;
String car_model_name;
String car_type;
car(int car_cost,String car_model_name,String car_type)
{
this.car_cost=car_cost;
this.car_model_name=car_model_name;
this.car_type=car_type;
}
public static void main(String[] args)
{
car c1=new car(1000000,"Audi","Petrol");
System.out.println(c1.car_cost);
System.out.println(c1.car_model_name);
System.out.println(c1.car_type);
}
}
