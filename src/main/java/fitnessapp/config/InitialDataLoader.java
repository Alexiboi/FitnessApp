package fitnessapp.config;

import fitnessapp.dao.WorkoutTemplateService;
import fitnessapp.entities.Workout;
import fitnessapp.entities.WorkoutTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InitialDataLoader {
    private final static Logger log = LoggerFactory.getLogger(InitialDataLoader.class);

//    private final static String[] TEMPLATES = {8, 3, "bench press"};


    @Bean
    CommandLineRunner initDatabase(WorkoutTemplateService workoutTemplateService) {
        if (workoutTemplateService.count() > 0) {
            return args -> {
                log.info("Database already populated. Skipping data initialization.");
            };
        }

        return args -> {
            WorkoutTemplate pushDay = new WorkoutTemplate("push day");

            Workout bench = new Workout(12, 3, "bench press", 95);

            Workout shoulderPress = new Workout(8, 3, "shoulder press", 65);

            bench.setWorkoutTemplate(pushDay);
            shoulderPress.setWorkoutTemplate(pushDay);

            List<Workout> workouts = new ArrayList<>();
            workouts.add(bench);
            workouts.add(shoulderPress);


            pushDay.setWorkouts(workouts);

            log.info("Preloading: " + workoutTemplateService.save(pushDay));
            log.info(workoutTemplateService.findAll().toString());
        };
    }
}
