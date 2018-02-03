package org.dani.osgi.sample.ds;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

public class DSBundleActivator implements BundleActivator {

  private ServiceTracker serviceTracker;
  private ServiceRegistration serviceRegistration;

  @Override
  public void start(BundleContext context) throws Exception {

    serviceTracker = new ServiceTracker(
        context, SampleComponentService.class.getName(),
        new ServiceTrackerCustomizer() {
          @Override
          public Object addingService(ServiceReference reference) {
            System.out.println("Registering " + context.getService(reference));

            return reference;
          }

          @Override
          public void modifiedService(ServiceReference reference, Object service) {

          }

          @Override
          public void removedService(ServiceReference reference, Object service) {
            context.ungetService(reference);

            System.out.println("Unregistering " + reference);
          }
        });
    serviceTracker.open();
  }

  @Override
  public void stop(BundleContext context) throws Exception {

  }
}
