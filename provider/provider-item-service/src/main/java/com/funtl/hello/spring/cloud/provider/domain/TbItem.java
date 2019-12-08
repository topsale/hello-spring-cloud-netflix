package com.funtl.hello.spring.cloud.provider.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_item")
public class TbItem implements Serializable {

    private static final long serialVersionUID = -3695449161375965172L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "num")
    private Integer num;

}