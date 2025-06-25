package fitnessapp.entities;
import jakarta.persistence.*;
import org.hibernate.jdbc.Work;

import java.util.ArrayList;
import java.util.List;

@Entity
public class WorkoutTemplate {

    @Id
    @GeneratedValue
    private Long template_id;

    private String workoutTitle;

    @OneToMany(mappedBy = "workoutTemplate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Workout> workouts = new ArrayList<>();

    public WorkoutTemplate() {}

    public WorkoutTemplate(String workoutTitle) {
        this.workoutTitle = workoutTitle;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    public String getTitle() {
        return workoutTitle;
    }

    public void setTitle(String workoutTitle) {
        this.workoutTitle = workoutTitle;
    }

    public void setId(Long id) {
        this.template_id = id;
    }

    public Long getId() {
        return template_id;
    }
}
