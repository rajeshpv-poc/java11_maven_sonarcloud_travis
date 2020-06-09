package saweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import saservice.ChangeStateActionService;
import saservice.DefaultActionService;
import saservice.RNIActionDTO;

import java.util.Date;
@Controller
@RequestMapping("/actions")
public class SaWebController {

    private DefaultActionService actionService = new DefaultActionService();
    private ChangeStateActionService changeStateActionService = new ChangeStateActionService();

    @PostMapping("/submitChangeState")
    @ResponseBody
    ///@SuppressWarnings("squid:S5131") // This was added with Jay's permission and those vulnerabilities will be fixed in the task SA-3005.
    public SubmitActionResponse submitChangeState(
            @RequestParam(required = false) final Date startDate,
            @RequestParam(required = false) final Date endDate,
            @RequestParam final String action) {

        try {
            final RNIActionDTO actionDTO = actionService.setupAction(startDate, endDate, action);
            return changeStateActionService.submitChangeState(actionDTO);
        } catch (Exception e) {
            return SubmitActionResponse.builder().errorString("ErrroMsg").build();
        }
    }


}
