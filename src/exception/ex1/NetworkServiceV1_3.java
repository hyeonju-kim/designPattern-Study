package exception.ex1;


/**
 * description    : 오류 상황을 반환 값으로 예외 처리 - 항상 disconnect 하도록 수정 -> 정상 흐름과 예외 흐름이 섞여있어서 가독성이 떨어짐
 * packageName    : exception.ex0
 * fileName       : NetworkServiceV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        final NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);


        final String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        }else {
            final String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();

    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
