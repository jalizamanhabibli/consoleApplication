package beans;

import config.Inititization;

import java.io.Serializable;

public class User implements Serializable {
    private  final String username="Alizaman";
    private  final String password="12345";
    private  int point;

    public  String getUsername() {
        return username;
    }

    public  String getPassword() {
        return password;
    }

    public  int getPoint() {
        return point;
    }

    public  void setPoint(int point) {
        this.point = point;
        Inititization.refreshConfig();
    }
}
