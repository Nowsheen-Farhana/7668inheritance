package inheritance;
class school
{
	public void students(String name,int Class,double fees,long scholorship) {
		System.out.println("Name of the student is:"+name);
		System.out.println("Class Studying:"+Class);
		System.out.println("Fees paid by the Student:"+fees);
		System.out.println("Scholorship ammount:"+scholorship);
		double totalfees=fees-scholorship;
		System.out.println("Total fees:"+totalfees);
		System.out.println();
	}
}
class staff extends school{
	public void teachers(String name,int Class,double salary,long bonus){
		System.out.println("Name of the Teacher:"+name);
	    System.out.println("Class Taken by the Teacher:"+Class);
	    System.out.println("Salary of the Teacher:"+salary);
		System.out.println("Bonus:"+bonus);
	double totalsalary=salary+bonus;
		System.out.println("Total salary:"+totalsalary);	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
staff s=new staff();
s.students("Nowsheen",12,6000,2000);
s.teachers("Santha mam",12,20000,2000);

	}

}
