package sandbox.controller;

import io.javalin.Handler;

import static sandbox.App.*;

public class UserController {

    public static Handler getUsers = ctx -> {
        ctx.json(userDao.findAll());
    };
}