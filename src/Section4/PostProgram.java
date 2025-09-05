package Section4;

import Section4.EntititesPost.Comment;
import Section4.EntititesPost.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostProgram {
    public static void main(String[] args) throws ParseException {
        System.out.println("put right below what will be the post");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post = new Post(sdf.parse("20/06/2018 13:50:40"), "Travel to New Zealand", "it was awesome, i gotta go again", 16);
        Comment cm = new Comment("Really cool");
        Comment cm2 = new Comment("i need to visit that place as well");
        post.addComments(cm);
        post.addComments(cm2);
        System.out.println(post);
    }
}
