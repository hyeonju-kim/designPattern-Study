package designPattern.factoryMethod;


abstract class UIComponent {
    protected abstract String componentName(); // 1. 이름

    public UIComponent() { // 2. 동작
        System.out.println(this.componentName() + " 생성!");
    }
}
