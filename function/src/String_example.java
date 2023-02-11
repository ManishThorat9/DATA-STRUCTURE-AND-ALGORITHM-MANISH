import java.util.Scanner;

public class String_example {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = sc.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);

    }
    static String myGreet(String name){
        String message = "hello" + name;
        return message;
    }

    static  String greet(){
        String greeting =" how are you manish ";
        return greeting;
    }
}
