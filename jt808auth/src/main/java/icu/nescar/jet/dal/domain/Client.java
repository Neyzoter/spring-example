package icu.nescar.jet.dal.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 客户端信息
 * @author scc
 * @date 2020-7-6
 */
@Getter
@Setter
public class Client implements Serializable {
    private static final long serialVersionUID = 4434264917264211735L;
    /**
     * clientId
     */
    private String clientId;

    /**
     * password
     */
    private String password;
}
