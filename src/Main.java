public class Main {
    public static void main(String[] args) {
        task1();//Задача 1
        task2();//Задача 2
        task3();//Задача 3
        task4();//Задача 4
        task5();//Задача 5
        task6();//Задача 6
        task7();//Задача 7
        task8();//Задача 8
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int a = 2000000;
        byte b = 121;
        short c = 333;
        long d = 75807;
        float e = 3.41f;
        double j = 1.912548936541;
        System.out.println("Значение переменной а с типом int равно " + a + ".");
        System.out.println("Значение переменной b с типом byte равно " + b + ".");
        System.out.println("Значение переменной c с типом short равно " + c + ".");
        System.out.println("Значение переменной d с типом long равно " + d + ".");
        System.out.println("Значение переменной e с типом float равно " + e + ".");
        System.out.println("Значение переменной j с типом double равно " + j + ".");
    }

    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        float e = 27.12f;
        long d = 987678965549L;
        double j = 2.786;
        var a = 569;
        short c = -159;
        int f = 27897;
        byte b = 67;
        System.out.println("Значение переменной e с типом float равно " + e + ".");
        System.out.println("Значение переменной d с типом long равно " + d + ".");
        System.out.println("Значение переменной j с типом double равно " + j + ".");
        System.out.println("Значение переменной a с типом var равно " + a + ".");
        System.out.println("Значение переменной c с типом short равно " + c + ".");
        System.out.println("Значение переменной f с типом int равно " + f + ".");
        System.out.println("Значение переменной b с типом byte равно " + b + ".");
    }

    public static void task3() {
        //Задача 3
        System.out.println("Задача 3");
        byte class1 = 23;
        short class2 = 27;
        int class3 = 30;
        long classAll = class1 + class2 + class3;
        long paper = 480;
        long paperBy1Student = paper / classAll;
        System.out.println("На каждого ученика рассчитано " + paperBy1Student + " листов бумаги.");
    }

    public static void task4() {
        //Задача 4
        System.out.println("Задача 4");
        byte vmin1 = 16 / 2;
        int vmin20 = vmin1 * 20;
        int vhour1 = vmin1 * 60;
        int vday1 = vhour1 * 24;
        int vmonth1 = vday1 * 30;
        System.out.println("За 20 минут машина произвела " + vmin20 + " штук бутылок.");
        System.out.println("За 1 час машина произвела " + vhour1 + " штук бутылок.");
        System.out.println("За 1 день машина произвела " + vday1 + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + vmonth1 + " штук бутылок.");
    }

    public static void task5() {
        //Задача 5
        System.out.println("Задача 5");
        byte whiteBanks1Class = 2;
        byte brownBanks1Class = 4;
        int all_Banks_1Class = whiteBanks1Class + brownBanks1Class;
        int all_Class = (120 / all_Banks_1Class);
        int allwhiteBanks = all_Class * whiteBanks1Class;
        int allbrownBanks = all_Class * brownBanks1Class;
        System.out.println("В школе, где " + all_Class + " классов, было куплено " + allwhiteBanks + " банок белой краски и " + allbrownBanks + " банок коричневой краски.");
    }

    public static void task6() {
        //Задача 6
        System.out.println("Задача 6");
        short bananas5 = 5 * 80;
        short milk200 = 2 * 105;
        short icecreame2 = 2 * 100;
        short eags4 = 4 * 70;
        int sportbreakfastingramm = bananas5 + milk200 + icecreame2 + eags4;
        float sportbreakfastinkg = sportbreakfastingramm / 1000f;
        System.out.println("Вес спортзавтрака " + sportbreakfastingramm + " грамм или " + sportbreakfastinkg + " килограмм.");
    }

    public static void task7() {
        //Задача 7
        System.out.println("Задача 7");
        double maxday = 7 / 0.25;
        double minday = 7 / 0.5;
        double averageday = (maxday + minday) / 2;
        System.out.println("Спортсмену понадобится на похудение " + maxday + " дней, если он будет терять каждый день по 250 грамм.");
        System.out.println("Спортсмену понадобится на похудение " + minday + " дней, если он будет терять каждый день по 500 грамм.");
        System.out.println("Спортсмену понадобится в среднем " + averageday + " день, чтобы добиться результата похудения.");
    }

    public static void task8() {
        //Задача 8
        System.out.println("Задача 8");
        double masha = 67760 + 67760 * 0.1;
        double kristina = 76230 + 76230 * 0.1;
        double denis = 83690 + 83690 * 0.1;
        double mashadeltagod = (masha - 67760) * 12;
        double kristinadeltagod = (kristina - 76230) * 12;
        double denisdeltagod = (denis - 83690) * 12;
        System.out.println("После индексации в  размере 10% от текущей зарплаты, Маша будет получать " + masha + " рублей в месяц, её годовой доход вырос на " + mashadeltagod+" рублей.");
        System.out.println("Кристина будет получать " + kristina + " рублей в месяц, её годовой доход вырос на " + kristinadeltagod + " рублей.");
                System.out.println("Денис будет получать " + denis + " рублей в месяц, его годовой доход вырос на " + denisdeltagod+ " рублей.");
         }
       }