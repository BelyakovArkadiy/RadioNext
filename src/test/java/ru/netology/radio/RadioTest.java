package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void getCurrentChanelConsole() {
        radio.setCurrentChanelConsole(5);
        assertEquals(5,radio.getCurrentChanel());

    }
    @Test
    void getCurrentChanelConsoleMin() {
        radio.setCurrentChanelConsole(0);
        assertEquals(0,radio.getCurrentChanel());

    }
    @Test
    void getCurrentChanelConsoleMax() {
        radio.setCurrentChanelConsole(9);
        assertEquals(9,radio.getCurrentChanel());

    }

    @Test
    void getCurrentChanelNext() {
        radio.setCurrentChanelNext(5);
        assertEquals(6, radio.getCurrentChanel());

    }
    @Test
    void getCurrentChanelPrev() {
        radio.setCurrentChanelPrev(8);
        assertEquals(7, radio.getCurrentChanel());

    }
    @Test
    void getCurrentChanelNextMax() {
        radio.setCurrentChanelNext(10);
        assertEquals(0, radio.getCurrentChanel());

    }
    @Test
    void getCurrentChanelPrevMin() {
        radio.setCurrentChanelPrev(-1);
        assertEquals(9, radio.getCurrentChanel());

    }
    @Test
    void getCurrentSoundPlus() {
        radio.setCurrentSoundPlus();
        assertEquals(1,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundPlusMax() {
        radio.setCurrentSoundPlus();
        assertEquals(10,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundMinus() {
        radio.setCurrentSoundMinus();
        assertEquals(0,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundMinusMin() {
        radio.setCurrentSoundMinus();
        assertEquals(0,radio.getCurrentSound());
    }
}