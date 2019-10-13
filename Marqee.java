package library;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Marquee extends Text {
    private AnchorPane pnlMain = null;
    private HBox pnlHBMain = null;
    private TranslateTransition marqueeTT;  
    private int speedSec = 18;
    private boolean hasPausedME = false;
    private boolean hasPlayedME = false;
    
    public Marquee () {
        this("");
    }
    public Marquee (String text){
        this.setStyle("-fx-font: bold 20 arial;");
        this.setVisible(false);
        this.setTranslateY(this.maxHeight(0));
        this.setText(text);
    }
     
    public void setScrollDuration(int seconds) {
        this.speedSec = seconds;
    }
    
    public void play() {
        marqueeTT.play();
    }
    
    public void pause() {
        marqueeTT.pause();
    }
    
    public void setBoundsFrom(AnchorPane pnl){
        this.pnlMain = pnl;
    }    
    
    public void setBoundsFrom(HBox pnl){
        this.pnlHBMain = pnl;
    }
    
    public void moveDownBy(int amount) {
        this.setTranslateY(this.maxHeight(0)+amount);
    }
    
    public void setColor(String color) {
        this.setFill(Paint.valueOf(color));
    }

    public void run() {
        marqueeTT = new TranslateTransition(Duration.seconds(this.speedSec), this); 
        
        marqueeTT.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                reRunMarquee();
            }
        });

        Thread thread = new Thread() {
           public void run() {
               try {
                    Thread.sleep(700);
                } catch (InterruptedException ex) { }
                    runMarquee();
           }
       }; 
       thread.start();
    }
    
    private boolean hasPausedME(){
        return hasPausedME;
    }    
    
    private boolean hasPlayedME(){
        return hasPlayedME;
    }
    
    private void setHasPausedME(boolean state){
        hasPausedME = state;
    }    
    
    private void setHasPlayedME(boolean state){
        hasPlayedME = state;
    }       
    
    
    private void runMarquee() {
        this.setOnMouseEntered(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent t) {
               if(hasPausedME() ) {
                   marqueeTT.pause();
               }
               else {
                   setHasPausedME(true);
                   Thread thread = new Thread() {
                        public void run() {
                            try {
                                 Thread.sleep(180);
                             } catch (InterruptedException ex) { }
                                if(hasPlayedME() == false ) marqueeTT.pause();
                        }
                    }; 
                    thread.start(); 
               }
            }
        });

        this.setOnMouseExited(new EventHandler<MouseEvent> (){
            @Override
            public void handle(MouseEvent t) {
                marqueeTT.play();
                setHasPlayedME(true);
            }
        });
        reRunMarquee();
    }
        
    private void reRunMarquee() {
        marqueeTT.setDuration(Duration.seconds(this.speedSec));
        marqueeTT.setInterpolator(Interpolator.LINEAR);
        marqueeTT.stop();
        marqueeTT.setToX(-(this.maxWidth(0)+50));
        
        if( this.pnlMain != null ) {
            marqueeTT.setFromX(this.pnlMain.getWidth());
        }
        else {
            marqueeTT.setFromX(this.pnlHBMain.getWidth());
        }
        
        marqueeTT.playFromStart();
        this.setVisible(true);
    }
}
