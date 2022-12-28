package SingletonCreationalPattern;

public class SingletonPatternDemo {
    public static void main ( String[] args ) {

        // illegal construct
        // Compile time error : The constructor single object() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance ();

        // Show the message
        object.showMessage ();

    }
}
