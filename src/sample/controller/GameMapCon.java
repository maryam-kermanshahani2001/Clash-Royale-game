package sample.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import sample.view.MapView;

import java.util.Timer;
import java.util.TimerTask;

public class GameMapCon {
    final private static double FRAMES_PER_SECOND = 5.0;

    @FXML private MapView mapView;
    private Timer timer;



    private void startTimer() {
        this.timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    public void run() {
                        mapView.update();
                    }
                });
            }
        };

        long frameTimeInMilliseconds = (long)(1000.0 / FRAMES_PER_SECOND);
        this.timer.schedule(timerTask, 0, frameTimeInMilliseconds);
    }
}
