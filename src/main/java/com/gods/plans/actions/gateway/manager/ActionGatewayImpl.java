package com.gods.plans.actions.gateway.manager;

import com.gods.plans.actions.domain.Actions;
import com.gods.plans.actions.gateway.ActionGateway;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class ActionGatewayImpl implements ActionGateway {

  @Override
  public Actions save(final String name, final String action) {

    Path file = Paths.get("files/" + name + ".txt");
    try {
      Files.write(file, Collections.singletonList(action), Charset.forName("UTF-8"));
    } catch (IOException e) {
      System.out.println("Error saving action");
    }
    return null;
  }
}
