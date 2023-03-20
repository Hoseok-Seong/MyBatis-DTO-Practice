package shop.mtcoding.mybatisdto.model.board;

import java.util.List;

public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public Board findByUsernameAndPassword(Board board);
}