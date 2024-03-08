package modulo13.exercicio2.application;

import java.time.LocalDateTime;

import modulo13.exercicio2.entities.Comment;
import modulo13.exercicio2.entities.Post;

public class Program {
    public static void main(String[] args) {        
        Comment c1 = new Comment("That's awesome");
        Comment c2 = new Comment("Nice trip");
        Post p1 = new Post(
            LocalDateTime.parse("2024-03-06T23:00:00"), 
            "New Zeland", 
            "I'm gonna travel next week", 
            12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Sleep well");
        Comment c4 = new Comment("Was the bed warm?");
        Post p2 = new Post(
            LocalDateTime.parse("2024-03-06T23:15:00"), 
            "Good night", 
            "See you tomorrow", 
            10);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
