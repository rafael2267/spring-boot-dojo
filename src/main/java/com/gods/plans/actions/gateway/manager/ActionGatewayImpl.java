package com.gods.plans.actions.gateway.manager;

import com.gods.plans.actions.domain.Actions;
import com.gods.plans.actions.gateway.ActionGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

@Service
public class ActionGatewayImpl implements ActionGateway {

  @Override
  public Actions save(final String name, final String action) {
    Actions peopleAction = new Actions();

    if (action.length() > 7) {
      peopleAction.setGood(action);
    } else {
      peopleAction.setBad(action);
    }

    Path file = Paths.get("files/" + name + ".txt");
    try {
      Files.write(file, Collections.singletonList(action), Charset.forName("UTF-8"));
    } catch (IOException e) {
      System.out.println("Error saving action");
    }
    return peopleAction;
  }
}
