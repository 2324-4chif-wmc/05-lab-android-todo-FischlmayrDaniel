package at.htlleonding.todo;

import static at.htlleonding.todo.TodoApplication.TAG;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.ComponentActivity;

import javax.inject.Inject;

import at.htlleonding.todo.ui.layout.MainView;
import at.htlleonding.todo.util.Config;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends ComponentActivity {

    @Inject
    MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Config.load(this);
        var baseUrl = Config.getProperties("json.placeholder.baseurl");
        Log.i(TAG, "onCreate: " + baseUrl);
        mainView.buildContent(this);
    }
}
