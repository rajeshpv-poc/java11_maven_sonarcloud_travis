package saservice;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public enum ActionType {
    READ_METER_REQUEST("Read Meter Request", Arrays.asList("WATER", "ELECTRIC", "GAS")),
    CHANGE_VALVE_STATE("Change Valve State", Arrays.asList("WATER", "GAS")),
    CHANGE_STATE("Change State", Arrays.asList("ELECTRIC")),
    CANCEL_ACTION("Cancel Action", Arrays.asList("WATER", "ELECTRIC", "GAS")),
    WORK_ORDER("Work Order", Arrays.asList("WATER", "ELECTRIC", "GAS")),
    RETRIEVE_TRANSACTION_STATUS("Retrieve Transaction Status", Arrays.asList("WATER", "ELECTRIC", "GAS"));

    String description;
    List<String> commodity;
    private static final Map<String, ActionType> lookup = new HashMap();

    private ActionType(String description, List<String> commodity) {
        this.description = description;
        this.commodity = commodity;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getCommodity() {
        return this.commodity;
    }

    public static ActionType getActionTypeFromString(String type) {
        return (ActionType)lookup.get(type);
    }

    static {
        Iterator var0 = EnumSet.allOf(ActionType.class).iterator();

        while(var0.hasNext()) {
            ActionType c = (ActionType)var0.next();
            lookup.put(c.getDescription(), c);
        }

    }
}
