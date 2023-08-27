package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class GameGetter implements GameDAO{

    @Override
    public Game findById(int id) {
            Connection connection = ConnectionFactory.getConnection();
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Game WHERE appid=" + id);

                if(rs.next())
                {
                    Game game = new Game();

                    game.setAppID( rs.getInt("appid") );
                    game.setName( rs.getString("name") );
                    game.setGenre( rs.getString("genre") );
                    game.setRating( rs.getDouble("Rating") );
                    game.setReleaseYear(rs.getInt("release_year"));
                    return game;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return null;
        }


    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Game update(Game dto) {
        return null;
    }

    @Override
    public Game create(Game dto) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
