interface BaseInterface{
    public int cost();
}

class BaseClass implements BaseInterface{
    public int cost(){
        return 1;
    }
}


interface Decorator extends BaseInterface{

}

class DecoratorClass implements Decorator{

    BaseInterface baseImplementation;
    public DecoratorClass(BaseInterface bi){
        this.baseImplementation = bi;
    }


    public int cost(){
       return  this.baseImplementation.cost() + 2;
    }

}

class DecoratorClass2 implements Decorator{
    DecoratorClass firstDecorator;
    public DecoratorClass2(DecoratorClass dc){
        this.firstDecorator = dc;
    }

    public int cost(){
        return this.firstDecorator.cost() + 4;
    }

}


//--------------------------------Main------------------------------------------------

public class DecoratorDesignP{

    public static void main(String... args){

        //we can have multiple base classes and corresponding variables saying this is one base type
        BaseInterface base = new BaseClass();

        DecoratorClass dc = new DecoratorClass(base);
        System.out.println(dc.cost());


        // 2nd level decorator
        DecoratorClass2 dc2 = new DecoratorClass2(dc);
        System.out.println(dc2.cost());




        
    }

}
