package by.nkt.agreg.logic;
// 4. Счета. Клиент может иметь несколько счетов в банке.
// Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import by.nkt.agreg.entity.Bill;
import by.nkt.agreg.entity.User;

import java.util.List;

public class BillLogic {
    public static List<Bill> SortBills(User user) {
        List<Bill> usersBills = user.getBills();

        boolean isSorted = false;
        long buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < usersBills.size() - 1; i++) {
                if (usersBills.get(i).getId() > usersBills.get(i + 1).getId()) {
                    isSorted = false;

                    buf = usersBills.get(i).getId();
                    usersBills.get(i).setId(usersBills.get(i + 1).getId());
                    usersBills.get(i + 1).setId(buf);
                }
            }
        }
        return usersBills;
    }

    public User findBill(List<User> users, int id) {
        for (User i : users
        ) {
            List<Bill> userBills = i.getBills();
            for (Bill j : userBills
            ) {
                if (j.getId() == id) {
                    return i;
                }
            }
        }
        return null;
    }

    public double sumInCommon(User user) {
        List<Bill> userBills = user.getBills();
        double sum = 0;
        for (Bill i: userBills
             ) {
            sum = sum + i.getCurrencyCount();
        }
        return sum;
    }
    public double sumOfPositiveBill(User user) {
        List<Bill> userBills = user.getBills();
        double sum = 0;
        for (int i = 0; i < userBills.size(); i++) {
            if (userBills.get(i).getCurrencyCount() > 0) {
                sum = sum + userBills.get(i).getCurrencyCount();
            }
        }
        return sum;
    }
    public double sumOfNegativeBill(User user) {
        List<Bill> userBills = user.getBills();
        double sum = 0;
        for (int i = 0; i < userBills.size(); i++) {
            if (userBills.get(i).getCurrencyCount() < 0) {
                sum = sum + userBills.get(i).getCurrencyCount();
            }
        }
        return sum;
    }
}
