class Bike
{
int bike_cost;
String bike_brand;
String bike_color;
Bike(int bike_cost,String bike_brand,String bike_color)
{
this.bike_cost=bike_cost;
this.bike_brand=bike_brand;
this.bike_color=bike_color;
return;
}
public static void main(String[] args)
{
Bike B1=new Bike(1000000,"Royal Enfield","black");
System.out.println(B1.bike_cost);
System.out.println(B1.bike_brand);
System.out.println(B1.bike_color);
}
}

//bike_cost
//bike_brand
//bike_color

