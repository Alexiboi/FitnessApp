package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;
import org.springframework.data.repository.CrudRepository;

interface WorkoutRepository extends CrudRepository<WorkoutTemplate, Long> {
}
