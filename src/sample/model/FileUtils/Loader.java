package sample.model.FileUtils;

import sample.model.playersPack.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Loader {

    private ObjectInputStream objectReader;
    private Scanner textReader;

    /**
     *
     * @param mainFolder is the address of main folder
     */
    public Loader(String mainFolder) {
//        super(mainFolder);
    }

    /**
     * Load Saved users
     *
     * @return the loaded Players
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public synchronized HashMap<String, Player> loadSavedPlayers() throws IOException, ClassNotFoundException {
        HashMap<String, Player> loadedPlayers = new HashMap<String, Player>();

        Path path = Paths.get("./src/sample/Files/");// load user Folder

        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);// load all file at folder
        for (Path path2 : directoryStream) {// iterate through all files
            Player temp = (Player) loadObject(path2.toString());
            loadedPlayers.put(temp.getUsername(), temp);

        }
        return loadedPlayers;
    }

    /**
     * Load any kind of object from address
     *
     * @param address
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public synchronized Object loadObject(String address) throws IOException, ClassNotFoundException {
        objectReader = new ObjectInputStream(new FileInputStream(new File(address)));
        Object temp = objectReader.readObject();
        objectReader.close();
        return temp;
    }
}
