package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStaition;
    private int currentVolume;
    private int howMuchStation = 10;

    public Radio(int howMuchStation) {
        this.howMuchStation = howMuchStation;
    }

    public void next() {
        if (currentStaition < howMuchStation - 1) {
            currentStaition = currentStaition + 1;
        } else {
            currentStaition = 0;
        }
    }

    public void prev() {
        if (currentStaition > 0) {
            currentStaition = currentStaition - 1;
        } else {
            currentStaition = howMuchStation - 1;
        }
    }

    public void setCurrentStaition(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > howMuchStation - 1) {
            return;
        }
        currentStaition = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}