package hello;

import hello.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {
  @Override
  public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
      Book book = new Book();

      book.setId(rs.getInt("id"));
      book.setTitle(rs.getString("title"));
      book.setAuthor(rs.getString("author"));
      //book.setPublished(rs.getString("published"));

      return book;
  }
}