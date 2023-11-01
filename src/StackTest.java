public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(5);
        s.push(7);

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.isEmpty());

        s.pop();
        s.pop();

        System.out.println(s.isEmpty());

        s.push(3);
        s.push(5);
        s.push(7);

        System.out.println(s.size());

        System.out.println(s.peek());
    }
}
