package exception.ex2;

/**
 * description    :
 * packageName    : exception.ex2
 * fileName       : NetworkClientExceptionV2
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkClientExceptionV2 extends Exception {
    private String errorCode;


    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
