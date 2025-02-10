public class Main {
    public static void main(String[] args) {
        class Main {
            public static void main (String[] args) {
                byte first = 1;
                short second = 2;
                int thrid = 3;
                long fourth = 4L;
                System.out.println(first + second + thrid + fourth);

                float a = 27.12F;
                long b = 987678965549L;
                float c = 2.768F;
                short d = 569;
                short f = -159;
                short g = 27897;
                byte h = 67;

                byte LP = 23;
                byte AS = 27;
                byte EA = 30;
                int schoolKids = (LP + AS + EA);
                System.out.println("Всего учеников " + schoolKids + " суммарно");
                short papers = 480;
                int eachChildren = papers / schoolKids;
                System.out.println("На каждого ученика рассчитано " + eachChildren + " листов бумаги");

                byte min2 = 16;
                int min20 = min2 * 10;
                System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
                int day1 = min2 * 1200;
                System.out.println("За 1 сутки машина произвела " + day1 + " штук бутылок");
                int day3 = min2 * 3600;
                System.out.println("За 3-ое суток машина произвела " + day3 + " штук бутылок");
                int month1 = min2 * 43800;
                System.out.println("За месяц машина произвела " + month1 + " штук бутылок");

                byte twoColors = 120;
                byte white = 2;
                byte brown = 4;
                int whiteColors = twoColors / white;
                int brownColors = twoColors / brown;
                int rooms = 120 / (2 + 4);
                System.out.println("В школе, где " + rooms + " классов, нужно " + whiteColors + "  белой краски и " + brownColors + " банок коричневой краски");

                byte bananas = 5;
                short milk = 105;
                short iceCream = 100;
                short eggs = 70;
                int coctail = (bananas * 80) + (milk * 2) + (iceCream * 2) + (eggs * 4);
                System.out.println("Граммов в данном спортзавтраке равно " + coctail);
                float sportCoctail = coctail / 1000;
                System.out.println("Кг в данном спортзавтраке равно " + (float) sportCoctail);

                short allKG = 7 * 1000;
                short on250 = 250;
                short on500 = 500;
                int on250g = allKG / on250;
                int on500g = allKG / on500;
                System.out.println("Дней для похудения по 250 грамм понадобится " + on250g + " , а по 500 грамм понадобится " + on500g + " дней");

                int masha = 67760;
                int denis = 83690;
                int cristina = 76230;
                int mashayear = 67760 * 12;
                int denisyear = 83690 * 12;
                int cristinayear = 76230 * 12;
                int mashanew = 67760 + (67760 / 10);
                int denisnew = 83690 + (83690 / 10);
                int cristinanew = 76230 + (76230 / 10);
                int mashanewyear = (mashanew * 12);
                int denisnewyear = (denisnew * 12);
                int cristinanewyear = (cristinanew * 12);
                int differenceLastYearMasha = mashanewyear - mashayear;
                int differenceLastYearDenis = denisnewyear - denisyear;
                int differenceLastYearCristina = cristinanewyear - cristinayear;
                System.out.println("Маша теперь получает " + mashanewyear + " рублей, годовой доход вырос на " + differenceLastYearMasha + " Рублей");
                System.out.println("Денис теперь получает " + denisnewyear + " рублей, годовой доход вырос на " + differenceLastYearDenis + " Рублей");
                System.out.println("Кристина теперь получает " + cristinanewyear + " рублей, годовой доход вырос на " + differenceLastYearCristina + " Рублей");


            }
        }
    }
}
