package check.model.dao.exception;

public class DaoException extends Exception {
    public DaoException(String message) {
        super(message);
    }
    public DaoException(Exception e) {
        super(e);
    }
    public DaoException(String message, Exception e) {
        super(message, e);
    }
}