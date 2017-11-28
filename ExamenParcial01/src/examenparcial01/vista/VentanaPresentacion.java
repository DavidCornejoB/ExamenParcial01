package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaPresentacion extends JInternalFrame {

    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JButton boton;
    private JPanel panelInicial;
    private List<JLabel> labelList;
    private List<JTextField> textoList;
    private List<JButton> botonList;
    private List<JComboBox> comboList;
    private GestionDato gD;

    public VentanaPresentacion(String title, GestionDato gD) {
        super(title, true, true, true, true);
        this.setSize(400, 320);
        this.setLocation(906, 20);
        this.gD = gD;
        this.iniciaComponente();
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JPanel getPanelInicial() {
        return panelInicial;
    }

    public void setPanelInicial(JPanel panelInicial) {
        this.panelInicial = panelInicial;
    }

    public List<JLabel> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<JLabel> labelList) {
        this.labelList = labelList;
    }

    public List<JTextField> getTextoList() {
        return textoList;
    }

    public void setTextoList(List<JTextField> textoList) {
        this.textoList = textoList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public List<JComboBox> getComboList() {
        return comboList;
    }

    public void setComboList(List<JComboBox> comboList) {
        this.comboList = comboList;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public void iniciaComponente() {
        //Ingreso de datos
        this.panelInicial = new JPanel(new BorderLayout());
        JPanel panelNorte = new JPanel(new BorderLayout());

        this.labelList = new ArrayList<JLabel>();
        this.labelList.add(new JLabel("Festival"));
        this.labelList.add(new JLabel("Artista"));
        this.labelList.add(new JLabel("Numero de Presentacion"));
        this.labelList.add(new JLabel("Presentacion-Artista"));

        this.textoList = new ArrayList<JTextField>();
        this.textoList.add(new JTextField());

        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Limpiar"));
        for (int i = 0; i < this.botonList.size(); i++) {
            //this.botonList.get(i).addActionListener(new EventoCarrera(this));
        }

        this.comboList = new ArrayList<JComboBox>();
        this.comboList.add(new JComboBox());
        this.comboList.add(new JComboBox());
        LayoutManager disDatos = new GridLayout(5, 2);
        LayoutManager disTitulo = new FlowLayout();

        JPanel panelTitulo = new JPanel(disTitulo);
        JPanel panelIngreso = new JPanel(disDatos);

        panelIngreso.add(this.labelList.get(0));
        this.cargarCombo();//Cargar el comboBox con los festivales
        panelIngreso.add(this.comboList.get(0));
        panelIngreso.add(this.labelList.get(1));
        this.cargarCombo();//Cargar el comboBox con los artistas
        panelIngreso.add(this.comboList.get(1));
        panelIngreso.add(this.labelList.get(2));
        panelIngreso.add(this.textoList.get(0));

        panelTitulo.add(this.labelList.get(3));
        panelIngreso.add(this.botonList.get(0));
        panelIngreso.add(this.botonList.get(1));

        panelNorte.add(panelTitulo, BorderLayout.NORTH);
        panelNorte.add(panelIngreso, BorderLayout.CENTER);

        //Tabla 
        this.encabezado = new Object[3];
        this.encabezado[0] = "Festival";
        this.encabezado[1] = "Artista";
        this.encabezado[2] = "Numero de presentacion";

        //this.datos=cargarDatos(this.gD.getCarreraList().size(), this.encabezado.length);
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        this.boton = new JButton("Actualizar");
        //this.boton.addActionListener(new EventoCarrera(this));

        this.panelInicial.add(panelNorte, BorderLayout.NORTH);
        this.panelInicial.add(this.scroll, BorderLayout.CENTER);
        this.panelInicial.add(this.boton, BorderLayout.SOUTH);

        this.add(this.panelInicial);

    }

    public Object[][] cargarDatos(int f, int c) {
        Object[][] retorno = new Object[f][c];

        return retorno;
    }

    public void cargarCombo() {
        this.comboList.get(0).removeAllItems();

    }
}
