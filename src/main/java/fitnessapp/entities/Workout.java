package fitnessapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Workout {

    @Id
    @GeneratedValue
    private Long id;

    private int reps;

    private int sets;

    private String exercise;

    private int weight;

    @ManyToOne
    private WorkoutTemplate workoutTemplate;

    public Workout() {}

    public Workout(int reps, int sets, String exercise, int weight) {
        this.reps = reps;
        this.sets = sets;
        this.exercise = exercise;
        this.weight = weight;
    }

    public WorkoutTemplate getWorkoutTemplate() {
        return workoutTemplate;
    }

    public void setWorkoutTemplate(WorkoutTemplate workoutTemplate) {
        this.workoutTemplate = workoutTemplate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getExercise(){
        return exercise;
    }

    public void setExercise(String exercise){
        this.exercise = exercise;
    }

    public int getReps(){
        return this.reps;
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    public int getSets(){
        return this.sets;
    }

    public void setSets(int sets){
        this.sets = sets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
