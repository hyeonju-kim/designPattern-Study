package designPattern.factoryMethod;

/**
 *  컴포넌트 - 버튼
 */
public class Button extends UIComponent{
    @Override
    protected String componentName() {
        return "버튼";
    }
}
