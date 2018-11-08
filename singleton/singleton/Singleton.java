package singleton.singleton;

public class Singleton {
    //最简单的避免同步问题，但是一开始就加载出来，浪费资源
//    private static Singleton singleton = new Singleton();

    private static volatile Singleton singleton;    //volatile 打开内存可见

    private Singleton(){

    }

    //懒加载，但是存在同步问题
//    public  static Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //避免同步问题，但是性能下降很多
//    public synchronized static Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }


    //双层锁
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){     //双层锁
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
