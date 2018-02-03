package org.dani.osgi.sample.impl;

import org.dani.osgi.sample.api.SampleAPI;

public class SampleImpl implements SampleAPI {

  @Override
  public String greet() {
    return "Hello from Impl!";
  }
}
