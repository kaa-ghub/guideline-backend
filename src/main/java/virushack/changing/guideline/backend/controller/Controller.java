package virushack.changing.guideline.backend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import virushack.changing.guideline.backend.dto.RecommendationRequestDto;
import virushack.changing.guideline.backend.dto.RecommendationResponseDto;
import virushack.changing.guideline.backend.service.RecommendationService;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {
    private final RecommendationService recommendationService;

    @PostMapping("recommendation")
    public RecommendationResponseDto getRecommendation(@RequestBody RecommendationRequestDto request){
        log.info("{}", request);
        RecommendationResponseDto response = recommendationService.getRecommendation(request);
        log.info("{}", response);
        return response;
    }
}
