package saweb;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubmitActionResponse {

    private final String errorString;
    private final List<String> notSupportedAction;
    private final int totalTransactionCount;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    SubmitActionResponse(
            @JsonProperty("errorString") String errorString,
            @JsonProperty("notSupportedAction") List<String> notSupportedAction,
            @JsonProperty("totalTransactionCount") int totalTransactionCount) {

        this.errorString = errorString;
        this.notSupportedAction = notSupportedAction != null ? Collections.unmodifiableList(notSupportedAction) : null;
        this.totalTransactionCount = totalTransactionCount;
    }

    public String getErrorString() {
        return errorString;
    }

    public List<String> getNotSupportedAction() {
        return notSupportedAction;
    }

    public int getTotalTransactionCount() {
        return totalTransactionCount;
    }

    public static Builder builder() {
        return new DefaultBuilder();
    }

    public interface Builder {

        Builder errorString(String errorString);

        Builder notSupportedAction(List<String> notSupportedAction);

        Builder totalTransactionCount(int totalTransactionCount);

        SubmitActionResponse build();
    }

    public static final class DefaultBuilder implements Builder {
        private String errorString;
        private List<String> notSupportedAction;
        private int totalTransactionCount;

        @Override
        public Builder errorString(String errorString) {
            this.errorString = errorString;
            return this;
        }

        @Override
        public Builder notSupportedAction(List<String> notSupportedAction) {
            this.notSupportedAction = notSupportedAction;
            return this;
        }

        @Override
        public Builder totalTransactionCount(int totalTransactionCount) {
            this.totalTransactionCount = totalTransactionCount;
            return this;
        }

        @Override
        public SubmitActionResponse build() {
            return new SubmitActionResponse(
                    this.errorString,
                    this.notSupportedAction,
                    this.totalTransactionCount
            );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitActionResponse that = (SubmitActionResponse) o;
        return new EqualsBuilder()
                .append(totalTransactionCount, that.totalTransactionCount)
                .append(errorString, that.errorString)
                .append(notSupportedAction, that.notSupportedAction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(errorString)
                .append(notSupportedAction)
                .append(totalTransactionCount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SubmitActionResponse.class.getSimpleName() + "[", "]")
                .add("errorString='" + errorString + "'")
                .add("notSupportedAction=" + notSupportedAction)
                .add("totalTransactionCount=" + totalTransactionCount)
                .toString();
    }
}