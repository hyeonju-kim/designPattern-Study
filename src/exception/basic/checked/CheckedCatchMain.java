package exception.basic.checked;

/**
 * description    :
 * packageName    : exception.basic.checked
 * fileName       : CheckedCatchMain
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class CheckedCatchMain {
    public static void main(String[] args) {
        final Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
