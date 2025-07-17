package ref;

/**
 * description    :
 * packageName    : ref
 * fileName       : MethodChange2
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }
}
