package exception.ex1;


/**
 * description    : 오류 상황 만들기
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        final NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 추가

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
