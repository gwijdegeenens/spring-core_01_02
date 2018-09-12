package eu.noelvaes.housekeeping;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.noelvaes.housekeeping.services.CleaningService;

public class HouseApp {

   public static void main(String[] args) {
      ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(
            AppConfig.class);
      CleaningService jill = ctx.getBean("jill", CleaningService.class);
      CleaningService jane = ctx.getBean("jane",
            CleaningService.class);
      CleaningService richard = ctx.getBean("richard",
            CleaningService.class);
      jill.clean();
      jane.clean();
      richard.clean();
      ctx.close();
   }
}
