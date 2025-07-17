package exception.basic.checked;

/**
 * description    :
 * packageName    : exception.basic.checked
 * fileName       : Service
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) { // 상위 타입인 Exception을 잡아도 된다! 부모니까.
            // 예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        // 정상 로직
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckedException {
        client.call();

    }
}
