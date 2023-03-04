
package hany.modern.treasury.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "object",
    "live_mode",
    "contact_identifier",
    "contact_identifier_type",
    "discarded_at",
    "created_at",
    "updated_at"
})
@Data
@Builder
@Generated("jsonschema2pojo")
public class ContactDetail {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("contact_identifier")
    public String contactIdentifier;
    @JsonProperty("contact_identifier_type")
    public String contactIdentifierType;
    @JsonProperty("discarded_at")
    public Object discardedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
