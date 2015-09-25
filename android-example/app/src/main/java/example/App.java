package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends android.app.Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void onCreate() {
        super.onCreate();
        LOGGER.info("App::onCreate");
    }

}
