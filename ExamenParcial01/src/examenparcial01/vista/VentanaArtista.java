package examenparcial01.vista;

import examenparcial01.controlador.EventoArtista;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaArtista extends JInternalFrame {

    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panelInicial;
    private List<JLabel> labelList;
    private List<JTextField> textoList;
    private List<JButton> botonList;
    private GestionDato gD;
    private ResourceBundle rD;

    public VentanaArtista(String title, GestionDato gD) {
        super(title, true, true, true, true);
        this.setSize(500, 330);
        this.setLocation(200, 315);
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
        this.labelList.add(new JLabel("Nombre"));
        this.labelList.add(new JLabel("Apellido"));
        this.labelList.add(new JLabel("Fecha de nacimiento"));
        this.labelList.add(new JLabel("Agregar Artista"));

        this.textoList = new ArrayList<JTextField>();
        for (int i = 0; i < this.labelList.size() - 1; i++) {
            this.textoList.add(new JTextField());
        }

        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Limpiar"));
        for (int i = 0; i < this.botonList.size(); i++) {
            //this.botonList.get(i).addActionListener(new EventoRector(this));
        }

        JPanel panelTitulo = new JPanel(new FlowLayout());
        JPanel panelIngreso = new JPanel(new GridLayout(4, 2));

        panelIngreso.add(this.labelList.get(0));
        panelIngreso.add(this.textoList.get(0));
        panelIngreso.add(this.labelList.get(1));
        panelIngreso.add(this.textoList.get(1));
        panelIngreso.add(this.labelList.get(2));
        panelIngreso.add(this.textoList.get(2));

        panelTitulo.add(this.labelList.get(3));
        panelIngreso.add(this.botonList.get(0));
        panelIngreso.add(this.botonList.get(1));

        panelNorte.add(panelTitulo, BorderLayout.NORTH);
        panelNorte.add(panelIngreso, BorderLayout.CENTER);

        //Tabla 
        this.encabezado = new Object[3];
        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "Apellido";
        this.encabezado[2] = "Fecha de Nacimiento";

        this.datos = cargarDatos(this.gD.getArtistaList().size(), this.encabezado.length);
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        this.panelInicial.add(panelNorte, BorderLayout.NORTH);
        this.panelInicial.add(this.scroll, BorderLayout.CENTER);
        
        this.botonList.get(0).addActionListener(new EventoArtista(this));
        this.botonList.get(1).addActionListener(new EventoArtista(this));
        
        this.add(this.panelInicial);
    }
    
    public Object[][] cargarDatos(int f, int c) {
        Object[][] retorno = new Object[f][c];
        int i=0;
        for(Artista a: this.gD.getArtistaList()){
            retorno[i][0]=a.getNombre();
            retorno[i][1]=a.getApellido();
            retorno[i][2]=a.getFechaNac();
            i++;
        }
        return retorno;
    }
    
     public void addIdioma() {
        this.labelList.get(0).setText(rD.getString("etiquetaTexto5"));
        this.labelList.get(1).setText(rD.getString("etiquetaTexto6"));
        this.labelList.get(2).setText(rD.getString("etiquetaTexto7"));
        this.labelList.get(3).setText(rD.getString("etiquetaTitulo2"));
        this.botonList.get(0).setText(rD.getString("etiquetaBoton1"));
        this.botonList.get(1).setText(rD.getString("etiquetaBotona2"));
        this.encabezado[0]=rD.getString("etiquetaTexto5");
        this.encabezado[1]=rD.getString("etiquetaTexto6");
        this.encabezado[2]=rD.getString("etiquetaTexto7");
        
     }
    
}
