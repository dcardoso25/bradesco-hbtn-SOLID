import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLoggerExample {

    private static final Logger logger = Logger.getLogger(FileLoggerExample.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("logs.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.info("Teste de log");
            logger.info("Olá, eu sou o teste da classe principal");

        } catch (IOException e) {
            logger.severe("Erro ao configurar o logger: " + e.getMessage());
        }
    }
}
