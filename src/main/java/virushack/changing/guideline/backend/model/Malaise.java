package virushack.changing.guideline.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Malaise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private MalaiseType kind;
    @Enumerated(EnumType.STRING)
    private Value value;
    private String painDuration;
    private BigDecimal pressure;
    private String attendant;
}
