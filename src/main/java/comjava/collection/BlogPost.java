package comjava.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private String title;
    private BlogPostType type;
}


enum BlogPostType {
    NEWS, REVIEW, GUIDE
}
