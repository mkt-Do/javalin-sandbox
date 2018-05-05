package sandbox;

import io.javalin.Javalin;
import sandbox.controller.UserController;
import sandbox.domain.dao.UserDao;

import static io.javalin.ApiBuilder.*;

public class App {

    public static UserDao userDao;

    public static void main(String[] args) {

        userDao = new UserDao();

        Javalin app = Javalin.create()
            .port(7000)
            .start();

        app.routes(() -> {
            path("/users", () -> {
                get("", UserController.getUsers);
            });
        });
    }
}
