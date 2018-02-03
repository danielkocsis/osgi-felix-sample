package org.dani.osgi.sample.api;

import org.osgi.framework.BundleContext;

public class BundleActivator implements org.osgi.framework.BundleActivator {

  @Override
  public void start(BundleContext context) throws Exception {
    System.out.println("Bundle is activated! " + context.getBundle().getSymbolicName());
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    System.out.println("Bundle is de-activated! " + context.getBundle().getSymbolicName());
  }
}
