package virushack.changing.guideline.backend.dto;

import lombok.Data;
import virushack.changing.guideline.backend.model.Gender;
import virushack.changing.guideline.backend.model.MalaiseKind;
import virushack.changing.guideline.backend.model.PainValue;

import java.math.BigDecimal;

@Data
public class RecommendationRequestDto {
    private String id;

    private Gender gender;
    private String age;
    private MalaiseKind kind;
    private PainValue painValue;
    private String painDuration;
    private BigDecimal pressure;
    private String attendant;
}
