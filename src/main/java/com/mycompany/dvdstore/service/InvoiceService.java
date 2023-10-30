package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Invoice;
import com.mycompany.dvdstore.repository.InvoiceRepository;

public class InvoiceService {


   // Avec static le numero sera disponible et partagé
    private static Long invoiceNumber= 0L;
    private InvoiceRepository invoiceRepository = new InvoiceRepository();


    public void createInvoice (Invoice invoice){
        // On reçoit une facture en paramètre et on lui crée un numero avant de l'enregistrer
        invoice.setNumber(String.valueOf(++invoiceNumber));
        invoiceRepository.add(invoice);

    }




}
