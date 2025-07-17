package exception.ex2;


/**
 * description    : disconnect 를 finally 문에 넣어주기 (완성된 버전★)
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data){
        String address = "http://example.com";
        final NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try { // 아래처럼 한번에 쓰면 된다!
            client.connect();
            client.send(data); // 여기서 예상 밖의 throw new RuntimeException던져도 finally를 거친 뒤에 메인으로 가서 터진다.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());

        }finally { // 추가
            client.disconnect(); // 갈 때 가더라도 finally 호출하고 간다.
        }

    }

    /**
     * 해결한 문제 :
     *      - try 안에서 다른 예외가 발생해도 finally로 자원을 항상 해제할 수 있다.
     *
     */
}
