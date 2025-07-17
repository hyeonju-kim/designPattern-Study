package exception.ex2;

/**
 * description    :
 * packageName    : exception.ex0
 * fileName       : NetworkClientV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkClientV2 {
    private final String address;
    public boolean connectError; // 기본값은 false
    public boolean sendError; // 기본값은 false

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");

        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);

            // 중간에 다른 예외가 발생했다고 가정
//            throw new RuntimeException("ex(런타임예외 메모..)");
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        // 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }

    // 추가
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
