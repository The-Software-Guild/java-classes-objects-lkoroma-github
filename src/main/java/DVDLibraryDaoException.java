public class DVDLibraryDaoException extends Exception{

    public DVDLibraryDaoException(String message){
        super(message);
    }


    //custom exception for our application
    public DVDLibraryDaoException(String message, Throwable cause){
        super(message, cause);
    }
}
