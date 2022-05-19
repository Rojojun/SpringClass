import java.io.BufferedReader;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Passenger taxPassenger1 = new Passenger(1000000);

        Passenger person1 = new Passenger(4000);
        Passenger person2 = new Passenger(4000);
        Passenger person3 = new Passenger(4000);
        Passenger person4 = new Passenger(4000);
        Passenger person5 = new Passenger(4000);
        Passenger person6 = new Passenger(4000);
        Passenger person7 = new Passenger(4000);
        Passenger person8 = new Passenger(4000);
        Passenger person9 = new Passenger(4000);
        Passenger person10 = new Passenger(4000);
        // 사람이 10명

        // 버스의 기본 사항을 설정합니다.
        System.out.println("OIL?");
        int oilNum =  Integer.parseInt(input.readLine());
        System.out.println("SPEED?");
        int currentSpeed = Integer.parseInt(input.readLine());
        int MAX_PASSENGER = 10;
        //위의 설정된 기본사항에서 버스의 현 상태를 보여줍니다.
        Bus firstBus = new Bus(oilNum, MAX_PASSENGER, currentSpeed);
        firstBus.showInfo();
        firstBus.showOil(currentSpeed);
        firstBus.fullOrNot();
        // 속도 변경 뒤에 변경된 기름 값을 보여줍니다.
        System.out.println("Change Speed");
        currentSpeed = Integer.parseInt(input.readLine());
        firstBus.setSpeed(currentSpeed);
        // 승객이 탑승 후 변경된 상태를 보여줍니다.
        // 탑승객 만큼 기름의 숫자도 줄어듭니다.
        person1.takeBus(firstBus);
        firstBus.showInfo();
        firstBus.showOil(currentSpeed );
        person2.takeBus(firstBus);
        firstBus.fullOrNot();
        firstBus.showOil(currentSpeed );
        person3.takeBus(firstBus);
        firstBus.fullOrNot();
        firstBus.showOil(currentSpeed );
        person4.takeBus(firstBus);
        firstBus.fullOrNot();
        firstBus.showOil(currentSpeed );
        person5.takeBus(firstBus);
        firstBus.fullOrNot();
        person5.takeBus(firstBus);
        person6.takeBus(firstBus);
        person7.takeBus(firstBus);
        person8.takeBus(firstBus);
        person9.takeBus(firstBus);
        person10.takeBus(firstBus);
        firstBus.fullOrNot();
        // 택시택시택시택시

        System.out.println("OIL?");
        oilNum =  Integer.parseInt(input.readLine());
        System.out.println("SPEED?");
        currentSpeed = Integer.parseInt(input.readLine());
        //위의 설정된 기본사항에서 택시의 현 상태를 보여줍니다.
        Taxi firstTaxi = new Taxi(oilNum, currentSpeed);
        firstTaxi.showInfo();
        firstTaxi.showOil(currentSpeed);
        firstTaxi.fullOrNot();
        // 속도 변경 뒤에 변경된 기름 값을 보여줍니다.
        System.out.println("Change Speed");
        currentSpeed = Integer.parseInt(input.readLine());
        firstTaxi.setSpeed(currentSpeed);
        // 승객이 탑승 후 변경된 상태를 보여줍니다.
        // 탑승객 만큼 기름의 숫자도 줄어듭니다.
        // 목적지 만큼 기름의 숫자도 줄어듭니다.
        person1.takeTaxi(firstTaxi);
        System.out.println("A passenger catch a cap!\nWhere to go? (Km)");
        int km =  Integer.parseInt(input.readLine());
        firstTaxi.calPrice(km);
        firstTaxi.showInfo();
    }
}
