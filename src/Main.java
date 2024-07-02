public class Main {
    public static void main(String[] args)   {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ");

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" ");

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i +2){
            System.out.println(i);
        }
        System.out.println(" ");

        System.out.println("Task 4");
        for (int i = 10;i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Task 5");
        for (int y = 1904; y <= 2096; y=y+4){
            System.out.println(y + " год является високостным.");
        }
        System.out.println("");

        System.out.println("Task 6");
        for (int i = 7;i <=98; i=i+7){
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Task 7");
        for (int i = 1;i<=512;i=i*2){
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Task 8");
        int accumulation = 29000;
        int total = 0;
        for (int i=0;i<12;i++){
            total=total+accumulation;
            System.out.println("Месяц "+i+", сумма накомлений равна " + total + " рублей.");
        }
        System.out.println("");

        System.out.println("Task 9");
        int accumulation1 = 29000;
        int total1 = 0;
        for (int i=1;i<=12;i++){
            total1=total1+accumulation1;
            total1=total1 + total1/100;
            System.out.println("Месяц "+i+", сумма накомлений равна " + total1 + " рублей.");
        }
        System.out.println("");

        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}