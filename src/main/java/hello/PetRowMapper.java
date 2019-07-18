package hello;

import hello.Pets;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PetRowMapper implements RowMapper<Pets>{
    @Override
    public Pets mapRow(ResultSet result, int rowNumber) throws SQLException {
        Pets pets = new Pets();

        pets.setId(result.getInt("id"));
        pets.setName(result.getString("name"));
        pets.setBreed(result.getString("breed"));
        pets.setColor(result.getString("color"));
        pets.setChecked(result.getBoolean("checked_in"));
        pets.setOwnerId(result.getInt("owner_id"));

        return pets;
    }
}