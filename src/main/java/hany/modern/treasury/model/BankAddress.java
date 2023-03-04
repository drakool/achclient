
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
    "line1",
    "line2",
    "locality",
    "region",
    "postal_code",
    "country",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
@Data
@Builder
public class BankAddress {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("line1")
    public String line1;
    @JsonProperty("line2")
    public Object line2;
    @JsonProperty("locality")
    public String locality;
    @JsonProperty("region")
    public String region;
    @JsonProperty("postal_code")
    public String postalCode;
    @JsonProperty("country")
    public String country;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
