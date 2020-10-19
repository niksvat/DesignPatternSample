class Base{

    private Strategy1 s1;

    public Base(Strategy1 s1){
        this.s1=s1;
    }


    public void execute(){
        this.s1.run();
    }

}

class Child extends Base{

    public Child(Strategy1 s1){
        super(s1);
    }

    public void log(){
        System.out.println("Logged into the log file");
    }

}


interface Strategy1{
    public void run();
}

//----------------------------------------- ABOVE Pattern --------------------
// Example comparator and comparable interfaces

class Strategy1Concrete implements Strategy1{
    public void run(){
        System.out.println("My own strategy ran");
    }
}

class StrategyDesignP{

    public static void main(String... args){


        
        Child c1 = new Child(new Strategy1Concrete());
        c1.execute();

    }


}
