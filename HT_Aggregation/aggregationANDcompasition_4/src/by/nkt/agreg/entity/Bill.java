package by.nkt.agreg.entity;
// 4. Счета. Клиент может иметь несколько счетов в банке.
// Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Bill {

    private long id;
    private double currencyCount;
    private boolean statusIsBlocked;

    public Bill(long id, double currencyCount) {
        this.id = id;
        this.currencyCount = currencyCount;
    }
    public Bill(long id, double currencyCount, boolean statusIsBlocked) {
        this.id = id;
        this.currencyCount = currencyCount;
        this.statusIsBlocked = statusIsBlocked;
    }

    public Bill() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCurrencyCount() {
        return currencyCount;
    }

    public void setCurrencyCount(double currencyCount) {
        this.currencyCount = currencyCount;
    }

    public boolean statusIsBlocked() {
        return statusIsBlocked;
    }

    public void statusIsBlocked(boolean status) {
        this.statusIsBlocked= status;
    }
}
