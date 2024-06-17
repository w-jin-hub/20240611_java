package p02_variable;

import common.Utils;

public class Ex07double {
  public static void main(String[] args) {
    // float :: -3.4*10^38 ~ 3.4*10^38 (정밀도 : 소수 7자리)
    // double :: -1.7*10^308 ~ 1.7*10^308 (정밀도 : 소수 13자리)
    float f1 = 0.0f; // f 무조건 필요
    double d1 = 0.0; // d 생략 가능
    Utils.typeOf( 0.0);
    Utils.typeOf( 0.0f);
    int i1 = 10;
    long l1 = 1000;
    Utils.typeOf( 0.0f +i1);
    Utils.typeOf( 0.0f +l1); // 표현범위 큰 타입으로 형변환!
    Utils.typeOf( f1 + d1);
    d1 = f1; // 묵시적 형변환
    // 표현범위가 double이 크기때문에 상관읎음
    // 하지만 반대로는 불가하다 표현범위가 double이 크기 때문에
  }
}
