import java.util.List;

public class Item {

    public String color;
    public String type;
    public int heatRating;
    public String weather;
    public String itemPath;
    public boolean formal;
    public List<Item> layeringOptions;
    public String itemName;
    public boolean bright;
    public boolean hood;

    /**
     * Creator of initial representation.
     */
    public void createNewItem(String color, String type, int heatRating,
            String weather, boolean formal, String itemPath,
            List<Item> layeringOptions, String itemName, boolean bright,
            boolean hood) {
        this.color = color;
        this.type = type;
        this.heatRating = heatRating;
        this.weather = weather;
        this.formal = formal;
        this.itemPath = itemPath;
        this.layeringOptions = layeringOptions;
        this.itemName = itemName;
        this.bright = bright;
        this.hood = hood;
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Item(String color, String type, int heatRating, String weather,
            boolean formal, String itemPath, List<Item> layers, String itemName,
            boolean bright, boolean hood) {
        this.createNewItem(color, type, heatRating, weather, formal, itemPath,
                layers, itemName, bright, hood);
    }

    public boolean isBright() {
        return this.bright;
    }

    public void setBright(boolean bright) {
        this.bright = bright;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeatRating() {
        return this.heatRating;
    }

    public void setHeatRating(int heatRating) {
        this.heatRating = heatRating;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public boolean getFormal() {
        return this.formal;
    }

    public void setFormal(boolean formal) {
        this.formal = formal;
    }

    public String getItemPath() {
        return this.itemPath;
    }

    public void setItemPath(String itemPath) {
        this.itemPath = itemPath;
    }

    public List<Item> getLayeringOptions() {
        return this.layeringOptions;
    }

    public void setLayeringOptions(List<Item> layeringOptions) {
        this.layeringOptions = layeringOptions;
    }

}
