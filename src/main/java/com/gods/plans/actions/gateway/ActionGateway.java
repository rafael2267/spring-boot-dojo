package com.gods.plans.actions.gateway;

import com.gods.plans.actions.domain.Actions;

public interface ActionGateway {
  Actions save(String name, String action);
}
