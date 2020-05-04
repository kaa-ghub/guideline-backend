package virushack.changing.guideline.backend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import virushack.changing.guideline.backend.dto.ConsultationRequestDto;
import virushack.changing.guideline.backend.dto.ConsultationResponseDto;
import virushack.changing.guideline.backend.service.ConsultationService;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {
    private final ConsultationService consultationService;

    @PostMapping("consultation")
    public ConsultationResponseDto getConsultation(@RequestBody ConsultationRequestDto request){
        log.info("{}", request);
        ConsultationResponseDto response = consultationService.getConsultation(request);
        log.info("{}", response);
        return response;
    }
}
