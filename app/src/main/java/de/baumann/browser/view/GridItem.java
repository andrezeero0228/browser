package de.baumann.browser.view;

public class GridItem {
    private final String title;
    public String getTitle() {
        return title;
    }

    private final String url;
    public String getURL() {
        return url;
    }

    private final int icon;
    public int getIcon() {
        return icon;
    }

    private final int data;
    public int getData() {
        return data;
    }

    public GridItem(int icon, String title, String url, int data) {
        this.title = title;
        this.url = url;
        this.icon = icon;
        this.data = data;
    }
}
