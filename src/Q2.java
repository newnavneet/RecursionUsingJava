import java.util.* ;
public class Q2 {
    static int count =0;
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        List<String> list= new ArrayList<>();

        print(str,"",list);
        for(String s:list){
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println(count);
    }

    public static void print(String str, String p, List<String> result){
        if(str.length()==0){
            result.add(p);
            count++;
            return;
        }

        char ch = str.charAt(0);
        print(str.substring(1),p,result);
        print(str.substring(1),p+ch,result);
        print(str.substring(1),p+(int)ch,result);


    }


}
