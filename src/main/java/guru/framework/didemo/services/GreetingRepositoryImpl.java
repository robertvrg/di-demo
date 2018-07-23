package guru.framework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getGermanhGreeting() {
        return "Primärer Grußdienst";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }
}
