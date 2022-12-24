public class Mahasiswa <T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;

    public void setNim(T1 nim) {
        this.nim = nim;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public void setClas(T3 clas) {
        this.clas = clas;
    }

    public T1 getNim() {
        return this.nim;
    }

    public T2 getName() {
        return this.name;
    }

    public T3 getClas() {
        return this.clas;
    }
}
 14  
tugas-sesi-9/Mahasiswaku.java
@@ -0,0 +1,14 @@
public class Mahasiswaku {

    public static void main(String[] args) {
        Mahasiswa <String,String, Integer> m = new Mahasiswa<>();
        m. setNim("1102020");
        m. setName ("Ferdi");
        m. setClas(21);
        System.out.println(m.getNim());
        System.out.println(m.getName ());
        System.out.println(m.getClas());
    }
}

//Maka buatlah contoh progam genericnya agar kode progam diatas dapat berjalan?
