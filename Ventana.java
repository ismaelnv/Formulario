import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class Ventana<ActionEvent> extends JFrame {

    private JPanel panel,panel2;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,etiqueta6,etiqueta7,etiqueta8,etiqueta9,etiqueta10,etiqueta11,guardando;
    private JTextField texto,texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    private JButton boton;
    private JLabel nombre,apellido,sexo,edad,dirección,número,ciudad,provincia,códigoPostal,correo;
    
    public Ventana(){
        this.setSize(800, 700);//Establecemos el tamaño  de la ventana
        this.setVisible(true);//Hacemos visible  la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Cuando cierre mi ventana el programa termina
        this.setTitle("Formulario");// Para poner titulo 
        this.setLayout(null);
        this.setLocationRelativeTo(null);//Establecemos  la ventana en el centro
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarRadioBotones();
        colocarCajaDeTexto();
        colocarListasDespleables();
        etiquetasDeGuardado();
    } 
    
    
        
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);// Para desactivar el diseño
        panel.setSize(400,700);
        panel.setBackground(Color.DARK_GRAY);//Establecer el color del panel
        //panel.setLayout(new GridLayout(0,0));
        this.getContentPane().add(panel);//Agregar el panel a la venta

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(400,0,400, 700);
        panel2.setBackground(Color.DARK_GRAY);
        this.add(panel2,BorderLayout.EAST);  
    }

    private void colocarEtiquetas() {

        JLabel etiqueta =  new JLabel(" FORMULARIO DATOS PERSONALES ");//para crear etiqueta
        etiqueta.setOpaque(true);//Desactiva el diseño
        etiqueta.setBounds(20, 5, 370, 90);
        etiqueta.setFont(new Font("cooper black",3,18));//Cambiar diseño de letra y tamaño
        etiqueta.setForeground(Color.cyan);//color de letra
        etiqueta.setBackground(Color.DARK_GRAY);//Cambiamos el color del fondo de la etiqueta
        panel.add(etiqueta);//Para agregar la etiqueta al panel

        etiqueta1 = new JLabel("Nombre:");
        etiqueta1.setBounds(20, 65, 100, 70);
        etiqueta1.setFont(new Font("cooper black",3,11));
        etiqueta1.setForeground(Color.GREEN);
        panel.add(etiqueta1);
    
        etiqueta2 = new JLabel("Apellidos:");
        etiqueta2.setBounds(20, 120, 100, 70);
        etiqueta2.setFont(new Font("cooper black",3,11));
        etiqueta2.setForeground(Color.GREEN);
        panel.add(etiqueta2);
    
        etiqueta3 = new JLabel("sexo:");
        etiqueta3.setBounds(30, 175, 100, 70);
        etiqueta3.setFont(new Font("cooper blanck",3,11));
        etiqueta3.setForeground(Color.GREEN);
        panel.add(etiqueta3);
            
        etiqueta4 =  new JLabel("Edad:");
        etiqueta4.setBounds(210, 175, 100, 70);
        etiqueta4.setFont(new Font("Cooper blanck",3,11));
        etiqueta4.setForeground(Color.GREEN);
        panel.add(etiqueta4);
    
        etiqueta5 = new JLabel(" Dirección:");
        etiqueta5.setBounds(20 ,250 , 100, 70);
        etiqueta5.setFont(new Font("cooper blanck",3,11));
        etiqueta5.setForeground(Color.GREEN);
        panel.add(etiqueta5);
    
        etiqueta6 = new JLabel("Número:");
        etiqueta6.setBounds(20, 305, 100, 70);
        etiqueta6.setFont(new Font("cooper blanck",3,11));
        etiqueta6.setForeground(Color.GREEN);
        panel.add(etiqueta6);
    
        etiqueta7 =  new JLabel("ciudad:");
        etiqueta7.setBounds(20, 360, 100, 70);
        etiqueta7.setFont(new Font("cooper blanck",3,11));
        etiqueta7.setForeground(Color.GREEN);
        panel.add(etiqueta7);
    
        etiqueta8 = new JLabel("Provincia:");
        etiqueta8.setBounds(150, 360, 100, 70);
        etiqueta8.setFont(new Font("cooper blanck",3,11));
        etiqueta8.setForeground(Color.GREEN);
        panel.add(etiqueta8);
    
        etiqueta9 = new JLabel("Código Postal:");
        etiqueta9.setBounds(280, 360, 100, 70);
        etiqueta9.setFont(new Font("cooper blanck",3,11));
        etiqueta9.setForeground(Color.GREEN);
        panel.add(etiqueta9);
    
        etiqueta10 =  new JLabel("Correo electrónico (uso frecuente):");
        etiqueta10.setBounds(20, 450, 250, 70);
        etiqueta10.setFont(new Font("cooper blanck",3,11));
        etiqueta10.setForeground(Color.GREEN);
        panel.add(etiqueta10);

        guardando = new JLabel();
        guardando.setBounds(20, 5, 400, 70);
        guardando.setFont(new Font("cooper blanck",3,20));
        guardando.setForeground(Color.MAGENTA);
        panel2.add(guardando);

        etiqueta11 = new JLabel();
        etiqueta11.setBounds(20,385, 400, 70);
        etiqueta11.setFont(new Font("cooper blanck",3,20));
        etiqueta11.setForeground(Color.MAGENTA);
        panel2.add(etiqueta11);
        
        ImageIcon itadori = new ImageIcon("like.jpg");

        JLabel sucuna = new JLabel();
        sucuna.setBackground(Color.BLACK);
        sucuna.setBounds(45, 80, 300, 300);
        sucuna.setIcon(new ImageIcon(itadori.getImage().getScaledInstance(300, 300,Image.SCALE_SMOOTH)));
        panel2.add(sucuna);
    }

    private void colocarBotones(){

        boton =  new JButton();
        boton.setText("GUARDAR");//porner texto en el boton
        boton.setBounds(95,560, 200 , 70);
        boton.setForeground(Color.white);
        boton.setFont(new Font("cooper black",3,18));
        boton.setBackground(Color.GREEN);
        panel.add( boton);

        ActionListener oyenteDeAccion = new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                guardando.setText("GUARDANDO DATOS...");
                etiqueta11.setText("DATOS GUARDADOS:");
                nombre.setText("NOMBRE: "+texto.getText()); 
                apellido.setText("APELLIDOS: "+texto1.getText());
                sexo.setText("SEXO: ");
                edad.setText("EDAD: "+texto2.getText());
                dirección.setText("DIRECCIÓN: "+texto3.getText());
                número.setText("NÙMERO: "+texto6.getText());
                ciudad.setText("CIUDAD: "+texto4.getText());
                provincia.setText("PROVINCIA: ");
                códigoPostal.setText("CÓDIGO POSTAL: "+texto7.getText());
                correo.setText("CORREO: "+texto5.getText());
            }
        };

        boton.addActionListener(oyenteDeAccion);
    }

  
    private void colocarRadioBotones(){

        JRadioButton radioButton = new JRadioButton("Masculino");//Creando un radio boton 
        radioButton.setBounds(10, 230, 100, 10);
        radioButton.setBackground(Color.DARK_GRAY);
        radioButton.setForeground(Color.orange);
        panel.add(radioButton);

        JRadioButton radioButton2 = new JRadioButton("Femenino");
        radioButton2.setBounds(10,245, 100, 10);
        radioButton2.setBackground(Color.DARK_GRAY);
        radioButton2.setForeground(Color.orange);
        panel.add(radioButton2);

        ButtonGroup grupoRadioBotones = new ButtonGroup();//Grupo de radio botones 
        grupoRadioBotones.add(radioButton);
        grupoRadioBotones.add(radioButton2);
    }

    private void colocarCajaDeTexto(){
        
        texto = new JTextField();//Nombre
        texto.setBounds(20, 110, 200, 20);
        texto.setBackground(Color.LIGHT_GRAY);
        texto.setFont(new Font("cooper black",3,11));
        texto.setForeground(Color.black);
        panel.add(texto);

        texto1 = new JTextField();//Apellido
        texto1.setBounds(20, 165, 200, 20);
        texto1.setBackground(Color.LIGHT_GRAY);
        texto1.setFont(new Font("cooper black",3,11));
        texto1.setForeground(Color.black);
        panel.add(texto1);

        texto2 = new JTextField();//edad
        texto2.setBounds(210, 220,100 , 20);
        texto2.setBackground(Color.LIGHT_GRAY);
        texto2.setFont(new Font("cooper black",3,11));
        texto2.setForeground(Color.black);
        panel.add(texto2);

        texto3 = new JTextField();//Dirección
        texto3.setBounds(20, 295, 200, 20);
        texto3.setBackground(Color.LIGHT_GRAY);
        texto3.setFont(new Font("cooper black",3,11));
        texto3.setForeground(Color.black);
        panel.add(texto3);

        texto4 =  new JTextField();//ciudad
        texto4.setBounds(20, 405, 90, 20);
        texto4.setBackground(Color.LIGHT_GRAY);
        texto4.setFont(new Font("cooper black",3,11));
        texto4.setForeground(Color.black);
        panel.add(texto4);

        texto5 = new JTextField();//Correo
        texto5.setBounds(20, 500,250, 22);
        texto5.setBackground(Color.LIGHT_GRAY);
        texto5.setFont(new Font("cooper black",3,11));
        texto5.setForeground(Color.black);
        panel.add(texto5);

        texto6 = new JTextField();//Número
        texto6.setBounds(20, 350, 100, 20);
        texto6.setBackground(Color.LIGHT_GRAY);
        texto6.setFont(new Font("cooper black",3,11));
        texto6.setForeground(Color.black);
        panel.add(texto6);

        texto7 = new JTextField();//Código postal
        texto7.setBounds(280, 405, 90, 20);
        texto7.setBackground(Color.LIGHT_GRAY);
        texto7.setFont(new Font("cooper black",3,11));
        texto7.setForeground(Color.black);
        panel.add(texto7);

        
    }

    private void colocarListasDespleables(){

        String [] provincias = {"lima","Amazonas","Áncash","Apurimaca","Arequipa","Ayacucho","Cajamarca",
        "Callao","Cuzco","Huancavelica","Huánuco","Ica","Junin","La libertad","Lanbayaque","Loreto","Madre de dios",
        "Moquegua","Pasco","Piura","Puno","San Martín","Tacna","Tumbes","Ucayali"};
        
        JComboBox lista = new JComboBox<>(provincias); //creando una lista desplegable
        lista.setBounds(150, 405, 90, 20);
        lista.setBackground(Color.LIGHT_GRAY);
        lista.setFont(new Font("cooper black",3,11));
        lista.setForeground(Color.black);
        //lista.addItem("pelota");//Para agregar elementos a la lista
        panel.add(lista);
    }
    private void  etiquetasDeGuardado(){

        nombre =  new JLabel();
        nombre.setBounds(20, 420,400, 70);
        nombre.setFont(new Font("cooper blanck",3,11));
        nombre.setForeground(Color.orange);
        panel2.add(nombre);

        apellido = new JLabel();
        apellido.setBounds(20, 440, 400, 70);
        apellido.setFont(new Font ("cooper blanck",3,11));
        apellido.setForeground(Color.orange);
        panel2.add(apellido);

        sexo = new JLabel();
        sexo.setBounds(20, 460, 400, 70);
        sexo.setFont(new Font("cooper black",3,11));
        sexo.setForeground(Color.orange);
        panel2.add(sexo); 

        edad = new JLabel();
        edad.setBounds(20, 480, 400, 70);
        edad.setFont(new Font("cooper black",3,11));
        edad.setForeground(Color.orange);
        panel2.add(edad);

        dirección = new JLabel();
        dirección.setBounds(20 , 500, 400,70);
        dirección.setFont(new Font("cooper black",3,11));
        dirección.setForeground(Color.orange);
        panel2.add(dirección);

        número = new JLabel();
        número.setBounds(20, 520, 400, 70);
        número.setFont(new Font("cooper black",3,11));
        número.setForeground(Color.orange);
        panel2.add(número);

        ciudad = new JLabel();
        ciudad.setBounds(20, 540, 400,70);
        ciudad.setFont(new Font("cooper black",3,11));
        ciudad.setForeground(Color.orange);
        panel2.add(ciudad);

        provincia = new JLabel();
        provincia.setBounds(20, 560, 400, 70);
        provincia.setFont(new Font("cooper black",3,11));
        provincia.setForeground(Color.orange);
        panel2.add(provincia);

        códigoPostal = new JLabel();//  códigoPostal 
        códigoPostal.setBounds(20, 580, 400, 70);
        códigoPostal.setFont(new Font("cooper black",3,11));
        códigoPostal.setForeground(Color.orange);
        panel2.add(códigoPostal);

        correo = new JLabel();//correo
        correo.setBounds(20, 600, 400, 70);
        correo.setFont(new Font("cooper black",3,11));
        correo.setForeground(Color.orange);
        panel2.add(correo);
    }
}

    

    

    

    







     

   

    
        
        


    

    
    

