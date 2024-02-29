public class Main {
    public static void main(String[] args) {
                                                       // задача 1
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
                                                       // задача 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
                                                       // задача 3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
                                                         // задача 4
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
                                                          // задача 5
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
                                                           // задача 6
        var boxer1Weight=78.2;
        var boxer2Weight=82.7;
        var summaryWeight=boxer1Weight+boxer2Weight;
        System.out.println(summaryWeight);
        var differenceWeight=boxer2Weight-boxer1Weight;
        System.out.println(differenceWeight);
                                                           // задача 7
        var remains=summaryWeight%differenceWeight;        //непонятно, остаток между весами боксеров или между суммой и разницей, в условиях не указано
        System.out.println(remains);
                                                            // задача 8.1
        var totalHours=640;
        var individualPerDay=8;
        var personnelCount=totalHours/individualPerDay;
        System.out.println("Всего работников в компании " + personnelCount + " человек");
                                                            // задача 8.2
        personnelCount=personnelCount+94;
        individualPerDay=totalHours/personnelCount;
        System.out.println("Если в компании работает " + personnelCount + " человек, то всего " + individualPerDay + " часов работы может быть поделено между сотрудниками");
                                                                          //для пулл реквеста
    }
}