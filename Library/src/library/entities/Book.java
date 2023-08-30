
package library.entities;

import java.util.Objects;

/**
 * La clase Libro debe guardar el título del libro, autor, número de ejemplares
 * y número de ejemplares prestados.
 * @author paula
 */
public class Book {
    private String title;
    private String author;
    private int copiesLeft;
    private int lentCopies;

    public Book(String title, String author, int copiesLeft, int lentCopies) {
        this.title = title;
        this.author = author;
        this.copiesLeft = copiesLeft;
        this.lentCopies = lentCopies;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopiesLeft() {
        return copiesLeft;
    }

    public void setCopiesLeft(int copiesLeft) {
        this.copiesLeft = copiesLeft;
    }

    public int getLentCopies() {
        return lentCopies;
    }

    public void setLentCopies(int lentCopies) {
        this.lentCopies = lentCopies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Objects.hashCode(this.author);
        hash = 47 * hash + this.copiesLeft;
        hash = 47 * hash + this.lentCopies;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.copiesLeft != other.copiesLeft) {
            return false;
        }
        if (this.lentCopies != other.lentCopies) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    /**
     * Method that increases the lentCopies attribute every time a loan is done.
     * @return whether if the operation could be done or not.
     */
    public boolean loan(){
        boolean success;
        if(copiesLeft > 0){
            copiesLeft--;
            lentCopies++;
            success = true;
        } else {
            success = false;
        }
        return success;
    }
    
    /**
     * Method that decreases the lentCopies attribute every time a devolution is
     * done. 
     * @return whether if the operation could be done or not.
     */
    public boolean devolution(){
        boolean success;
        if(lentCopies > 0){
            lentCopies--;
            copiesLeft++;
            success = true;
        } else {
            success = false;
        }
        return success;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", copiesLeft=" + copiesLeft + ", lentCopies=" + lentCopies + '}';
    }
}
