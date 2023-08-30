/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoP2_DanielElvir;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Inicio.setVisible(true);
        CrearNuevo.setVisible(false);
        Abrir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_Flujo = new javax.swing.JDialog();
        JD_UML = new javax.swing.JDialog();
        bg = new javax.swing.JPanel();
        sideMenu = new javax.swing.JPanel();
        HomeBttn = new javax.swing.JPanel();
        HomeTXT1 = new javax.swing.JLabel();
        HomeTXT2 = new javax.swing.JLabel();
        NewBttn = new javax.swing.JPanel();
        NewTXT1 = new javax.swing.JLabel();
        NewTXT2 = new javax.swing.JLabel();
        OpenBttn = new javax.swing.JPanel();
        OpenTXT1 = new javax.swing.JLabel();
        OpenTXT2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        CrearNuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DFlujoTXT = new javax.swing.JLabel();
        DUMLTXT = new javax.swing.JLabel();
        DFlujoBttn = new javax.swing.JPanel();
        DFlujoImg = new javax.swing.JLabel();
        DUMLBttn = new javax.swing.JPanel();
        DUMLImg = new javax.swing.JLabel();
        Abrir = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        MenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout JD_FlujoLayout = new javax.swing.GroupLayout(JD_Flujo.getContentPane());
        JD_Flujo.getContentPane().setLayout(JD_FlujoLayout);
        JD_FlujoLayout.setHorizontalGroup(
            JD_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_FlujoLayout.setVerticalGroup(
            JD_FlujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_UMLLayout = new javax.swing.GroupLayout(JD_UML.getContentPane());
        JD_UML.getContentPane().setLayout(JD_UMLLayout);
        JD_UMLLayout.setHorizontalGroup(
            JD_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_UMLLayout.setVerticalGroup(
            JD_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Python");
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 51, 51));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideMenu.setBackground(new java.awt.Color(0, 102, 102));

        HomeBttn.setBackground(new java.awt.Color(204, 204, 255));
        HomeBttn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        HomeBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBttnMouseExited(evt);
            }
        });

        HomeTXT1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        HomeTXT1.setForeground(new java.awt.Color(0, 0, 0));
        HomeTXT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTXT1.setText("Inicio");
        HomeTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeTXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTXT1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeTXT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeTXT1MouseExited(evt);
            }
        });

        HomeTXT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hogar.png"))); // NOI18N
        HomeTXT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeTXT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTXT2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HomeBttnLayout = new javax.swing.GroupLayout(HomeBttn);
        HomeBttn.setLayout(HomeBttnLayout);
        HomeBttnLayout.setHorizontalGroup(
            HomeBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeBttnLayout.setVerticalGroup(
            HomeBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBttnLayout.createSequentialGroup()
                .addGroup(HomeBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HomeTXT2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(HomeTXT1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        NewBttn.setBackground(new java.awt.Color(204, 204, 255));

        NewTXT1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NewTXT1.setForeground(new java.awt.Color(0, 0, 0));
        NewTXT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewTXT1.setText("Crear Nuevo");
        NewTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTXT1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewTXT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewTXT1MouseExited(evt);
            }
        });

        NewTXT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina.png"))); // NOI18N
        NewTXT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTXT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewTXT2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NewBttnLayout = new javax.swing.GroupLayout(NewBttn);
        NewBttn.setLayout(NewBttnLayout);
        NewBttnLayout.setHorizontalGroup(
            NewBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewTXT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NewBttnLayout.setVerticalGroup(
            NewBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewBttnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(NewBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewTXT2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(NewTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        OpenBttn.setBackground(new java.awt.Color(204, 204, 255));

        OpenTXT1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        OpenTXT1.setForeground(new java.awt.Color(0, 0, 0));
        OpenTXT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpenTXT1.setText("Abrir");
        OpenTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OpenTXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenTXT1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OpenTXT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OpenTXT1MouseExited(evt);
            }
        });

        OpenTXT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carpeta (1).png"))); // NOI18N
        OpenTXT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OpenTXT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenTXT2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout OpenBttnLayout = new javax.swing.GroupLayout(OpenBttn);
        OpenBttn.setLayout(OpenBttnLayout);
        OpenBttnLayout.setHorizontalGroup(
            OpenBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpenBttnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OpenTXT2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        OpenBttnLayout.setVerticalGroup(
            OpenBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(OpenTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(OpenTXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/snakes_423066.png"))); // NOI18N

        javax.swing.GroupLayout sideMenuLayout = new javax.swing.GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGroup(sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NewBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideMenuLayout.createSequentialGroup()
                .addComponent(OpenBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sideMenuLayout.setVerticalGroup(
            sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuLayout.createSequentialGroup()
                .addComponent(HomeBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(169, 169, 169))
        );

        bg.add(sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 670));

        Inicio.setBackground(new java.awt.Color(0, 51, 51));
        Inicio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENERADOR DE DIAGRAMAS");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenida");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Imagina una interfaz intuitiva donde puedes crear diagramas de flujo y UML arrastrando símbolos y conectándolos visualmente. A medida que diseñas, el código Python relacionado se genera automáticamente en tiempo real, reflejando tus acciones en el diagrama. Cada elemento gráfico, como cajas y flechas, se vincula con partes específicas del código. Puedes personalizar propiedades y detalles, y el código generado se ajusta en consecuencia. Una vez satisfecho, exportas el código para su uso. Esta interfaz combina la claridad visual del diseño con la eficiencia de generar código funcional, beneficiando tanto a principiantes como a desarrolladores experimentados.");
        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setBorder(null);

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(0, 51, 51));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Así que adelante, empieza a convertir tus conceptos en realidad con tan solo unos pocos clics. ¡Explora, experimenta y disfruta del viaje de convertir tus diagramas en código Python con mi plataforma!");
        jScrollPane2.setViewportView(jTextPane2);

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Que es?");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBorder(null);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(0, 51, 51));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane3.setText("¡Bienvenido a mi innovadora plataforma de conversión de diagramas de flujo y UML a código Python! Estamos encantados de tenerte aquí y emocionados por la oportunidad de ayudarte a transformar tus ideas visuales en robustas aplicaciones Python.");
        jTextPane3.setCaretColor(new java.awt.Color(0, 51, 51));
        jTextPane3.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jScrollPane3.setViewportView(jTextPane3);

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(132, 132, 132))
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator4)
                        .addComponent(jLabel13)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        bg.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 670));

        CrearNuevo.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GENERADOR DE DIAGRAMAS");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PARA CODIGO PYTHON");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Que desea crear?");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        DFlujoTXT.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        DFlujoTXT.setForeground(new java.awt.Color(255, 255, 255));
        DFlujoTXT.setText("Diagrama de Flujo");

        DUMLTXT.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        DUMLTXT.setForeground(new java.awt.Color(255, 255, 255));
        DUMLTXT.setText("Diagrama UML (Clases)");

        DFlujoBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DFlujoImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DFlujoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/uml.png"))); // NOI18N

        javax.swing.GroupLayout DFlujoBttnLayout = new javax.swing.GroupLayout(DFlujoBttn);
        DFlujoBttn.setLayout(DFlujoBttnLayout);
        DFlujoBttnLayout.setHorizontalGroup(
            DFlujoBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DFlujoBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DFlujoImg, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        DFlujoBttnLayout.setVerticalGroup(
            DFlujoBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DFlujoBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DFlujoImg, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        DUMLImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DUMLImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diagrama-de-flujo.png"))); // NOI18N

        javax.swing.GroupLayout DUMLBttnLayout = new javax.swing.GroupLayout(DUMLBttn);
        DUMLBttn.setLayout(DUMLBttnLayout);
        DUMLBttnLayout.setHorizontalGroup(
            DUMLBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DUMLBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DUMLImg, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        DUMLBttnLayout.setVerticalGroup(
            DUMLBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DUMLBttnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DUMLImg, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CrearNuevoLayout = new javax.swing.GroupLayout(CrearNuevo);
        CrearNuevo.setLayout(CrearNuevoLayout);
        CrearNuevoLayout.setHorizontalGroup(
            CrearNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearNuevoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(DFlujoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DUMLBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(CrearNuevoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(CrearNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(CrearNuevoLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(DFlujoTXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DUMLTXT)
                .addGap(122, 122, 122))
        );
        CrearNuevoLayout.setVerticalGroup(
            CrearNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearNuevoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(CrearNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CrearNuevoLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DFlujoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DUMLBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DFlujoTXT)
                    .addComponent(DUMLTXT))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        bg.add(CrearNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 670));

        Abrir.setBackground(new java.awt.Color(0, 51, 51));

        jScrollPane4.setViewportView(jTree1);

        javax.swing.GroupLayout AbrirLayout = new javax.swing.GroupLayout(Abrir);
        Abrir.setLayout(AbrirLayout);
        AbrirLayout.setHorizontalGroup(
            AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbrirLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        AbrirLayout.setVerticalGroup(
            AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbrirLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        bg.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 670));

        jMenu1.setText("Archivos");

        jMenu7.setText("Nuevo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Diagrama de Flujo");
        jMenu7.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Diagrama UML");
        jMenu7.add(jMenuItem2);

        jMenu1.add(jMenu7);

        jMenu6.setText("Abrir");
        jMenu1.add(jMenu6);
        jMenu1.add(jSeparator1);

        MenuPrincipal.add(jMenu1);

        jMenu2.setText("Ayuda");
        MenuPrincipal.add(jMenu2);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeTXT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTXT1MouseEntered
        HomeTXT1.setBackground(Color.cyan);
        HomeTXT1.setForeground(Color.white);
    }//GEN-LAST:event_HomeTXT1MouseEntered

    private void HomeBttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBttnMouseEntered
        
    }//GEN-LAST:event_HomeBttnMouseEntered

    private void HomeBttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBttnMouseExited
        
    }//GEN-LAST:event_HomeBttnMouseExited

    private void HomeTXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTXT1MouseClicked
        Inicio.setVisible(true);
        CrearNuevo.setVisible(false);
        Abrir.setVisible(false);
    }//GEN-LAST:event_HomeTXT1MouseClicked

    private void NewTXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTXT1MouseClicked
        Inicio.setVisible(false);
        CrearNuevo.setVisible(true);
        Abrir.setVisible(false);
    }//GEN-LAST:event_NewTXT1MouseClicked

    private void OpenTXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenTXT1MouseClicked
        Inicio.setVisible(false);
        CrearNuevo.setVisible(false);
        Abrir.setVisible(true);
    }//GEN-LAST:event_OpenTXT1MouseClicked

    private void HomeTXT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTXT2MouseClicked
        Inicio.setVisible(true);
        CrearNuevo.setVisible(false);
        Abrir.setVisible(false);
    }//GEN-LAST:event_HomeTXT2MouseClicked

    private void NewTXT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTXT2MouseClicked
        Inicio.setVisible(false);
        CrearNuevo.setVisible(true);
        Abrir.setVisible(false);
    }//GEN-LAST:event_NewTXT2MouseClicked

    private void OpenTXT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenTXT2MouseClicked
        Inicio.setVisible(false);
        CrearNuevo.setVisible(true);
        Abrir.setVisible(false);
    }//GEN-LAST:event_OpenTXT2MouseClicked

    private void HomeTXT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTXT1MouseExited
        HomeTXT1.setBackground(Color.white);
        HomeTXT1.setForeground(Color.black);
    }//GEN-LAST:event_HomeTXT1MouseExited

    private void NewTXT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTXT1MouseEntered
        NewTXT1.setBackground(Color.cyan);
        NewTXT1.setForeground(Color.white);
    }//GEN-LAST:event_NewTXT1MouseEntered

    private void NewTXT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewTXT1MouseExited
        NewTXT1.setBackground(Color.white);
        NewTXT1.setForeground(Color.black);
    }//GEN-LAST:event_NewTXT1MouseExited

    private void OpenTXT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenTXT1MouseEntered
        OpenTXT1.setBackground(Color.cyan);
        OpenTXT1.setForeground(Color.white);
    }//GEN-LAST:event_OpenTXT1MouseEntered

    private void OpenTXT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenTXT1MouseExited
        OpenTXT1.setBackground(Color.white);
        OpenTXT1.setForeground(Color.black);
    }//GEN-LAST:event_OpenTXT1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Abrir;
    private javax.swing.JPanel CrearNuevo;
    private javax.swing.JPanel DFlujoBttn;
    private javax.swing.JLabel DFlujoImg;
    private javax.swing.JLabel DFlujoTXT;
    private javax.swing.JPanel DUMLBttn;
    private javax.swing.JLabel DUMLImg;
    private javax.swing.JLabel DUMLTXT;
    private javax.swing.JPanel HomeBttn;
    private javax.swing.JLabel HomeTXT1;
    private javax.swing.JLabel HomeTXT2;
    private javax.swing.JPanel Inicio;
    private javax.swing.JDialog JD_Flujo;
    private javax.swing.JDialog JD_UML;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JPanel NewBttn;
    private javax.swing.JLabel NewTXT1;
    private javax.swing.JLabel NewTXT2;
    private javax.swing.JPanel OpenBttn;
    private javax.swing.JLabel OpenTXT1;
    private javax.swing.JLabel OpenTXT2;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel sideMenu;
    // End of variables declaration//GEN-END:variables
}
