package br.edu.infnet.visao;
import br.edu.infnet.valida.FornecedorInvalidoException;
import br.edu.infnet.modelo.Fornecedor;
import br.edu.infnet.modelo.Produto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.edu.infnet.repository.FornecedorRepository;
import br.edu.infnet.repository.ProdutoRepository;
import br.edu.infnet.valida.ProdutoInvalidoException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JFileChooser;

@Component
public class Janela extends javax.swing.JFrame {

    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbaApresentação = new javax.swing.JTabbedPane();
        Apresentacao = new javax.swing.JPanel();
        ClienteNome = new javax.swing.JLabel();
        campoClienteNome = new javax.swing.JTextField();
        go = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        abaCadastroFornecedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JTextField();
        contatoFornecedor = new javax.swing.JTextField();
        botaoSalvarFornecedor = new javax.swing.JButton();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        abaCadastroProduto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoCadastrarNome = new javax.swing.JTextField();
        campoCadastrarPreco = new javax.swing.JTextField();
        botaoSalvarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboCadastroFornecedor = new javax.swing.JComboBox<>();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        abaBuscar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoBusca = new javax.swing.JTextField();
        painelResultados = new javax.swing.JScrollPane();
        botaoBuscar = new javax.swing.JButton();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        abaExibir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoEditarId = new javax.swing.JTextField();
        campoEditarNome = new javax.swing.JTextField();
        campoEditarPreco = new javax.swing.JTextField();
        comboEditarFornecedor = new javax.swing.JComboBox<>();
        botaoEditarProduto = new javax.swing.JButton();
        botaoRemoverProduto = new javax.swing.JButton();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        abaExportar = new javax.swing.JPanel();
        botaoExportarProduto = new javax.swing.JButton();
        botaoExportarFornecedor = new javax.swing.JButton();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AbaApresentação.setBackground(java.awt.SystemColor.activeCaption);
        AbaApresentação.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        AbaApresentação.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbaApresentaçãoMouseClicked(evt);
            }
        });

        Apresentacao.setBackground(java.awt.SystemColor.activeCaption);
        Apresentacao.setToolTipText("");

        ClienteNome.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ClienteNome.setForeground(new java.awt.Color(255, 255, 255));
        ClienteNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClienteNome.setText("Digite seu nome:");

        campoClienteNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClienteNomeActionPerformed(evt);
            }
        });

        go.setBackground(java.awt.Color.red);
        go.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        go.setForeground(new java.awt.Color(255, 255, 255));
        go.setLabel("GO!");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 0));
        label1.setText("//");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        label2.setForeground(java.awt.Color.white);
        label2.setText("ASSESSMENT");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label3.setForeground(java.awt.Color.white);
        label3.setText("Programa para Registro de Fornecedores e Produtos");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        label4.setForeground(java.awt.Color.white);
        label4.setText("EMPRESA ACME");

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 0));
        label5.setText("****************************************************");

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setText("Programa desenvolvido por Daniel Farias");

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label17.setText("Assessment de Fundamentos JAVA");

        javax.swing.GroupLayout ApresentacaoLayout = new javax.swing.GroupLayout(Apresentacao);
        Apresentacao.setLayout(ApresentacaoLayout);
        ApresentacaoLayout.setHorizontalGroup(
            ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApresentacaoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(go, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoClienteNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ApresentacaoLayout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        ApresentacaoLayout.setVerticalGroup(
            ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApresentacaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ApresentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(ClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoClienteNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(79, 79, 79)
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        label2.getAccessibleContext().setAccessibleParent(AbaApresentação);
        label3.getAccessibleContext().setAccessibleParent(AbaApresentação);
        label4.getAccessibleContext().setAccessibleParent(AbaApresentação);
        label5.getAccessibleContext().setAccessibleParent(AbaApresentação);

        AbaApresentação.addTab("ACME", Apresentacao);

        abaCadastroFornecedor.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Telefone de contato:");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome:");

        nomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFornecedorActionPerformed(evt);
            }
        });

        contatoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contatoFornecedorActionPerformed(evt);
            }
        });

        botaoSalvarFornecedor.setBackground(java.awt.SystemColor.textHighlight);
        botaoSalvarFornecedor.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        botaoSalvarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarFornecedor.setText("Salvar");
        botaoSalvarFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        botaoSalvarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarFornecedorActionPerformed(evt);
            }
        });

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        label6.setForeground(java.awt.Color.white);
        label6.setText("Cadastro de Fornecedores");

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 0));
        label7.setText("**********************************");

        javax.swing.GroupLayout abaCadastroFornecedorLayout = new javax.swing.GroupLayout(abaCadastroFornecedor);
        abaCadastroFornecedor.setLayout(abaCadastroFornecedorLayout);
        abaCadastroFornecedorLayout.setHorizontalGroup(
            abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeFornecedor)
                    .addComponent(contatoFornecedor)
                    .addComponent(botaoSalvarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(138, 138, 138))
        );
        abaCadastroFornecedorLayout.setVerticalGroup(
            abaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contatoFornecedor)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );

        nomeFornecedor.getAccessibleContext().setAccessibleDescription("");
        botaoSalvarFornecedor.getAccessibleContext().setAccessibleDescription("");

        AbaApresentação.addTab("Cadastro Fornecedor", abaCadastroFornecedor);

        abaCadastroProduto.setBackground(java.awt.SystemColor.activeCaption);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preço:");

        campoCadastrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastrarNomeActionPerformed(evt);
            }
        });

        botaoSalvarProduto.setBackground(java.awt.SystemColor.textHighlight);
        botaoSalvarProduto.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        botaoSalvarProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarProduto.setText("Salvar");
        botaoSalvarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, null));
        botaoSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fornecedor:");

        comboCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCadastroFornecedorActionPerformed(evt);
            }
        });

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        label8.setForeground(java.awt.Color.white);
        label8.setText("Cadastro de Produtos");

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 0));
        label9.setText("****************************");

        javax.swing.GroupLayout abaCadastroProdutoLayout = new javax.swing.GroupLayout(abaCadastroProduto);
        abaCadastroProduto.setLayout(abaCadastroProdutoLayout);
        abaCadastroProdutoLayout.setHorizontalGroup(
            abaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastroProdutoLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(abaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCadastrarNome)
                    .addComponent(campoCadastrarPreco)
                    .addComponent(botaoSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGroup(abaCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCadastroFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(168, 168, 168))
        );
        abaCadastroProdutoLayout.setVerticalGroup(
            abaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCadastrarNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCadastrarPreco)
                .addGap(18, 18, 18)
                .addGroup(abaCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCadastroFornecedor)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(botaoSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(132, 132, 132))
        );

        AbaApresentação.addTab("Cadastro Produto", abaCadastroProduto);
        abaCadastroProduto.getAccessibleContext().setAccessibleParent(abaCadastroProduto);

        abaBuscar.setBackground(java.awt.SystemColor.activeCaption);
        abaBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                abaBuscarFocusGained(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Busca:");

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });

        botaoBuscar.setBackground(java.awt.SystemColor.textHighlight);
        botaoBuscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        botaoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        label10.setForeground(java.awt.Color.white);
        label10.setText("Busca de Produtos");

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 0));
        label11.setText("************************");

        javax.swing.GroupLayout abaBuscarLayout = new javax.swing.GroupLayout(abaBuscar);
        abaBuscar.setLayout(abaBuscarLayout);
        abaBuscarLayout.setHorizontalGroup(
            abaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaBuscarLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(abaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(painelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        abaBuscarLayout.setVerticalGroup(
            abaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        AbaApresentação.addTab("Buscar Produto", abaBuscar);

        abaExibir.setBackground(java.awt.SystemColor.activeCaption);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preço:");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fornecedor:");

        campoEditarId.setEditable(false);

        campoEditarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEditarNomeActionPerformed(evt);
            }
        });

        comboEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditarFornecedorActionPerformed(evt);
            }
        });

        botaoEditarProduto.setBackground(java.awt.SystemColor.textHighlight);
        botaoEditarProduto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botaoEditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarProduto.setText("Editar");
        botaoEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarProdutoActionPerformed(evt);
            }
        });

        botaoRemoverProduto.setBackground(java.awt.SystemColor.textHighlight);
        botaoRemoverProduto.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        botaoRemoverProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverProduto.setText("Remover");
        botaoRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverProdutoActionPerformed(evt);
            }
        });

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        label12.setForeground(java.awt.Color.white);
        label12.setText("Editar / Remover");

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 0));
        label13.setText("**********************");

        javax.swing.GroupLayout abaExibirLayout = new javax.swing.GroupLayout(abaExibir);
        abaExibir.setLayout(abaExibirLayout);
        abaExibirLayout.setHorizontalGroup(
            abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaExibirLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(abaExibirLayout.createSequentialGroup()
                        .addComponent(botaoEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(botaoRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(abaExibirLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(campoEditarId, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(abaExibirLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(campoEditarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addGroup(abaExibirLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(campoEditarPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addGroup(abaExibirLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(comboEditarFornecedor, 0, 315, Short.MAX_VALUE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        abaExibirLayout.setVerticalGroup(
            abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaExibirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoEditarId))
                .addGap(18, 18, 18)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoEditarNome))
                .addGap(21, 21, 21)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoEditarPreco))
                .addGap(18, 18, 18)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboEditarFornecedor))
                .addGap(18, 18, 18)
                .addGroup(abaExibirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(botaoEditarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );

        AbaApresentação.addTab("Exibir Produto", abaExibir);
        abaExibir.getAccessibleContext().setAccessibleParent(abaExibir);

        abaExportar.setBackground(java.awt.SystemColor.activeCaption);

        botaoExportarProduto.setBackground(java.awt.SystemColor.textHighlight);
        botaoExportarProduto.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        botaoExportarProduto.setForeground(new java.awt.Color(255, 255, 255));
        botaoExportarProduto.setText("Exportar Produto");
        botaoExportarProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        botaoExportarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExportarProdutoActionPerformed(evt);
            }
        });

        botaoExportarFornecedor.setBackground(java.awt.SystemColor.textHighlight);
        botaoExportarFornecedor.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        botaoExportarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        botaoExportarFornecedor.setText("Exportar Fornecedor");
        botaoExportarFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        botaoExportarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExportarFornecedorActionPerformed(evt);
            }
        });

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        label14.setForeground(java.awt.Color.white);
        label14.setText("Exportar Fornecedor / Produto");

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 0));
        label15.setText("***************************************");

        javax.swing.GroupLayout abaExportarLayout = new javax.swing.GroupLayout(abaExportar);
        abaExportar.setLayout(abaExportarLayout);
        abaExportarLayout.setHorizontalGroup(
            abaExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaExportarLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(abaExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoExportarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExportarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );
        abaExportarLayout.setVerticalGroup(
            abaExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaExportarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addComponent(botaoExportarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoExportarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(159, 159, 159))
        );

        AbaApresentação.addTab("Exportar", abaExportar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AbaApresentação)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(AbaApresentação, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbaApresentaçãoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AbaApresentaçãoMouseClicked
        Iterable<Fornecedor> fornecedores = fornecedorRepository.findAll();
        comboCadastroFornecedor.removeAllItems();
        for (Fornecedor fornecedor : fornecedores) {
            comboCadastroFornecedor.addItem(fornecedor);
        }
    }//GEN-LAST:event_AbaApresentaçãoMouseClicked

    private void botaoRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverProdutoActionPerformed
        Integer id = Integer.parseInt(campoEditarId.getText());
        produtoRepository.deleteById(id);
        AbaApresentação.setSelectedComponent(abaBuscar);
        JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto foi deletado com Sucesso!");
    }//GEN-LAST:event_botaoRemoverProdutoActionPerformed

    private void botaoEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarProdutoActionPerformed

        Integer id = Integer.parseInt(campoEditarId.getText());
        String nome = campoEditarNome.getText();
        String preco = campoEditarPreco.getText();
        String precoSemvirgula = preco.replaceAll("\\,", ".");

        try {
            Fornecedor fornecedor = (Fornecedor) comboEditarFornecedor.getSelectedItem();
            Double precoDouble = Double.parseDouble(precoSemvirgula);

            if (precoDouble > 0) {
                String precoStr = Double.toString(precoDouble);
                validaProduto(nome, precoStr, fornecedor);
                Produto produto = new Produto(nome, precoStr, fornecedor);
                produto.setId(id);
                produtoRepository.save(produto);
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto foi Atualizado com Sucesso!");
                AbaApresentação.setSelectedComponent(abaBuscar);
            } else {
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Preço está inválido. O valor deve ser MAIOR que ZERO!");
            }
        } catch (NumberFormatException | InputMismatchException ne) {
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto está inválido");
        } catch (ProdutoInvalidoException pe) {
            Fornecedor fornecedor = (Fornecedor) comboEditarFornecedor.getSelectedItem();
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto está inválido.");
        }
    }//GEN-LAST:event_botaoEditarProdutoActionPerformed

    private void comboEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditarFornecedorActionPerformed

    private void campoEditarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEditarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEditarNomeActionPerformed

    public void validaProduto(String nome, String preco, Fornecedor fornecedor) throws ProdutoInvalidoException {

        if (nome == null || fornecedor == null || preco == null) {
            ProdutoInvalidoException produtoInvalidoException = new ProdutoInvalidoException();
            throw produtoInvalidoException;
        }

        if (nome.trim().length() < 3) {
            ProdutoInvalidoException produtoInvalidoException = new ProdutoInvalidoException();
            throw produtoInvalidoException;
        }
    }


    private void botaoSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarProdutoActionPerformed

        String nome = campoCadastrarNome.getText();
        String preco = campoCadastrarPreco.getText();
        String precoSemvirgula = preco.replaceAll("\\,", ".");

        try {
            Fornecedor fornecedor = (Fornecedor) comboCadastroFornecedor.getSelectedItem();
            Double precoDouble = Double.parseDouble(precoSemvirgula);
            if (precoDouble > 0) {
                String precoStr = Double.toString(precoDouble);
                validaProduto(nome, precoStr, fornecedor);
                Produto produto = new Produto(nome, precoStr, fornecedor);
                produtoRepository.save(produto);
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto foi Salvo com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Preço está inválido. O valor deve ser MAIOR que ZERO!");
            }
        } catch (ProdutoInvalidoException pe) {
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Produto está inválido.");
        } catch (NumberFormatException | InputMismatchException ne) {
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Preço está inválido.");
        }

        campoCadastrarNome.setText("");
        campoCadastrarPreco.setText("");
    }//GEN-LAST:event_botaoSalvarProdutoActionPerformed

    private void campoCadastrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastrarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadastrarNomeActionPerformed

    public void validaFornecedor(String nome, String contato) throws FornecedorInvalidoException {

        if (nome == null || contato == null) {
            FornecedorInvalidoException fornecedorInvalidoException = new FornecedorInvalidoException();
            throw fornecedorInvalidoException;
        }

        if (nome.trim().length() < 3 || contato.trim().length() < 3) {
            FornecedorInvalidoException fornecedorInvalidoException = new FornecedorInvalidoException();
            throw fornecedorInvalidoException;
        }
    }

    private void botaoExportarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExportarProdutoActionPerformed
        Iterable<Produto> produtos = produtoRepository.findAll(); //Pega os Funcionarios do Banco de Dados e põe em uma Lista

        try {
            JFileChooser fileChooser = new JFileChooser(); //Cria uma Janela para escolher em qual pasta eu vou salvar meu arquivo
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Significa que eu só posso selecionar diretório, não vou poder selecionar arquivo
            fileChooser.showSaveDialog(null); //Vai exibir uma janela, ela  é null pois não tem componente Pai, ele vai aparecer na tela, não dentro de um outro componente
            File file = new File(fileChooser.getSelectedFile(), "produtos.csv"); //Instancia um Objeto do tipo "File" pegando a pasta que eu escolhi no "fileChooser" e passo o nome do arquivo, o File tem 2 parametros, eu sempre vou poder passar  pasta PAI e o nome do arquivo
            System.out.println(file.getAbsolutePath()); //Aqui, vai escrever onde o arquivo foi salvo
            FileWriter fileWriter = new FileWriter(file, false); //Crio um FileWriter e passo meu arquivo como parametro, e false para que toda vida crie um novo arquivo, vai deletar e apagar sempre que salvar um novo arquivo
            StringBuilder builder = new StringBuilder(); //Instancio um StringBuilder
            for (Produto produto : produtos) {
                builder.append(produto.getId());
                builder.append(";");
                builder.append(produto.getNome());
                builder.append(";");
                builder.append(produto.getPreço());
                builder.append("\n");
            }
            String texto = builder.toString(); //concatena toda o "builder" com o "toString'''
            fileWriter.append(texto); //coloco o texto no meu arquivo
            fileWriter.flush(); //escreve tudo que esta em memoria no arquivo
            fileWriter.close(); //fecho o arquivo
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", os Produtos foram Exportados com Sucesso!");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoExportarProdutoActionPerformed

    private void botaoExportarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExportarFornecedorActionPerformed
        Iterable<Fornecedor> fornecedores = fornecedorRepository.findAll();

        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.showSaveDialog(null);
            File file = new File(fileChooser.getSelectedFile(), "fornecedores.csv");
            System.out.println(file.getAbsolutePath());
            FileWriter fileWriter = new FileWriter(file, false);
            StringBuilder builder = new StringBuilder();
            for (Fornecedor fornecedor : fornecedores) {
                builder.append(fornecedor.getId());
                builder.append(";");
                builder.append(fornecedor.getNome());
                builder.append(";");
                builder.append(fornecedor.getContato());
                builder.append("\n");
            }
            String texto = builder.toString();
            fileWriter.append(texto);
            fileWriter.flush();
            fileWriter.close();
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", os Fornecedores foram Exportados com Sucesso!");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoExportarFornecedorActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
       StringBuilder strBuilder = new StringBuilder();
       String nome = campoClienteNome.getText();
       String[] nomeCompleto = nome.split("\\n");
       
       for(int i = 0; i < nomeCompleto.length; i++ ) {
           strBuilder.append(nomeCompleto[i]).append(" ");
       }
        
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        DateFormat formatoData = DateFormat.getDateInstance(DateFormat.FULL);
        String d = formatoData.format(date);
        
        JOptionPane.showMessageDialog(null, strBuilder.toString() + ", Bem vindo ao programa da Empresa ACME!");
        JOptionPane.showMessageDialog(null, "A Data de hoje é: " + d);
        AbaApresentação.setSelectedComponent(abaCadastroFornecedor);
    }//GEN-LAST:event_goActionPerformed

    private void campoClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClienteNomeActionPerformed

    private void botaoSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarFornecedorActionPerformed

        String nome = nomeFornecedor.getText();
        String contato = contatoFornecedor.getText();

        try {
            Integer contatoInt = Integer.parseInt(contato);
            if (contatoInt > 0) {
                String contatoStr = Integer.toString(contatoInt);
                validaFornecedor(nome, contatoStr);
                Fornecedor fornecedor = new Fornecedor(nome, contatoStr);
                fornecedorRepository.save(fornecedor);
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Fornecedor foi Salvo com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Número de contato é inválido. Tente um número de telefone válido.");
            }
        } catch (FornecedorInvalidoException ex) {
            JOptionPane.showMessageDialog(null, campoClienteNome.getText()+ ", o Fornecedor é inválido.");
        } catch (NumberFormatException | InputMismatchException ne) {
            JOptionPane.showMessageDialog(null, campoClienteNome.getText() + ", o Número de contato é inválido. Tente um número de telefone válido.");
        }

        nomeFornecedor.setText("");
        contatoFornecedor.setText("");
    }//GEN-LAST:event_botaoSalvarFornecedorActionPerformed

    private void contatoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contatoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contatoFornecedorActionPerformed

    private void nomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorActionPerformed

    private void abaBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_abaBuscarFocusGained

    }//GEN-LAST:event_abaBuscarFocusGained

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed

        String nome = campoBusca.getText();
        List<Produto> produtosList = produtoRepository.findByNomeIgnoreCaseContaining(nome);
        JList jList = new JList();
        DefaultListModel<Produto> listModel = new DefaultListModel();

        for (Produto produto : produtosList) {
            listModel.addElement(produto);
        }

        jList.setModel(listModel);
        painelResultados.setViewportView(jList);
        painelResultados.setVisible(true);

        jList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Produto p = (Produto) jList.getSelectedValue();
                campoEditarId.setText(p.getId() + "");
                campoEditarPreco.setText(p.getPreço());
                campoEditarNome.setText(p.getNome() + "");
                Iterable<Fornecedor> fornecedores = fornecedorRepository.findAll();
                comboEditarFornecedor.removeAllItems();

                for (Fornecedor fornecedor : fornecedores) {
                    comboEditarFornecedor.addItem(fornecedor);
                    if (fornecedor.getId().equals(p.getFornecedor().getId())) {
                        comboEditarFornecedor.setSelectedItem(fornecedor);
                    }
                }
                AbaApresentação.setSelectedComponent(abaExibir);
                listModel.clear();
            }
        });
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void comboCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCadastroFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCadastroFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AbaApresentação;
    private javax.swing.JPanel Apresentacao;
    private javax.swing.JLabel ClienteNome;
    private javax.swing.JPanel abaBuscar;
    private javax.swing.JPanel abaCadastroFornecedor;
    private javax.swing.JPanel abaCadastroProduto;
    private javax.swing.JPanel abaExibir;
    private javax.swing.JPanel abaExportar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoEditarProduto;
    private javax.swing.JButton botaoExportarFornecedor;
    private javax.swing.JButton botaoExportarProduto;
    private javax.swing.JButton botaoRemoverProduto;
    private javax.swing.JButton botaoSalvarFornecedor;
    private javax.swing.JButton botaoSalvarProduto;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JTextField campoCadastrarNome;
    private javax.swing.JTextField campoCadastrarPreco;
    private javax.swing.JTextField campoClienteNome;
    private javax.swing.JTextField campoEditarId;
    private javax.swing.JTextField campoEditarNome;
    private javax.swing.JTextField campoEditarPreco;
    private javax.swing.JComboBox<Fornecedor> comboCadastroFornecedor;
    private javax.swing.JComboBox<br.edu.infnet.modelo.Fornecedor> comboEditarFornecedor;
    private javax.swing.JTextField contatoFornecedor;
    private java.awt.Button go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JScrollPane painelResultados;
    // End of variables declaration//GEN-END:variables
}
