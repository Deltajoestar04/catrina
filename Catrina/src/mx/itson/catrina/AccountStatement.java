/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina;

import com.google.gson.Gson;
import java.util.List;



/**
 *
 * @author Admin
 */
public class AccountStatement  {
    private String account;
    private Customer customer;
    private String clabe;
    private String currency;
    private List<Transaction> transactions;
 
    public AccountStatement  deserializar(String json){
        
        AccountStatement  deserializado = new AccountStatement ();
        
        try{
            
            deserializado = new Gson().fromJson(json, AccountStatement .class);
            
        }catch(Exception ex){
            
            System.err.print("Ocurrió un error: " + ex.getMessage());
            
        }return deserializado;
}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Transaction> gettransactions() {
        return transactions;
    }

    public void setTransaction(List<Transaction> Transactions) {
        this.transactions = Transactions;
    }
}
