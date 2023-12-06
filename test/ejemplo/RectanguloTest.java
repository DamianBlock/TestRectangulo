package ejemplo;

// import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class RectanguloTest {
        @Test
        void probarAreaYPerimetro(){

            Rectangulo r = new Rectangulo(3,5);

            assertAll ( () -> assertEquals (15, r.area()),
                        () -> assertEquals (16, r.perimetro())
            );

        }

        @Test
        public void probarPerimetro() {

            Rectangulo r2 = new Rectangulo();

            assertEquals(12, r2.perimetro(3,3),0);


        }

    }


