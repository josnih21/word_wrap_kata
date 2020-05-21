import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class wordWrapShould {
    @Test
    public void allows_empty_text(){
        assertThat(wordWrap.wrapping("",0)).isEqualTo("");
    }

    @Test
    public void allows_a_word_smaller_than_column_width(){
        assertThat(wordWrap.wrapping("hello",6)).isEqualTo("hello");
        assertThat(wordWrap.wrapping("adios tio",10)).isEqualTo("adios tio");
    }

    @Test
    public void add_new_line_when_word_bigger_than_column_width(){
        assertThat(wordWrap.wrapping("caracoles",5)).isEqualTo("carac\noles");
        assertThat(wordWrap.wrapping("hoy tengo de comer papas con carne",4)).isEqualTo("hoy \nteng\no de\n com\ner p\napas\n con\n car\nne");
        assertThat(wordWrap.wrapping("hola k ase",2)).isEqualTo("ho\nla\n k\n a\nse");
        assertThat(wordWrap.wrapping("keloke manin",6)).isEqualTo("keloke\n manin");
        assertThat(wordWrap.wrapping("a longword",6)).isEqualTo("a long\nword");
        assertThat(wordWrap.wrapping("Hello World",6)).isEqualTo("Hello \nWorld");
        assertThat(wordWrap.wrapping("Mi nombre es Shepard y esta es mi tienda favorita de la ciudadela",10)).isEqualTo("Mi nombre \nes Shepard\n y esta es\n mi tienda\n favorita \nde la ciud\nadela");
    }



}
