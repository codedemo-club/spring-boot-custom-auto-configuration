package club.codedemo.springbootcustomautoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 *  7. 自定义自动配置条件
 */
public class CustomerConditionTrue extends SpringBootCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 第一个参数返回true,表示该注解下的配置生效。生产条件应该根据当前情景动态计算出true或false
        return new ConditionOutcome(true, "message");
    }
}
