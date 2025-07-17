package exception.ex2;


import java.util.Scanner;

/**
 * description    :
 * packageName    : exception.ex0
 * fileName       : MainV0
 * author         : 김현주
 * date           : 25. 6. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 15.        김현주             최초 생성
 */
public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        final NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        final NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        final NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        final NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        final NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        // 스캐너로 메시지 입력 받기
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            final String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }
}
