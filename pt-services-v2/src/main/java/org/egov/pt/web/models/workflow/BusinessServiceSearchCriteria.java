package org.egov.pt.web.models.workflow;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessServiceSearchCriteria {


    @NotNull
    @JsonProperty("tenantId")
    private String tenantId;

    @JsonProperty("businessServices")
    private List<String> businessServices;

    @JsonIgnore
    private List<String> stateUuids;

    @JsonIgnore
    private List<String> actionUuids;


    public BusinessServiceSearchCriteria(BusinessServiceSearchCriteria criteria) {
        this.tenantId = criteria.getTenantId();
        this.businessServices = criteria.getBusinessServices();
        this.stateUuids = criteria.getStateUuids();
        this.actionUuids = criteria.getActionUuids();
    }
}