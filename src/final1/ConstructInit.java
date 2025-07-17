package final1;

/**
 * description    :
 * packageName    : final1
 * fileName       : ConstructInit
 * author         : 김현주
 * date           : 25. 6. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 22.        김현주             최초 생성
 */
public class ConstructInit {

    final int value; // 여기에 final을 사용하게 되면 생성자로 1번만 초기화 할 수 있다. 그 이후엔 불가능.

    public ConstructInit(int value) {
        this.value = value;
    }
}
