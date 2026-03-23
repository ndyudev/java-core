package JavaCore.IOstreams;

import java.io.*;

public class Lesson1CharacterStream {
    public static void main(String[] args) {
        String filepath = "F:\\jetbrain-project\\intellij-jetbrain\\java-core\\src\\JavaCore\\IOstreams\\students.txt";
        String filename = "students.txt";
        try {
            FileWriter writer = new FileWriter(filepath);
            writer.write("1 Nhật Duy 2006\n2 Kim Thư 2006\n");
            writer.close();
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(filepath);
            int kytu;
            while((kytu = reader.read()) != -1) { // -1 ở số của hàm read trả ra khi hết file
                System.out.print((char) kytu);
            }
            System.out.print("\nĐọc file thành công!");
        } catch (IOException e) {
            System.out.println("lỗi khi đọc file");
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
            bw.write("\nDòng thứ nhất");
            bw.newLine();
            bw.write("Dòng thứ hai");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi thao tác file");
        }
    }
}
