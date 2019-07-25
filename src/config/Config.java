package config;

import beans.Competitor;
import beans.User;
import java.io.Serializable;

public class Config implements Serializable {
    private  User user=new User();
    private  Competitor[] competitors=null;

    public  User getUser() {
        return user;
    }

    public  Competitor[] getCompetitors() {
        return competitors;
    }

    public  void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
        Inititization.refreshConfig();
    }
}
