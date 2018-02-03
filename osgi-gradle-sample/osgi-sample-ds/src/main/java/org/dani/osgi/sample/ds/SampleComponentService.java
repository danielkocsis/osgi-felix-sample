package org.dani.osgi.sample.ds;

import java.util.Map;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

@Component(service = SampleComponentService.class, immediate = true)
@SuppressWarnings("deprecated")
public class SampleComponentService {

  @Activate
  public void activate(
      ComponentContext componentContext, BundleContext bundleContext,
      Map<String, Object> configurationMap) {

    System.out.println("Service activated");
  }

  @Deactivate
  void deactivate(
      ComponentContext componentContext, BundleContext bundleContext,
      Map<String, Object> configurationMap) {

    System.out.println("Service de-activated");
  }

  @Modified
  void modified(Map<String, Object> configurationMap) {
  }
}
