package virushack.changing.guideline.backend.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Property {

    @Id
    private Long id;

    private String name;
    private String value;
}
