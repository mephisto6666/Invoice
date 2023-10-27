package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository {

    static List<Invoice> invoices = new ArrayList<>();

    public void add (Invoice invoice){
        invoices.add(invoice);
        System.out.println("La facture suivante   : " + invoice.getNumber() + "   a été créé pour "+ invoice.getCustomerName());

    }





}
