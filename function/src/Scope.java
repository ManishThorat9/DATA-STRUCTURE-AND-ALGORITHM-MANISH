import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =23;
        System.out.println("A =" + a);
        // function scope= variable declare in function
        random();
        {
            //  BLOCK SCOPE


            a = 78 ; // reassign the origin ref variable to some other variables
            // we can't initialise previously initialise data-items but modify in block scope
            int c =03;
            System.out.println(c);
            // values initialised in this block , will remain in block

        }
        //System.out.println(c);
        // we can't use c outside the block

        // LOOPS SCOPE
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num =90;

        }
       // System.out.println(num);
        // we can't use num outside the loop


    }
    // FUNCTION SCOPE
    static  void random(){
        int a = 23;
        System.out.println("A =" + a);
        // this change will only be valid in this function scope only

    }
}
