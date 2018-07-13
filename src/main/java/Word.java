/**
 * Created by jxzhong on 2018/5/22.
 */
public class Word {
    private String value;
    private int count;

    public Word(String w, int i) {
        this.value = w;
        this.count = i;
    }

    public String getValue() {
        return this.value;
    }

    public int getWordCount() {
        return this.count;
    }
}
