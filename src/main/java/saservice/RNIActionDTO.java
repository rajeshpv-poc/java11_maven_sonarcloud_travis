package saservice;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RNIActionDTO {

    private final ActionType actionType;
    private final Map<String, String> filters;
    private final String commodity;
    private final Boolean allSelected;
    private final String ids;
    private final Boolean allReplace;
    private final Boolean allDeviceIds;
    private final List<String> replace;
    private final List<String> deviceIds;
    private final String batchId;
    private final String transactionIds;
    private final String sActionState;
    private final String actionName;
    private final Date startDate;
    private final Date endDate;
    private final Boolean existsAccount;
    private final String source;
    private final Map<String, MeterReliabilityStatusScaleDTO> meterReliabilities;
    private final Boolean sendFailureNotification;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    RNIActionDTO(
            @JsonProperty("actionType") ActionType actionType,
            @JsonProperty("filters") Map<String, String> filters,
            @JsonProperty("commodity") String commodity,
            @JsonProperty("allSelected") Boolean allSelected,
            @JsonProperty("ids") String ids,
            @JsonProperty("allReplace") Boolean allReplace,
            @JsonProperty("allDeviceIds") Boolean allDeviceIds,
            @JsonProperty("replace") List<String> replace,
            @JsonProperty("deviceIds") List<String> deviceIds,
            @JsonProperty("batchId") String batchId,
            @JsonProperty("transactionIds") String transactionIds,
            @JsonProperty("sActionState") String sActionState,
            @JsonProperty("actionName") String actionName,
            @JsonProperty("startDate") Date startDate,
            @JsonProperty("endDate") Date endDate,
            @JsonProperty("existsAccount") Boolean existsAccount,
            @JsonProperty("source") String source,
            @JsonProperty("meterReliabilities") Map<String, MeterReliabilityStatusScaleDTO> meterReliabilities,
            @JsonProperty("sendFailureNotification") Boolean sendFailureNotification) {

        this.actionType = actionType;
        this.filters = filters != null ? Collections.unmodifiableMap(filters) : null;
        this.commodity = commodity;
        this.allSelected = allSelected;
        this.ids = ids;
        this.allReplace = allReplace;
        this.allDeviceIds = allDeviceIds;
        this.replace = replace != null ? Collections.unmodifiableList(replace) : null;
        this.deviceIds = deviceIds != null ? Collections.unmodifiableList(deviceIds) : null;
        this.batchId = batchId;
        this.transactionIds = transactionIds;
        this.sActionState = sActionState;
        this.actionName = actionName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.existsAccount = existsAccount;
        this.source = source;
        this.meterReliabilities = meterReliabilities != null ? Collections.unmodifiableMap(meterReliabilities) : null;
        this.sendFailureNotification = sendFailureNotification;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public Map<String, String> getFilters() {
        return filters;
    }

    public String getCommodity() {
        return commodity;
    }

    public Boolean getAllSelected() {
        return allSelected;
    }

    public String getIds() {
        return ids;
    }

    public Boolean getAllReplace() {
        return allReplace;
    }

    public Boolean getAllDeviceIds() {
        return allDeviceIds;
    }

    public List<String> getReplace() {
        return replace;
    }

    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getTransactionIds() {
        return transactionIds;
    }

    public String getsActionState() {
        return sActionState;
    }

    public String getActionName() {
        return actionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Boolean getExistsAccount() {
        return existsAccount;
    }

    public String getSource() {
        return source;
    }

    public Map<String, MeterReliabilityStatusScaleDTO> getMeterReliabilities() {
        return meterReliabilities;
    }

    public Boolean getSendFailureNotification() {
        return sendFailureNotification;
    }

    public static Builder builder() {
        return new DefaultBuilder();
    }

    public static Builder builder(RNIActionDTO rniActionDTO) {
        return new DefaultBuilder(rniActionDTO);
    }

    public interface Builder {

        Builder actionType(ActionType actionType);

        Builder filters(Map<String, String> filters);

        Builder commodity(String commodity);

        Builder allSelected(Boolean allSelected);

        Builder ids(String ids);

        Builder allReplace(Boolean allReplace);

        Builder allDeviceIds(Boolean allDeviceIds);

        Builder replace(List<String> replace);

        Builder deviceIds(List<String> deviceIds);

        Builder batchId(String batchId);

        Builder transactionIds(String transactionIds);

        Builder sActionState(String sActionState);

        Builder actionName(String actionName);

        Builder startDate(Date startDate);

        Builder endDate(Date endDate);

        Builder existsAccount(Boolean existsAccount);

        Builder source(String source);

        Builder meterReliabilities(Map<String, MeterReliabilityStatusScaleDTO> meterReliabilities);

        Builder sendFailureNotification(Boolean sendFailureNotification);

        RNIActionDTO build();
    }

    public static final class DefaultBuilder implements Builder {
        private ActionType actionType;
        private Map<String, String> filters;
        private String commodity;
        private Boolean allSelected;
        private String ids;
        private Boolean allReplace;
        private Boolean allDeviceIds;
        private List<String> replace;
        private List<String> deviceIds;
        private String batchId;
        private String transactionIds;
        private String sActionState;
        private String actionName;
        private Date startDate;
        private Date endDate;
        private Boolean existsAccount;
        private String source;
        private Map<String, MeterReliabilityStatusScaleDTO> meterReliabilities;
        private Boolean sendFailureNotification;

        public DefaultBuilder(){}

        public DefaultBuilder(RNIActionDTO rniActionDTO) {
            this.actionType = rniActionDTO.getActionType();
            this.filters = rniActionDTO.getFilters();
            this.commodity = rniActionDTO.getCommodity();
            this.allSelected = rniActionDTO.getAllSelected();
            this.ids = rniActionDTO.getIds();
            this.allReplace = rniActionDTO.getAllReplace();
            this.allDeviceIds = rniActionDTO.getAllDeviceIds();
            this.replace = rniActionDTO.getReplace();
            this.deviceIds = rniActionDTO.getDeviceIds();
            this.batchId = rniActionDTO.getBatchId();
            this.transactionIds = rniActionDTO.getTransactionIds();
            this.sActionState = rniActionDTO.getsActionState();
            this.actionName = rniActionDTO.getActionName();
            this.startDate = rniActionDTO.getStartDate();
            this.endDate = rniActionDTO.getEndDate();
            this.existsAccount = rniActionDTO.getExistsAccount();
            this.source = rniActionDTO.getSource();
            this.meterReliabilities = rniActionDTO.getMeterReliabilities();
            this.sendFailureNotification = rniActionDTO.getSendFailureNotification();
        }

        @Override
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        @Override
        public Builder filters(Map<String, String> filters) {
            this.filters = filters;
            return this;
        }

        @Override
        public Builder commodity(String commodity) {
            this.commodity = commodity;
            return this;
        }

        @Override
        public Builder allSelected(Boolean allSelected) {
            this.allSelected = allSelected;
            return this;
        }

        @Override
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        @Override
        public Builder allReplace(Boolean allReplace) {
            this.allReplace = allReplace;
            return this;
        }

        @Override
        public Builder allDeviceIds(Boolean allDeviceIds) {
            this.allDeviceIds = allDeviceIds;
            return this;
        }

        @Override
        public Builder replace(List<String> replace) {
            this.replace = replace;
            return this;
        }

        @Override
        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        @Override
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        @Override
        public Builder transactionIds(String transactionIds) {
            this.transactionIds = transactionIds;
            return this;
        }

        @Override
        public Builder sActionState(String sActionState) {
            this.sActionState = sActionState;
            return this;
        }

        @Override
        public Builder actionName(String actionName) {
            this.actionName = actionName;
            return this;
        }

        @Override
        public Builder startDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        @Override
        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        @Override
        public Builder existsAccount(Boolean existsAccount) {
            this.existsAccount = existsAccount;
            return this;
        }

        @Override
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        @Override
        public Builder meterReliabilities(Map<String, MeterReliabilityStatusScaleDTO> meterReliabilities) {
            this.meterReliabilities = meterReliabilities;
            return this;
        }

        @Override
        public Builder sendFailureNotification(Boolean sendFailureNotification) {
            this.sendFailureNotification = sendFailureNotification;
            return this;
        }

        @Override
        public RNIActionDTO build() {
            return new RNIActionDTO(
                    this.actionType,
                    this.filters,
                    this.commodity,
                    this.allSelected,
                    this.ids,
                    this.allReplace,
                    this.allDeviceIds,
                    this.replace,
                    this.deviceIds,
                    this.batchId,
                    this.transactionIds,
                    this.sActionState,
                    this.actionName,
                    this.startDate,
                    this.endDate,
                    this.existsAccount,
                    this.source,
                    this.meterReliabilities,
                    this.sendFailureNotification
            );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RNIActionDTO that = (RNIActionDTO) o;
        return new EqualsBuilder()
                .append(actionType, that.actionType)
                .append(filters, that.filters)
                .append(commodity, that.commodity)
                .append(allSelected, that.allSelected)
                .append(ids, that.ids)
                .append(allReplace, that.allReplace)
                .append(allDeviceIds, that.allDeviceIds)
                .append(replace, that.replace)
                .append(deviceIds, that.deviceIds)
                .append(batchId, that.batchId)
                .append(transactionIds, that.transactionIds)
                .append(sActionState, that.sActionState)
                .append(actionName, that.actionName)
                .append(startDate, that.startDate)
                .append(endDate, that.endDate)
                .append(existsAccount, that.existsAccount)
                .append(source, that.source)
                .append(meterReliabilities, that.meterReliabilities)
                .append(sendFailureNotification, that.sendFailureNotification)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(actionType)
                .append(filters)
                .append(commodity)
                .append(allSelected)
                .append(ids)
                .append(allReplace)
                .append(allDeviceIds)
                .append(replace)
                .append(deviceIds)
                .append(batchId)
                .append(transactionIds)
                .append(sActionState)
                .append(actionName)
                .append(startDate)
                .append(endDate)
                .append(existsAccount)
                .append(source)
                .append(meterReliabilities)
                .append(sendFailureNotification)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RNIActionDTO.class.getSimpleName() + "[", "]")
                .add("actionType=" + actionType)
                .add("filters=" + filters)
                .add("commodity='" + commodity + "'")
                .add("allSelected=" + allSelected)
                .add("ids='" + ids + "'")
                .add("allReplace=" + allReplace)
                .add("allDeviceIds=" + allDeviceIds)
                .add("replace=" + replace)
                .add("deviceIds=" + deviceIds)
                .add("batchId='" + batchId + "'")
                .add("transactionIds='" + transactionIds + "'")
                .add("sActionState='" + sActionState + "'")
                .add("actionName='" + actionName + "'")
                .add("startDate=" + startDate)
                .add("endDate=" + endDate)
                .add("existsAccount=" + existsAccount)
                .add("source='" + source + "'")
                .add("meterReliabilities=" + meterReliabilities)
                .add("sendFailureNotification=" + sendFailureNotification)
                .toString();
    }
}
