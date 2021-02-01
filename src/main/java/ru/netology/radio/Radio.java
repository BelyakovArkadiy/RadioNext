package ru.netology.radio;

public class Radio {

    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 25;
    private double currentSound;
    private double minSound = 0.00;
    private double maxSound = 100.00;

    public Radio(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentChannel() {
        if (currentChannel >= minChannel && currentChannel <= maxChannel) {
            this.currentChannel = currentChannel;
        }
    }


    public void setCurrentChannelMinus() {
        if (currentChannel > minChannel) {
            this.currentChannel--;
        } else if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
        }
    }

    public void setCurrentChannelPlus() {
        if (currentChannel < maxChannel) {
            this.currentChannel++;
        } else if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }
    }

    public Radio(double currentSound) {
        this.currentSound = currentSound;
    }

    public void setCurrentSoundNext() {
        if (currentSound < maxSound) {
            this.currentSound++;
        } else if (currentSound == maxSound) {
            this.currentSound = maxSound;
        }
    }

    public void setCurrentSoundPrev() {
        if (currentSound > minSound) {
            this.currentSound--;
        } else if (currentSound == minSound) {
            this.currentSound = minSound;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public double getCurrentSound() {
        return currentSound;
    }


}

