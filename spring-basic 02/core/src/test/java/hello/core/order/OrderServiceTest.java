package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberAId = 1L;
        Long memberBId = 2L;
        Member memberA = new Member(memberAId, "memberA", Grade.VIP);
        Member memberB = new Member(memberBId, "memberB", Grade.BASIC);
        memberService.join(memberA);
        memberService.join(memberB);

        Order orderA = orderService.createOrder(memberAId, "itemA", 10000);
        Order orderB = orderService.createOrder(memberBId, "itemB", 10000);

        Assertions.assertThat(orderA.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(orderB.getDiscountPrice()).isEqualTo(0);
    }
}
