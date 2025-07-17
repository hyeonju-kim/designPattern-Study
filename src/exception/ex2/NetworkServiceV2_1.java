package exception.ex2;


/**
 * description    : 예외를 로그가 아닌 커스텀익셉션을 만들어서 던지는 서비스
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        final NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
