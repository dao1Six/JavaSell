package com.muke.sell.Entiy;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Table("Teacher")
@Data
public class Teacher {

    private String TId;

    private String Tname;

}
