package simple.web.server.pojo;

import org.springframework.stereotype.Component;

@Component
public class Response {

    private int code;
    private String message;
    private Object data;

    private Response() {
        this(0, "", null);
    }

    private Response(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Response success(String message, Object data) {
        return new Response(0, message, data);
    }

    public static Response error(int code, String message) {
        return new Response(code, message, null);
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
