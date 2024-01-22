public class SBIUser extends BankApp {

    public SBIUser(String name){

        super(name);
        System.out.println("I am constructer from new class");
    }

    public void getuseINFO(){
        super.getuseInfo();
        System.out.println("No of Tax info" + Taxdetail);
    }
}
