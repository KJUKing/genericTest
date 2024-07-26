package kr.or.ddit.basic;

// 제네릭을 사용하지 않을 경우
class NonGeneric {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
// 제네릭 클래스 사용
class Generic<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class GenericTest {
    public static void main(String[] args) {

        NonGeneric non1 = new NonGeneric();
        non1.setValue("안녕하세요");
        String value = (String) non1.getValue();
        System.out.println("value = " + value);
        System.out.println("non1.getValue() = " + non1.getValue());

        NonGeneric non2 = new NonGeneric();
        non2.setValue(1);

        System.out.println("a = " + (int) (Integer) non2.getValue());

//        int rtn3 = (int) non1.getValue(); 형변환오류

        Generic<String> g1 = new Generic<>();
        g1.setValue("안녕하세요");

        Generic<Integer> g2 = new Generic<>();
//        g1.setValue(1); 미연에 방지


        String myRtn1 = g1.getValue();
        System.out.println("myRtn1 = " + myRtn1);


    }
}
