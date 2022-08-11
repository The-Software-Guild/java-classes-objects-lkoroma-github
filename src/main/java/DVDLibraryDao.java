import java.util.ArrayList;

public interface DVDLibraryDao {

    DVD addDVD(String myTitle, String myDate, double mpaaRate, String director, String studioName, String user);

    DVD removeDVD(DVD d);

    DVD editDVD(DVD d, int field, String data);

    ArrayList<DVD> listDVDS();

    DVD searchDVD(String title);

}
