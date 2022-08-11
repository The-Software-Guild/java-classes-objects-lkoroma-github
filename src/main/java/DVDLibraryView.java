import java.util.ArrayList;

public class DVDLibraryView {

    private UserIO io;

    public DVDLibraryView(UserIO myIo){
        this.io = myIo;
    }

    public int printMenuAndGetChoice(){
        io.print("Main Menu");
        io.print("\t1. Add DVD to the collection");
        io.print("\t2. Remove DVD from the collection");
        io.print("\t3. Edit DVD in the collection");
        io.print("\t4. List DVDs in the collection");
        io.print("\t5. Search for a DVD by title");
        io.print("\t6. Exit program");

        return io.readInt("Please select from the above choices.",1, 9);
    }

    public DVD getNewDVDInfo(){
        String title = io.readString("\tPlease enter the title of the DVD");
        String date = io.readString("\tPlease enter the release date of the DVD");
        double mpaaRate = io.readDouble("\tPlease enter the MPAA rating of the DVD");
        String director = io.readString("\tPlease enter the director's name");
        String studio = io.readString("\tPlease enter the studio name");
        String userRate = io.readString("\tPlease enter the user rating of the DVD");
        return new DVD(title, date, mpaaRate, director,studio, userRate);
    }

    public void showDVDCollection(ArrayList<DVD> dvds){
        if (dvds.size()==0){
            io.print("\tNo DVDs Found");
            return;
        }
        for (DVD d: dvds){
            String dvd = String.format("\tTitle: %s%n\tRelease Date: %s%n\tMPAA Rating: %.2f%n\tDirector: %s, Studio %s%n\t" +
                    "User Rating: %s%n", d.getTitle(), d.getDate(), d.getMpaaRating(), d.getDirectorName(),
                    d.getStudio(), d.getUserRating());
            io.print(dvd);
        }
    }
    public String getDVDTitle(String s){
        return io.readString(String.format("\tEnter the name of the DVD you want to %s", s));
    }

    public int getEditField(){
        io.print("\t1 - Title");
        io.print("\t2 - Release Date");
        io.print("\t3 - MPAA Score");
        io.print("\t4 - Director Name");
        io.print("\t5 - Studio");
        io.print("\t6 - User Rating");
        return io.readInt("What option do you want to edit?", 1, 6);
    }

    public String getEditData(){
        return io.readString("\tEnter the data to edit into the DVD record");
    }

    public void showDVDInfo(DVD d){
        io.print(String.format("\tTitle: %s%n\tRelease Date: %s%n\tMPAA Rating: %.2f%n\tDirector: %s, Studio %s%n\t" +
                        "User Rating: %s%n", d.getTitle(), d.getDate(), d.getMpaaRating(), d.getDirectorName(),
                d.getStudio(), d.getUserRating()));
    }

    public void displayAddDVDMenu(){
        io.print("ADD DVD MENU");
    }

    public void displayRemoveDVDMenu(){
        io.print("REMOVE DVD MENU");

    }
    public void displayEditDVDMenu(){
        io.print("EDIT DVD MENU");

    }
    public void displayListDVDsMenu(){
        io.print("LIST DVDS MENU");

    }
    public void displayListADVDMenu(){
        io.print("DVD LOOKUP MENU");

    }
    public void printCreateSuccess(){
        io.print("\tDVD added to collection");
    }
    public void printRemoveSuccess(){
        io.print("\tDVD removed from collection");
    }
    public void printEditSuccess(){
        io.print("\tDVD successfully edited");
    }
}
