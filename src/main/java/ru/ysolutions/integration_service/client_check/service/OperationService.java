package ru.ysolutions.integration_service.client_check.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ysolutions.integration_service.client_check.dao.entities.Request;
import ru.ysolutions.integration_service.client_check.dao.repositories.RequestRepository;

import java.util.List;

@Service
public class OperationService {
    private static final Logger log = LoggerFactory.getLogger(OperationService.class);
    private RequestRepository repository;

    @Autowired
    public OperationService(RequestRepository repository) {
        this.repository = repository;
    }

    public void id() {
        log.info("Method id started");

        List<Request> r = repository.getRequets();

        if (log.isDebugEnabled()) {
            log.debug(String.valueOf(r));
        }

        System.out.println(r);
    }
}
