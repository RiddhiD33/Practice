class Account{
    String accountNumber;
    double balance;

    public Account(String accountNumber,double balance){
        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Error : Account Number cannot be empty.");
            return;
        }
        if(balance < 0){
            System.out.println("Error : Balance cannot be negative.");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void  display(){
        if(accountNumber == null) return;
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args){
        Account acc = new Account("555555", 500000);
        acc.display();

        Account acc1 = new Account(" ",500);
        Account acc2 = new Account("55555",-500);

    }
}