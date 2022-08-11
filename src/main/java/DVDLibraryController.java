public class DVDLibraryController {

    private DVDLibraryView view;
    private DVDLibraryDao model;
    private UserIO io = new UserIOConsoleImpl();

    public DVDLibraryController(DVDLibraryView myView, DVDLibraryDao myModel){
        this.view = myView;
        this.model = myModel;
    }

    public void run(){
        boolean running = true;

        while (running){
            int selection = getMenuSelection();

            switch (selection) {
                case 1 -> addDVDToCollection();
                case 2 -> removeDVDFromCollection();
                case 3 -> editDVDInCollection();
                case 4 -> listAllDVDSInCollection();
                case 5 -> listSingleDVDInCollection();
                case 6 -> searchDVDByTitleInCollection();
                case 7 -> loadDVDsToCollection();
                case 8 -> saveDVDsFromCollection();
                case 9 -> running = false;
                default -> {
                }
            }

        }
    }

    public int getMenuSelection(){
        return view.printMenuAndGetChoice();
    }

    public void addDVDToCollection(){
        io.print("To Implement");
    }

    public void removeDVDFromCollection(){
        io.print("To Implement");
    }

    public void editDVDInCollection(){
        io.print("To Implement");
    }

    public void listAllDVDSInCollection(){
        io.print("To Implement");
    }

    public void listSingleDVDInCollection(){
        io.print("To Implement");
    }

    public void searchDVDByTitleInCollection(){
        io.print("To Implement");
    }

    public void loadDVDsToCollection(){
        io.print("To Implement");
    }

    public void saveDVDsFromCollection(){
        io.print("To Implement");
    }

}
