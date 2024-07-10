package MAY.ex_25052024;

public class HTTP_Status {
    public static void main(String[] args) {

        //    HTTP status codes are standardized codes returned by web servers to indicate the outcome of a client's request.
//     These codes help clients understand whether a request was successful, and if not, why it failed.
//     They are divided into five categories based on the type of response they represent.

        HTTPStatusCODE status = HTTPStatusCODE.OK;
        System.out.println(status.getCode() +" - " + status.getMessage());

    }


}


enum HTTPStatusCODE{

    // crteating key value player enums to keep something
    // here we have kept a constant name as OK which contains code value 200 and error message
//    Now I can use these into main class
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");
// Above constants are case sensitive always in capital & no need to add data type always

    // In the enum we have code as well as message
    // only here we use data type to mention wht is the type of value that we store as constants
    private int code; // here int can be wrapper also
    private String message;


    // Generate constructors
    HTTPStatusCODE(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // create getter setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}