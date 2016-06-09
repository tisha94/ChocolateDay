package tiy.webapp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Tisha868 on 6/7/16.
 */

@RestController
public class CocoJSONController {

    @RequestMapping(path ="/coco.json", method = RequestMethod.GET)
    public ChocolateSolution makeCoco(Model model, int small, int big, int goal) {
        Main newMain = new Main();
        ChocolateSolution sweet = newMain.makeChocolate(small, big, goal);// takes 3 inpit params... cre8 variable
        // called: sweet. calling
        // makeChocolate that is returning coco solution & returnng sweet.

            return sweet;
    } //defined a json end point:= http://localhost:8080/coco.json?big=4&small=4&goal=5
    //^^^^^^^call path, gave it parameters, taking input calling main & made Coco :) and returned a coco solution.



    @RequestMapping(path ="/sweet.json", method = RequestMethod.POST)
    public ChocolateSolution makeCoco(Model model,@RequestBody CocoInputContainer newCoco){ // taking container or
        // class as an input.
        Main newMain = new Main();
        ChocolateSolution sweet = newMain.makeChocolate(newCoco.small,newCoco.big,newCoco.goal);//cre8 variable called:
        // sweet.
        // calling
        // makeChocolate that is returning coco solution & returnng sweet.

        return sweet;
    }
}
