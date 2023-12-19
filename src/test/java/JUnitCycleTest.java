import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll //전체 테스트를 시작하기 전에 1회 실행하므로 메소드는 static으로 선언
    static void beforeAll(){
        System.out.println("@BeforeAll");
        //@BeforeAll 전체 테스트를 시작하기 전에 처음으로 한 번만 실행
        //예를 들어 dDB를 연결해야하거나 테스트 환경을 초기화 할 때 사용
    }

    @BeforeEach // 테스트 케이스를 시작하기 전마다 실행
    public void beforeEach(){
        System.out.println("@BeforeEach");
        //@BeforeEach 테스트 케이스를 시작하기 전에 매번 실행한다.
        //예를 들어 테스트 메소드에서 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣을 때 사용
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll //전체 테스트를 마치고 종료하기 전에 2회 실행하므로 메소드는 static으로 선언
    static void afterAll(){
        System.out.println("@AfterAll");
        //@AfterAll : 전체 테스트를 마치고 종료하기 전에 한 번만 실행한다.
        //예를 들어 DB 연결 종료, 공통적으로 사용하는 자원을 해제할 때 사용
    }

    @AfterEach //테스트 케이스를 종료하기 전마다 실행
    public void afterEach(){
        System.out.println("@AfterEach");
        //@AfterEach : 각 테스트 케이스를 종료하기 전 매번 실행한다.
        //예를 들어 테스트 후 특정 데이터를 삭제해야 하는 경우 사용
    }
}
