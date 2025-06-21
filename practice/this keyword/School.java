class School
{
String School_name;
char School_grade;
int School_strength;
School(String School_name,char School_grade,int School_strength)
{
this.School_name=School_name;
this.School_grade=School_grade;
this.School_strength=School_strength;
return;
}
public static void main(String[] args)
{
School S1=new School("PESSAT",'A',1000);
System.out.println(S1.School_name);
System.out.println(S1.School_grade);
System.out.println(S1.School_strength);
}
}
