public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int firstType = 30000000;
        System.out.println("Значение переменной firstType с типом int равно " + firstType);

        byte secondType = 100;
        System.out.println("Значение переменной secondType с типом byte равно " + secondType);

        short thirdType = 15000;
        System.out.println("Значение переменной thirdType с типом short равно " + thirdType);

        long fourthType = 607000000L;
        System.out.println("Значение переменной fourthType с типом long равно " + fourthType);

        float fifthType = 1.4995f;
        System.out.println("Значение переменной fifthType с типом float равно " + fifthType);

        double sixthType = 799.991;
        System.out.println("Значение переменной sixthType с типом double равно " + sixthType);
    }

    public static void task2() {
        System.out.println("Задача 2");

        /* 27.12
        987 678 965 549
        2.786
        569
                -159
        27897
        67
                 */
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;


    }

    public static void task3() {
        System.out.println("Задача 3");

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;

        short allPaper = 480;
        int allStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;

        int paperForOne = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + paperForOne + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        int capacityPerMinute = bottles / time;
        byte givenTime1 = 20;
        int capacityPerTime = capacityPerMinute * givenTime1;
        System.out.println("За " + givenTime1 + " минут машина произвела " + capacityPerTime + " штук бутылок");

        byte givenTime2 = 1;
        int dayToMinutes = givenTime2 * 1440;
        int capacityPerTime2 = capacityPerMinute * dayToMinutes;
        System.out.println("За " + givenTime2 + " сутки машина произвела " + capacityPerTime2 + " штук бутылок");

        byte givenTime3 = 3;
        int dayToMinutes2 = givenTime3 * 1440;
        int capacityPerTime3 = capacityPerMinute * dayToMinutes2;
        System.out.println("За " + givenTime3 + " суток машина произвела " + capacityPerTime3 + " штук бутылок");

        byte givenTime4 = 1;
        int monthToMinutes = givenTime4 * 30 * 1440;
        int capacityPerTime4 = capacityPerMinute * monthToMinutes;
        System.out.println("За " + givenTime4 + " месяц машина произвела " + capacityPerTime4 + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classesQuantity = allPaint / (whitePaint + brownPaint);
        int allWhitePaint = classesQuantity * whitePaint;
        int allBrownPaint = classesQuantity * brownPaint;

        System.out.println("В школе, где " + classesQuantity + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");

        byte oneBanana = 80;
        byte quantityBananas = 5;
        int overallWeightBananas = oneBanana * quantityBananas;

        short milk = 200;
        short weightMilk = 105/100;
        int overallWeightMilk = milk * weightMilk;

        byte quantityIcecream = 2;
        byte weightIcecream = 100;
        int overallWeightIcecream = quantityIcecream * weightIcecream;

        byte quantityEgg = 4;
        byte weightEgg = 70;
        int overallWeightEgg = quantityEgg * weightEgg;

        int fullWeight = overallWeightBananas + overallWeightMilk + overallWeightIcecream + overallWeightEgg;
        float oneKg = 1000;
        float fullWeightKg = fullWeight / oneKg;

        System.out.println("Общий вес спортзавтрака в граммах " + fullWeight + ", что в килограммах " + fullWeightKg);

    }
    public static void task7() {
        System.out.println("Задача 7");
        byte weightToLose = 7;
        short minLose = 250;
        short maxLose = 500;
        short gramInKilos = 1000;

        int daysMinLose = (weightToLose * gramInKilos) / minLose;
        int daysMaxLose = (weightToLose * gramInKilos) / maxLose;
        System.out.println( daysMinLose + " дней до потери веса при минимальном значении");
        System.out.println( daysMaxLose + " дней до потери веса при максимальном значении");

        int averageLose = (minLose + maxLose) / 2;
        int daysAverageLose = (weightToLose * gramInKilos) / averageLose;
        System.out.println( daysAverageLose + " дней до потери веса при среднем значении");

    }
    public static void task8() {
        System.out.println("Задача 8");

        int currentMashaSalary = 67760;
        int currentDenisSalary = 83690;
        int currentKristinaSalary = 76230;
        float indexing = 1.10f;
        byte year = 12;

        float futureMashaSalary = currentMashaSalary * indexing;
        float futureDenisSalary = currentDenisSalary * indexing;
        float futureKristinaSalary = currentKristinaSalary * indexing;

        int fullCurrentMashaSalary = currentMashaSalary * year;
        float fullFutureMashaSalary = futureMashaSalary * year;
        float mashaSalaryDifference = fullFutureMashaSalary - fullCurrentMashaSalary;

        int fullCurrentDenisSalary = currentDenisSalary * year;
        float fullFutureDenisSalary = futureDenisSalary * year;
        float denisSalaryDifference = fullFutureDenisSalary - fullCurrentDenisSalary;

        int fullCurrentKristinaSalary = currentKristinaSalary * year;
        float fullFutureKristinaSalary = futureKristinaSalary * year;
        float kristinaSalaryDifference = fullFutureKristinaSalary - fullCurrentKristinaSalary;

        System.out.println("Маша теперь получает " + futureMashaSalary + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей");

        System.out.println("Денис теперь получает " + futureDenisSalary + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей");

        System.out.println("Кристина теперь получает " + futureKristinaSalary + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей");

    }
    }
