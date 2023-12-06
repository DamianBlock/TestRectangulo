package ejemplo;

// import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class RectanguloTest {
        @Test
        void Test(){

            Rectangulo r = new Rectangulo(3,5);

            assertAll ( () -> assertEquals (15, r.area()),
                        () -> assertEquals (16, r.perimetro())
            );

        }

    }


