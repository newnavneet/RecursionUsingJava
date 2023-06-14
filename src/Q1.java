
import java.util.*;

public class  Q1{
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        while(n-->0){
            String str= sc.next();
            List<String> list= new ArrayList<>();
            print(str,"",list);

            Collections.sort(list);

            for(String str2:list){
                System.out.println(str2);
            }

        }

    }

    public static void print(String str,String p,List<String> result){

        if(str.length()==0){
            result.add(p);
            return;
        }
        char ch= str.charAt(0);
        print(str.substring(1),p+ch,result);
        print(str.substring(1),p,result);

    }



}
