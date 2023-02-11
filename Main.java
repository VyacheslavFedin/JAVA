public class Main {
    public static void main(String[] args) {
        LinkedLst<Integer> lst = new LinkedLst<Integer>();
        lst.add(11);
        lst.add(2);
        lst.add(24);
        lst.add(4);
        lst.add(14);


        for (Integer item : lst) {
            System.out.println(item);
        }
    }
}