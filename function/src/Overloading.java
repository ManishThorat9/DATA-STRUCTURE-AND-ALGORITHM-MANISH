public class Overloading {
    public static void main(String[] args) {
    fun(93);
    fun("manish");
    int ans = sum(3,4);
        System.out.println(ans);
 // compiler search function by it:
//        1) name
//        2) arguments and its quantity
//        3)datatype
    int answer = sum(3,5,6);
        System.out.println(answer);


    // FUNCTION OVERLOADING

//   in same function  we can use same name but different value
//   but use different datatype
    }
    static  int sum(int a,int b){
        return a+b;
    }
    static  int sum(int a,int b ,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }


}
