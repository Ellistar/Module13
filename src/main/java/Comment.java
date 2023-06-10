import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
