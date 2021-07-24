package sample.model.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * The type Fio.
 */
public class FIO {
    private static HashMap<String, Path> folders;// contain the needed Folders
    /**
     * The Main folder.
     */
    protected String mainFolder;//is the name of the main folder


    /**
     * The Cousntructor
     *
     * @param mainFolder the main folder
     */
    public FIO(String mainFolder) {
        this.mainFolder=mainFolder;
        folders = new HashMap<String, Path>();// key name and value path of folder
    }

    /**
     *
     * @param address the address of dir
     * @throws IOException if couldn't make folder
     */
    private void makeDir(String address) throws IOException {

        File temp = new File(address);
        if (!exists(temp.getPath())) {// if was exist before
            if (!temp.mkdir()) {// if couldn't make dir
                throw new IOException("Cant make" + temp.getPath());
            }
        }

    }


    /**
     * Add to folders.
     *
     * @param name    of folder
     * @param address of folder
     * @throws IOException the io exception
     */
    protected void addToFolders(String name, String address) throws IOException {
        if (!folders.containsKey(name)) {// if the folder wasn't created
            folders.put(name, new File(address).toPath());
            makeDir(address);
        }
    }

    /**
     * Gets folders.
     *
     * @return map of existed folders
     */
    public static HashMap<String, Path> getFolders() {
        return folders;
    }

    /**
     * Check the existence
     *
     * @param address the address
     * @return true if the address was true
     */
    protected boolean exists(String address) {
        File temp = new File(address);
        if (temp.exists()) {
            return true;
        }
        return false;
    }
}
