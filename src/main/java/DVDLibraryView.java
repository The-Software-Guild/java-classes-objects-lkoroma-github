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
        io.print("\t5. List information for a specific DVD");
        io.print("\t6. Search for a DBD by title");
        io.print("\t7. Load DVD library from a file");
        io.print("\t8. Save DVD library to a file");
        io.print("\t9. Exit program");

        return io.readInt("Please select from the above choices.",1, 9);
    }
}
