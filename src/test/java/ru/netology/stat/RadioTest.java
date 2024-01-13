package ru.netology.stat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setNumberCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberCurrentRadioStation3() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(9);
        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(3);
        radio.nextStation();


        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio radio = new Radio();
        radio.setNumberCurrentRadioStation(4);
        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(80);

        int expected = 80;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentSoundVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentSoundVolumeTest3() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVolumeTest() {
        Radio radio = new Radio();
        radio.addVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.addVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeTest() {
        Radio radio = new Radio();
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(55);
        radio.turnDownVolume();

        int expected = 54;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}