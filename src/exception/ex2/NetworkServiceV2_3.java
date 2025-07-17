package exception.ex2;


/**
 * description    : 예외를 트라이 캐치 1번으로 한눈에 보이게 !
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        final NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try { // 아래처럼 한번에 쓰면 된다!
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());

        }

    }

    /**
     * 해결된 문제 : 정상흐름은 try블럭에 모아두고 예외흐름만 catch블럭에 모아서 가독성이 좋아졌다.
     * 남은 문제 :
     *      -사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다.
     *      -지금은 예외가 생기면 건너뛴다.
     *
     */
}
