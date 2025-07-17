package ref;

/**
 * description    :
 * packageName    : ref
 * fileName       : MethodChange1
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10

        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a); // 20 아니야 ? 스태틱인데?? -> 헐 ㅋㅋ 10이네;;;;;;;ㅋㅋㅋㅋㅋㅋ
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
