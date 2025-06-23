package fitnessapp.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class WorkoutTemplate {

    @Id
    @GeneratedValue
    private Long id;

    private int reps;

    private int sets;

    private String exercise;

    public WorkoutTemplate() {}

    public WorkoutTemplate(int reps, int sets, String exercise) {
        this.reps = reps;
        this.sets = sets;
        this.exercise = exercise;
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
