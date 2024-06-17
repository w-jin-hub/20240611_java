package p02_variable;
// 변수
public class Ex01Location {
  // 1. 변수의 선언 위치 : 전역, 지역
  static int sum = 0; // 멤버변스는 전역변수(global variable)
  // int sum = 1; // 중복 선언되어서 사용 할 수 없다.

  public void sum() {
    System.out.println("global : " + sum);
    int sum = 1; // 지역변수(local variable)
    System.out.println("local : " + sum);
  }

  public static void main(String[] args) {
    System.out.println(sum);

    Ex01Location ex01 = new Ex01Location();
    System.out.println(ex01.sum);

    ex01.sum();
  }

}
