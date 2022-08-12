public class App {
    public static void main(String[] args) throws DVDLibraryDaoException {

        //dependency injection to the view and controller
        UserIO myIo = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIo);
        DVDLibraryDao myModel = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller= new DVDLibraryController(myView, myModel);

        //runs the program
        controller.run();
    }
}
