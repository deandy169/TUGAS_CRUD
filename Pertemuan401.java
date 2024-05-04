package pertemuan401;

/**
 *
 * @author Andi 2201010101
 * 23/04/2024
 * 
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BukuTeman BTeman = new BukuTeman();
        
        String ul = "YA";
        do{
        System.out.println("A. View Data");
        System.out.println("B. Add Data");
        System.out.println("C. Edit Data");
        System.out.println("D. Delete Data");
        System.out.println("E. Exit");
        System.out.println("Choose Option (A/B/C/D/E): ");
        String mPIL = BTeman.dtIN.nextLine();
        switch (mPIL) {
            case "A":
                BTeman.viewdata();
                break;
            case "B":
                BTeman.Storedata();
                break;
            case "C":
                System.out.println("Masukkan nomor teman yang akan diupdate: ");
                int idxUpdate = Integer.parseInt(BTeman.dtIN.nextLine());
                BTeman.Update(idxUpdate - 1); 
                break;
            case "D":
                System.out.println("Masukkan nomor teman yang akan dihapus: ");
                int idxDelete = Integer.parseInt(BTeman.dtIN.nextLine());
                BTeman.Destroy(idxDelete - 1); 
                break;
            case "E":
                ul = "tidak";
                break;
                
            default:
                System.out.println("type A/B/C/D/E");
                break;
        }
        }while(ul.equals("YA"));
    }
    
}

