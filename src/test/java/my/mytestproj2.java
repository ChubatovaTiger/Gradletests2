package my;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import java.lang.Thread;

public class mytestproj2 {

    @Test
    public void foo1proj2() {
        if (1==1){
            try 
            {
                Thread.sleep(12);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }

        }
        else {
            System.out.println(System.currentTimeMillis());
            try 
            {
                Thread.sleep(40);
            } 
            catch(InterruptedException e)
            {
            // this part is executed when an exception (in this example InterruptedException) occurs
            }
            Assert.fail("fail message");
        };

    };


}
