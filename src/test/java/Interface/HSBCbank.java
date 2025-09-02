package Interface;

public class HSBCbank implements USbank,BrazilBank{

    public void credit() {
        System.out.println("HSBC CREDIT**");
    }

    public void debid() {
        System.out.println("HSBC DEBID**");
    }

    public void transferMoney() {
        System.out.println("HSBC TRANSFER**");
    }

    public void educationLoad(){
        System.out.println("HSBC EDUCATION LOAD**");
    }

    public void carLoad(){
        System.out.println("HSBC CAR LOAD**");
    }

    public static void main(String[] args) {

        HSBCbank hs = new HSBCbank();
        hs.carLoad(); // static poly overidding from USBank Interfaca
        hs.credit();     // static poly overidding from USBank Interfaca
        hs.debid();  // static poly overidding from USBank Interfaca
        hs.transferMoney();
        hs.educationLoad();

        // run time poly
        USbank b= new HSBCbank();
        System.out.println("*******");
        b.credit();
        b.debid();
        b.transferMoney();
        System.out.println(USbank.min_bal);
        hs.mutualFund();
    }

    @Override
    public void mutualFund() { // overriding from BrazilBank Inteface
        System.out.println("HSBC Mutual Fund**");
    }
}
