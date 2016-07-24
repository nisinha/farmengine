package com.farmengine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nisinha on 7/24/2016.
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class UserArea {
    @JsonProperty
    private String userId;

    @JsonProperty
    private String latitude;

    @JsonProperty
    private String longitude;

}
