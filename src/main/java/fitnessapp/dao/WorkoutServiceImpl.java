package fitnessapp.dao;


import fitnessapp.entities.Workout;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class WorkoutServiceImpl implements WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public Iterable<Workout> findAll(){
        return workoutRepository.findAll();
    }

    @Override
    public Optional<Workout> findByWorkoutId(Long id){
        return workoutRepository.findById(id);
    }

    @Override
    public long count(){
        return workoutRepository.count();
    }

    @Override
    public Workout save(Workout workout){
        return workoutRepository.save(workout);
    }
}
