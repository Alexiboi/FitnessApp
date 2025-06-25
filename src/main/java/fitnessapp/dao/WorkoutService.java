package fitnessapp.dao;

import fitnessapp.entities.Workout;

import java.util.Optional;

public interface WorkoutService {
    public Iterable<Workout> findAll();

    public Optional<Workout> findByWorkoutId(Long id);

    public long count();

    public Workout save(Workout workout);
}
