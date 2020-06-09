package saservice;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/*
 * Data transfer object for the meter reliability status and scale.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MeterReliabilityStatusScaleDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Integer scale;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    MeterReliabilityStatusScaleDTO(@JsonProperty("status") String status,
                                   @JsonProperty("scale") Integer scale) {
        this.status = status;
        this.scale = scale;
    }

    public String getStatus() {
        return status;
    }

    public Integer getScale() {
        return scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MeterReliabilityStatusScaleDTO that = (MeterReliabilityStatusScaleDTO) o;
        return Objects.equals(status, that.status) && Objects.equals(scale, that.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, scale);
    }

    @Override
    public String toString() {
        return "MeterReliabilityStatusScaleDTO{" + "status='" + status + '\'' + ", scale=" + scale
                + '}';
    }


}

