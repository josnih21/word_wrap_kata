import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class WordWrapShould {
    @Test
    public void allows_empty_text(){
        assertThat(WordWrap.wrapping("",0)).isEqualTo("");
    }

    @Test
    public void allows_a_word_smaller_than_column_width(){
        assertThat(WordWrap.wrapping("hello",6)).isEqualTo("hello");
    }

    @Test
    public void add_new_line_when_word_bigger_than_column_width(){
        assertThat(WordWrap.wrapping("caracoles",5)).isEqualTo("carac\noles");
        assertThat(WordWrap.wrapping("hoy tengo de comer papas con carne",4)).isEqualTo("hoy \nteng\no de\n com\ner p\napas\n con\n car\nne");
    }

}
