package designPattern.factoryMethod;


public class Console {
    private UIComponentFactory componentFactory = new UIComponentFactory();

    UIComponent comp1;
    UIComponent comp2;
    UIComponent comp3;

    // 이렇게 하면 약국에서 '타이레놀'주세요, '페니라민'주세요 하는거랑 똑같다.
    void createManually() {
        comp1 = new Button();
        comp2 = new Switch();
        comp3 = new Dropdown();
    }

    // 이렇게 하면 약국에서 '머리아픈약'주세요, '콧물약'주세요. 처럼 증상만 말하면 됨!!!!
    void createWithFactory() {
        comp1 = componentFactory.createComponent(Purpose.CLICK);
        comp2 = componentFactory.createComponent(Purpose.TOGGLE);
        comp3 = componentFactory.createComponent(Purpose.EXPAND);
    }
}
