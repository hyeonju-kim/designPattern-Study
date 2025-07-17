package designPattern.factoryMethod;

/**
 *  클라이언트
 *   - 객체 생성을 직접 하지 않고, 팩토리에게 요청해서 필요한 객체를 생성받는 주체
 *   - 어떤 객체를 생성해야 하는지 몰라도 됨.. 팩토리에 다 맡길거니까.
 */
public class Console {
    private UIComponentFactory componentFactory = new UIComponentFactory();

    UIComponent comp1;
    UIComponent comp2;
    UIComponent comp3;

    /**
     *  기존 방식
     */
    // 이렇게 하면 약국에서 '타이레놀'주세요, '페니라민'주세요 하는거랑 똑같다.
    void createManually() {
        comp1 = new Button();
        comp2 = new Switch();
        comp3 = new Dropdown();
    }

    /**
     *  팩토리 메서드 방식
     */
    // 이렇게 하면 약국에서 '머리아픈약'주세요, '콧물약'주세요. 처럼 증상만 말하면 됨!!!!
    void createWithFactory() {
        comp1 = componentFactory.createComponent(Purpose.CLICK);
        comp2 = componentFactory.createComponent(Purpose.TOGGLE);
        comp3 = componentFactory.createComponent(Purpose.EXPAND);
    }
}
