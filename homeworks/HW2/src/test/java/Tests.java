import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class Tests {


    @Test
    public void getBulls() {
        assertThat(Main.getBulls(new char[] {'d', 'a', 'd'}, new char[] {'d', 'a', 'w'}), is(equalTo(2)));
    }

    @Test
    public void getCows() {
        assertThat(Main.getCows(new char[] {'b', 'a', 'c'}, new char[] {'a', 'b', 'c'}), is(equalTo(3)));
    }


}
