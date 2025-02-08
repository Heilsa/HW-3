public class Main {
    public static void main(String[] args) {
        byte first = 111;
        short second = 22330;
        int thrid = 3456789;
        long fourth = 4273894578L;
        System.out.println(first);
        System.out.println(second);
        System.out.println(thrid);
        System.out.println(fourth);

        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.768F;
        short d = 569;
        short f = -159;
        short g = 27897;
        byte h = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        byte teach1 = 23;
        byte teach2 = 27;
        byte teach3 = 30;
        byte school = (byte) (teach1 + teach2 + teach3);
        System.out.println("Всего учеников " + school + " суммарно");
        short papers = 480;
        short eachChildren = (short) (papers / school);
        System.out.println("На каждого ученика рассчитано " + eachChildren + " листов бумаги");

        byte bottle = 16;
        byte time = 2;
        byte time20 = (byte) (20 * 16);
        System.out.println("За 20 минут машина произвела " + time20 + " штук бутылок");
        short days1 = 1440;
        short day1 = (short) (days1 / bottle);
        System.out.println("За 1 сутки машина произвела " + day1 + " штук бутылок");
        short days3 = 4320;
        short day3 = (short) (days3 / bottle);
        System.out.println("За 3-ое суток машина произвела " + day3 + " штук бутылок");
        short months1 = (short) 44640;
        short month1 = (short) (months1 / bottle);
        System.out.println("За месяц машина произвела " + month1 + " штук бутылок");

        byte twoColors = 120;
        byte white = 2;
        byte brown = 4;
        byte rooms = 120 / (2 + 4);
        byte whiteColors = (byte) (twoColors - (rooms * brown));
        byte brownColors = (byte) (twoColors - whiteColors);
        System.out.println("В школе, где " + rooms + " классов, нужно " + whiteColors + "  белой краски и " + brownColors + " банок коричневой краски");

        byte bananas = 5;
        short milk = 105;
        short iceCream = 100;
        short eggs = 70;
        short coctail = (short) ((bananas * 80) + (milk * 2) + (iceCream * 2) + (eggs * 4));
        System.out.println("Граммов в данном спортзавтраке равно " + coctail);
        float sportCoctail = (float) coctail / 1000;
        System.out.println("Кг в данном спортзавтраке равно " + sportCoctail);

        short allKG = 7 * 1000;
        short on250 = 250;
        short on500 = 500;
        short on250g = (short) (allKG / on250);
        short on500g = (short) (allKG / on500);
        System.out.println("Дней для похудения по 250 грамм понадобится " + on250g + " , а по 500 грамм понадобится " + on500g + " дней");
        short mid = (short) (on250g + on500g);
        short midday = (short) (allKG / mid);
        System.out.println("Дней в среднем понадобится для похудения " + midday );

        short masha = (short) 67760;
        short denis = (short) 83690;
        short cristina = (short) 76230;
        short mashanew = (short) (67760 + (67760 / 10));
        short denisnew = (short) (83690 + (83690 / 10));
        short cristinanew = (short) (76230 + (76230 / 10));
        short mashaoldyear = (short) (masha * 12);
        short denisoldyear = (short) (denis * 12);
        short cristinaoldyear = (short) (cristina * 12);
        short mashaNewYear = (short) (mashanew * 12);
        short denisNewYear = (short) (denisnew * 12);
        short cristinaNewYear = (short) (cristinanew * 12);
        short differencemasha = (short) (mashaNewYear - mashaoldyear);
        short differencedenis = (short) (denisNewYear - denisoldyear);
        short differencecristina = (short) (cristinaNewYear - cristinaoldyear);
        short alldiffMasha = (short) (mashaNewYear - differencemasha);
        short alldiffDenis = (short) (denisNewYear - differencedenis);
        short alldiffCristina = (short) (cristinaNewYear - differencecristina);
        System.out.println("Маша в новом году за год будет получать " + mashaNewYear + " Денис будет получать " + denisNewYear + " Кристина будет получать " + cristinaNewYear + " рублей");
        System.out.println("Разница у Маши с предыдущем годом будет составлять " + alldiffMasha + " Разница у Дениса будет составлять " + alldiffDenis + " Разница у Кристины будет составлять " + alldiffCristina + " Рублей");
    }
}