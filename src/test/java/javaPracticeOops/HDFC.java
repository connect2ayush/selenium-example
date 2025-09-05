package javaPracticeOops;

import java.sql.SQLOutput;

public class HDFC extends IndiaBank{

    @Override
    void transfer() {
        System.out.println("HDFC transfer");
    }

    public static void main(String[] args) {

        IndiaBank indiaBank = new HDFC();
        indiaBank.transfer();
        indiaBank.debit();
        indiaBank.credit();
    }

}
