package lesson18;

public class StaticVariableAndMethods {

    public static int variable;

    public int variable2;

    static{
        variable = foo();

    }



    public static int foo(){
        System.out.println(variable);
        return 1;

    };

    public void show (){
        System.out.println("No");
        foo();

    }





}
