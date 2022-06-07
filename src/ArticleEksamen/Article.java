package ArticleEksamen;

import java.util.Arrays;
import java.util.Comparator;

public class Article {
    private String heading;
    private String body;
    private String author;

    Article(String heading, String body, String author){
        this.heading=heading;
        this.body=body;
        this.author=author;
    }
    public String getLongestWord(String body){
        String longest = Arrays.stream(body.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        return longest;
    }
    public String[] getWords(String body){
        String[] result = body.split(" ");
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if(result[i]!=result[j]){
                    break;
                }
                System.out.println(result[i]);
            }
        }
        return result;
    }

    public String toString(){
        return "" + heading + " " + body + " " + author;
    }

    public static void main(String [] args){
        Article article = new Article("Øvelse 11", "Lav en lang tekst streng med dette indholdet af denne øvelsesbeskrivelse","Peter");
        System.out.println(article.getLongestWord(article.body));
        article.getWords(article.body);
    }
}
