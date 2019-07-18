package hello;

import hello.Owners;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class OwnerRowMapper implements RowMapper<Owners> {
  @Override
  public Owners mapRow(ResultSet rs, int rowNum) throws SQLException {
      Owners owners = new Owners();

      owners.setId(rs.getInt("id"));
      owners.setTitle(rs.getString("name"));

      return owners;
  }
}