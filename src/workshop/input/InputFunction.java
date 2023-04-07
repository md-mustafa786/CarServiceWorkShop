package workshop.input;

import workshop.car.Cars;
import workshop.service.Services;

import java.util.Scanner;

public class InputFunction {


        public void input() {
        Scanner sc = new Scanner(System.in);

        Cars car = new Cars();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("select car from car list:  example->  suv");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for (String carName : car.carList) {
            System.out.println(carName);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        String userSelectedCar = sc.next().toLowerCase();

        Services carService = new Services();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println(carService.carNameWithService.get(userSelectedCar));
        sc.nextLine();
        System.out.println();
        System.out.println("Please choose services from the list above and separate each option with a space. example-> GF01 TS01 BF01 ...");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        String userServiceList = sc.nextLine();
        System.out.println();
        String[] userServices = userServiceList.replaceAll("( )+", " ").split(" ");
        int amount = 0;
        for (String userService : userServices) {
            Integer price = (carService.carNameWithService.get(userSelectedCar)).get(userService);
            amount += price;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Price: "+amount+" INR");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}
