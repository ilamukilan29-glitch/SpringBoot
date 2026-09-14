package CRUD.Exp.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity 
public class todo {

    @Id 
    @GeneratedValue 
    Long id;

    String TaskName;
    String Discription;
    boolean isCompleted;
}
