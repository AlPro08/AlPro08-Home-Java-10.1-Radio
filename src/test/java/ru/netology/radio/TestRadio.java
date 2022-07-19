package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRadio {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "8,9",
            "9,10",
            "13,14,",
            "14,0",
    })
    public void changeToNextStation(int numberStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStaition(numberStation);
        radio.next();
        int actual = radio.getCurrentStaition();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2,1",
            "1,0",
            "0,14",
            "14,13",
    })
    public void chageToPreviousStation(int numberStation, int expected) {
        Radio radio = new Radio (15);
        radio.setCurrentStaition(numberStation);
        radio.prev();
        int actual = radio.getCurrentStaition();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "1,1",
            "8,8",
            "9,9",
            "14,14",
            "15,0"

    })
    public void shuoldSetCurrentStation(int numberStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStaition(numberStation);
        int actual = radio.getCurrentStaition();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({

            "0,1",
            "1,2",
            "2,3",
            "99,100",
            "100,100"
    })
    public void shouldIncreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({

            "10,9",
            "9,8",
            "2,1",
            "1,0",
            "0,0"
    })
    public void shouldDecreaseVolume(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetHowMuchStation() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getHowMuchStation());
    }

}


