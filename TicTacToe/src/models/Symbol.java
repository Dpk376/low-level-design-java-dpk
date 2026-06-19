package models;

/**
 * Represents the character (e.g., 'X', 'O') a Player places on the Board.
 */
public class Symbol {

    private String name;
    private String img;

    public Symbol(String name, String img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
