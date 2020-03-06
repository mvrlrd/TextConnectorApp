package ru.mvrlrd.textconnectorapp.moxypack.moxypresenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.mvrlrd.textconnectorapp.moxymodel.MoxyModel;
import ru.mvrlrd.textconnectorapp.moxyview.MoxyMainView;
import ru.mvrlrd.textconnectorapp.moxyview.MoxyView;


@InjectViewState
public class MoxyPresenter extends MvpPresenter <MoxyView> {
    private MoxyModel model;

    public MoxyPresenter() {
        this.model = new MoxyModel();
    }

    public String addTextToModelText(String s){
       return model.getUnitedText().append(s).toString();
    }

    public void onButtonPresenter(String s){
        getViewState().setText(addTextToModelText(s));
    }
}
