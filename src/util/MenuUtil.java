package util;

import java.util.Scanner;

public class MenuUtil {
    public static int showMenu(){
        System.out.print("1.Yarışmacıları register et\n" +
                "2.Istirakcilara bax\n" +
                "3.Yarışmaya başla\n" +
                "4.Istirakcilarin sayini artir\n" +
                "5.Xalini oyren\n" +
                "6.Logout\n" +
                "7.Exit\n" +
                "Menudan seciminizi edin: ");
        Scanner scan = new Scanner(System.in);
        int selectedMenu = scan.nextInt();
        if(selectedMenu > 0 && selectedMenu < 8)
            return selectedMenu;
        else
            System.out.print("Yalnis secim!\n");return -1;
    }
    public static int showMenuInfinit(){
        while(true) {
            int selectedMenu=showMenu();
            if(selectedMenu==1){
                CompetitionUtil.registerCompetitorsAndShowInfo();
            }else if(selectedMenu==2){
                CompetitionUtil.printCompetitors();
            }else if(selectedMenu==3){
                CompetitionUtil.startCompatition();
            } else if(selectedMenu==4){
                CompetitionUtil.increaseCompetitor();
            }else if(selectedMenu==5){
                CompetitionUtil.showPoint();
            } else if(selectedMenu==6){
                UserUtil.registerLogin(3);
            }else if(selectedMenu==7){
                return -1;
            }
        }
    }
}
