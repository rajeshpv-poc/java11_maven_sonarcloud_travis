package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo(){}

    public static int div(int a, int b) throws Throwable {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
