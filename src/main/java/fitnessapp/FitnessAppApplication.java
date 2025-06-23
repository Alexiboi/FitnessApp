package fitnessapp;

import fitnessapp.dao.WorkoutService;
import fitnessapp.entities.WorkoutTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FitnessAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessAppApplication.class, args);
    }



    public void insertDummyData(WorkoutService workoutService) {
        workoutService.save(new WorkoutTemplate(8, 3, "bench press"));
        workoutService.save(new WorkoutTemplate(12, 2, "squats"));
        workoutService.save(new WorkoutTemplate(7, 2, "chest flys"));
    }


}
