package com.sample.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerGroupProcess {
    public static void main(String[] args) {
        System.out.println("Customer Group Process Started");
        CustomerGroupProcess reference = new CustomerGroupProcess();
        reference.process2();
        System.out.println("Customer Group Process Ended");
    }

    private void process() {
        System.out.println("Processing customer groups...");
        List<Customer> customerList = new ArrayList<>();// Create an empty list to hold Customer objects - FIFO

        for (int i = 0; i < 50; i++) {
            Customer customer = new Customer(i + 1, "Customer-" + (i + 1), "customer" + (i + 1) + "@example.com");
            customerList.add(customer); // Add the newly created Customer object to the list
        }

        int listSize = customerList.size();
        int desiredCustomer = 0;
        System.out.println("Total customers processed: " + listSize);
        if(desiredCustomer<listSize) {
            Customer cust = customerList.get(desiredCustomer); // Always get the first customer (FIFO)
            System.out.println("Processing " + cust);
        }

    }

    private void process1(){
        System.out.println("Processing customer groups - process1...");

        List<Integer> intList = new ArrayList<>();

        for(int i=1; i<=20; i++){
            intList.add(i);
        }
        for(int i=1; i<=10; i++){
            intList.add(i);
        }
        System.out.println("Total integers in the list: " + intList.size());

        for(Integer val : intList){
            System.out.println("List value: " + val);
        }

        Set<Integer> intSet = new HashSet<>();

        for(int i=1; i<=20; i++){
            intSet.add(i);
        }
        for(int i=1; i<=10; i++){
            intSet.add(i);
        }
        System.out.println("Total integers in the Set: " + intSet.size());

        for(Integer val : intSet){
            System.out.println("Set value: " + val);
        }

    }

    private void process2(){
        System.out.println("Processing customer groups - process2...");
        List<Customer> customerList = new ArrayList<>();// Create an empty list to hold Customer objects

        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer(i + 1, "Customer-" + (i + 1), "customer" + (i + 1) + "@example.com");
            customerList.add(customer); // Add the newly created Customer object to the list
        }

        Customer customer = new Customer(3, "Customer-" + 3, "customer" + (3) + "@example.com");
        customerList.add(customer); // Add the newly created Customer object to the list

        System.out.println("Total customers processed: " + customerList.size());
        for(Customer cust : customerList){
            System.out.println("Customer: " + cust);
        }

        System.out.println("\n Set Example \n");

        Set<Customer> customerSet = new HashSet<>();// Create an empty list to hold Customer objects - FIFO

        for (int i = 0; i < 5; i++) {
            Customer customer1 = new Customer(i + 1, "Customer-" + (i + 1), "customer" + (i + 1) + "@example.com");
            customerSet.add(customer1); // Add the newly created Customer object to the list
        }

        Customer customer1 = new Customer(3, "Customer-100"  , "customer" + (3) + "@example.com");
        System.out.println(customer1.hashCode());
        customerSet.add(customer1); // Add the newly created Customer object to the list

        System.out.println("Total customers processed: " + customerSet.size());
        for(Customer cust : customerSet){
            System.out.println("Customer: " + cust);
        }


    }

}
