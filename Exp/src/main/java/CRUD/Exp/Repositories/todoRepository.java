package CRUD.Exp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import CRUD.Exp.Models.todo;


// -- CRUD  
@Component 
public interface todoRepository extends JpaRepository<todo, Long> {
    
} 
