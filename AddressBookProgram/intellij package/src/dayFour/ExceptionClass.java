package dayFour;

/**
 * Created by student on 16/02/2017.
 */
public class ExceptionClass {
    public static void main(String[] args){
        try {
            compute(1);
            compute(15);
        }catch (MyException e){
            System.out.println("We caught " + e);
        }
    }

    static void compute(int a) throws MyException {     //put throws up here- FORCES you to put compute() method in try catch block when you call it
        System.out.println("Compute(" + a+ ")");
        if (a>10)
            throw new MyException(a);
    }

}

//need to extend Exception class- to create a new exception class
class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail= a;
    }

    public String toString(){
        return "MyException: " + detail;
    }
}