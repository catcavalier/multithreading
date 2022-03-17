package test;

/**
 * @Description
 * @className: Request
 * @Date 2022-3-16
 */
//request类表示请求
public class Request {
    private final String name;
    public Request(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "[ Request " + name + " ]";
    }
}