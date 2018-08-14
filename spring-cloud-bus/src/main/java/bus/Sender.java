package bus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author DolphinTwo
 * @date 2018/8/14
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sent(){
        String context = "hello"+new Date();
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
