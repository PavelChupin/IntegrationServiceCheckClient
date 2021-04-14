package ru.ysolutions.integration_service.client_check.dao.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.ysolutions.integration_service.client_check.dao.entities.Request;
import ru.ysolutions.integration_service.client_check.dao.entities.mapper.RequestMapper;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class RequestRepositoryImpl implements RequestRepository {
    private static final Logger log = LoggerFactory.getLogger(RequestRepositoryImpl.class);
    //final private DataSource dataSource;
    final private JdbcTemplate jdbcTemplate;

    @Autowired
    public RequestRepositoryImpl(DataSource dataSource) {
        //this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Request> getRequets() {
        List<Request> requests = jdbcTemplate.query("select id from tests with (nolock)", new RequestMapper());
        return requests;
    }
}
