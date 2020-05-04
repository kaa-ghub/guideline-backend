package virushack.changing.guideline.backend.dto;

import lombok.Data;
import virushack.changing.guideline.backend.model.Guideline;

import java.util.List;

@Data
public class RecommendationResponseDto {
    private String id;
    private List<Guideline> guideline;
}
