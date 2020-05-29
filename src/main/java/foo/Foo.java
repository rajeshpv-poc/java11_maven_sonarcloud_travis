package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo(){}

    static String storedValue = null;
//    static String storedNullValue = null;

    public static int div(int a, int b) throws WrongOperation {
    	if (b == 0) {
    		throw new WrongOperation("Can't divide by zero!");
    	}
        return a / b;  
    }

    public static void main(String[] args){
        OptModel model = new OptModel();

        // test-1
        if (model.getWithValue().isPresent()){
            storedValue = model.getWithValue().get();
            System.out.println("This WILL print:: storedValue=" + storedValue);
        }

        /*
        // test-2
        if (model.getWithoutValue().isPresent()){
            storedNullValue = model.getWithoutValue().get();
            System.out.println("THis will NOT print:: storedNullValue=" + storedNullValue);
        }*/
    }

}
