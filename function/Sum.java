import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
  /*  access modifier return_type name () {
    //body
    return  statement;
   */
//      int ans =  sum2();
//        System.out.println(ans);

        int ans =sum3(30,54);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum = a + b ;
        return sum;
    }
    // pass the value of numbers when you are calling the method in main()
//    static void sum() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entered the first number");
//        int num1 = sc.nextInt();
//        System.out.println("Entered the second number");
//        int num2 =sc.nextInt();
//        int sum = num1 + num2 ;
//        System.out.println("the sum is =" + sum );

    static int sum2(){
        // return the value
            Scanner sc = new Scanner(System.in);
            System.out.println("Entered the first number");
            int num1 = sc.nextInt();
            System.out.println("Entered the second number");
            int num2 =sc.nextInt();
            int sum = num1 + num2 ;
            return sum;
//            after this no code executed

        }

}