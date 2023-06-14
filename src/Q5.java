

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<String> lst= new ArrayList<>();
        count(n,lst);
        Collections.sort(lst);
        for(String i:lst){
            System.out.print(i+" ");
        }
    }
    public static void count(int n,List<String> result){
        if(n<0){
            return;
        }
        result.add(n+"");
        count(--n,result);
    }

}
