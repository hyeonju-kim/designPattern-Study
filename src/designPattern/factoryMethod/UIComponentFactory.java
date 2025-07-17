package designPattern.factoryMethod;


public class UIComponentFactory { // 🎯 객체의 변경이 쉽도록 이렇게 공장클래스에 모아둔다!!!

    // 객체의 생성을 팩토리로 위임 ⭐
    public UIComponent createComponent(Purpose purpose) {
        if (purpose == Purpose.CLICK) {
            return new Button();
        } else if (purpose == Purpose.TOGGLE) {
            return new Switch();
        } else {
            return new Dropdown();
        }
    }

    /**
     * 기존처럼 사용자가 new 로 직접 객체를 생성하려면,
     * 사용자는 어떤 클래스인지, 생성 방식까지 모두 알고 있어야 한다.
     * 즉, 구체적인 구현 클래스에 강하게 결합(coupling)되어 있는 상태다.
     *
     * 하지만 팩토리 패턴을 사용하면,
     * 사용자는 '무엇을 하고 싶은지' (ex. CLICK 용도)만 전달하면 되고,
     * 어떤 클래스가 실제로 생성되는지는 팩토리가 알아서 처리한다.
     *
     * 나중에 CLICK 용도를 BUTTON이 아니라 BUTTON2로 바꾼다고 해도,
     * 팩토리 안의 코드만 수정하면 되므로,
     * 사용하는 코드(클라이언트)는 변경하지 않아도 된다. → 유지보수성이 높아짐!
     */

}
