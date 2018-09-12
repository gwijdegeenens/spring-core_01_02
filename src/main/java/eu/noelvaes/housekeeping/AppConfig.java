package eu.noelvaes.housekeeping;

import org.springframework.context.annotation.*;

import eu.noelvaes.housekeeping.services.*;

@Configuration
public class AppConfig {
	
	@Bean
	@Description("This is a broom")
	public CleaningTool broom() {
		return new Broom();
	}
	
	@Bean
	public CleaningTool vacuum() {
		return new VacuumCleaner();
	}

	@Bean
	public CleaningTool sponge() {
		return new Sponge();
	}

	@Bean
	public CleaningService jill() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(broom());
		return cs;
	}

	@Bean
	public CleaningService jane() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(vacuum());
		return cs;
	}
	
	@Bean
	public CleaningService richard() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(sponge());
		return cs;
	}


}
