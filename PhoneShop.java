package Software_Design_Patterns.Assignment4;

import java.util.ArrayList;
import java.util.List;

public class PhoneShop implements Observed{

    List<Phone> smartphones = new ArrayList<>();
    List<Observer> buyers = new ArrayList<>();

    public void addSmartphone(Phone smartphone){
        smartphones.add(smartphone);
        notifyObservers();
    }
    public void removeSmartphone(Phone smartphone){
        smartphones.remove(smartphone);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        buyers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        buyers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: buyers) {
            observer.HandleEvent(smartphones);
        }
    }
}
