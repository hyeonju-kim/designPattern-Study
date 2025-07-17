package exception.basic.unchecked;

/**
 * description    :
 * packageName    : exception.basic.unchecked
 * fileName       : UncheckedCatchMain
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class UncheckedCatchMain {
    public static void main(String[] args) {
        final Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
