package inheritance;
class Bank{
	String Bankname;
	void Bankname(String Bankname)
	{
		System.out.println("Bank name is :"+Bankname);
	}
}
class Accholder1 extends Bank{
	long balance;
	void acchol1(String name,long accno,long amnt,long amntwithdrawl)
	{
		balance=amnt-amntwithdrawl;
		System.out.println("Name of the Account Holder:"+name);
		System.out.println("Account number:"+accno);
		System.out.println("Amount in the account:"+amnt);
		System.out.println("Amount withdrawl from the account:"+amntwithdrawl);
		System.out.println("Balance Amount in the Account:"+balance);
	System.out.println();	
	}
}
class Accholder2 extends Bank{
	long balance;
	void acchol2(String name,long accno,long amnt,long amntdeposited)
	{
		balance=amnt+amntdeposited;
		System.out.println("Name of the Account Holder:"+name);
		System.out.println("Account number:"+accno);
		System.out.println("Amount in the account:"+amnt);
		System.out.println("Amount deposited to the account:"+amntdeposited);
		System.out.println("Balance Amount in the Account:"+balance);	
	}
}
public class HierarichalInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accholder1 acc=new Accholder1();
		Accholder2 ac=new Accholder2();
		acc.Bankname("State Bank of India");
		acc.acchol1("Nowsheen",1099827783,55000,5000);
		ac.Bankname("Indian Bank");
		ac.acchol2("Farhana",10998738,50000,10000);
	}

}
