
package hany.modern.treasury.model;

import java.util.List;
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
    "account_type",
    "party_name",
    "party_type",
    "party_address",
    "account_details",
    "routing_details",
    "name",
    "metadata",
    "verification_status",
    "contact_details",
    "discarded_at",
    "created_at",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class Account {

    @JsonProperty("id")
    public String id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("live_mode")
    public Boolean liveMode;
    @JsonProperty("account_type")
    public String accountType;
    @JsonProperty("party_name")
    public String partyName;
    @JsonProperty("party_type")
    public Object partyType;
    @JsonProperty("party_address")
    @Valid
    public PartyAddress partyAddress;
    @JsonProperty("account_details")
    @Valid
    public List<AccountDetail> accountDetails;
    @JsonProperty("routing_details")
    @Valid
    public List<RoutingDetail> routingDetails;
    @JsonProperty("name")
    public String name;
    @JsonProperty("metadata")
    @Valid
    public Metadata__1 metadata;
    @JsonProperty("verification_status")
    public String verificationStatus;
    @JsonProperty("contact_details")
    @Valid
    public List<ContactDetail> contactDetails;
    @JsonProperty("discarded_at")
    public Object discardedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;

}
