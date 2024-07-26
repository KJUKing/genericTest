package kr.or.ddit.basic;

public class EnumTest {

    /**
        열거형은 클래스처럼 독립된 java파일에 만들수있고
     하나의 java파일에 클래스와 같이 만들수있고
     클래스 내부에 내부 클래스처럼 만들 수 있다.

     열거형의 속성 및 메서드
     열거형의변수.name -> 열거형 상수의 이름을 문자열로 반환한다.
     열거형변수.ordinal() -> 열거형 상수가 정의된 순서값(index값)을 반환한다 0부터 시작
     열거형이름.valueOf("열거형상수명") -> 인수값에 지정한 '열거형상수명'과 일치하는 열거형 상수를 반환
     열거형변수.상수명 -> valueOf()메소드를 사용한 결과와 같다
     */
    public enum Color {
        RED, GREEN, BLUE

    }
    public enum Count {
        ONE, TWO, THREE
    }
    public enum Season{
        봄("3월부터 5월까지", 13),
        여름("6월부터 8월까지", 27),
        가을("9월부터 11월까지", 15),
        겨울("12월부터 2월까지", 1);

        private String message;
        private int degree;

        Season(String message, int degree) {
            this.message = message;
            this.degree = degree;
        }

        public String getMessage() {
            return message;
        }

        public int getDegree() {
            return degree;
        }
    }
    public static void main(String[] args) {

//        System.out.println("ConstTest.RED = " + ConstTest.RED);
//        System.out.println("ConstTest.THREE = " + ConstTest.THREE);
//
//        if (ConstTest.ONE == ConstTest.RED) {
//            System.out.println("같다...");
//        } else {
//            System.out.println("다르다..");
//
//        }
        Color myCol = Color.valueOf("GREEN");
        Count myCnt = Count.ONE;

        System.out.println("myCol : " + myCol);
        System.out.println("myCnt : " + myCnt.name());

        System.out.println("myCol의 ordinal : " + myCol.ordinal());
        System.out.println("myCnt의 ordinal : " + myCnt.ordinal());


        Season ss = Season.valueOf("봄");
        System.out.println("ss = " + ss);
        System.out.println("ss.ordinal() = " + ss.ordinal());
        System.out.println("ss.message = " + ss.message);
        System.out.println("ss.getMessage() = " + ss.getMessage());

        for (Color col : Color.values()) {
            System.out.println("name : " + col.name());
            System.out.println("ordinal : " + col.ordinal());
            System.out.println();
        }
        System.out.println("_--------------------------");

        for (Season season : Season.values()) {
            System.out.println(season + "," + season.getMessage() + ","
                            + season.degree);
        }

        // 열거형을 switch문에서 비교하기
        switch (myCol) {
            case RED:
                System.out.println("RED 입니다");
                break;
            case BLUE:
                System.out.println("파랑이네요");
                break;
            case GREEN:
                System.out.println("그린이네요");
                break;
        }
    }
}
