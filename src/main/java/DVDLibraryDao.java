import java.util.ArrayList;

//Model interface
public interface DVDLibraryDao {

    DVD addDVD(String myTitle, String myDate, String mpaaRate, String director, String studioName, String user) throws DVDLibraryDaoException;

    DVD removeDVD(DVD d) throws DVDLibraryDaoException;

    DVD editDVD(DVD d, int field, String data) throws DVDLibraryDaoException;

    ArrayList<DVD> listDVDS() throws DVDLibraryDaoException;

    DVD searchDVD(String title) throws DVDLibraryDaoException;

}
