# 상속

## 07-1 상속

**📌 정의**

> 이미 잘 개발된 클래스를 재사용해서 새로운 클래스를 만듦

- 👉 중복되는 코드를 줄여줌
- 부모 클래스의 수정으로 모든 자식 클래스도 수정됨 👉 유지보수 시간 최소화



### 클래스 상속

> 자식이 부모를 선택함

```java
class SportsCar extends Car{
}
```

1. extends 뒤에 단 하나의 부모 클래스만 와야함
2. 부모 클래스에서 private 접근 제한을 갖는 필드/메소드는 상속 대상에서 제외됨



### super()

```java
public class People{
  public String name;
  public String ssn;
    public People(String name, String ssn){
    	this.name = name;
    	this.ssn = ssn;
  }
}

public class Student extends People{
  public Student(String name, String ssn, int num){
    	super(name); // 이 경우에 부모의 생성자 파라미터와 일치하지 않는다 👉 compile error
    	super(name,ssn); // ✔️
    	super(); // 생성자가 명시되지 않은 경우 파라미터가 없는 기본 생성자 부름, 일치하지 않는다 👉 compile error
  }
}
```



### 오버라이딩, 메소드 재정의

📌 정의

>  자식 클래스에서 부모 클래스의 메소드를 다시 정의하는것



⚠️ 유의

- 동일한 리턴타입, 이름, 매개 변수 목록을 가져야함
- 접근제한을 더 강하게 바꿀 수 없음
- 새로운 예외를 throw할 수 없음



#### Override

```java
@Override
double areaCircle(double r){
  return Math.PI*r*r;
}
```

- 메소드가 정확히 재정의되었느지 컴파일러가 확인해줌 👉 개발자의 실수를 줄여준다



### 부모 메소드 호출

오버라이딩시에 재정의된 자식 메소드만 사용된다.

자식클래스 내부에서 부모 클래스의 메소드를 호출하고 싶을때 

명시적으로 super키워드 붙여주면됨

```java
super.부모메소드();
```



### Final 

클래스, 필드, 메소드를 선언할 떄 사용

해당 선언이 최종 상태이고 결코 수정될 수 없음을 뜻함



### Final class

상속할 수 없는 클래스



### Final method

자식 클래스에서 재정의할 수 없는 메소드







## 07-2 타입변환과 다형성



## 07-3 추상클래스

```java
abstract class Phone{
  ...
}
```

- new 연산자를 이용해 객체를 만들지 못함
- 상속을 통해 자식 클래스만 만들 수 있다.



‼️ 목적

- 데이터와 기능이 모두 동일함에도 설계하는 사람이 여러명일 경우, 아름이 다르고 사용방법이 달라질 수 있다.
- 재사용