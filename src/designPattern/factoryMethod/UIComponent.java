package designPattern.factoryMethod;

/**
 *  컴포넌트 추상 클래스 (버튼, 스위치, 드롭다운 등...)
 */
abstract class UIComponent {
    protected abstract String componentName(); // 1. 이름

    public UIComponent() { // 2. 동작
        System.out.println(this.componentName() + " 생성!");
    }
}
