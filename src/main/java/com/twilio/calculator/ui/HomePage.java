package com.twilio.calculator.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target EQUAL_BUTTON= Target.the("name of sign equal").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
    public static Target SUM_BUTTON= Target.the("sing sum").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
    public static Target RESULT = Target.the("field result").located(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
    public static Target NUMBER_ONE = Target.the("number one").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
    public static Target NUMBER_TWO = Target.the("number two").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
    public static Target NUMBER_THREE = Target.the("number three").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
    public static Target NUMBER_FOUR = Target.the("number four").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
    public static Target NUMBER_FIVE= Target.the("number five").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
    public static Target NUMBER_SIX = Target.the("number six").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
    public static Target NUMBER_SEVEN = Target.the("number seven").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
    public static Target NUMBER_EIGHT = Target.the("number eight").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
    public static Target NUMBER_NINE = Target.the("number nine").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
    public static Target NUMBER_ZERO = Target.the("number zero").located(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
}
