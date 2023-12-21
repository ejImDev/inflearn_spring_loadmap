package hello.core.Singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {

    //static 영역에 객체를 생성
    private static final SingletonService instance = new SingletonService();

    //객체 인스턴스가 필요하면 이 static 메스드를 통해서만 조회하도록 허용
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private로 선언해서 외부에서 new 키워드를 통한 객체 생성을 못하게 막음
    private SingletonService(){

    }

    public void logic() {
        System.out.println("싱클톤 객체 로직 호출");
    }

}
