import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtmOperation op=new AtmOperationImpl();
		int Atmnumber=12345;
		int Atmpin=123;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter ATM Number:");
		int AtmNumber=in.nextInt();
		System.out.println("Enter ATM Pin:");
		int pin =in.nextInt();
if((Atmnumber==AtmNumber)&&(Atmpin==pin))
{
	System.out.println("Valid ATM");
	while(true)
	{
		System.out.println("1.View Available Balance\n 2.Withdraw Money\n 3.Deposite Amount\n 4.Exit ");
		System.out.println("Enter your choice:");
		int ch= in.nextInt();
		if(ch==1) {
			op.ViewBalance();
		}
		else if(ch==2){
			System.out.println("Enter Amount to WithDraw");
			double WithdrawMoney = in.nextDouble();
			op.WithdrawMoney(WithdrawMoney);
		}
		else if(ch==3){
			System.out.println("Enter Amount to be deposite:");
			double DepositeAmount= in.nextDouble();	
			op.DepositeAmount(DepositeAmount);
			}
		else if(ch==4)
		{
			System.out.println("Thank You !!!");
			System.exit(0);
		}
		else
		{
			System.out.println("Please enter valid option");
		}
	}
}
else
{
	System.out.println("INvalid ATM");
	System.exit(0);
}


	}
}
