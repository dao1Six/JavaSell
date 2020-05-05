package com.muke.sell.Entiy;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Table("Course")
@Data
public class Course {

    private String CId;

    private String Cname;

    private String TId;

}
