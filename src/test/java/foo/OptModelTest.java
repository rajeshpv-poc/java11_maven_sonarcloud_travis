package foo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptModelTest {

    @Test
    public void testGetName() {
        {
            OptModel optModel = new OptModel();
            assertEquals("testing - with default constructor", "unknown", optModel.getName());
        }

        {
            OptModel optModel = new OptModel("John");
            assertEquals("testing - with one-arg constructor", "John", optModel.getName());
        }
    }

    @Test
    public void getWithValue() {
        OptModel optModel = new OptModel("Smith");
        assertEquals("testing - with TRUE", "Smith", optModel.getWithValue().get());
    }

//    @Test
//    public void getWithoutValue() {
//        OptModel optModel = new OptModel("Smith");
//        assertFalse("testing - with FALSE", optModel.getWithoutValue().isPresent());
//    }
}