package com.muke.sell.Entiy;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Table("SC")
@Data
public class SC {

    private String SId;

    private String CId;

    private String score;

}
