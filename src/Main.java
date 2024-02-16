public class Main {
    public static void main(String[] args) {
        int a=-5;
        byte b=8;
        short c=200;
        long d=10L;
        float e=15.6F;
        double f=54.5;
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d+" e="+e+" f="+f);

        float g=27.12F;
        long h=987_678_965_549L;
        double i=2.786;
        short j=569; //не написала int, т.к. в задании было указано использовать ВСЕ типы переменных
        int k=-159;
        long l=27897L; //не написала int, т.к. в задании было указано использовать ВСЕ типы переменных
        byte m=67; //не написала int, т.к. в задании было указано использовать ВСЕ типы переменных
        System.out.println(g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m);

        int ludmilaPavlovna=23;
        int annaSergeevna=27;
        int ekaterinaAndreevna=30;
        int allSchoolChildren=ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna;
        int paper=480;
        int paperForOne=paper/allSchoolChildren;
        System.out.println("На каждого ученика рассчитано по "+paperForOne+" листов бумаги.");

        int bottle=16;
        int minute=2;
        int oneMinute=bottle/minute;
        int twentyMinutes=oneMinute*20;
        System.out.println("За 20 минут машина произвела "+twentyMinutes+" штук бутылок");
        int oneDay=oneMinute*1440;
        System.out.println("За сутки машина произвела "+oneDay+" штук бутылок");
        int threeDays=oneDay*3;
        System.out.println("За 3 дня произвела "+threeDays+" штук бутылок");
        int oneMontn=oneDay*30;
        System.out.println("За месяц машина произвела "+oneMontn+" штук бутылок");

        int whitePaint=2;
        int brownPaint=4;
        int allThePaint=120;
        int numberOfOffices=allThePaint/(whitePaint+brownPaint);
        int allWhitePaint=numberOfOffices*whitePaint;
        int allBrownPaint=numberOfOffices*brownPaint;
        System.out.println("В школе, где "+numberOfOffices+" классов, нужно "+allWhitePaint+" банок белой краски и "+allBrownPaint+" банок коричневой краски");

        int bananas=80;
        int milk=105;
        int iceCream=100;
        int egg=70;
        int allBananas=bananas*5;
        int allMilk=milk*2;
        int allIceCream=iceCream*2;
        int allEgg=egg*4;
        int sportsBreakfast=allBananas+allMilk+allIceCream+allEgg;
        float sportBreakfastInKG=sportsBreakfast/1000F;
        System.out.println("В спортивном завтраке "+sportsBreakfast+" грамм, или "+sportBreakfastInKG+" килограмм");

        int optionOne=250;
        int oneKilos=1000;
        int numberOfKilos=7;
        int numberOfGrams=numberOfKilos*oneKilos;
        int deysOptionOne=numberOfGrams/optionOne;
        int optionTwo=500;
        int deysOptionTwo=numberOfGrams/optionTwo;
        double averageValue=(optionOne+optionTwo)/2;
        double deysAverageValue=numberOfGrams/averageValue; //исправить на float!!!!!!!!!!!!
        System.out.println(deysOptionOne+" "+deysOptionTwo+" "+deysAverageValue);

        int masha=67760;
        int denis=83690;
        int kristina=76230;
        int mOneE=masha*12;
        int dOneE=denis*12;
        int kOneE=kristina*12;
        int mPercent=((masha*10)/100)+masha;
        int dPercent=((denis*10)/100)+denis;
        int kPercent=((kristina*10)/100)+kristina;
        int mPOneE=mPercent*12;
        int dPOneE=dPercent*12;
        int kPOneE=kPercent*12;
        int mIncomeDifference=mPOneE-mOneE;
        int dIncomeDifference=dPOneE-dOneE;
        int kIncomeDifference=kPOneE-kOneE;
        System.out.println("Маша теперь получает "+mPercent+" рублей. Годовой доход вырос на "+mIncomeDifference+" рублей");
        System.out.println("Денис теперь получает "+dPercent+" рублей. Годовой доход вырос на "+dIncomeDifference+" рублей");
        System.out.println("Кристина теперь получает "+kPercent+" рублей. Годовой доход вырос на "+kIncomeDifference+" рублей");


    }
}