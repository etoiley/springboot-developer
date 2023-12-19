import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    //JUnit은 자바 언어를 위한 단위 테스트 프레임워크입니다. 단위 테스트란 작성한 코드가 의도대로 작동하는지
    //작은 단위로 검증하는 것을 의미한다.(단위 : 메소드)
    @DisplayName("1+2는 3이다.")//테스트 이름
    @Test
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a+b);//값이 같은지 확인

        /*
        @DisaplyName :  테스트 이름을 명시
        @Test : 테스트를 수행하는 메소드

        * */
    }

    @DisplayName("1+3는 4이다.")//테스트 이름
    @Test
    public void junitFailTest(){
        int a = 1;
        int b = 2;
        int sum = 4;

        Assertions.assertEquals(sum, a+b);//실패하는 케이스
        //Junit은 테스트 케이스가 하나라도 실패하면 전체 테스트를 실패한 것으로 보여준다.

    }

    @DisplayName("죠르디는 귀엽다.")//테스트 이름
    @Test
    public void junitJordy(){
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a+b);//귀여운 케이스

    }
}
