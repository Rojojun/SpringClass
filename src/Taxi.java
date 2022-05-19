public class Taxi {
    int taxiNum;
    int price;
    int passenger;
    int oil;
    int speed;
    int pricePerKm;
    int totalPassenger;
    private String status;

    public Taxi(int oilCapacity, int numSpeed)
    {
        this.taxiNum = (int)(Math.random()*1000);
        this.oil = oilCapacity;
        this.speed = numSpeed;
        this.status = "Working";
    }

    public void take(int passenger) {
        this.totalPassenger++;
        this.price += 3000;
        this.pricePerKm = 150;
    }

    public int getOil() {return oil;}

    public int setOil(int oilRemain) {
        this.oil = oilRemain;
        return oilRemain;
    }

    public int getTaxiNum() {
        return taxiNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public int calPrice(int km){
        price = getPrice() + 150 * km;
        oil -= km;
        System.out.println("Destination : " + km
                            + "\nBasic Price : " + this.getPrice()
                            + "\nEarned : " + price + " won"
                            + "\nCurrent Oil : " + this.oil + "ml");
        return price;
    }

    public int getPassenger() {
        return passenger;
    }

    public int getSpeed() {return speed;}

    public void setSpeed(int speedUp) {
        this.speed = getSpeed() + speedUp;
        System.out.println("Increase speed : " + speedUp + "Km/h" +
                "\n Current speed : " + this.speed);
    }

    public void showInfo() {
        System.out.println("Taxi License ID : no." + this.getTaxiNum() +
                "\nToday's Total Passenger : " + this.getPassenger()

                + "\nCurrent Oil : " + this.getOil() + "ml"
                + "\nCurrent speed : " + this.getSpeed() + "km/h");
    }
    public int showOil(int speed) {
        if (oil >= 10){
            setOil(getOil() - speed);
            System.out.println("\nCurrent Oil : " + this.oil + "ml");
        }
        else{System.out.println("Use enough not ENERGY\nPlease go to a GAS STATION");}
        return oil;
    }
    public void fullOrNot() {
        if (this.getStatus() == "Working"){
            System.out.println("Taxi is available now");
            setStatus();
        } else{
            System.out.println("Can not ride more people");
        }
    }
}
