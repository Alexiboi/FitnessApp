package fitnessapp.controllers;

import fitnessapp.dao.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.ui.Model;


@Controller
@RequestMapping(value = "/workouts", produces = MediaType.TEXT_HTML_VALUE)
public class WorkoutTemplateController {

    @Autowired
    private WorkoutService workoutService;

//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String workoutNotFoundHandler(workoutNotFoundException ex, Model model) {
//        model.addAttribute("not_found_id", ex.getId())
//    }

    @GetMapping
    public String listWorkouts(Model model) {
        model.addAttribute("workouts", workoutService.findAll());

        return "workouts/index";
    }


}
