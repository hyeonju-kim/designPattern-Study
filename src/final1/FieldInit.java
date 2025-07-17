package final1;

/**
 * description    :
 * packageName    : final1
 * fileName       : FieldInit
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class FieldInit {
    static final int CONST_VALUE = 10; // static final 이 붙으면 대문자로 쓰는게 자바 관례
    final int value = 10; // 이렇게 이미 값을 할당하면 생성자로 못바꿈..

//    public FieldInit(int value) {
//        value = 20;
//    }
}

