
package br.com.buildersys.workshop.mongodb.resources;

import br.com.buildersys.workshop.mongodb.domain.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daniel
 */
@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria  = new User("1" , "Maria Souza" , "maria@email.com");
        User joao  = new User("1" , "João Dias" , "joao@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,joao));
        return ResponseEntity.ok().body(list);
        
    }
    
}
