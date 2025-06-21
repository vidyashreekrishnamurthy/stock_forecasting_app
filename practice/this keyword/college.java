class college
{
String course_name;
String university_name;
int examcost;
college(String course_name, String university_name, int examcost)
{
this.course_name=course_name;
this.university_name=university_name;
this.examcost=examcost;
}
public static void main(String[] args)
{
college c1=new college("CSE","PESSAT",1000);
System.out.println(c1.course_name);
System.out.println(c1.university_name);
System.out.println(c1.examcost);
}
}
