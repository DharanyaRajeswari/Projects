
public class AtmOperationImpl implements AtmOperation {
Atm atm=new Atm();
	@Override
	public void ViewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is:" +atm.getBalance());
	}

	@Override
	public void WithdrawMoney(double WithdrawMoney) {
		if(WithdrawMoney<=atm.getBalance())
		{
		System.out.println("Please Collect the Amount"+WithdrawMoney);
		atm.setBalance(atm.getBalance()-WithdrawMoney);

		ViewBalance();
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void DepositeAmount(double DepositeAmount) {
		// TODO Auto-generated method stub
		System.out.println(DepositeAmount+" Amount Deposited Sucessfully");
		atm.setBalance(atm.getBalance()+DepositeAmount);
		ViewBalance();
	}

}
