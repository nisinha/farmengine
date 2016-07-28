package com.farmengine.model.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nisinha on 7/28/2016.
 */
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class FarmLocation {

    @JsonProperty
    private String customerId;
    @JsonProperty
    private String farmId;
    @JsonProperty
    private String farmName;
    @JsonProperty
    private String latitude;
    @JsonProperty
    private String longitude;
    @JsonProperty
    private String radius;

}
