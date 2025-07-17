package designPattern.factoryMethod;

/**
 *  컴포넌트 - 드롭다운
 */
public class Dropdown extends UIComponent{
    @Override
    protected String componentName() {
        return "드롭다운";
    }
}
