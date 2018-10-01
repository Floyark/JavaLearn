package extendsdemo;

import sun.applet.Main;

public class ExtendsDemo2 {
    interface Car {

    }

    static class Benz implements Car{

    }

    static class Maibahe extends Benz {
        private void drive() {
            System.out.println("maibahe");
        }

        public static void main(String[] args) {
            Maibahe maibahe = new Maibahe();

            Benz benz = new Maibahe();
            System.out.println(benz instanceof  Maibahe);
            System.out.println(benz instanceof Benz);
            System.out.println(benz.getClass().getName());
            System.out.println(benz instanceof Car);
            ((Maibahe) benz).drive();
        }

    }


}
