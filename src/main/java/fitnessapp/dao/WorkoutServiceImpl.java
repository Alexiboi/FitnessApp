package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public Iterable<WorkoutTemplate> findAll(){
        return workoutRepository.findAll();
    }

    @Override
    public Optional<WorkoutTemplate> findByWorkoutId(Long id){
        return workoutRepository.findById(id);
    }

    @Override
    public long count(){
        return workoutRepository.count();
    }

    @Override
    public WorkoutTemplate save(WorkoutTemplate workoutTemplate){
        return workoutRepository.save(workoutTemplate);
    }


}
