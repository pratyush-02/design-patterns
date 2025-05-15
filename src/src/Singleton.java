public class Singleton {
    private static volatile Singleton singleObject;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleObject == null){
            synchronized (Singleton.class){
                if(singleObject == null){
                    singleObject = new Singleton();
                }
            }
        }
        return singleObject;
    }
}
