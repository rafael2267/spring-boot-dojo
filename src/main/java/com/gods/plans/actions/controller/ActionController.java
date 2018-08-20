package com.gods.plans.actions.controller;

import com.gods.plans.actions.domain.Actions;
import com.gods.plans.actions.usecase.SaveAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action")
public class ActionController {

  @Autowired
  private SaveAction saveAction;

  @RequestMapping(value = "/{name}/{action}", method = RequestMethod.POST)
  public ResponseEntity<Actions> peopleActionsSaver(@PathVariable("name") String name, @PathVariable("action") String action) {

    return new ResponseEntity<>(saveAction.execute(name, action), HttpStatus.OK);
  }
}
