package icu.nescar.jet.dal.dao;

import icu.nescar.jet.dal.domain.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ClientDao {
    /**
     * fine user
     * @param clientId 客户端ID
     * @param password 密码
     * @return 是否存在
     */
    List<Client> findClient(@Param("clientId") String clientId, @Param("password") String password);
}
