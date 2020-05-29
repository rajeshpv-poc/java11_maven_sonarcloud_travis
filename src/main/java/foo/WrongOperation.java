package foo;

public class WrongOperation extends Exception {
    public WrongOperation(){
        this("Wrong Operation");
    }

    public WrongOperation(String msg){
        super(msg);
    }

}
