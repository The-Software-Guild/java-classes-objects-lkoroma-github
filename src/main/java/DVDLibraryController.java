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
                case 5 -> searchDVDCollection();
                case 6 -> running = false;
                default -> {
                }
            }
        }
    }

    public int getMenuSelection(){
        return view.printMenuAndGetChoice();
    }

    public void addDVDToCollection(){
        view.displayAddDVDMenu();
        DVD d = view.getNewDVDInfo();
        model.addDVD(d.getTitle(), d.getDate(), d.getMpaaRating(),d.getDirectorName(),d.getStudio(),d.getUserRating());
        view.printCreateSuccess();
    }

    public void removeDVDFromCollection(){
        view.displayRemoveDVDMenu();
        String title = view.getDVDTitle("remove");
        DVD dvd = model.searchDVD(title);
        model.removeDVD(dvd);
        view.printRemoveSuccess();
    }

    public void editDVDInCollection(){
        view.displayEditDVDMenu();
        String title = view.getDVDTitle("edit");
        DVD dvd = model.searchDVD(title);
        int field = view.getEditField();
        String date = view.getEditData();
        model.editDVD(dvd, field, date);
        view.printEditSuccess();
    }

    public void listAllDVDSInCollection(){
        view.displayListDVDsMenu();
        view.showDVDCollection(model.listDVDS());
    }

    public void searchDVDCollection(){
        view.displayListADVDMenu();
        String title = view.getDVDTitle("view");
        DVD d = model.searchDVD(title);
        view.showDVDInfo(d);
    }


}
