package inheritance;
class HR{
	String HRname="Syed";
	void hr()
{
System.out.println("Name of the HR:"+HRname);
}
}
class TeamLeader extends HR{
	String TL="Avinash";
	void tl()
	{
		System.out.println("Name of the Team Leeader:"+TL);	
	}
}
class TeamA extends TeamLeader{
	int tm=10;
	void TA()
	{
		System.out.println("There are "+tm+" Members in a TeamA");
		}
}
class TeamB extends TeamLeader{
	int tm=11;
	void TB()
	{
		System.out.println("There are "+tm+" Members in a TeamB");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamLeader tl=new TeamLeader();
		TeamA tA=new TeamA();
		TeamB tB=new TeamB();
		tl.hr();
		tl.tl();
		tA.TA();
		tB.TB();
		
		
	}

}
