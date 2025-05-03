package Test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

public class test_Timer {
    public static void main(String[] args){


        Timer reloj = new Timer(10 , new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                LocalTime horaActual = LocalTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss a");


            }
        });
        reloj.start();
    }
}

