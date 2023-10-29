package Software_Design_Patterns.Assignment4;

public class IPhone13Factory implements PhoneFactory{
    @Override
    public Phone createSmartPhone() {
        return new iphone13();
    }
}
