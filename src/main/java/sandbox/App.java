package sandbox;

import io.javalin.Javalin;
import sandbox.domain.repository.UserRepository;

public class App {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        Javalin app = Javalin.start(7000);
        app.get("/", ctx -> ctx.json("Hello world"));
        app.get("/users", ctx -> ctx.json(userRepository.findAll()));
    }
}
