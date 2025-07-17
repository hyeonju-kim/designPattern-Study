package ref;

/**
 * description    :
 * packageName    : ref
 * fileName       : VarChange1
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 당연히 20
        System.out.println("b = " + b); // 얘는 기본형이니까 주소를 가지고 있는게 아니니까 그대로 10이 나올듯?.. 헷갈리네; ㅇㅇ 10 나오네!!!!

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 그대로 20
        System.out.println("b = " + b); // 30 나오겠지..
    }
}
