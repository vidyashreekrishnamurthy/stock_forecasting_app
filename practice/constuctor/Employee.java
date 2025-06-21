class Employee
{
String emp_id;
int emp_sal;
String emp_grade;
Employee(String a,int b,String c)
{
emp_id=a;
emp_sal=b;
emp_grade=c;
return;
}
public static void main(String[] args)
{
Employee E1=new Employee("PES004",1000000,"Senior Manager");
System.out.println(E1.emp_id);
System.out.println(E1.emp_sal);
System.out.println(E1.emp_grade);
}
}

//emp_id
//emp_sal
//emp_grade

