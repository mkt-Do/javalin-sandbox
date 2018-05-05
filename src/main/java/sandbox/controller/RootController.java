package sandbox.controller;

import io.javalin.Context;

public class RootController {
    public static void getRoot(Context ctx) {
        ctx.result("Hello World");
    }
}
