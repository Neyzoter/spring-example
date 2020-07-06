package icu.nescar.jet.service.impl;

import icu.nescar.jet.dal.dao.ClientDao;
import icu.nescar.jet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 客户端服务
 * @author scc
 * @date 2020-7-6
 */
@Component
public class ClientServiceImpl implements ClientService {
    // ClientDao通过@MapperScan 来实现
    @Autowired
    ClientDao clientDao;
    @Override
    public boolean existClient (String clientId, String password) {
        return clientDao.findClient(clientId, password).size() > 0;
    }
}
