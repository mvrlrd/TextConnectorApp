package ru.mvrlrd.textconnectorapp.nonmoxypack.presenter;


import ru.mvrlrd.textconnectorapp.nonmoxypack.model.Model;
import ru.mvrlrd.textconnectorapp.nonmoxypack.view.MainActivity;
import ru.mvrlrd.textconnectorapp.nonmoxypack.view.MainView;

public class Presenter {
    private MainView activity;
    private Model model;

    public Presenter(MainActivity activity) {
        this.activity = activity;
        this.model = new Model();
    }

    public void addTextToStringBuilderFromModel(String s){
        model.getUnitedText().append(s);
    }

    public void onButtonPresenter(String s){
        addTextToStringBuilderFromModel(s); //имеет ли смысл менять stringBuilder в моделе?
        activity.setText(model.getUnitedText().toString());
    }


}
