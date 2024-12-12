package hw2.Additional;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    public List<Comment> comments;
}
