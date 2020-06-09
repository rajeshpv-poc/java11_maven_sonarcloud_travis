package foo;

import java.util.Optional;

/**
 * Foo class
 */
public class Foo {

    private Foo(){}

    static String storedValueTest1 = null;
    static String storedValueTest2 = null;

    public static int div(int a, int b) throws WrongOperation {
    	if (b == 0) {
    		throw new WrongOperation("Can't divide by zero!");
    	}
        return a / b;  
    }

    public static void main(String[] args){
        final OptModel model = new OptModel();

        // test-1
        if (model.getWithValue().isPresent()){
            storedValueTest1 = model.getWithValue().get();
            System.out.println("This WILL print:: storedValueTest1=" + storedValueTest1);
        }


        // test-2
        final Optional<String> optString = model.getWithValue();
        if (optString.isPresent()){
            storedValueTest2 = optString.get();
            System.out.println("This WILL print:: storedValueTest2=" + storedValueTest2);
        }
    }

}
