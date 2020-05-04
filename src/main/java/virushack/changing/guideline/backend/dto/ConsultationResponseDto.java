package virushack.changing.guideline.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import virushack.changing.guideline.backend.model.Guideline;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultationResponseDto {
    private String id;
    private String label;
    private String description;
    private List<String> symptoms;
    private List<String> doctor;
    private Guideline guideline;
}
