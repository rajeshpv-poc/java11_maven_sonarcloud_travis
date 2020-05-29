package foo;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.*;
public class FooTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testAdd_without_exception() throws Exception {
        assertEquals(2, Foo.div(10, 5));
    }

    @Test
    public void testAdd_with_exception() throws Exception {
        exceptionRule.expect(WrongOperation.class);
        exceptionRule.expectMessage("Can't divide by zero!");
        Foo.div(10, 0);
    }

    @Test
    public void test_WronOperation_exception() throws Exception {
        exceptionRule.expect(WrongOperation.class);
        exceptionRule.expectMessage("Wrong Operation");
        throw new WrongOperation();
    }
}
