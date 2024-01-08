package ru.netology.stat;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxStation;

    public Radio(){
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount -1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNumberCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation == maxStation) {
            currentRadioStation = 0;
        } else currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxStation;
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
