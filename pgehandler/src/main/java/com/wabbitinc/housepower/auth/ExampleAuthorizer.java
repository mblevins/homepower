package com.wabbitinc.housepower.auth;

import com.wabbitinc.housepower.core.User;
import io.dropwizard.auth.Authorizer;

public class ExampleAuthorizer implements Authorizer<User> {

    @Override
    public boolean authorize(User user, String role) {
        if (role.equals("ADMIN") && !user.getName().startsWith("chief")) {
            return false;
        }
        return true;
    }
}
