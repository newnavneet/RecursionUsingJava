public class Factorial {
    public static int fact(int n ){
        // Base Case
         if(n==0){
             return 1;
         }



         else {
             return n*fact(n-1);  // recursive calls

    }

}

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }



}
