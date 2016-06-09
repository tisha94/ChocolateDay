package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Tisha868 on 6/3/16.
 */

@Controller
public class CocoSpringAppController {


    @RequestMapping(path = "/", method = RequestMethod.GET) // takes 2 Parameters name of the path & method.
    // Path variable doesn't have to be the same Name as the view= coco.html file.
    public String coco(Model model, HttpSession session) {
      //  model.addAttribute("coco");
        return "coco";
    }
}
