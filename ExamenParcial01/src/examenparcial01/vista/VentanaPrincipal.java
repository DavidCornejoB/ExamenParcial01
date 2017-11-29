package examenparcial01.vista;

import examenparcial01.controlador.EventoPrincipal;
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
        JOptionPane.showMessageDialog(this, "Oeeee Pizarro (10mo Aviso) el boton de limpiar es para 'limpiar' los JTextfield");
        this.escritorio = new JDesktopPane();
        this.barraMenu = new JMenuBar();

        this.menuList = new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Festival"));//0
        this.menuList.add(new JMenu("Asistente"));//1
        this.menuList.add(new JMenu("Artista"));//2
        this.menuList.add(new JMenu("Boleto"));//3
        this.menuList.add(new JMenu("Idiomas"));//4

        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Agregar Festival"));//0
        this.menuItemList.add(new JMenuItem("Agregar Asistente"));//1
        this.menuItemList.add(new JMenuItem("Agregar Artista"));//2
        this.menuItemList.add(new JMenuItem("Presentacion de Artista"));//3
        this.menuItemList.add(new JMenuItem("Asignacion de Boleto"));//4
        this.menuItemList.add(new JMenuItem("Español"));//5
        this.menuItemList.add(new JMenuItem("Ingles"));//6
        

        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        for (int i = 0; i < this.menuList.size(); i++) {
            barraMenu.add(this.menuList.get(i));
        }
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(1).add(this.menuItemList.get(1));
        this.menuList.get(2).add(this.menuItemList.get(2));
        this.menuList.get(2).add(this.menuItemList.get(3));
        this.menuList.get(3).add(this.menuItemList.get(4));
        this.menuList.get(4).add(this.menuItemList.get(5));
        this.menuList.get(4).add(this.menuItemList.get(6));

        for (int i = 0; i < this.menuItemList.size(); i++) {
            this.menuItemList.get(i).addActionListener(new EventoPrincipal(this));
        }
    }

}
