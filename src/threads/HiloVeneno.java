/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;
import models.CampoDeJuego;
import models.Veneno;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author juans
 */

public class HiloVeneno implements Runnable {

    private CampoDeJuego campo;
    private JPanel panel;
    private Random random = new Random();

    public HiloVeneno(CampoDeJuego campo, JPanel panel) {
        this.campo = campo;
        this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            if (campo.contarTipo(Veneno.class) < 4) {
                int x = random.nextInt(760);
                if (!campo.hayColision(x, 0, 40, 40)) {
                    campo.addSprite(new Veneno(x, 0, 40, 40));
                }
            }

            campo.moverTodo(Veneno.class, 5);
            panel.repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
