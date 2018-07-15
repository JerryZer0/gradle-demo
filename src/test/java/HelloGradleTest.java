import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.LinkedList;
public class HelloGradleTest{
  @Test
  public void testGradleGreet(){
    HelloGradle gradle=new HelloGradle();

    assertEquals("I AM GRADLE!", gradle.gradleGreet());
  }

  @Test
   public void testMockClass() throws Exception {
       // you can mock concrete classes, not only interfaces
       LinkedList mockedList = mock(LinkedList.class);

       // stubbing appears before the actual execution
       String value = "first";
       when(mockedList.get(0)).thenReturn(value);

       assertEquals(mockedList.get(0), value);
   }
}