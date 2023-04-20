package behavioral.observer;

public interface Subject {

     void registerObservers(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();


}
