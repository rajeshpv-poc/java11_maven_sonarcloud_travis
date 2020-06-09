package saservice;

import com.google.gson.Gson;

import java.util.Date;

public class DefaultActionService {

    public RNIActionDTO setupAction(Date startDate, Date endDate, String action) {
        final RNIActionDTO actionTO = new Gson().fromJson(action, RNIActionDTO.class);
        return  RNIActionDTO.builder(actionTO).endDate(endDate).startDate(startDate).build();

        //return  RNIActionDTO.builder().actionName(action).build();
    }
}
