public class makeTheCoverLetter {
    public static void main(String[] aggs) {
        // 변수 정의
        String  name = "코드잇";
        int year = 2015;
        int month = 7;
        int day = 20;
        boolean married = false;

        // 값 대입
        String  fullName = "이름: " + name;
        String  birth = "생일: " + year + "년" + month + "월" + day + "일";
        String  typeOfMarried = "결혼: " + married;


        // 자기 소개
        System.out.println(fullName);
        System.out.println(birth);
        System.out.println(typeOfMarried);

    }
}

