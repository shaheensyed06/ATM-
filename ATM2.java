public class ATM2 {
     private int balance;
     private int pin;
    public ATM2(int balance,int pin){
        this.balance=balance;
        this.pin=pin;
    }
    public void displaymenu(){
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.changepin");
        System.out.println("5.exit");
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("insufficient funds!");
            return;
        }
        balance-=amount;
    }
    public int getbalance(){
        return balance;

    }
    public boolean validatepin(int pin){
        return this.pin==pin;
    }
    public void changepin(int newpin){
        pin=newpin;
    }
    public static void main(String[] args){
        ATM2 atm = new ATM2(balance:1000 , pin:1234 );
        atm.displaymenu();
        System.out.println("enter the pin");
        int pin=Integer.parseInt(System.console().readLine());
        System.out.println("entered pin:"+pin);

    }


    
}
