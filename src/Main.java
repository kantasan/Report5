/**
 * Created by e165701 on 2016/12/12.
 */
public class Main {
    public static void main(String[]args){
        String str = null;


        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println(e.toString()+ "が起きました。");
            e.printStackTrace();
        }

     }
}

