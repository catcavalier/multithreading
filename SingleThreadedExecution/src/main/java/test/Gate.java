package test;

/**
 * @Description
 * @className: Gate
 * @Date 2022-3-16
 */
public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }
    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("***** BROKEN ***** " + toString());
        }
    }
    public String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }
}
