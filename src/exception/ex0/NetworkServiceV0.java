package exception.ex0;

/**
 * description    :
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        final NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
