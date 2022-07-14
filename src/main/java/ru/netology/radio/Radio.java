package ru.netology.radio;

public class Radio {

    private int currentStaition;
    private int currentVolume;

    public int getCurrentStaition() {
        return currentStaition;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void next() {
        if (currentStaition < 9) {
            currentStaition = currentStaition + 1;
        } else {
            currentStaition = 0;
        }
    }

    public void prev() {
        if (currentStaition > 0) {
            currentStaition = currentStaition - 1;
        } else {
            currentStaition = 9;
        }
    }

    public void setCurrentStaition(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStaition = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}