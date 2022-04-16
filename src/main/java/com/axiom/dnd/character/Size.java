package com.axiom.dnd.character;

public class Size {
    private SizeName sizeName = null;
    private Double frontage = null;
    public Size(SizeName sizeName){
        this.sizeName = sizeName;
        setFrontage(sizeName);
    }

    public SizeName getSizeName() {
        return sizeName;
    }

    public Double getFrontage() {
        return frontage;
    }

    private void setFrontage(SizeName sizeName){
        if(sizeName == SizeName.TINY) {
            this.frontage = 2.5;
        } else if (sizeName == SizeName.SMALL) {
            this.frontage = 5.0;
        } else if (sizeName == SizeName.MEDIUM) {
            this.frontage = 5.0;
        } else if (sizeName == SizeName.LARGE) {
            this.frontage = 10.0;
        } else if (sizeName == SizeName.HUGE) {
            this.frontage = 15.0;
        } else if (sizeName == SizeName.GARGANTUAN) {
            this.frontage = 20.0;
        }
    }
}
