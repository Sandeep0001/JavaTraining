package designpatterns.factorypattern;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car suvCar = factory.getCar("SUV");
        suvCar.assemble(); //SUV -- assembling

        Car sedanCar = factory.getCar("Sedan");
        sedanCar.assemble(); //Sedan -- assembling

        Car miniCar = factory.getCar("MINI");
        miniCar.assemble(); // Mini -- assembling
    }

}
