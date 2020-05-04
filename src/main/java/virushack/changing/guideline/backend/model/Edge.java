
package virushack.changing.guideline.backend.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edge {

    @Id
    @Column(name = "edge_id")
    private String id;

    @JsonProperty("data")
    @OneToOne(targetEntity = EdgeData.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "edge_data_id", unique = true)
    private EdgeData data;

    @JsonIgnore
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="additional_properties", joinColumns=@JoinColumn(name="edge_id"))
    private Map<String, String> additionalProperties = new HashMap<String, String>();

    @JsonIgnore
    @ManyToOne(targetEntity = Guideline.class)
    private Guideline guideline;
}
