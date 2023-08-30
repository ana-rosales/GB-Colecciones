
package singers.entities;

/**
 *
 * @author paula
 */
public class FamousSinger {
    private String name;
    private String highestSellingAlbum;

    public FamousSinger(String name, String highestSellingAlbum) {
        this.name = name;
        this.highestSellingAlbum = highestSellingAlbum;
    }

    public FamousSinger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHighestSellingAlbum() {
        return highestSellingAlbum;
    }

    public void setHighestSellingAlbum(String highestSellingAlbum) {
        this.highestSellingAlbum = highestSellingAlbum;
    }

    @Override
    public String toString() {
        return " - " + name + ", highest selling album =" + highestSellingAlbum + '}';
    }
    
}
