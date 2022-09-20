public class For {

    public static void main(String[] args) {

//        for : 가장 많이 사용되는 반복문
//        while문과 차이점
//        1. 초기화 변수와 초기화 변수 카운트를 for문의 설정 부분에 입력
//        2. 초기화 변수가 for문의 설정 부분에 입력되면서 for 문의 지역변수로 사용되어 같은 변수를 계속 사용할 수 있음
//        3. 초기화 변수 카운트가 항상 마지막에 동작함

        System.out.println("\n----- for문 -----\n");
        for(int i = 0; i < 10; i++){
            System.out.println(i);

        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("\n----- while문 -----\n");
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count++;
        }

//        int count = 0; // 동일한 이름의 변수를 선언할 수 없음
//        기존의 변수에 재활용하고 저장된 값을 초기화하여 사용해야 함
        count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

//        문제 1) 아래의 while문을 for으로 변환하여 출력하세요
        System.out.println("\n----- 문제 1 -----\n");
        int hit = 0;

        while (hit < 100){
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 100){
                System.out.println("나무가 넘어갑니다.");
            }
        }

        for (int i = 1; i < 11; i++){
            System.out.println("나무를 " + i + "번 찍었습니다.");

            if (i == 10){
                System.out.println("나무가 넘어갑니다.");
            }
        }


//        문제 2) 원하는 단수의 구구단을 출력하는 프로그램을 for문을 사용하여 출력하세요
        System.out.println("\n----- 문제 2 -----\n");
        for (int i = 1; i < 10; i++){
            System.out.println(5 + "*" + i + "=" + (5 * i) );
        }


//        문제 3) 사용자 입력을 통해서 데이터 5개를 입력받고 입력받은 값의 총합을 구하는 프로그램을 for문을 사용하여 작성하세요
        System.out.println("\n----- 문제 3 -----\n");

//        문제 4) for문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍을 하세요
//        *
//        **
//        ***
//        ****
//        *****

        System.out.println("\n----- 문제 4 -----\n");
        String star = "";
        for (int i = 0; i < 5; i++) {
            star += "*";
//         star = star + "*";
            System.out.println(star);
        }

        System.out.println("\n ----- 중첩 for문 ----- \n");
//        for 문 안에 for문 존재하는 형태의 for문
//        2차원 배열의 내애ㅛㅇ을 출력할 때 많이 사용함

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.println("i의 값 : " + i + "\tj의 값 : " + j);
            }
            System.out.println("---------------------");

        }

//        변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산출 대입 연산자를 사용 시 원하는 크기만큼 카운트 값을 변경할 수 있음
        for (int i = 2; i < 10; i += 2){
            System.out.println("----- " + i + "단 -----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }
}
