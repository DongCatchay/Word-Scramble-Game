package models;

/**
 * Created by DongCatchay on 10/17/2016.
 */

import com.avaje.ebean.*;
import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "entries")
public class Word extends Model{
    @Id
    private String id;

    private String word;

    // get random word from database
    public String randomWord(){
        List<Word> words = new Model.Finder(String.class, Word.class).all();
        return (oversetWord(words.get(new Random().nextInt(words.size())).word).toUpperCase());
    }

    // function overset the word
    private String oversetWord(String word){
        char[] chars = word.toCharArray();
        Random rand = new Random();
        for (int i = 0; i < word.length() - 1; i++) {
            int j = rand.nextInt(word.length() - 1);
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        return new String(chars);
    }

    // check is the word in database
    public boolean checkWordInDatabase(String word){
        List<Word> words = new Model.Finder(String.class, Word.class).where()
                .like("word", word)
                .findList();
        return words.size() > 0;
    }
}
