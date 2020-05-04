package virushack.changing.guideline.backend.dto;

import lombok.Data;
import virushack.changing.guideline.backend.model.Gender;
import virushack.changing.guideline.backend.model.MalaiseType;
import virushack.changing.guideline.backend.model.Value;

import java.util.List;

@Data
public class ConsultationRequestDto {
    private String id;

    private Gender sex;
    private String age;
    private List<MalaiseType> malaiseType;
    private String painLevel;
    private String painDuration;
    private Value currentPressure;
    private List<String> additionalDiseases;
    private String attendant;
}
