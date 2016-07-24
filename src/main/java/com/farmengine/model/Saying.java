package com.farmengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * Created by nisinha on 7/24/2016.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Saying {
    @JsonProperty
    private String id;

    @JsonProperty
    @Length(max = 3)
    private String content;

}
