package net.nueca.posko.app.di.component;

import android.app.Application;

import net.nueca.posko.app.PoskoApplication;
import net.nueca.posko.app.di.modules.ActivityBindingsModule;
import net.nueca.posko.app.di.modules.AppModule;
import net.nueca.posko.app.di.modules.NavigationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by edwinmartinez on June 20, 2019
 */
@Singleton
@Component(modules = {

        AndroidSupportInjectionModule.class,

        AppModule.class,

        ActivityBindingsModule.class,

        NavigationModule.class

})
public interface AppComponent extends AndroidInjector<PoskoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();

    }
}
