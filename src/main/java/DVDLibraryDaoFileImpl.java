import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDLibraryDaoFileImpl implements  DVDLibraryDao{

    //constants for dealing with file I/O
    public static final String DVD_FILE = "dvds.txt";
    public static final String DELIMITER = "::";

    //arraylist of dvds
    private ArrayList<DVD> dvdCollection = new ArrayList<>();

    //Adds new dvd object to the arraylist
    @Override
    public DVD addDVD(String myTitle, String myDate, String mpaaRate, String director, String studioName, String user) throws DVDLibraryDaoException {
        loadCollection();
        DVD newDVD = new DVD(myTitle, myDate, mpaaRate, director, studioName, user);
        dvdCollection.add(newDVD);
        saveCollection();
        return newDVD;
    }

    //Removes dvd from the arraylist
    @Override
    public DVD removeDVD(DVD d) throws DVDLibraryDaoException {
        loadCollection();
        dvdCollection.remove(d);
        saveCollection();
        return d;
    }

    //Edits dvd from the arraylist with the dvd, field and data being provided
    @Override
    public DVD editDVD(DVD d, int field, String data) throws DVDLibraryDaoException {
        loadCollection();
        switch(field){
            case 1 -> d.setTitle(data);
            case 2 -> d.setDate(data);
            case 3 -> d.setMpaaRating(data);
            case 4 -> d.setDirectorName(data);
            case 5 -> d.setStudio(data);
            case 6 -> d.setUserRating(data);
        }
        saveCollection();
        return d;
    }

    //returns the arraylist of dvds
    @Override
    public ArrayList<DVD> listDVDS() throws DVDLibraryDaoException {
        loadCollection();
        return dvdCollection;
    }

    //searches for a specific dvd inside the arraylist
    @Override
    public DVD searchDVD(String title) throws DVDLibraryDaoException {
        loadCollection();
        for (DVD d: dvdCollection){
            if (d.getTitle().equals(title)){
                return d;
            }
        }
        return null;
    }

    //saves all dvds to the dvds.txt file
    public void saveCollection() throws DVDLibraryDaoException {
        PrintWriter out;
        try{
            out = new PrintWriter(new FileWriter(DVD_FILE));
        }catch(IOException e){
            throw new DVDLibraryDaoException("Could not save DVD data", e);
        }
        String dvdAsText;
        ArrayList<DVD> dvdList = this.listDVDS();
        for (DVD d: dvdList){
            dvdAsText = marshallDVD(d);
            out.println(dvdAsText);
            out.flush();
        }
        out.close();
    }

    //loads all dvds to the dvds.txt file
    public void loadCollection() throws DVDLibraryDaoException {
        if (dvdCollection.size() !=0){
            return;
        }
        Scanner scan;

        try{
            scan = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));
        }catch(FileNotFoundException e){
            throw new DVDLibraryDaoException("Couldn't load dvd data into memory", e);
        }

        String curLine;
        DVD newDVD;
        while (scan.hasNextLine()){
            curLine= scan.nextLine();
            newDVD = unmarshallDVD(curLine);
            dvdCollection.add(newDVD);
        }
        scan.close();
    }

    //converts a dvd file to a string for saving to a file
    public String marshallDVD(DVD d){
        String dvdAsText = d.getTitle() + DELIMITER;
        dvdAsText+=d.getDate()+DELIMITER;
        dvdAsText+=d.getMpaaRating()+DELIMITER;
        dvdAsText+=d.getDirectorName()+DELIMITER;
        dvdAsText+=d.getStudio()+DELIMITER;
        dvdAsText+=d.getUserRating();
        return dvdAsText;
    }

    //conerts a string to a dvd file for reading from a file
    public DVD unmarshallDVD(String s){
        String[] dvdTokens = s.split(DELIMITER);
        return new DVD(dvdTokens[0], dvdTokens[1], dvdTokens[2],dvdTokens[3], dvdTokens[4], dvdTokens[5]);


    }
}
