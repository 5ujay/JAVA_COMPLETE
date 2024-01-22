public class BankApp {

    String name;
    int age;
    String Taxdetail;
    Double amount;

    public BankApp(String name){
        this.name=name;
    }

    public void accAge(int age){
        this.age=age;
    }

    public void accTax(String Taxdetail){
        this.Taxdetail=Taxdetail;
    }

    public void depositAmount( Double amount){
        this.amount=amount;
    }

    public void getuseInfo(){
        System.out.println("Name of user is :" +this.name);
        System.out.println("No of balance is :" +this.amount);
    }















}