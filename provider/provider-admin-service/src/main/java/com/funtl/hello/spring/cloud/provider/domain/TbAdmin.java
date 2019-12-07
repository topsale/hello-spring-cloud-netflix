package com.funtl.hello.spring.cloud.provider.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_admin")
public class TbAdmin implements Serializable {

    private static final long serialVersionUID = -2202893144114263805L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "sharding_id")
    private Integer shardingId;
}