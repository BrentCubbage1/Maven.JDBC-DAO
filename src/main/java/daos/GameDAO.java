package daos;

import java.util.List;

public interface GameDAO {
    public Game findById(int id);
    public List findAll();
    public Game update(Game dto);
    public Game create(Game dto);
    public void delete(int id);
}
