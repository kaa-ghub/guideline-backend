
package virushack.changing.guideline.backend.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
    "source",
    "target"
})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EdgeData {

    @Id
    @Column(name = "edge_data_id")
    private String id;

    @JsonProperty("source")
    private String source;

    @JsonProperty("target")
    private String target;

    @JsonIgnore
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="additional_properties", joinColumns=@JoinColumn(name="edge_data_id"))
    private Map<String, String> additionalProperties = new HashMap<String, String>();
}
