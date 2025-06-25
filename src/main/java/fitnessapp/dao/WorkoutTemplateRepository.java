package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;
import org.springframework.data.repository.CrudRepository;

interface WorkoutTemplateRepository extends CrudRepository<WorkoutTemplate, Long> {
}
