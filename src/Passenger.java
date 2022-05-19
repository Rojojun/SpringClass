public class Passenger {
    private int money;

    public Passenger(int money) {
        this.money = money;
    }

    public void takeBus(Bus bus) {
        this.money -= 1000;
        bus.take(1);
    }

    public void takeTaxi(Taxi taxi) {
        this.money -= 1500;
        taxi.take(1);
    }


    public int getMoney() {
        return money;
    }

}
