package Ex_14_Exception_Handling;

import java.io.FileNotFoundException;

public class Lab220_Custtom_Exception {

    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);


//        Bank jp_chase = new Bank("USD", 101);
//        Integer total_bal_all_countries = sbi.add(jp_chase);
//        System.out.println(total_bal_all_countries);

 Bank maharshtra_bank=new Bank("INR",203);
 Integer total_bal_ind=sbi.add(maharshtra_bank);
        System.out.println(total_bal_ind);
        System.out.println(total_bal_ind);

    }
}

class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception, FileNotFoundException {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch, Can't Proceed!");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}