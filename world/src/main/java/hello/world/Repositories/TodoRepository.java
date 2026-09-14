package hello.world.Repositories;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    // DB communication Detailes

    // There is Three main layers in Spring

    /*
            Presentation Layer -- It's the top layer which connects with the Front-end or Browser and communicates with them
            Ex: Controllers

            Service Layer -- In this layer all the logics are written it process the data getted from the db
            Ex: ServiceFiles

            Persistance Layer -- DB related communication and the content of that file is changed as per the DB type
            EX: RepositoryFiles
    */

    public String getAllTodos(){
        return "todos";
    }
}
