import java.util.* ;
public class Q3 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        List<String> lst= new ArrayList<>();
        search(str,"",lst);

        System.out.println(lst);

    }

    public static void search(String str,String p,List<String> lst){
        if(str.isEmpty()){
            lst.add(p);
            return;
        }
        for(int i=1;i<=str.length();i++){
            String n=str.substring(0,i);
            if(isValid(n)){
                char ch= (char)(Integer.parseInt(n)-1+'a');

                String remain=str.substring(i);
                search(remain,p+ch,lst);
            }

        }

    }
    public static boolean isValid(String str){
        if(str.length()>2|| str.length()==0){
            return false;
        }else if(Integer.parseInt(str)>26){
            return false;
        }else{
            return true;
        }
    }

}
