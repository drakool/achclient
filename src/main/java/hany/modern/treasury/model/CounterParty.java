
package hany.modern.treasury.model;

import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "object",
    "live_mode",
    "name",
    "email",
    "send_remittance_advice",
    "metadata",
    "accounts",
    "discarded_at",
    "created_at",
    "updated_at"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Generated("jsonschema2pojo")
public class CounterParty {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("name")
    public String name;
    @JsonProperty("email")
    public String email;
    @JsonProperty("send_remittance_advice")
    public Boolean sendRemittanceAdvice;
    @JsonProperty("metadata")
    @Valid
    public Metadata metadata;
    @JsonProperty("accounts")
    @Valid
    public List<Account> accounts;
    @JsonProperty("discarded_at")
    public Object discardedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
