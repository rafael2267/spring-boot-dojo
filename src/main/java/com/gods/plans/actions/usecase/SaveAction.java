package com.gods.plans.actions.usecase;

import com.gods.plans.actions.domain.Actions;
import com.gods.plans.actions.gateway.ActionGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveAction {

  @Autowired
  private ActionGateway actionGateway;

  public Actions execute(String name, String action){
    return actionGateway.save(name, action);
  }
}
