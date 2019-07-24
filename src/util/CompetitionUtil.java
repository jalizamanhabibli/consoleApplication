package util;

import beans.Competitor;
import beans.User;
import config.Config;
import java.util.Scanner;

    public class CompetitionUtil {

    private static User user =new User();

    public static Competitor[] registerCompetitors(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Nece istirakci daxil etmek isteyirsiniz: ");
        int competitorCount=scan.nextInt();
        Competitor[] competitors=new Competitor[competitorCount];
        for(int i=0;i<competitorCount;i++){
           Competitor competitor= registerCompetitor(i+1);
           competitors[i]=competitor;
        }
        Config.setCompetitors(competitors);
        System.out.println("All competitors successfully register!");
        return competitors;
    }
    public static Competitor[] registerCompetitorsAndShowInfo(){
        Competitor[] competitors= CompetitionUtil.registerCompetitors();
        CompetitionUtil.printCompetitors(competitors);
        return competitors;
    }
    public static Competitor registerCompetitor(int i){
        Scanner scan=new Scanner(System.in);
        System.out.print(i+".Istirakci adi: ");
        String name=scan.nextLine();
        System.out.print(i+".Istirakci soyadi: ");
        String surname=scan.nextLine();
        System.out.print(i+".Istirakci yasi: ");
        int age=scan.nextInt();

        Competitor competitor=new Competitor(name,surname,age);

        return competitor;
    }

    public static void printCompetitors(Competitor[] competitors){
        if(competitors==null||competitors.length==0){
            System.out.println("null");
            return;
        }
        for(int i=0;i<competitors.length;i++){
            Competitor competitor=competitors[i];
            System.out.println(competitor);
        }
    }
    public static void printCompetitors(){
        printCompetitors(Config.getCompetitors());
    }
    public static boolean startCompatition(){
        Competitor[] competitors=Config.getCompetitors();
        if(competitors==null||competitors.length==0){
            System.out.println("Istirakcilar daxil edilmeyib!");
            return false;
        }
        else{
            int winner = (int)(Math.random() * (competitors.length));
            Scanner scan = new Scanner(System.in);
            while(true) {
                System.out.print("Sizce secilen istirakci kimdir? ");
                String guessName = scan.nextLine();
                if(competitors[winner].getName().equals(guessName)){
                    System.out.println("You won!");
                    increacePoint();
                    return true;
                } else {
                    System.out.println("You failed!");
                }
            }
        }
    }
    public static void increacePoint(){
        user.setPoint(user.getPoint()+10);
    }
    public static void showPoint(){
        System.out.println("Sizin xaliniz: "+user.getPoint());
    }
    public static void increaseCompetitor(){
        Competitor[] oldCompetitors=Config.getCompetitors();
        if(oldCompetitors==null||oldCompetitors.length==0){
            System.out.println("Istirakcilar daxil edilmeyib!");
        }else{
            System.out.print("Nece istirakci elave etmek isteyirsiniz? ");
            Scanner scan =new Scanner(System.in);
            int addCompetitor=scan.nextInt();
            Competitor[] newCompetirors = new Competitor[oldCompetitors.length + addCompetitor];
            for (int i = 0; i < oldCompetitors.length; i++) {
                newCompetirors[i] = oldCompetitors[i];
            }
            for (int i = oldCompetitors.length; i < newCompetirors.length; i++) {
                newCompetirors[i] = registerCompetitor(i+1);
            }
            Config.setCompetitors(newCompetirors);
        }
    }


}
