package util;

import java.io.*;

public class FileUtil {
    public static void objectWriteToFIle(Object obj){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Alizaman.ser"))) {
            oos.writeObject(obj);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static Object ObjectReadToFile(){
        Object obj=null;
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Alizaman.ser"))) {
            obj=ois.readObject();
        }catch (ClassNotFoundException|IOException ex){
            //ex.printStackTrace();
        }
        return obj;
    }
}
