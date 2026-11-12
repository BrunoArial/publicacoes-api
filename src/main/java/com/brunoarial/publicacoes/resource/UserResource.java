package com.brunoarial.publicacoes.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity; 

import com.brunoarial.publicacoes.domain.User;

@RestController 
@RequestMapping (value="/users")
public class UserResource {
    
    @RequestMapping (method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User u1 = new User("1", "Bruno", "brunoarial@gmail.com");
        User u2 = new User("2", "Maria", "maria@gmail.com");
        List<User> list = List.of(u1, u2);
        return ResponseEntity.ok().body(list);
    }
}
