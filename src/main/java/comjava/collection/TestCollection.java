package comjava.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollection {

    public static void main(String[] args) {
        List<BlogPost> blogPosts = Arrays.asList(new BlogPost("title 1", BlogPostType.GUIDE),
                new BlogPost("title 2", BlogPostType.GUIDE),
                new BlogPost("title 3", BlogPostType.NEWS),
                new BlogPost("title 4", BlogPostType.NEWS),
                new BlogPost("title 5", BlogPostType.REVIEW),
                new BlogPost("title 6", BlogPostType.REVIEW));
        Map<BlogPostType, List<BlogPost>> postsPerType =
                blogPosts.stream().collect(Collectors.groupingBy(BlogPost::getType));
        System.out.println(Collectors.groupingBy(BlogPost::getType));
        System.out.println(postsPerType);
    }
}
