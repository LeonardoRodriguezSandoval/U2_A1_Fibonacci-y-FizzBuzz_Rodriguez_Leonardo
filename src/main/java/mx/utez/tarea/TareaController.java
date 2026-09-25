package mx.utez.tarea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {

    private static final String nombreAlumno = "Leonardo Rodriguez Sandoval";


    @GetMapping("/fizzbuzz/{n}")
    public String fizzbuzz(@PathVariable int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return nombreAlumno;
    }

    @GetMapping("/fibonacci/{n}")
    public String fibonacci(@PathVariable int n) {
        int anterior = 0;
        int actual = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(anterior);
            } else if (i == 2) {
                System.out.println(actual);
            } else {
                int siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
                System.out.println(actual);
            }
        }
        return nombreAlumno;
    }

}
