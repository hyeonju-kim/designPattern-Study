package ref;

/**
 * description    :
 * packageName    : ref
 * fileName       : InitMain
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // null
        System.out.println("value2 = " + data.value2); // 10
    }
}
