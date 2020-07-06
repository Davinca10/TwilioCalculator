package com.twilio.calculator.utils;

import com.twilio.calculator.ui.HomePage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;

public class SelectNumber {
    enum LocationNumbers {
        one("1", "the user select number one") {
            public Target getLocation() {
                return HomePage.NUMBER_ONE;
            }
        },
        two("2", "the user select number two") {
            public Target getLocation() {
                return HomePage.NUMBER_TWO;
            }
        },
        three("3", "the user select number three") {
            public Target getLocation() {
                return HomePage.NUMBER_THREE;
            }
        },
        four("4", "the user select number four") {
            public Target getLocation() {
                return HomePage.NUMBER_FOUR;
            }
        },
        five("5", "the user select number five") {
            public Target getLocation() {
                return HomePage.NUMBER_FIVE;
            }
        },
        six("6", "the user select number six") {
            public Target getLocation() {
                return HomePage.NUMBER_SIX;
            }
        },
        seven("1", "the user select number seven") {
            public Target getLocation() {
                return HomePage.NUMBER_SEVEN;
            }
        },
        eight("8", "the user select number eight") {
            public Target getLocation() {
                return HomePage.NUMBER_EIGHT;
            }
        },
        nine("9", "the user select number one") {
            public Target getLocation() {
                return HomePage.NUMBER_NINE;
            }
        },
        zero("0", "the user select number zero") {
            public Target getLocation() {
                return HomePage.NUMBER_ZERO;
            }
        };

        private String number;
        private String description;

        public String getNumber() {
            return number;
        }

        public String getDescription() {
            return description;
        }

        public abstract Target getLocation();

        private LocationNumbers(String number, String description) {
            this.number = number;
            this.description = description;
        }
        public static LocationNumbers withNameNumber(String findNumberForName) {
            return Arrays.stream(values())
                    .filter(optionProducts -> optionProducts.number.equals(findNumberForName))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("el numero ingresado no existe"));
        }
    }
    public static void one(String findNumberForName){

        for (int i = 0 ; i<findNumberForName.length();i++){
            LocationNumbers locationNumbers = LocationNumbers.withNameNumber(findNumberForName.charAt(i)+"");
            OnStage
                    .theActorInTheSpotlight()
                    .describedAs(locationNumbers.getDescription())
                    .remember(Constants.LOCATION_NUMBER_ONE,locationNumbers.getLocation());
            Target oneNumber = OnStage
                    .theActorInTheSpotlight()
                    .recall(Constants.LOCATION_NUMBER_ONE);
            OnStage.withCurrentActor(
                    Click.on(oneNumber)
            );
        }

    }
    public static void two(String findNumberForName){
        for (int i = 0 ; i<findNumberForName.length();i++){
            LocationNumbers locationNumbers = LocationNumbers.withNameNumber(findNumberForName.charAt(i)+"");
            OnStage
                    .theActorInTheSpotlight()
                    .describedAs(locationNumbers.getDescription())
                    .remember(Constants.LOCATION_NUMBER_TWO,locationNumbers.getLocation());
            Target twoNumber = OnStage
                    .theActorInTheSpotlight()
                    .recall(Constants.LOCATION_NUMBER_TWO);
            OnStage.withCurrentActor(
                    Click.on(twoNumber)
            );
        }

    }
}
