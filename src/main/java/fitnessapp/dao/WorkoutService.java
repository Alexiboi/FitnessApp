package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;

import java.util.List;
import java.util.Optional;

public interface WorkoutService {

    public Iterable<WorkoutTemplate> findAll();

    public Optional<WorkoutTemplate> findByWorkoutId(Long id);

    public long count();

    public WorkoutTemplate save(WorkoutTemplate workoutTemplate);



}
