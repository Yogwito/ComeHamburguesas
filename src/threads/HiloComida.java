/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;
import java.util.List;
import models.CampoDeJuego;
import models.Comida;
import java.util.Random;
import javax.swing.JPanel;
import gui.VentanaJuego;

/**
 *
 * @author juans
 */

public class HiloComida implements Runnable {

    private CampoDeJuego campo;
    private JPanel panel;
    private Random random = new Random();

    public HiloComida(CampoDeJuego campo, JPanel panel) {
        this.campo = campo;
        this.panel = panel;
    }
    
    @Override
    public void run() {
        while (true) {
            if (campo.contarTipo(Comida.class) < 4) {
                int x = random.nextInt(760);
                campo.addSprite(new Comida(x, 0, 40, 40));
            }

            campo.moverTodo(Comida.class, 5);

            List<Comida> fuera = campo.comidasFueraDelLimite(panel.getHeight());
            for (Comida c : fuera) {
                campo.removeSprite(c);
                VentanaJuego.restarPuntoPorCaida();
            }

            panel.repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}