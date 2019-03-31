package com.beemdevelopment.aegis;

public enum ViewMode {
    NORMAL,
    COMPACT;

    public static ViewMode fromInteger(int x) {
        switch(x) {
            case 0:
                return NORMAL;
            case 1:
                return COMPACT;
        }
        return null;
    }

    public static String getViewModeName(int x) {
        switch(x) {
            case 0:
                return "Normal";
            case 1:
                return "Compact";
        }
        return null;
    }

    public static String[] getViewModeNames() {
        return new String[] {
                "Normal",
                "Compact"
        };
    }
}
