public class Bus {
    private int busNum;
    private int intake = 0;
    private int maxPassenger;
    private int passenger;
    private int oil;
    private int speed;
    private String status;

    public Bus(int oilCapacity, int numPassenger, int numSpeed)
    {
        this.busNum = (int)(Math.random()*1000);
        this.oil = oilCapacity;
        this.maxPassenger = numPassenger;
        this.speed = numSpeed;
        this.status = "Working";
    }

    public void take(int passenger) {
        this.passenger++;
        this.intake += 1000;
        oil -= passenger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    public int getOil() {
        return oil;
    }

    public int getBusNum() {
        return busNum;
    }

    public int getIntake() {
            return intake;
    }

    public int getPassenger() {
        return passenger;
    }

    public int getMaxPassenger() {return  maxPassenger;}

    public int getSpeed() {return speed;}

    public void setSpeed(int speedUp) {
        this.speed = getSpeed() + speedUp;
        System.out.println("Increase speed : " + speedUp + "Km/h" +
                "\n Current speed : " + this.speed);
    }
    public int setOil(int oilRemain) {
        this.oil = oilRemain;
        return oilRemain;
    }

    public void showInfo() {
        System.out.println("Bus number : no." + this.getBusNum() +
                "\nPassenger : " + this.getPassenger()
                + "\nEarned : "
                + this.getIntake() + " won"
                + "\nCurrent Oil : " + this.getOil() + "ml"
                + "\nCurrent speed : " + this.getSpeed() + "km/h"
                + "\nMax Passenger : " + this.getMaxPassenger());
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
        if (this.getPassenger() >= this.getMaxPassenger() || this.getStatus().equals("Garage")){
            System.out.println("Can not ride more people");
        } else if (this.getPassenger() < this.getMaxPassenger() && this.getStatus().equals("Working"))
        {
            System.out.println("Bus is available now");
        }
    }
}
