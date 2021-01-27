package ru.netology.radio;

public class Radio {

    private int currentChanel;
    private int minChanel = 0;
    private int maxChanel = 9;
    private int currentSound;
    private int minSound = 0;
    private int maxSound = 10;


    public void setCurrentChanelConsole(int currentChanel) {
        if (currentChanel >= minChanel && currentChanel <= maxChanel) {
            this.currentChanel = currentChanel;
        }
    }

    public void setCurrentChanelNext(int currentChanel) {
        if (currentChanel < maxChanel) {
            this.currentChanel = currentChanel + 1;
        } else if (currentChanel > maxChanel) {
            this.currentChanel = minChanel;
        }
    }

    public void setCurrentChanelPrev(int currentChanel) {
        if (currentChanel > minChanel) {
            this.currentChanel = currentChanel - 1;
        } else if (currentChanel < minChanel) {
            this.currentChanel = maxChanel;
        }
    }

    public int getCurrentChanel() {
        return currentChanel;
    }


    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSoundPlus() {
        if (currentSound < maxSound) {
            this.currentSound = currentSound + 1;
        } else if (currentSound == maxSound) {
            this.currentSound = maxSound;

        }
    }

    public void setCurrentSoundMinus() {
        if (currentSound > minSound) {
            this.currentSound = currentSound - 1;
        } else if (currentSound == minSound) {
            this.currentSound = minSound;
        }
    }
}
