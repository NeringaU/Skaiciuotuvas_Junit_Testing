import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSkaiciuotuvas {
    Skaiciuotuvas skaic;

    @Before
            public void setUp() {

        this.skaic = new Skaiciuotuvas();

    }

    @Test
    public void testSudetis(){
        int result = skaic.sudeti(2,2);
        Assert.assertEquals(4, result);
    }

    //arba uztenka parasyti tik taip ir daro ta pati

     @Test
     public void testAtimti(){
         double result = Skaiciuotuvas.atimti(10,2);
        Assert.assertEquals(3,result,0);

     }

}
