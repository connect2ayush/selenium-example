package javaPracticeOops;

public abstract class IndiaBank {

    public void credit() {
        System.out.println("HDFC credit from India class");
    }
    public void debit() {
        System.out.println("HDFC debit from India class");
    }
   abstract void transfer();


}
