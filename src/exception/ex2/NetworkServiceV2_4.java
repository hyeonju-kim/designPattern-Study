package exception.ex2;


/**
 * description    : disconnect 를 try-catch 문 밖에 두어서 항상 해제할 수 있게 시도
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data){
        String address = "http://example.com";
        final NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try { // 아래처럼 한번에 쓰면 된다!
            client.connect();
            client.send(data); // 여기서 throw new RuntimeException 던지고 메인으로 가서 터진다. client.disconnect();는 호출도 안된다.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());

        }
        // try-catch 문 밖에 항상 해제할 수 있게 둬보자.
        client.disconnect();

    }

    /**
     * 남은 문제 :
     *      - try 안에서 다른 예외가 발생하면 거기서 터지기 때문에 disconnect는 또 무시된다.
     *      - disconnect를 항상 해제가 가능하도록 해야하는데 어떻게 하지?...
     *
     */
}
