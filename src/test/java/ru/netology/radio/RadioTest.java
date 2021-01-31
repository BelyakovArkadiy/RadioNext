package ru.netology.radio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void currentChanelConsole() {
        Radio radio = new Radio(10);
        assertEquals(10,radio.getCurrentChannel());
    }
    @Test
    void currentChanelLessMin() {
        Radio radio = new Radio(-1,0);
        assertEquals(25,radio.getCurrentChannel());
    }
    @Test
    void currentChanelFrontMin() {
        Radio radio = new Radio(1,0);
        assertEquals(0,radio.getCurrentChannel());
    }
    @Test
    void currentChanelMinus() {
        Radio radio = new Radio(11,0);
        assertEquals(10,radio.getCurrentChannel());
    }
     @Test
    void currentChanelPlus() {
        Radio radio = new Radio(10,0,25);
        assertEquals(11,radio.getCurrentChannel());
    }
    @Test
    void currentChanelLessMax() {
        Radio radio = new Radio(26,0,25);
        assertEquals(0,radio.getCurrentChannel());
    }
    @Test
    void currentChanelFrontMax() {
        Radio radio = new Radio(24,0,25);
        assertEquals(25,radio.getCurrentChannel());
    }
    @Test
    void currentSoundPlus() {
        Radio radio = new Radio(19.00,100.00);
        assertEquals(20,radio.getCurrentSound());
    }
    @Test
    void currentSoundMaxPlus() {
        Radio radio = new Radio(100.00,100.00);
        assertEquals(100,radio.getCurrentSound());
    }
    @Test
    void currentSoundMinus() {
        Radio radio = new Radio(50.00,0.00,100);
        assertEquals(49,radio.getCurrentSound());
    }
    @Test
    void currentSoundMinMinus() {
        Radio radio = new Radio(0.00,0.00,100);
        assertEquals(0,radio.getCurrentSound());
    }







}