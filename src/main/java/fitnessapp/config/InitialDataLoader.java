package fitnessapp.config;

import fitnessapp.dao.WorkoutService;
import fitnessapp.entities.WorkoutTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialDataLoader {
    private final static Logger log = LoggerFactory.getLogger(InitialDataLoader.class);

//    private final static String[] TEMPLATES = {8, 3, "bench press"};

    @Bean
    CommandLineRunner initDatabase(WorkoutService workoutService) {
        if (workoutService.count() > 0) {
            return args -> {
                log.info("Database already populated. Skipping data initialization.");
            };
        }

        return args -> {

            log.info("Preloading: " + workoutService.save(new WorkoutTemplate(8, 3, "bench press")));
            log.info(workoutService.findAll().toString());
        };
    }
}
