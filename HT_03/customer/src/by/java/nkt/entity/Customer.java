package by.java.nkt.entity;

import java.util.List;
import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String surname;
    private String thirdName;
    private String address;
    private long card;
    private long bankAccount;

    private final int ID_SIZE = 10;
    private final long CARD_SIZE = 16;
    private final long BANK_ACCOUNT_SIZE = 18;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setId(int id) {
        String checkID = Integer.toString(id);
        int size = checkID.length();
        if (size == ID_SIZE) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setCard(long card) {
        String checkCard = Long.toString(card);
        ;
        int size = checkCard.length();
        if (size == CARD_SIZE) {
            this.card = card;
        } else {
            this.card = 0;
        }
    }

    public long getCard() {
        return this.card;
    }

    public void setBankAccount(long bankAccount) {
        String checkBankAccount = Long.toString(bankAccount);
        int size = checkBankAccount.length();
        if (size == BANK_ACCOUNT_SIZE) {
            this.bankAccount = bankAccount;
        } else {
            this.bankAccount = 0;
        }
    }

    public long getBankAccount() {
        return bankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                card == customer.card &&
                bankAccount == customer.bankAccount &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(thirdName, customer.thirdName) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, thirdName, address, card, bankAccount, ID_SIZE, CARD_SIZE, BANK_ACCOUNT_SIZE);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", card=" + card +
                ", bankAccount=" + bankAccount +
                ", ID_SIZE=" + ID_SIZE +
                ", CARD_SIZE=" + CARD_SIZE +
                ", BANK_ACCOUNT_SIZE=" + BANK_ACCOUNT_SIZE +
                '}';
    }

    public Customer(int id, String name, String surname, String thirdName, String address, long card, long bankAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.thirdName = thirdName;
        this.address = address;
        this.card = card;
        this.bankAccount = bankAccount;
    }

    public Customer() {
    }

    @Override
    public int compareTo(Customer customer) {
        int result = this.name.compareTo(customer.name);
        if (result == 0) {
            result = this.surname.compareTo(customer.surname);
        }
        if (result == 0) {
            result = this.thirdName.compareTo(customer.thirdName);
        }
        return result;
    }

}
