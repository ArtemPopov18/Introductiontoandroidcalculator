package com.popov.introductiontoandroidalculator;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

public enum Theme {
    ONE(R.style.Theme_IntroductionToAndroidСalculator, R.string.themes_day, "THEMES_DAY"),
    TWO(R.style.Theme_IntroductionToAndroidСalculatorNight, R.string.themes_night, "THEMES_NIGHT");


    private @StyleRes
    final int theme;

    private @StringRes
    final int title;
    private final String key;

    Theme( int theme, int title, String key) {
        this.title = title;
        this.theme = theme;
        this.key = key;
    }

    public int getTitle() {
        return title;
    }

    public String getKey() {
        return key;
    }

    public int getTheme() {
        return theme;
    }
}
