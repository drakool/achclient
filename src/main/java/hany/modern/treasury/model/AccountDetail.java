
package hany.modern.treasury.model;

import java.util.List;

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
    "account_number",
    "account_number_safe",
    "account_number_type",
    "discarded_at",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
@Data
@Builder
public class AccountDetail {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("account_number")
    public String accountNumber;
    @JsonProperty("account_number_safe")
    public String accountNumberSafe;
    @JsonProperty("account_number_type")
    public String accountNumberType;
    @JsonProperty("discarded_at")
    public Object discardedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
