import java.util.ArrayList;
import java.util.List;

public class DVDLibraryDaoFileImpl implements  DVDLibraryDao{

    private ArrayList<DVD> dvdCollection = new ArrayList<>();

    @Override
    public DVD addDVD(String myTitle, String myDate, double mpaaRate, String director, String studioName, String user) {
        DVD newDVD = new DVD(myTitle, myDate, mpaaRate, director, studioName, user);
        dvdCollection.add(newDVD);
        return newDVD;
    }

    @Override
    public DVD removeDVD(DVD d) {
        dvdCollection.remove(d);
        return d;
    }

    @Override
    public DVD editDVD(DVD d, int field, String data) {
        switch(field){
            case 1 -> d.setTitle(data);
            case 2 -> d.setDate(data);
            case 3 -> d.setMpaaRating(Double.parseDouble(data));
            case 4 -> d.setDirectorName(data);
            case 5 -> d.setStudio(data);
            case 6 -> d.setUserRating(data);
        }
        return d;
    }

    @Override
    public ArrayList<DVD> listDVDS() {
        return dvdCollection;
    }

    @Override
    public DVD searchDVD(String title) {
        for (DVD d: dvdCollection){
            if (d.getTitle().equals(title)){
                return d;
            }
        }
        return null;
    }
}
