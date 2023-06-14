public class CharactersofString {

    public static void print(String  str){
        if(str.length() == 0){
            return;
        }
        else {
            //System.out.println(str.charAt(0));
           // print(str.substring(1));

            // REVERSE
            print(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    public static void main(String[] args) {
        print("code ");

    }
}
