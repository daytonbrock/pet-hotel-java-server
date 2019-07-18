package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.jdbc.core.JdbcTemplate;

import hello.Owners;
import hello.Pets;

@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/owners")
    public List<Owners> getAllOwners() {
        String query = "SELECT * FROM owners";
        List<Owners> owners = jdbcTemplate.query(
            query, new OwnerRowMapper());
          return owners;
    }

    @GetMapping("/pets")        
    public List<Pets> getAllPets() {
        String query = "SELECT * FROM pets";
        List<Pets> pets = jdbcTemplate.query(
            query, new PetRowMapper());
            return pets;
    }

    // @PostMapping(path = "/post-pet", consumes = "application/json", produces = "application/json")
    // public void addPet(@RequestBody Member member){
    //     String query = "INSERT INTO pets WHERE ";
    // }
    
}
