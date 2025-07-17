package designPattern.factoryMethod;


public class Button extends UIComponent{
    @Override
    protected String componentName() {
        return "버튼";
    }
}
