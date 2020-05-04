package virushack.changing.guideline.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import virushack.changing.guideline.backend.dto.ConsultationRequestDto;
import virushack.changing.guideline.backend.dto.ConsultationResponseDto;
import virushack.changing.guideline.backend.model.Guideline;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConsultationService {

    public ConsultationResponseDto getConsultation(ConsultationRequestDto request) {
        ConsultationResponseDto response =
                new ConsultationResponseDto(UUID.randomUUID().toString(),
                        "Паническая атака",
                        "Необъяснимый, мучительный для больного приступ тяжёлой тревоги, \n" +
                                "          сопровождаемый беспричинным страхом, в сочетании с различными \n" +
                                "          вегетативными (соматическими) симптомами.",
                        List.of("Давление редко повышается выше 180/120 мм рт. ст.",
                                "Учащённое сердцебиение",
                                "Дрожат руки",
                                "Тошнота",
                                "Бросает в пот",
                                "Головокружение",
                                "Асимметрии в улыбке и движениях нет",
                                "Мысли спутаны, но речь разборчива",
                                "Симптомы достигают пика в течении 10-15 минут и после этого промежутка все симптомы сходят на нет"),
                        List.of("невролог"),
                        new Guideline());

        return response;
    }

}
