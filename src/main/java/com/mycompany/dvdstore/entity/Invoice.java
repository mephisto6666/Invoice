package com.mycompany.dvdstore.entity;

public class Invoice {

    private String number;
    private String customerName ;

    public Invoice(String customerName) {
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
