package config;

import util.FileUtil;

public class Inititization {
    public static Config config=new Config();

    public static Config inititizationRead(){
        Object obj= FileUtil.ObjectReadToFile();
        if(obj!=null){
            config= (Config)obj;
        }
        return config;
    }
    public static void refreshConfig(){
        FileUtil.objectWriteToFIle(config);
    }
}
