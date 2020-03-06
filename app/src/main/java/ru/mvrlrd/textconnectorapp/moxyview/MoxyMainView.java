package ru.mvrlrd.textconnectorapp.moxyview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import ru.mvrlrd.textconnectorapp.R;
import ru.mvrlrd.textconnectorapp.moxypack.moxypresenter.MoxyPresenter;

public class MoxyMainView extends MvpAppCompatActivity implements MoxyView {
    private static final String TAG = "MainActivity";
    @InjectPresenter
    MoxyPresenter presenter;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Log.d(TAG,"onCreate");
    }

    @Override
    public void setText(String s) {
        Log.d(TAG,"setText "+ s);
        textView.setText(s);
    }
}
