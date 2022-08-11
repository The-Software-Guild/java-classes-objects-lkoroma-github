public class App {
    public static void main(String[] args) {

        UserIO myIo = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIo);
        DVDLibraryDao myModel = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller= new DVDLibraryController(myView, myModel);
        controller.run();
    }
}
