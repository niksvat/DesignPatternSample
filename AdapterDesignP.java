interface Target{
    public void request();
}




class Main{

    Target target;

    public Main(Target target){
        this.target = target;
    }

    public void execute(){

        //in code currently its 
        target.request();

    }


}

class Adaptee{
    public void specificRequest(){
        System.out.println("Specific request served");
    }
}

//-----------------------------------------Main code------------------------------------

class Adapter implements Target{
    
    Adaptee adapt;

    public Adapter(Adaptee a){
        this.adapt = a;
    }


    public void request(){
        this.adapt.specificRequest();
    }
}



class AdapterDesignP{
    public static void main(String... args){

        //Now, we want to use  adaptee in main without changine in main class

        Adaptee adaptee  = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        //meaning wrap adaptee around adapter

        Main main = new Main(adapter);
        main.execute();

    }
}




