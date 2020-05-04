package virushack.changing.guideline.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import liquibase.pro.packaged.A;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;
    private String name;
}
