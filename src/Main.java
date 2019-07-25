import config.Config;
import config.Inititization;
import util.MenuUtil;
import util.UserUtil;

public class Main {
    /*
    * 1ci Login Sehifesi hazirlanmali
    * 2ci Menu teqdim olunmali User menudan bir deyer secir
    */
    public static void main(String[] args) {
        UserUtil.registerLogin(3);
        Config config = Inititization.inititizationRead();
        System.out.println("Hello "+ config.getUser().getUsername());
        MenuUtil.showMenuInfinit();

    }
}
