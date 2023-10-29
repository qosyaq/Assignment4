package Software_Design_Patterns.Assignment4;

public class main {
    public static void main(String[] args) {
        PhoneFactory iphone13factory = new IPhone13Factory();
        Phone iphone13 = iphone13factory.createSmartPhone();

        PhoneFactory iphone14factory = new Iphone14Factory();
        Phone iphone14 = iphone14factory.createSmartPhone();

        PhoneShop phoneshop = new PhoneShop();

        phoneshop.addSmartphone(iphone13);

        Observer firstBuyer = new Buyer("Amanzholov Ansar");
        Observer secondBuyer = new Buyer("Akylzhanuly Abai");

        phoneshop.addObserver(firstBuyer);
        phoneshop.addObserver(secondBuyer);

        phoneshop.addSmartphone(iphone14);

        phoneshop.removeSmartphone(iphone13);


    }
}
