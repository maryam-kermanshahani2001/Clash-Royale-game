package sample.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The type Battle history.
 */
public class BattleHistory implements Serializable {
    private String date;
    private String winner;

    /**
     * Instantiates a new Battle history.
     *
     * @param winner the winner
     */
    public BattleHistory( String winner) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date battleDate = new Date();
        date = formatter.format(battleDate);
        this.winner = winner;
    }
}
