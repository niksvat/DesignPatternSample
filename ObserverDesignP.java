import java.util.*;
interface Observable{
    public void add(Observer o);
    public void notifyNow();
    public void remove(Observer o);

}


interface Observer{
    public void update();
}


class ObservableConcerete implements Observable{

    int value;
    List<Observer> observers;

    public ObservableConcerete(){
        value = 20;
        observers = new ArrayList<>();
    }


    public void add(Observer o){
        observers.add(o);
    }

    public void remove(Observer o){
        observers.remove(o);
    }

    public void notifyNow(){
        for(Observer o: observers){
            o.update();
        }
    }

    //this method is something which is changing the value, and notifying as well
    public void changeState(){
        value++;
        this.notifyNow();
    }

}


class ObserverConcrete implements Observer{
    
    //This is required to access the values which is change and its need to be concrete class(NOT INTERFACE)
    ObservableConcerete observable;


    public ObserverConcrete(ObservableConcerete observable){
        this.observable = observable;
    }

    public void update(){
        System.out.println("Value changed:"+ observable.value);
    }
}

//-----------------------------------MAIN METHOD------------------------

class ObserverDesignP{

    public static void main(String... args){

        ObservableConcerete observable = new ObservableConcerete();
        ObserverConcrete obs = new ObserverConcrete(observable);

        observable.add(obs);

        // Changing state which automatically changing the state
        observable.changeState();
        observable.changeState();
        observable.changeState();
        observable.changeState();
        

    }


}
