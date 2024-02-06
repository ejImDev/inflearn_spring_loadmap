# 인프런 스프링강의 복습용 코드기술 레파지토리
- 기존 공부했던 스프링 기초를 다시 다지기위해 강의 수료 후 복습용 코드타이핑을 하기 위함<br><br>

<details>
<summary>1. 스프링 핵심 원리 - 기본편 (12/12~12/29)</summary>
   
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
   6) 컴포넌트 스캔 (12/22~12/23)
      - @ComponentScan : @Component 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록함. 일반적으로 스프링부트의 시작 정보인 @SpringBootApplication 안에 @ComponentScan가 들어있음
      - @Autowired : @Component를 사용해서 스프링 컨테이너에 빈을 저장할때 의존관계를 지정해줌
      - @ComponentScan의 스캔 기본 대상 : @Component, @Service, @Repository, @Configuration
      - 중복 빈 생성 : 자동vs자동은 실행시 오류가 발생하나, 자동vs수동은 수동이 우선권을 가지고 오버라이딩 함 (단 스프링부트를 통해 실행하면 오류가 발생함)
   7) 의존관계 자동 주입 (12/23~12/25)
      - 생성자 주입 :생성자 호출 시점에 딱 1번만 호출되는 것이 보장. 불변,필수 의존관계에 주로 사용
      - 수정자 주입 : setter로 필드 값 변경. 선택,변경 가능성이 있는 의존관계에 주로 사용
      - 필드 주입 : 필드에 바로 주입하는 방식. 코드는 간결하나 외부에서 변경이 불가능 함. DI프레임워크가 없으면 무용지물. **사용하지 말자**
      - 일반 메서드 주입 : 한번에 여러 필드 주입을 받을 수 있다. 일반적으로 잘 사용하지 않음
      - @Autowired 사용시 적용할수 있는 옵션
      - Lombok 기초 사용 개념
      - 같은 타입의 빈이 두개가 존재할때 의존성 주입 문제 확인 (이중사용의 경우 주사용 빈에 @Primy를 기본으로 사용하고, 간혹 사용하는 빈에 @Quilifier를 사용하는것이 좋음. p보다 q가 우선권)
      - 조회가 필요한 타입의 빈들을 리스트 또는 Map으로 전부 불러 활용하기
   8) 빈 생명주기 콜백 (12/26)
      - 빈 생성시 초기화 및 소멸 메서드 지정
      - @PostConstruct, @PreDestroy 활용
   9) 빈 스코프 (12/27~12/29)
      - 싱글톤타입과 프로토타입의 빈 스코프
      - 싱글톤타입,프로토타입을 같이 사용했을 때 발생하는 문제점 및 해결 방법
      - request 스코프 만들기 및 프록시모드 활용 방법  

</details>


<details>
<summary>2. 모든 개발자를 위한 HTTP 웹 기본 지식 (1/9~)</summary>
   
   1) 인터넷 네트워크 (1/9)
   2) URI와 웹 브라우저 요청 흐름(1/11)
   3) HTTP 기본(1/12)
   4) HTTP 메서드(1/24)
   5) HTTP 메서드 활용(1/25)
   6) HTTP 상태코드(1/26)
   7) HTTP 헤더 - 일반 헤더 (1/30~1/31)
   8) HTTP 헤더 - 캐시와 조건부 요청 (2/1~2/6)
</details>
