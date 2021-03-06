package com.android.endre.androidcalculator;

/**
 * Created by Endre on 22.01.2018
 * Project name: Calculator.
 */

class InputController {

    static boolean canNumberBeParsed(String input){
        try {
            Double.parseDouble(input);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isBothNumbersPresent(Model model){
        return !"".equals(model.getFirstNumber().getText().toString()) &&
                !"".equals(model.getSecondNumber().getText().toString());
    }

}
