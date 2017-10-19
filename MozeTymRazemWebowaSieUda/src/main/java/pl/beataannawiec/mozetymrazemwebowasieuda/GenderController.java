/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.beataannawiec.mozetymrazemwebowasieuda;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Animka
 */
@Controller
public class GenderController {
    final static Logger logger=Logger.getLogger(GenderController.class);
    
    @RequestMapping("/gender")
      public String greeting(@RequestParam(value="gender", required=false, defaultValue="none") String gender, Model model) {
        logger.info("user gender: "+gender);
        if(gender.equals("male"))
            gender="Bro";
        else if(gender.equals("female"))
            gender="Sistah";
        else
            gender="Human of a gender outside of my database";
        model.addAttribute("gender",gender);
        return "gender";
    }
}
