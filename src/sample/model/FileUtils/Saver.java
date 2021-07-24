package sample.model.FileUtils;

import sample.model.playersPack.Player;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * The type Saver.
 */
public class Saver {

    private ObjectOutputStream objectWriter;// for write object serielized

    /**
     * The Cousntructor
     *
     * @param mainFolder the main folder
     */
    public Saver(String mainFolder) {
//        super(mainFolder);
    }


    /**
     * Save to the ./Files/Users
     *
     * @param player that will save
     * @throws IOException the io exception
     */
    public void saveUser(Player player) throws IOException {

//        addToFolders("Users", "../" + mainFolder + "/Users/");// make user dir
//        String newFile = "../" + mainFolder + "/Users/" + player.getUsername();// make file address
        String filePath = "./src/sample/Files/" + player.getUsername();
//        String file = "./Files/";
//        File file1 = new File(file);

//        System.out.println(file1.getAbsolutePath());
        saveObject(player, filePath);
    }

    /**
     * Write any Object to the address
     *
     * @param o       the o
     * @param address the address
     * @throws IOException the io exception
     */
    public void saveObject(Object o, String address) throws IOException {
//        cleanUp(address);// clean existed file
        objectWriter = new ObjectOutputStream(new FileOutputStream(new File(address)));// make the output
        objectWriter.writeObject(o);// write
        objectWriter.close();
    }


    /**
     * delete the existing file
     *
     * @param address of file
     */
    public void cleanUp(String address) {
        File selected = new File(address);
        if (selected.exists()) {
            selected.delete();
            System.out.println("deleted");
        }
    }
}
