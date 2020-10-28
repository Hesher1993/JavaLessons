package TestPack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveMessages {
    private static String FILE_ARCHIVE_TEMPLATE =
            "#archive.log";
    private static String archiveFileName;
    private static BufferedWriter archiveWriter;
    private final SaveMessages saveMessages;
    private static final long NUM_LAST_MESSAGES = 100;

    public SaveMessages(SaveMessages saveMessages) {
        this.saveMessages = saveMessages;
    }

    public void setArchiveFileName(String userName) {
        this.archiveFileName = userName+FILE_ARCHIVE_TEMPLATE;
    }


    public static void putMessageToArchveFile(String message) throws IOException {

        if (archiveWriter==null) {
            archiveWriter =
                    new BufferedWriter(new FileWriter(archiveFileName,
                            true));
        }
        archiveWriter.write(message);
        archiveWriter.newLine();
    }


    public static List getArchiveFromFile(long numLastMessages)
            throws IOException {
        ArrayList messages = new ArrayList<String>();

        try (FileInputStream fis = new FileInputStream(archiveFileName)){
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(fis));
            String str;
            long i=numLastMessages;
            while ((str=br.readLine())!=null && i>0) {
                messages.add(str);
                i--;
            }
        }
        return messages;
    }
    public List getMessageArchive() throws IOException{
        List<String> messages =
                SaveMessages.getArchiveFromFile(NUM_LAST_MESSAGES);
        return messages;
    }


    public void close() {
        if (archiveWriter==null)
            return;
        try {

            archiveWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

