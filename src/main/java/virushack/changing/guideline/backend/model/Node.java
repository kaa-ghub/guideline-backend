
package virushack.changing.guideline.backend.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodeData",
    "position"
})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node {

    @Id
    @Column(name = "node_id")
    private String id;

    @JsonProperty("data")
    @OneToOne(targetEntity = EdgeData.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "node_data_id", unique = true)
    private NodeData nodeData;

    @JsonProperty("position")
    @Embedded
    private Position position;

    @JsonIgnore
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="additional_properties", joinColumns=@JoinColumn(name="node_id"))
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonIgnore
    @ManyToOne(targetEntity = Guideline.class)
    private Guideline guideline;

}
