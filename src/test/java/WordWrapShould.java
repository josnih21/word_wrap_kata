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
        assertThat(WordWrap.wrapping("adios tio",10)).isEqualTo("adios tio");
    }

    @Test
    public void add_new_line_when_word_bigger_than_column_width(){
        assertThat(WordWrap.wrapping("caracoles",5)).isEqualTo("carac\noles");
        assertThat(WordWrap.wrapping("hoy tengo de comer papas con carne",4)).isEqualTo("hoy \nteng\no de\n com\ner p\napas\n con\n car\nne");
        assertThat(WordWrap.wrapping("hola k ase",2)).isEqualTo("ho\nla\n k\n a\nse\n");
        assertThat(WordWrap.wrapping("keloke manin",6)).isEqualTo("keloke\n manin\n");
        assertThat(WordWrap.wrapping("a longword",6)).isEqualTo("a long\nword");
        assertThat(WordWrap.wrapping("Hello World",6)).isEqualTo("Hello \nWorld");
        assertThat(WordWrap.wrapping("Mi nombre es Shepard y esta es mi tienda favorita de la ciudadela",10)).isEqualTo("Mi nombre \nes Shepard\n y esta es\n mi tienda\n favorita \nde la ciud\nadela");
    }

}
