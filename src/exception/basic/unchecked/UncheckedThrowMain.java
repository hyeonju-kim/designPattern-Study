package exception.basic.unchecked;

/**
 * description    :
 * packageName    : exception.basic.unchecked
 * fileName       : UncheckedThrowMain
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class UncheckedThrowMain {
    public static void main(String[] args) {
        final Service service = new Service();
        service.callThrow(); // 예외가 main 밖으로 던져지며 스택트레이스를 출력하고 프로그램이 종료된다.
        System.out.println("정상 종료"); // 이건 출력이 안된다.
    }
}
