package OOP;

public class inventori {
    public static void namaBarang(){
        System.out.println("ban dalem");
    }

    public static void main(String[] args) {
        namaBarang();

        new inventori();
        inventori.namaBarang();

        inventori untitle = new inventori();
        untitle.namaBarang();

    }
}
