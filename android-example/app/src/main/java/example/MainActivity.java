package example;

import android.app.Activity;
import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.example.R;

public class MainActivity extends Activity {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainActivity.class);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LOGGER.info("MainActivity::onCreate");
        LOGGER.info("AndroidLibrary.process: {}", AndroidLibrary.process(this));
        LOGGER.info("JavaLibrary.process: {}", JavaLibrary.process(this));
    }

}
