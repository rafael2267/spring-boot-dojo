package com.gods.plans.actions.controller;

import com.gods.plans.actions.domain.Actions;
import com.gods.plans.actions.usecase.SaveAction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class ActionController {

  private SaveAction saveAction;

  public ResponseEntity<Actions> peopleActionsSaver(@PathVariable("name") String name, @PathVariable("action") String action) {

    return new ResponseEntity<>(saveAction.execute(name, action), HttpStatus.OK);
  }
}
