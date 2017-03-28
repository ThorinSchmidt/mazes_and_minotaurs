package com.example.cis.mazeminotaurs;

/**
 * Created by Thorin Schmidt on 3/18/2017.
 */

public class AttributeScore {

    //instance variables
    int mScore;
    int mModifier;
    String mDescription;

    //private methods

    /**
     * updates the modifier based on current value of score.
     * this method should be called by the constructor, and by any method that modifies
     * the score.  The modifier should never be set individually.
     *
     * just for kicks, the official score description is also set.  probably no space for it in
     * the app, but better to have it than not.
     *
     *  modifiers are applied as follows:
     *  score      mod     description
     *   1-2       -4       Abysmal
     *   3-4       -3       Pathetic
     *   5-6       -2       Inferior
     *   7-8       -1       Poor
     *   9-12       0       Average
     *  13-14       1       Good
     *  15-16       2       Superior
     *  17-18       3       Execptional
     *  19-20       4       Extraordinary
     *   21         5       Legendary
     *
     */
    private void updateModifier(){

        if(this.mScore <= 2){
            this.mModifier = -4;
            this.mDescription = "Abysmal";
        }
        else if(this.mScore <= 4){
            this.mModifier = -3;
            this.mDescription = "Pathetic";
        }
        else if(this.mScore <= 6){
            this.mModifier = -2;
            this.mDescription = "Inferior";
        }
        else if(this.mScore <= 8){
            this.mModifier = -1;
            this.mDescription = "Poor";
        }
        else if(this.mScore <= 12){
            this.mModifier = 0;
            this.mDescription = "Average";
        }
        else if(this.mScore <= 14){
            this.mModifier = 1;
            this.mDescription = "Good";
        }
        else if(this.mScore <= 16){
            this.mModifier = 2;
            this.mDescription = "Superior";
        }
        else if(this.mScore <= 18){
            this.mModifier = 3;
            this.mDescription = "Exceptional";
        }
        else if(this.mScore <= 20){
            this.mModifier = 4;
            this.mDescription = "Extraordinary";
        }
        else{
            this.mModifier = 5;
            this.mDescription = "Legendary";
        }
    }

    //public methods

    public AttributeScore(int score) {
        this.mScore = score;
        this.updateModifier();
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        this.mScore = score;
        this.updateModifier();
    }

    public int getModifier() {
        return mModifier;
    }

    /*  USE updateModifier() INSTEAD
    public void setModifier(int modifier) {
        this.modifier = modifier;
    }*/

    public String getDescription() {
        return mDescription;
    }

    /* USE updateModifier() INSTEAD
    public void setDescription(String description) {
        this.description = description;
    }*/
}
