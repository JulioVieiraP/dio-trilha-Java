package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        int resultado = calculadora.somar(20, 10);
        System.out.println("O calculo deu " + resultado);
    }
    
}
