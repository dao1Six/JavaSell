package com.muke.sell.Entiy;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;


@Table("Student")
@Data
public class Student {

     private String SId;

     private String Sname;

     private String Sage;

     private String Ssex;


}
