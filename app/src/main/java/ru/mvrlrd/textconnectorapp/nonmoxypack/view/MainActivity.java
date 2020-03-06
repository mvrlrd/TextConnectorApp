package ru.mvrlrd.textconnectorapp.nonmoxypack.view;

import androidx.appcompat.app.AppCompatActivity;
import ru.mvrlrd.textconnectorapp.R;
import ru.mvrlrd.textconnectorapp.nonmoxypack.presenter.Presenter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    private Presenter presenter;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonPresenter(editText.getText().toString());
            }
        };
        Button button = findViewById(R.id.button);
        button.setOnClickListener(onClickListener);

    }

    @Override
    public void setText(String s) {
        textView.setText(s);
    }
}
