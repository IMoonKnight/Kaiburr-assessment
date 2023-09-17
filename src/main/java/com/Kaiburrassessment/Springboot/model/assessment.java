

package com.Kaiburrassessment.Springboot.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@Builder

public class assessment {
    @Id
    private String _Id;
    private String name;
    private String id;
    private String language;
    private String framework;

}
