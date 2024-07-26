package kr.or.ddit.basic;

public class TestArgs {
    public static void main(String[] args) {
        TestArgs obj = new TestArgs();

        int[] arr = {1, 2, 3, 4, 5};
        //매개변수로 받은 정수들의 합계를 구하는 메소드 작성
        // 이정수들의 개수는 상황에 따라 다를 수 있다.
        System.out.println("i = " + obj.sumArr(arr));
        System.out.println("i1 = " + obj.sumArr(new int[]{1,2,3,4}));

        System.out.println(obj.sumArg(100, 200, 300));
        System.out.println(obj.sumArg(100, 200, 300, 400));
        System.out.println(obj.sumArg2("홍길동", 200, 300, 400));
    }
    // 가변인수(가변인자) -> 메서드를 호출할 때 인자의 개수가 다를때 사용할 수 있다.
    // 가변인자는 메소드안에서는 배열로 처리된다.
    // 가변인자는 하나의 메소드에서 한개만 사용가능

    public int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int sumArg(int... data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    //가변인자와 일반적인 매개변수를 같이 사용하게 될 경우에는
    //가변인자를 제일 뒤쪽에 배치해야한다.
    public String sumArg2(String name, int... data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return name + "씨의 점수 : " + sum;
    }
}
