package virushack.changing.guideline.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import virushack.changing.guideline.backend.model.Guideline;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationResponseDto {
    private String id;
    private List<Guideline> guideline;
}
