package exception.ex2;


/**
 * description    : 예외를 트라이 캐치로 드디어 잡는다!
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV2_2 {

    public void sendMessage(String data){
        String address = "http://example.com";
        final NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }

        client.disconnect();

    }

    /**
     * 해결된 문제 : 예외를 잡아서 처리하여 예외가 복구되고, 프로그램도 종료되지 않고 계속 수행된다.
     * 남은 문제 :
     *      -예외처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 어렵다.
     *      -사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다.
     *
     */
}
