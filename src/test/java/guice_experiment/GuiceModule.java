package guice_experiment;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class GuiceModule extends AbstractModule {

    public static final String MYCUSTOM = "HELLO";
    @Override
    protected void configure(){

        bind(String.class).toInstance("Hello world");
        bind(String.class).annotatedWith(Names.named (MYCUSTOM)).toInstance("My custom values are here!");
    }
}
