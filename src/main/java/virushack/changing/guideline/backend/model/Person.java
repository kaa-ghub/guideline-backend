package virushack.changing.guideline.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
