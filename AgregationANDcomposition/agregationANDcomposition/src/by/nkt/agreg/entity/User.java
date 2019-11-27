package by.nkt.agreg.entity;

import java.util.List;
import java.util.Objects;

public class User {

    private List<Bill> billList;

    public User(List<Bill> billList) {
        this.billList = billList;
    }

    public User() {
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(billList, user.billList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billList);
    }

    @Override
    public String toString() {
        return "User{" +
                "billList=" + billList +
                '}';
    }
}
