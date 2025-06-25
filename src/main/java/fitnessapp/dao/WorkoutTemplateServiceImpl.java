package fitnessapp.dao;

import fitnessapp.entities.WorkoutTemplate;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
class WorkoutTemplateServiceImpl implements WorkoutTemplateService {

    @Autowired
    private WorkoutTemplateRepository workoutTemplateRepository;

    @Override
    public Iterable<WorkoutTemplate> findAll(){
        return workoutTemplateRepository.findAll();
    }

    @Override
    public Optional<WorkoutTemplate> findByWorkoutId(Long id){
        return workoutTemplateRepository.findById(id);
    }

    @Override
    public long count(){
        return workoutTemplateRepository.count();
    }

    @Override
    public WorkoutTemplate save(WorkoutTemplate workoutTemplate){
        return workoutTemplateRepository.save(workoutTemplate);
    }


}
