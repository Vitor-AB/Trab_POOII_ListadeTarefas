import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    private JLabel labelcaixa;

    private JButton tarefaButton;

    private JCheckBox Tarefa;
    private JCheckBox Tarefa1;
    private JCheckBox Tarefa2;
    private JCheckBox Tarefa3;

    public Janela(){
        JFrame frame = new JFrame();
        setLayout(null);
        setResizable(false);
        setTitle("Tarefas");
        setSize(345,330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel painel = new JPanel();
        //painel.setBackground(Color.CYAN);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER,60,10));
        painel.setBounds(0,0,345,50);

        labelcaixa = new JLabel("Caixa de entrada");

        tarefaButton = new JButton("Nova Tarefa");

        JPanel painel2 = new JPanel();
        //painel2.setBackground(Color.GREEN);
        painel2.setBounds(0,50,345,280);
        painel2.setLayout(new BoxLayout(painel2,BoxLayout.PAGE_AXIS));

        Tarefa = new JCheckBox("Comprar Carvão");
        Tarefa.setFocusable(false);
        Tarefa.setAlignmentX(Component.CENTER_ALIGNMENT);

        Tarefa1 = new JCheckBox("Comprar Carvão");
        Tarefa1.setFocusable(false);
        Tarefa1.setAlignmentX(Component.CENTER_ALIGNMENT);

        Tarefa2 = new JCheckBox("Comprar Carvão");
        Tarefa2.setFocusable(false);
        Tarefa2.setAlignmentX(Component.CENTER_ALIGNMENT);

        Tarefa3 = new JCheckBox("Comprar Carvão");
        Tarefa3.setFocusable(false);
        Tarefa3.setAlignmentX(Component.CENTER_ALIGNMENT);


        painel.add(labelcaixa);
        painel.add(tarefaButton);
        painel2.add(Box.createRigidArea(new Dimension(10,10)));
        painel2.add(Tarefa);
        painel2.add(Box.createRigidArea(new Dimension(10,10)));
        painel2.add(Tarefa1);
        painel2.add(Box.createRigidArea(new Dimension(10,10)));
        painel2.add(Tarefa2);
        painel2.add(Box.createRigidArea(new Dimension(10,10)));
        painel2.add(Tarefa3);


        add(painel);
        add(painel2);
    }
}
