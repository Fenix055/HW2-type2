public class Main {
    public static void print(Object... args) {
        for (byte i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
    }

    public static void printType(String name, String type, Object number) {
        System.out.println("Значение переменной "+ name +" с типом " + type + " равно " + number);
    }

    public static void machineWork(int... min) {
        for (byte i = 0; i < min.length; i++) {
            System.out.println("За " + min[i] + " машина произвела " + (min[i]<<3) + " штук бутылок");
        }
        System.out.println();
    }

    public static void paymentUp(String name,int curPay) {
        int up=curPay/10;
        System.out.println(name + " теперь получает " + (curPay+up) + " рублей. Годовой доход вырос на " + (up*12) + " рублей");
    }

    public static void main(String[] args) {
        /// Task 1
        int i = 50000;
        byte b = 0;
        short s = 128;
        long l = -922337203685477580l;
        float f = 1.12345f;
        double d = 1.12345678;

        printType("i", "int", i);
        printType("b", "byte", b);
        printType("s", "short", s);
        printType("l", "long", l);
        printType("f", "float", f);
        printType("d", "double", d);
        System.out.println();

        ///  Task 2
        float x1 = 27.12f;
        long x2 = 987678965549l;
        float x3 = 2.786f;
        short x4 = 569;
        short x5 = -159;
        short x6 = 27897;
        byte x7 = 67;

        ///  Task 3
        short paper = 480;
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        System.out.println("На каждого ученика рассчитано " + (paper/(teacher1+teacher2+teacher3)) + " листов бумаги");
        System.out.println();

        /// Task 4
        machineWork(20, (24*60), (3*24*60), (30*24*60));

        /// Task 5
        byte paint = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        System.out.println("В школе, где " + paint/(whitePerClass+brownPerClass) +
                " классов, нужно " + paint/(whitePerClass+brownPerClass)*whitePerClass + " банок белой краски и "
                + paint/(whitePerClass+brownPerClass)*brownPerClass + " банок коричневой краски");
        System.out.println();

        /// Task 6
        print((short)(5*80+200/100*105+2*100+4*70),(float)(5*80+200/100*105+2*100+4*70)/1000);

        /// Task 7
        print(7*1000/250, 7*1000/500, (7*1000/250+7*1000/500)/2);

        /// Task 8

        paymentUp("Маша",67760);
        paymentUp("Денис",83690);
        paymentUp("Кристина",76230);
    }
}