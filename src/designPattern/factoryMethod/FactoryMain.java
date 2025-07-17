package designPattern.factoryMethod;

/**
 *  호출 부분
 */
public class FactoryMain {
    public static void main(String[] args) {
        new Console().createManually();
        new Console().createWithFactory();
    }
}
