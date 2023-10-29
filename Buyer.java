package Software_Design_Patterns.Assignment4;

import java.util.List;

public class Buyer implements Observer{
    String name;
    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void HandleEvent(List<Phone> smartphones) {
        System.out.println("Dear " + name + "\n We have some changes in products:\n");
        for(Phone smartphone: smartphones){
            System.out.print(smartphone.getName() + " ");
        }
        System.out.println("\n-----------------------------------------------------\n");
    }
}
