
package virushack.changing.guideline.backend.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "label",
    "type"
})
@Entity
@Data
public class NodeData {

    @JsonProperty("id")
    @Id
    @Column(name = "node_data_id")
    private String id;

    @JsonProperty("label")
    private String label;

    @JsonIgnore
    @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="additional_properties", joinColumns=@JoinColumn(name="node_data_id"))
    private Map<String, String> additionalProperties = new HashMap<String, String>();


}
