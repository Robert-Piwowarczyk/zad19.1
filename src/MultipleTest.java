import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleTest {

    private Multiple multiple = new Multiple();

    @Test
    public void shouldWorkFor10() {
        int result = multiple.set(10);

        Assertions.assertThat(result).isEqualTo(23);
    }

    @Test
    public void shouldWorkFor11() {
        int result = multiple.set(11);

        Assertions.assertThat(result).isEqualTo(33);
    }

    @Test
    public void shouldWorkFor12() {
        int result = multiple.set(12);

        Assertions.assertThat(result).isEqualTo(33);
    }

    @Test
    public void shouldWorkFor13() {
        int result = multiple.set(13);

        Assertions.assertThat(result).isEqualTo(45);
    }

    @Test
    public void shouldWorkFor16() {
        int result = multiple.set(16);

        Assertions.assertThat(result).isEqualTo(60);
    }
}