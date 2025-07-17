package exception.basic.unchecked;

/**
 * description    :
 * packageName    : exception.basic.unchecked
 * fileName       : Client
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class Client {
    public void call() { // 언체크드 예외는 여기서 throws를 필수로 던지지 않아도 된다. 대신 자동으로 예외가 던져진다.
        throw new MyUncheckedException("ex (언체크드예외 메시지 작성..)");
    }
}
