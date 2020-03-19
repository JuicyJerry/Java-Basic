// #1. 변수(variable)
// #2. 자료형(data type)
// #2. 기본 자료형(Primitive Types): byte, short, int, long, float, double, char, boolean
// #3. 숫자형(Number Type): 정수형: byte, short, int / 소수형: float, double
// - float과 double은 둘다 소수형을 담지만 정밀도(Precision) 혹은 정확도에 차이가 있다. double이 더 정밀하게 값을 보관할 수 있다.
// double을 소수형의 기본으로 사용됨. float f = 3.14f;
// 자바에서 public 클래스는 해당 파일 이름과 동일해야합니다.
public class Variables {
    public static void main(String[] args) {
        boolean myBoolean = true;
        myBoolean = false;

        int myInt = 123;
        long myLong = 12345678910L;
        double myDouble = 3.14;

        String myString = "codeit!!";
        System.out.println("hello!!");

        String hello = "Hello, I'm ";
        String dot = ".";
        System.out.print(hello);
        System.out.print(27);
        System.out.println(dot);

    }
}





