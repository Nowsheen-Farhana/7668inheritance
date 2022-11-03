package inheritance;
class StudentMarks{
	int m1=85;
	int m2=65;
	int m3=90;
	int total;
	String Class;
	void marks() {
System.out.println("Student mark1="+m1);
System.out.println("Student mark2="+m2);
System.out.println("Student mark3="+m3);
	}
	}
class StudentTotal extends StudentMarks{
	void total() {
	total=m1+m2+m3;
	System.out.println("Total mark of the Student="+total);
	}
	}
class Student extends StudentTotal{
	void Class()
	{
	if(total>=250)
	{
		System.out.println("First Class");
	}
	else {
		System.out.println("Second Class");
	}
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student  s=new Student();
 s.marks();
 s.total();
 s.Class();
 
 
	}

}
