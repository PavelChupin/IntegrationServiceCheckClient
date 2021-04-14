package ru.ysolutions.integration_service.client_check.scheduled;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.ysolutions.integration_service.client_check.service.OperationService;

@Component
@EnableScheduling
public class RequestScheduler {
    private static final Logger log = LoggerFactory.getLogger(RequestScheduler.class);
    final OperationService operationService;

    @Autowired
    public RequestScheduler(OperationService operationService) {
        this.operationService = operationService;
    }

    @Scheduled(fixedRateString = "${custom-settings.interval.start-request.milliseconds}")
    public void print() {
        operationService.id();
    }
}
