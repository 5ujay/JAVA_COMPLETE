public class BankUser {
    public static void main(String[] args) {

        BankApp Crazy= new BankApp("Sujay pagam ");

        Crazy.accAge(19);
        Crazy.depositAmount(50000.00);

        Crazy.getuseInfo();

        BankApp Don =new BankApp("JON THE DON");

        Don.accAge(20);
        Don.depositAmount(50000.00);

        Don.getuseInfo();

        Crazy.depositAmount(50000.00);
        Don.depositAmount(50000.00);

        Crazy.getuseInfo();
        Don.getuseInfo();

        SBIUser MCSTAN = new SBIUser("MC STAN");

        MCSTAN.depositAmount(100000000.00);
    }
}
