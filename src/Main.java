import beans.User;
import util.MenuUtil;
import util.UserUtil;

public class Main {
    /*
    * 1ci Login Sehifesi hazirlanmali
    * 2ci Menu teqdim olunmali User menudan bir deyer secir
    */
    public static void main(String[] args) throws ClassNotFoundException {
        User user=UserUtil.registerLogin(3);
        System.out.println("Hello "+ user.getUsername());
        MenuUtil.showMenuInfinit();

    }
}
