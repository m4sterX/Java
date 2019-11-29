package by.nkt.agreg.entity;

import java.util.List;
import java.util.Objects;

public class User {
    private List<Bill> bills;

    public User(List<Bill> bills) {
        this.bills = bills;
    }

    public User() {
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(bills, user.bills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bills);
    }

    @Override
    public String toString() {
        return "User{" +
                "bills=" + bills +
                '}';
    }
}
