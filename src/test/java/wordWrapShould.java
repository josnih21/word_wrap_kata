import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class wordWrapShould {

    @Test
    public void allow_empty_line(){
        assertThat(wordWrap.wrap("",0)).isEqualTo("");
    }

    @Test
    public void allow_line_shorter_than_column(){
        assertThat(wordWrap.wrap("hello",5)).isEqualTo("hello");
    }

    @Test
    public void wrap_line_bigger_than_column(){
        assertThat(wordWrap.wrap("caracoles",5)).isEqualTo("carac\noles");
    }

    @Test
    public void wrap_line_bigger_than_column_with_spaces(){
        assertThat(wordWrap.wrap("hello world",5)).isEqualTo("hello\nworld");
        assertThat(wordWrap.wrap("hello world",3)).isEqualTo("hel\nlo\nwor\nld");
        assertThat(wordWrap.wrap("hoy tengo papas de comer",5)).isEqualTo("hoy\ntengo\npapas\nde\ncomer");
        assertThat(wordWrap.wrap("You cannot say Pop and forget the smoke",6)).isEqualTo("You\ncannot\nsay\nPop\nand\nforget\nthe\nsmoke");
        //assertThat(wordWrap.wrap("a longword",6)).isEqualTo("a long\nword");
        assertThat(wordWrap.wrap("Mi nombre es Shepard y esta es mi tienda favorita de la ciudadela",10)).isEqualTo("Mi nombre\nes Shepard\ny esta es\nmi tienda\nfavorita\nde la\nciudadela");
    }




}
