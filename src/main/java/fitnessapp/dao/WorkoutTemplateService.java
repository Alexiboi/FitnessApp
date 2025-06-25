package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;

import java.util.Optional;

public interface WorkoutTemplateService {

    public Iterable<WorkoutTemplate> findAll();

    public Optional<WorkoutTemplate> findByWorkoutId(Long id);

    public long count();

    public WorkoutTemplate save(WorkoutTemplate workoutTemplate);



}
