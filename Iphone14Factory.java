package Software_Design_Patterns.Assignment4;

public class Iphone14Factory implements PhoneFactory{
    @Override
    public Phone createSmartPhone() {
        return new Iphone14();
    }
}
