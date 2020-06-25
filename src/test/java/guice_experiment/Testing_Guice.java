package guice_experiment;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class Testing_Guice {

    public static void main(String[] args){

        Injector in = Guice.createInjector(new GuiceModule());

        System.out.println(in.getInstance(String.class));
        System.out.println(in.getInstance(Key.get(String.class, Names.named(GuiceModule.MYCUSTOM))));
    }
}
