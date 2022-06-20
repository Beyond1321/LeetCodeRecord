package easy;

public class test {
    public static void main(String[] args) {
        offer30 obj = new offer30();
        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);
        obj.pop();
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
    }
}
