package blacktokkies.toquiz.socket;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class SocketController {
    @MessageMapping("/panels/{panelSid}")
    @SendTo("/sub/panels/{panelSid}")
    public Map<String, Object> message(
        Map<String, Object> message
    ){
        log.info(message.toString());
        return message;
    }
}
