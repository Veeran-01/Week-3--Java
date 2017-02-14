package dayOne;

/**
 * Created by student on 13/02/2017.
 */
public class Example {
    //needs to be public so jvm can access
    //need to create main method
    public static void main(String[] args){
        whileLoop();
    }

    static void whileLoop(){
        //uppercase System-to call class NOT package
        System.out.println("Starting to count...");

        int counter = 0;

        while (counter<=100){
            System.out.println(counter);
            counter++;
        }

        System.out.println("Finished counting");
    }
}
