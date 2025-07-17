package designPattern.factoryMethod;

/**
 *  컴포넌트 - 스위치
 */
public class Switch extends UIComponent{
    @Override
    protected String componentName() {
        return "스위치";
    }
}
