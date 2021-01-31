package ru.netology.radio;

public class Radio {

    private int currentChannel;
    private int minChannel = 0;
    private int maxChannel = 25;
    private double currentSound;
    private double minSound = 0.00;
    private double maxSound = 100.00;

    public Radio(int currentChanel) {
        if (currentChanel >= minChannel && currentChanel <= maxChannel) {
            this.currentChannel = currentChanel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public Radio(int currentChannel, int minChannel) {
        if (currentChannel > minChannel) {
            this.currentChannel = currentChannel - 1;
        } else if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
        }
    }

    public Radio(int currentChannel, int minChannel, int maxChannel) {
        if (currentChannel < maxChannel) {
            this.currentChannel = currentChannel + 1;
        } else if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }

    }

    public Radio(double currentSound, double maxSound) {
        if (currentSound < maxSound) {
            this.currentSound = currentSound + 1;
        } else if (currentSound == maxSound) {
            this.currentSound = maxSound;
        }
        else {
            return;
        }
    }

    public Radio(double currentSound, double minSound, double maxSound) {
        if (currentSound > minSound) {
            this.currentSound = currentSound - 1;
        } else if (currentSound == minSound) {
            this.currentSound = minSound;
        }
        else {
            return;
        }

    }

    public double getCurrentSound() {
        return currentSound;
    }
}

