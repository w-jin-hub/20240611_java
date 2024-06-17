package p02_variable;

import p01_class.Animal;

public class Ex02Types {
  boolean power;
  char c1;
  byte b1;
  short s1;
  int i1;
  long l1;
  float f1;
  double d1;

  String str;
  Animal animal;


  public static void main(String[] args) {
    // 변수의 종류 : Primitive(일반변수), Reference(참조형변수)
    // Primitive type( 일반 변수는 실제 값을 가짐 )
    boolean power = true; // 논리형 타입 : true, false 1byte
    char c1 = 'A';        // 문자형 타입 : 2byte 숫자로 표현 -> 0 ~ 65535 두글자 불가
    byte b1 = 10;         // 정수형 타입 : 1byte -128 ~ +127
    short s1 = 10;        // 정수형 타입 : 2byte -32768 + +32767
    int i1 = 10;          // 정수형 타입 : 4byte -???????좀크다
    long l1 = 10L;        // 정수형 타입 : 8byte 61경~~~~ 더크다
    float f1 = 0.1F;      // 실수형 타입 : 4byte 소수점 7번째 자리까지의 정확도를 가짐
    double d1 = 0.1D;     // 실수형 타입 : 8byte 소수점 13번째 자리까의 정확도를 가짐

    // Reference type ( 참조형 변수 주소 값을 가짐 )
    String str = "Hello"; System.out.println(str);
    Animal animal = new Animal(); System.out.println(animal);

    // Quiz
    Ex02Types ex02types = new Ex02Types();
    System.out.println(ex02types.power);
    System.out.println(ex02types.c1);
    System.out.println(ex02types.b1);
    System.out.println(ex02types.s1);
    System.out.println(ex02types.i1);
    System.out.println(ex02types.l1);
    System.out.println(ex02types.f1);
    System.out.println(ex02types.d1);
  }
}
