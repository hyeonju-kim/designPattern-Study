package exception.basic.unchecked;

/**
 * description    :
 * packageName    : exception.basic.unchecked
 * fileName       : Service
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */

/**
 * Unchecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }
        // 정상 로직
        System.out.println("정상 흐름");
    }

    /**
     * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
     * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다. (보통 생략한다. 명시적으로 보고 싶을 때만 선언해준다.)
     * 생략이 가능하니 개발자가 깜빡하고 캐치를 안할 수도 있다. 그럼 운영에서 사고날 가능성이 높아진다.
     */
    public void callThrow() {
        client.call();
    }

}
