package virushack.changing.guideline.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import virushack.changing.guideline.backend.dto.ConsultationRequestDto;
import virushack.changing.guideline.backend.dto.ConsultationResponseDto;
import virushack.changing.guideline.backend.model.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ConsultationService {

    public ConsultationResponseDto getConsultation(ConsultationRequestDto request) {
        NodeData nodeData = new NodeData("355752b6-c5a7-4e5c-9f62-e8a9cc59fa20", "Головные боли", null);
        Position position = new Position(BigDecimal.valueOf(574.4), BigDecimal.valueOf(200));
        Node node1 = new Node(UUID.randomUUID().toString(), nodeData, position, null, null);

        nodeData = new NodeData(UUID.randomUUID().toString(), "Паническая атака", null);
        position = new Position(BigDecimal.valueOf(795.5), BigDecimal.valueOf(200));
        Node node2 = new Node(UUID.randomUUID().toString(), nodeData, position, null, null);

        nodeData = new NodeData(UUID.randomUUID().toString(), "", null);
        position = new Position(BigDecimal.valueOf(381.5), BigDecimal.valueOf(200));
        Node node3 = new Node(UUID.randomUUID().toString(), nodeData, position, null, null);

        EdgeData edgeData1 = new EdgeData(UUID.randomUUID().toString(), node3.getId(), node1.getId(), null);
        Edge edge1 = new Edge(UUID.randomUUID().toString(), edgeData1, null, null);

        EdgeData edgeData2 = new EdgeData(UUID.randomUUID().toString(), node1.getId(), node2.getId(), null);
        Edge edge2 = new Edge(UUID.randomUUID().toString(), edgeData2, null, null);

        List<Node> nodes = List.of(node1, node2, node3);
        List<Edge> edges = List.of(edge1, edge2);

        final Guideline guideline = new Guideline(1L, "example", nodes, edges, null);

        ConsultationResponseDto response =
                new ConsultationResponseDto(request.getId(),
                        "Паническая атака",
                        "Необъяснимый, мучительный для больного приступ тяжёлой тревоги, " +
                                "сопровождаемый беспричинным страхом, в сочетании с различными " +
                                "вегетативными (соматическими) симптомами.",
                        List.of("Давление редко повышается выше 180/120 мм рт. ст.",
                                "Учащённое сердцебиение",
                                "Дрожат руки",
                                "Тошнота",
                                "Бросает в пот",
                                "Головокружение",
                                "Асимметрии в улыбке и движениях нет",
                                "Мысли спутаны, но речь разборчива",
                                "Симптомы достигают пика в течении 10-15 минут и после этого промежутка все симптомы сходят на нет"),
                        List.of(new Doctor(1L, "невролог")),
                        guideline);

        return response;
    }

}
