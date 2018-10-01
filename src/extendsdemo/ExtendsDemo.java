package extendsdemo;

public class ExtendsDemo {
    interface Car {
        String brand();
    }

    static class Benz implements Car {
        void drive() {
            System.out.println("Benz is driving");
        }

        @Override
        public String brand() {
            return "Benz";
        }
    }

    static class BMW implements Car {

        @Override
        public String brand() {
            return "BMW";
        }
    }

    public static void main(String[] args) {
        Car car = new Benz();
        Benz benz = new Benz();
//        benz.drive();
//        car.drive();

        //guess = false
        System.out.println("car == benz : "+ (car == benz));
        //guess = true
        System.out.println("car.class == benz.class : "+(car.getClass() == benz.getClass()));
        //guess Benz
        System.out.println(String.format("car.brand is %s", car.brand()));
    }
}
