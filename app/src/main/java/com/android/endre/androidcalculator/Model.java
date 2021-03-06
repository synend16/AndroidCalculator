package com.android.endre.androidcalculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Observable;

/**
 * Created by Endre on 19.01.2018.
 */

public class Model extends Observable{

    private Button btnAddition,
            btnSubtraction,
            btnMultiplication,
            btnDivision,
            btnClear,
            btnSave,
            btnLoad;

    private EditText firstNumber, secondNumber;
    private TextView txtResult;

    public Model() {
    }

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button btnSave) {
        this.btnSave = btnSave;
    }

    public Button getBtnLoad() {
        return btnLoad;
    }

    public void setBtnLoad(Button btnLoad) {
        this.btnLoad = btnLoad;
    }

    public Button getBtnAddition() {
        return btnAddition;
    }

    public void setBtnAddition(Button btnAddition) {
        this.btnAddition = btnAddition;
    }

    public Button getBtnSubtraction() {
        return btnSubtraction;
    }

    public void setBtnSubtraction(Button btnSubtraction) {
        this.btnSubtraction = btnSubtraction;
    }

    public Button getBtnMultiplication() {
        return btnMultiplication;
    }

    public void setBtnMultiplication(Button btnMultiplication) {
        this.btnMultiplication = btnMultiplication;
    }

    public Button getBtnDivision() {
        return btnDivision;
    }

    public void setBtnDivision(Button btnDivision) {
        this.btnDivision = btnDivision;
    }

    public EditText getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(EditText firstNumber) {
        this.firstNumber = firstNumber;
    }

    public EditText getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(EditText secondNumber) {
        this.secondNumber = secondNumber;
    }

    public TextView getTxtResult() {
        return txtResult;
    }

    public void setTxtResult(TextView txtResult) {
        this.txtResult = txtResult;
    }

    public Button getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(Button btnClear) {
        this.btnClear = btnClear;
    }
}
