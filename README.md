# 인프런 스프링강의 복습용 코드기술 레파지토리
- 기존 공부했던 스프링 기초를 다시 다지기위해 강의 수료 후 복습용 코드타이핑을 하기 위함<br><br>

1. 스프링 핵심 원리 - 기본편 (12/12~)
   1) 객체 지향 설계와 스프링 (12/12)
      - 스프링에 대한 기본 개념과 스프링에서의 자바 SOLID 중요성
   2) 스프링 핵심 원리 이해1 - 예제 만들기 (12/13)
      - 프로젝트 셋팅
      - 스프링을 사용하지 않은 기본자바만을 이용한 코드 구현
      - 기본 Junit 테스트 작성
   3) 스프링 핵심 원리 이해2 - 객체 지향 원리 적용 (12/15)
      - 일전 순수 자바로 구현한 코드에서 할인정책이 바뀌었다고 예를 들때 FixDiscountPolicy를 RateDiscountPolicy로 바꾸어줄 때<br>클라이언트(OrderServiceImpl)의 소스도 바꾸어주어야 하는 문제 발생. OCP, DIP 위반.<br>구현 객체를 대신 생성하고 주입해줄수 있는 방법이 필요함.
      - 위와 같은 문제로 구현 객체를 생성하고 연결하는 책임을 가진 별도의 클래스를 만듬 = AppConfig
      	- 각자의 구현체에서는 관여하지 않고 AppConfig에서 생성자 주입을 해줌
      	- 의존관계 주입 또는 의존성 주입이라 함
      - AppConfig 리팩터링
      	- 역할과 구현을 조금 더 명확하게 분리, 중복 제거
   4) 스프링 컨테이너와 스프링 빈 (12/18)
      - 스프링 컨테이너 생성시 빈 정보가 등록되고 DI가 이루어지는 과정 이해
      - 생성된 빈 테스트 (구조 이해)
      - xml으로 빈 설정
   5) 싱글톤 컨테이너 (12/21~22)
      - 싱글톤 패턴에 대한 기본 개념 및 주의점
      - 스프링 웹 애플리케이션과 싱글톤의 관계
      - @Configuration 어노테이션의 역할
      - @Configuration 바이트코드의 조작 원리
