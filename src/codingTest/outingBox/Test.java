package codingTest.outingBox;

import java.util.Optional;

/**
 * description    :
 * packageName    : codingTest.outingBox
 * fileName       : Test
 * author         : 김현주
 * date           : 25. 6. 28.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 25. 6. 28.        김현주             최초 생성
 */
public class Test {

    public static String test() {
        return "TEST";
    }

    public static void main(String[] args) {
        /**
         * Function 실습 1
         */
//        Function<Integer, String> intToString = i -> "숫자는 " + i;
//
//        String applied = intToString.apply(5);
//        System.out.println("[Test.java] [main] [applied] >>>>> " + applied);

//        Function<String, Integer> calculateStr = str -> str.length();
//        Integer applied = calculateStr.apply("hi~hello~");
//
//        System.out.println("[Test.java] [main] [calculateStr] >>>>> " + applied);

        /**
         * Function 실습 2
         */
//        List<String> list = List.of("apple", "banana", "cherry");
//        Function<String, Integer> stringLength = s -> s.length();
//
//        final List<Integer> integerList = list.stream()
//                .filter(s-> s.equals("apple"))
//                .map(stringLength)
////                .map(s -> stringLength.apply(s))
////                .map(s -> s.length())
//                .toList();
//
//        System.out.println("[Test.java] [main] [integerList] >>>>> " + integerList);

        /**
         * Predicate 실습 1
         */
//        Predicate<Integer> isTenOrMore = n -> n >= 10; // 10 이상이면 true
//
//        System.out.println("[Test.java] [main] [isTenOrMore - 5] >>>>> " + isTenOrMore.test(5));
//        System.out.println("[Test.java] [main] [isTenOrMore - 15] >>>>> " + isTenOrMore.test(15));


        /**
         *  Optional 실습
         */

//        String Str = "hello";
////        String Str = null;
////        Optional<String> hello = Optional.of(optionalStr);
//
//        Optional<String> optStr = Optional.ofNullable(Str);
////        String string = hello.orElse("널이어서 hello");
//
//
////        System.out.println("[Test.java] [main] [hello] >>>>> " + optStr.orElseThrow(() -> new RuntimeException("값이 없음!!!!!!!!!")));
////        System.out.println("[Test.java] [main] [hello] >>>>> " + optStr.orElseGet(() -> test()));
//        System.out.println("[Test.java] [main] [hello] >>>>> " + optStr.orElseThrow());
//        optStr.ifPresentOrElse(
//                val -> System.out.println("값 :" + val),
//                () -> System.out.println("없다")
//        );
//
//        optStr.ifPresent(System.out::println);
//        optStr.ifPresent(v -> System.out.println(v));
//
//        System.out.println("===============================");
//        System.out.println();
//
//        optStr.ifPresent(v -> v.length());
//        optStr.flatMap(v -> Optional.of(v + "님"))
//                .ifPresent(System.out::println);
//
//        System.out.println(optStr.orElse("널이에유"));

        /**
         *  String.join() 실습
         */

        final String join = String.join("_", "250716", "test");
        System.out.println("[Test.java] [main] [join] >>>>> " + join);


    }

}
