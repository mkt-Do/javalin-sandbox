package sandbox.controller;

import io.javalin.Handler;
import io.javalin.Context;

import static sandbox.App.*;

public class UserController {

    public static void getUsers(Context ctx) {
        ctx.json(userDao.findAll());
    }
}