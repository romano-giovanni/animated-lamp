import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercitazioni con i file");

        File file = new File("Esempio.txt");
        File file2 = new File("Esempio2.txt");

        if (file.isFile()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(file2);
                Writer out = new BufferedWriter(fw);

                String line = br.readLine();
                out.write(line.toUpperCase());
                out.flush();
                br.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("I/O exception");
            }
        }

        Persona persona = new Persona("Giovanni", "Romano");
        File personaFile = new File("Persona.txt");

        try {
            FileOutputStream fos = new FileOutputStream("Persona.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(persona);

            oos.flush();
            fos.close();
        } catch (Exception e) {
            System.out.println("File not found!!!");
        }

        if (personaFile.isFile()) {
            try {
                FileInputStream fis = new FileInputStream("Persona.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Persona p = (Persona) ois.readObject();
                System.out.println(p.getNome() + " " + p.getCognome());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}