package ru.ysolutions.integration_service.client_check.dao.entities.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.ysolutions.integration_service.client_check.dao.entities.Request;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestMapper implements RowMapper<Request> {
    @Override
    public Request mapRow(ResultSet rs, int i) throws SQLException {
        Request request = new Request();
        request.setId(BigDecimal.valueOf(rs.getLong("id")));
        return request;
    }
}
