package fitnessapp.dao;

import fitnessapp.entities.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout,Long> {
}
