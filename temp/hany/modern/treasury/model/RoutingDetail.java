
package hany.modern.treasury.model;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "object",
    "live_mode",
    "payment_type",
    "routing_number",
    "routing_number_type",
    "bank_name",
    "bank_address",
    "discarded_at",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class RoutingDetail {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("payment_type")
    public Object paymentType;
    @JsonProperty("routing_number")
    public String routingNumber;
    @JsonProperty("routing_number_type")
    public String routingNumberType;
    @JsonProperty("bank_name")
    public String bankName;
    @JsonProperty("bank_address")
    @Valid
    public BankAddress bankAddress;
    @JsonProperty("discarded_at")
    public Object discardedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
