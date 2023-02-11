import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun ( 2,4,5,67,7,3,3);
      multiple(3,5,"manish","rushi","Archana");

    }

    static void multiple(int a,int b,String ...v){
    // variable length argument comes always last

        System.out.println(Arrays.toString((a +" "+ b +" " + v).toCharArray()));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
//        all variable data take as a arguments and store as array
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
