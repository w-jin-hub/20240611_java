package p02.varialbe;
// 변수
public class Ex01 {
  // 1. 변수의 선언 위치 : 전역, 지역
  static int sum = 0; // 멤버변스는 전역변수(global variable)
  // int sum = 1; // 중복 선언되어서 사용 할 수 없다.

  public void sum() {
    int sum = 1; // 지역변수(local variable)
//    System.out.println(sum);
  }

  public static void main(String[] args) {
    System.out.println(sum);

    Ex01 ex01 = new Ex01();
    System.out.println(ex01.sum);

    ex01.sum();

  }

}
