package virushack.changing.guideline.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import virushack.changing.guideline.backend.dto.RecommendationRequestDto;
import virushack.changing.guideline.backend.dto.RecommendationResponseDto;
import virushack.changing.guideline.backend.model.Guideline;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    public RecommendationResponseDto getRecommendation(RecommendationRequestDto request) {
        RecommendationResponseDto response =
                new RecommendationResponseDto(UUID.randomUUID().toString(), List.of(new Guideline()));

        return response;
    }

}
