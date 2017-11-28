package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private JMenuBar barraMenu;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private JDesktopPane escritorio;
    private GestionDato gD;

    public VentanaPrincipal(String string, GestionDato gD) {
        super(string);
        this.gD = gD;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(1240, 450);
        this.iniciaComponente();
        this.setVisible(true);
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public void iniciaComponente() {
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();

        this.menuList = new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Festival"));
        this.menuList.add(new JMenu("Asistente")); 
        this.menuList.add(new JMenu("Artista"));
        this.menuList.add(new JMenu("Boleto"));

        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Agregar Festival"));
        this.menuItemList.add(new JMenuItem("Agregar Asistente"));
        this.menuItemList.add(new JMenuItem("Agregar Artista"));
        this.menuItemList.add(new JMenuItem("Asignacion de Boleto"));


        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        for (int i = 0; i < this.menuList.size(); i++) {
            barraMenu.add(this.menuList.get(i));
        }
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(1).add(this.menuItemList.get(1));
        this.menuList.get(2).add(this.menuItemList.get(2));
        this.menuList.get(3).add(this.menuItemList.get(3));

        for (int i = 0; i < this.menuItemList.size(); i++) {
            System.out.println("hola");
            //this.menuItemList.get(i).addActionListener(new EventoVentanaInicial(this));
        }
    }

}
