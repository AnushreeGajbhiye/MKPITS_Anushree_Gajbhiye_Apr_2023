class BankMain extends Bank{
//@Override
public void sbi(){
System.out.println("Added net banking facility");
}

public static void main(String[] args){

Bank bank = new Bank();
bank.sbi();

BankMain bankMain = new BankMain();
bankMain.sbi();
}
}