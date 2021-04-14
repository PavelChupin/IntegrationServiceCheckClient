package ru.ysolutions.integration_service.client_check.dao.repositories;

import ru.ysolutions.integration_service.client_check.dao.entities.Request;

import java.util.List;

public interface RequestRepository {
    List<Request> getRequets();
}
