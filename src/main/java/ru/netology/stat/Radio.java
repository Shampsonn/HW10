package ru.netology.stat;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else currentRadioStation--;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newSoundVolume;
    }

    public void addVolume() {
        if (currentSoundVolume == 100) {
            return;
        }
        currentSoundVolume++;
    }

    public void turnDownVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        currentSoundVolume--;
    }
}
