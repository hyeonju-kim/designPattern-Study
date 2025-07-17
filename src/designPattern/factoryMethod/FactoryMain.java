package designPattern.factoryMethod;


public class FactoryMain {
    public static void main(String[] args) {
        new Console().createManually();
        new Console().createWithFactory();
    }
}
