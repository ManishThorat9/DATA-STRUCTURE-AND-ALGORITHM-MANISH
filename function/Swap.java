public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=23;
        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        Swap(a,b);
        System.out.println(a +" "+ b );
    }
    static void Swap(int a ,int b){ //here we pass copy of object a and b
        int temp = a;  // here we're not changing the object we create new object
        a = b;
        b = temp;
    }
}
