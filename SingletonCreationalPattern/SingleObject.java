package SingletonCreationalPattern;

public class SingleObject {

    //Create an object of SingleObject
    private static SingleObject instance = new SingleObject ();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){

        return instance;

    }
    public void showMessage(){
        System.out.println ("Hello World! ");
    }

    /*
    *
    * private static SingleObject instance;
    * private SingleObject(){}
    *
    * public static SingleObject getInstance(){
          if(instance == null)
    *       instance = new SingleObject ();
    *
        return instance;

        }
    *
    * */

    /*
    *
    * public sealed class Singleton{
    *
    * private static Singleton instance = null;
    * private static readonly object padlock = new object();
    *
    * Singleton(){
    * }
    *
    * public static Singleton Instance{
    *
    * get{
    *
    * lock(padlock){
    *
    * if(instance == null)
    *       instance = new SingleObject ();
    *
    *  return instance;
    *
    * }
    *
    * }
    *
    * }
    *
    * }
    *
    * */

}
