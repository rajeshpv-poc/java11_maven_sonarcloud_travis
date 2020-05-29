package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo(){}

    public static int div(int a, int b) throws WrongOperation {
    	if (b == 0) {
    		throw new WrongOperation("Can't divide by zero!");
    	}
        return a / b;  
    }

}
