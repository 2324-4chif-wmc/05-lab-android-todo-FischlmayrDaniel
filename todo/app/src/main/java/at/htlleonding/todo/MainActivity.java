package at.htlleonding.todo;

import android.os.Bundle;

import androidx.activity.ComponentActivity;

import javax.inject.Inject;

import at.htlleonding.todo.ui.layout.MainView;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends ComponentActivity {

    @Inject
    MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainView.buildContent(this);
    }
}
