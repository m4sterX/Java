package by.java.nkt.logic;

import by.java.nkt.entity.Customer;

import java.util.List;

public class CustomerLogic {
    public List<Customer> sortByAccount(List<Customer> customers) {
        boolean isSorted = false;
        long buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < customers.size() - 1; i++) {
                if (customers.get(i).getBankAccount() > customers.get(i + 1).getBankAccount()) {
                    isSorted = false;

                    buf = customers.get(i).getBankAccount();
                    customers.get(i).setBankAccount(customers.get(i + 1).getBankAccount());
                    customers.get(i + 1).setBankAccount(buf);
                }
            }
        }
        return customers;
    }
}