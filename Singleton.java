class Singleton{
    private static Singleton instance;

    //this can have another objects which needs to be singleton


    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null)
            return new Singleton();

        return instance;
    }

}

//multithreading

class Singleton{
    private static Singleton instance;

    //this can have another objects which needs to be singleton


    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null)
            return new Singleton();

        return instance;
    }

}


//more effiecnent - now if its already instialized, threads get execute these method again and again

public static Singleton getInstance(){

    if(instance==null){

        synchronized(Singleton.class){
            if(instance==null)
                instance = new Singleton();
        }


    }
    return instance;

}



