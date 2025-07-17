package ref;

/**
 * description    :
 * packageName    : ref
 * fileName       : NullMain1
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // null
        data = new Data();
        System.out.println("2. data = " + data); // 참조값 생성
        data = null;
        System.out.println("3. data = " + data); // null -> 원래 있던 data 객체는 GC의 대상이 된다. (아하 기존 객체가 null로 대체되는게 아니라 그냥 참조가 끊긴 상태인거야.. null이 참조가 끊긴 상태야;;)
    }
}
