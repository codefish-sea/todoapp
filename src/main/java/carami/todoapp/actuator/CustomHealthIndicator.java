package carami.todoapp.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // 예: DB 연결 상태, REST API 연결 상태 등 임의 로직
        boolean serverIsUp = checkExternalServer();

        if (serverIsUp) {
            return Health.up()
                    .withDetail("externalServer", "OK")
                    .build();
        } else {
            return Health.down()
                    .withDetail("externalServer", "Not Responding")
                    .build();
        }
    }

    private boolean checkExternalServer() {
        // 서버 체크 로직 (ping, httpclient 등...)
        return true; // 실제 로직 작성
    }
}
