package exception.basic.checked;

/**
 * description    :
 * packageName    : exception.basic.checked
 * fileName       : Client
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class Client {
    public void call() throws MyCheckedException{ // 폭탄 던짐
        // 문제 상황
        throw new MyCheckedException("ex(예외 메시지 작성...)"); // 폭탄 터트림
    }
}
