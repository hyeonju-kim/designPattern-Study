package exception.basic.checked;

/**
 * description    : Exception을 상속받는 체크예외를 생성
 * packageName    : exception.basic.checked
 * fileName       : MyCheckedException
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
