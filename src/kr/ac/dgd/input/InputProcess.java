package kr.ac.dgd.input;

import java.util.Scanner;

public class InputProcess {

    // 사용자의 입력을 받아서 지정된 값 이외에는 "다시 입력해주세요" 라고 반복하여 물어봄.
    public String validateUserInput() {
        String inputString = null;
        Scanner sc = new Scanner(System.in);
        do {
            printInfo();
            inputString = inputFromUser(sc);
        } while (checkUserInputScope(inputString)); // do - while 구문 : while 조건이 false 일때까지 do를 무한 반복한다.
        return inputString;
    }

    // 이 프로그램이 지정한 inputString에 속하는거면 false, 아니면 "다시 입력해 주세요" 하고 true 처리
    private boolean checkUserInputScope(String inputString) {
        switch (inputString) {
            case "1": return false;
            default :
                System.out.println("잘못 입력 하셨습니다. ");
                System.out.println("주어진 메뉴중 하나를 골라 주세요");
                return true;
        }
    }

    // 콘솔로부터 사용자의 입력을 받는 InputProcess에서만 쓸 수 있는 기능. (private)
    private String inputFromUser(Scanner sc) {
        return sc.next();
    }

    // 사용자가 메뉴를 고를 수 있도록 콘솔로 띄워줌.
    private void printInfo() {
        System.out.println("아래 내용중 선택하세요.");
        System.out.println("1: 전체 학생 조회");
    }
}
