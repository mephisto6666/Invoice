package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Invoice;
import com.mycompany.dvdstore.service.InvoiceService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the customer name ? ? ? ?" );
        Scanner scan = new Scanner(System.in);

        String nom = scan.nextLine();

        Invoice invoice = new Invoice(nom);
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);


    }
}
