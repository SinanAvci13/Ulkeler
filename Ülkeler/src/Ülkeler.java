import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class Ülkeler {

	protected static final char[][] KıtalarVeÜlkeler = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ülkeler window = new Ülkeler();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ülkeler() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 128, 128));
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(new Color(0, 102, 153));
		frame.setBounds(100, 100, 860, 749);
		frame.setSize(1240, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("İran");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İran'ın Başkenti: Tahran\nNüfusu: 80.000.000\nPara Birimi: İran Riyali\nAlanı: 1.648.000km²");
			}
		});
		btnNewButton.setBounds(0, 125, 93, 29);
		frame.getContentPane().add(btnNewButton);

		JTextArea txtrAvrupalkeleri = new JTextArea();
		txtrAvrupalkeleri.setForeground(Color.RED);
		txtrAvrupalkeleri.setBackground(new Color(0, 255, 204));
		txtrAvrupalkeleri.setText("   Orta Doğu");
		txtrAvrupalkeleri.setBounds(6, 6, 87, 16);
		frame.getContentPane().add(txtrAvrupalkeleri);

		JButton btnBahreyn = new JButton("Bahreyn");
		btnBahreyn.setForeground(Color.BLACK);
		btnBahreyn.setBackground(new Color(0, 206, 209));
		btnBahreyn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(null,"Bahrey'nin Başkenti: Manama\n Bahrey'nin Nüfusu: 727.785\n Bahrey'nin Para Birimi: Bahreyn Dinarı\n Bahrey'nin Alanı: 665km²");

			}
		});
		btnBahreyn.setBounds(0, 22, 93, 29);
		frame.getContentPane().add(btnBahreyn);

		JButton btnFilistin = new JButton("Suriye");
		btnFilistin.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnFilistin.setBackground(Color.pink);
		btnFilistin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Suriye'nin Bakşkenti: Şam\n Suriye'nin Nüfusu: 20.178.485\n Suriye'nin Para Birimi: Suriye Lirası\n Suriye'nin Alanı: 185.180km²");
			}
		});
		btnFilistin.setBounds(0, 304, 93, 29);
		frame.getContentPane().add(btnFilistin);

		JButton btnIrak = new JButton("Birleşik Arap Emirlikleri");
		btnIrak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Birleşik Arap Emirlikleri'nin Başkenti: Abu Dabi\n Birleşik Arap Emirlikleri'nin Nüfusu: 4.798.491\n Birleşik Arap Emirlikleri'nin Para Birimi: Birleşik Arap Emirlikleri dirhemi\n Birleşik Arap Emirlikleri'nin Alanı: 83.600km²");

			}
		});
		btnIrak.setBounds(0, 47, 93, 29);
		frame.getContentPane().add(btnIrak);

		JButton btnKbrs = new JButton("Kıbrıs");
		btnKbrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kıbrıs'ın Başkenti: Lefkoşa\nKıbrıs'ın Nüfusu: 771.857\nKıbrıs'ın Para Birimi: Euro\nKıbrıs'ın Alanı: 9.250km²");

			}
		});
		btnKbrs.setBounds(0, 202, 93, 29);
		frame.getContentPane().add(btnKbrs);

		JButton btnKatar = new JButton("Katar");
		btnKatar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Katar'ın Başkenti: Doha\nKatar'ın Nüfusu: 833.285 Para\nKatar'ın Birimi: Katar Riyali\nKatar'ın Alanı: 11.437km²");

			}
		});
		btnKatar.setBounds(0, 177, 93, 29);
		frame.getContentPane().add(btnKatar);

		JButton button_2 = new JButton("Filistin");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Filisti'nin Başkenti: Doğu Kudüs\nFilisti'nin Nüfusu: 4.013.126\nFilisti'nin Para Birimleri: Yeni İsrail şekeli, Ürdün dinarı, Mısır lirası\nFilisti'nin Alanı: 6.220km²");

			}
		});
		button_2.setBounds(0, 73, 93, 29);
		frame.getContentPane().add(button_2);

		JButton btnLbnan = new JButton("Lübnan");
		btnLbnan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lübnan'ın Başkenti: Beyrut\nLübnan'ın Nüfusu: 4.017.095\nLübnan'ın Para birimi: Lübnan Lirası\nLübnan'ın Alanı: 10.400km²");

			}
		});
		btnLbnan.setBounds(0, 254, 93, 29);
		frame.getContentPane().add(btnLbnan);

		JButton btnKuveyt = new JButton("Kuveyt");
		btnKuveyt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kuveyt'in Başkenti: Kuvet\nKuveyt'in Nüfusu: 2.691.158\nKuveyt'in Para Birimi: Kuveyt Dinarı\nKuveyt'in Alanı: 17.820km²");

			}
		});
		btnKuveyt.setBounds(0, 228, 93, 29);
		frame.getContentPane().add(btnKuveyt);

		JButton btnMsr = new JButton("Mısır");
		btnMsr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mısır'ın Başkenti: Kahire\nMısır'ın Nüfusu: 83.082.869\nMısır'ın Para Birimi: Mısır Lİrası\nMısır'ın Alanı: 1.001.450km²");

			}
		});
		btnMsr.setBounds(0, 279, 93, 29);
		frame.getContentPane().add(btnMsr);

		JButton btnIsrail = new JButton("İsrail");
		btnIsrail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İsrail'in Başkenti: Tel Aviv\nİsrail'in Nüfusu: 7.233.701\nİsrail'in Para Birimi: Yeni İsrail Şekeli\nİsrail'in Alanı: 20.770km²");

			}
		});
		btnIsrail.setBounds(0, 151, 93, 29);
		frame.getContentPane().add(btnIsrail);

		JButton btnIrak_1 = new JButton("Irak");
		btnIrak_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Irak'ın Başkenti: Bağdat\nIrak'ın Nüfusu: 28.945.657\nIrak'ın Para Birimi: Irak dinarı\nIrak'ın Alanı: 28.945.657km²");

			}
		});
		btnIrak_1.setBounds(0, 98, 93, 29);
		frame.getContentPane().add(btnIrak_1);

		JButton btnSuudiArabistam = new JButton("Suudi Arabistan");
		btnSuudiArabistam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Suudi Arabistan'ın Başkenti: Riyad\nSuudi Arabistan'ın Nüfusu: 28.686.633\nSuudi Arabistan'ın Para Birimi: Suudi Arabistan riyali\nSuudi Arabistan'ın Alanı: 2.149.690km²");

			}
		});
		btnSuudiArabistam.setBounds(0, 330, 93, 29);
		frame.getContentPane().add(btnSuudiArabistam);

		JButton btnTrkiye = new JButton("Türkiye");
		btnTrkiye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Türkiye'nin Başkenti: Ankara\nTürkiye'nin Nüfusu: 77.804.122\nTürkiye'nin Para Birimi: Türk Lirası\nTürkiye'nin Alanı:780.580km²");

			}
		});
		btnTrkiye.setBounds(0, 355, 93, 29);
		frame.getContentPane().add(btnTrkiye);

		JButton btnUmman = new JButton("Umman");
		btnUmman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Umman'ın Başkenti: Maskat\nUmman'ın Nüfusu: 3.418.085\nUmman'ın Para Birimi: Umman Riyali\nUmman'ın Alanı: 212.460km²");

			}
		});
		btnUmman.setBounds(0, 381, 93, 29);
		frame.getContentPane().add(btnUmman);

		JButton btnrdn = new JButton("Ürdün");
		btnrdn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ürdün'ün Başkenti: Amman\nÜrdün'ün Nüfusu: 6.342.948\nÜrdün'ün Para Birimi: Ürdün Riyali\nÜrdün'ün Alanı: 92.300km²");
			}
		});
		btnrdn.setBounds(0, 407, 93, 29);
		frame.getContentPane().add(btnrdn);

		JButton btnYemen = new JButton("Yemen");
		btnYemen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Yemen'in Başkenti: San'a\nYemen'in Nüfusu: 23.822.783\nYemen'in Para Birimi: Yemen Riyali\nYemen'in Alanı: 527.970km²");
			}
		});
		btnYemen.setBounds(0, 432, 93, 29);
		frame.getContentPane().add(btnYemen);

		JButton btnAfganistan = new JButton("Afganistan");
		btnAfganistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Afganista'nın Başkenti: Kabil\nAfganista'nın Nüfusu: 33.609.937\nAfganista'nın Para Birimi: Afgani\nAfganista'nın Alanı: 647.500km²");

			}
		});
		btnAfganistan.setBounds(86, 22, 101, 29);
		frame.getContentPane().add(btnAfganistan);

		JButton btnAzerbeycan = new JButton("Azerbaycan");
		btnAzerbeycan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Azerbaycan'ın Başkenti: Bakü\nAzerbaycan'ın Nüfusu: 9.165.000\nAzerbaycan'ın Para Birimi: Azerbaycan Yeni Manatı\nAzerbaycan'ın Alanı: 86.600km");

			}
		});
		btnAzerbeycan.setBounds(86, 47, 101, 29);
		frame.getContentPane().add(btnAzerbeycan);

		JButton btnBanglade = new JButton("Bangladeş");
		btnBanglade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bangladeş'in Başkenti: Dakka\nBangladeş'in Nüfusu: 156.050.883\nBangladeş'in Para Birimi: Takka\nBangladeş'in Alanı: 144.000km²");

			}
		});
		btnBanglade.setBounds(86, 73, 101, 29);
		frame.getContentPane().add(btnBanglade);

		JButton btnBhutan = new JButton("Bhutan");
		btnBhutan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bhuta'nın Başkenti: Thimpu\nBhuta'nın Nüfusu: 691.141\nBhuta'nın Para Birimi: Ngultrum\nBhuta'nın Alanı: 47.000km²");

			}
		});
		btnBhutan.setBounds(86, 98, 101, 29);
		frame.getContentPane().add(btnBhutan);

		JButton btnBruney = new JButton("Bruney");
		btnBruney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bruney'in Başkenti: Bandar Seri Begawan\nBruney'in Nüfusu: 388.190\nBruney'in Para Birimi: Brunei doları\nBruney'in Alanı: 5.770km²");

			}
		});
		btnBruney.setBounds(86, 125, 101, 29);
		frame.getContentPane().add(btnBruney);

		JButton btnin = new JButton("Çin");
		btnin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Çin'in Başkenti: Pekin\nÇin'in Nüfusu: 1.338.612.968\nÇin'in Para Birimi: Renminbi\nÇin'in Alanı: 9.596.960km²");

			}
		});
		btnin.setBounds(86, 151, 101, 29);
		frame.getContentPane().add(btnin);

		JButton btnDouTimor = new JButton("Doğu Timor");
		btnDouTimor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Doğu Timor'un Başkenti: Dili\nDoğu Timor'un Nüfusu: 1.131.612 \nDoğu Timor'un Para Birimi: Abd Doları\nDoğu Timor'un Alanı: 15.007km²");

			}
		});
		btnDouTimor.setBounds(86, 177, 101, 29);
		frame.getContentPane().add(btnDouTimor);

		JButton btnEndonezya = new JButton("Ermenistan ");
		btnEndonezya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ermenista'nın Başkenti: Erivan\nErmenista'nın Nüfusu: 2.967.004\nErmenista'nın Para Birimi: Ermeni Dramı\nErmenista'nın Alanı:29.743km²");
			}
		});
		btnEndonezya.setBounds(86, 202, 101, 29);
		frame.getContentPane().add(btnEndonezya);

		JButton btnFilipinler = new JButton("Filipinler");
		btnFilipinler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Flipinler'in Başkenti: Manila\nFlipinler'in Nüfusu: 97.976.603\nFlipinler'in Para Birimi: Filipinler pesosu\nFlipinler'in Alanı:300.000km²");

			}
		});
		btnFilipinler.setBounds(86, 228, 101, 29);
		frame.getContentPane().add(btnFilipinler);

		JButton btnGneyKore = new JButton("Güney Kore");
		btnGneyKore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Güney Kore'nin Başkenti: Seul\nGüney Kore'nin Nüfusu: 48.508.972\nGüney Kore'nin Para Birimi: Güney Kore wonu\nGüney Kore'nin Alanı: 98.480km²");

			}
		});
		btnGneyKore.setBounds(86, 254, 101, 29);
		frame.getContentPane().add(btnGneyKore);

		JButton btnGrcistan = new JButton("Gürcistan");
		btnGrcistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gürcista'nın Başkenti: Tiflis\nGürcista'nın Nüfusu: 4.615.807\nGürcista'nın Para Birimi: Gürcistan Larisi\nGürcista'nın Alanı: 69.700km²");

			}
		});
		btnGrcistan.setBounds(86, 279, 101, 29);
		frame.getContentPane().add(btnGrcistan);

		JButton btnHindistan = new JButton("Hindistan");
		btnHindistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Hindistan'nın Başkenti: Yeni Delhi\nHindistan'nın Nüfusu: 1.166.079.217\nHindistan'nın Para Birimi: Hindistan Rupisi\nHindistan'nın Alanı:3.287.590km²");

			}
		});
		btnHindistan.setBounds(86, 304, 101, 29);
		frame.getContentPane().add(btnHindistan);

		JButton btnJaponya = new JButton("Japonya");
		btnJaponya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Japonya'nın Başkenti: Tokyo\nJaponya'nın Nüfusu: 127.078.679\nJaponya'nın Para Birimi: Yen\nJaponya'nın Alanı: 377.835km²");

			}
		});
		btnJaponya.setBounds(86, 330, 101, 29);
		frame.getContentPane().add(btnJaponya);

		JButton btnKamboya = new JButton("Kamboçya");
		btnKamboya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kamboçya'nın Başkenti: Phnom Penh\nKamboçya'nın Nüfusu: 14.494.293\nKamboçya'nın Para birimi: Riel\nKamboçya'nın Alanı:181.040km²");

			}
		});
		btnKamboya.setBounds(86, 355, 101, 29);
		frame.getContentPane().add(btnKamboya);

		JButton btnKazakistan = new JButton("Kazakistan");
		btnKazakistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kazakista'nın Başkenti: Astana\nKazakista'nın Nüfusu: 15.399.437\nKazakista'nın Para Birimi: Tenge\nKazakista'nın Alanı: 2.717.300km²");

			}
		});
		btnKazakistan.setBounds(86, 381, 101, 29);
		frame.getContentPane().add(btnKazakistan);

		JButton btnKrgzistan = new JButton("Kırgızistan");
		btnKrgzistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kırgızita'nın Başkenti: Bişkek\nKırgızita'nın Nüfusu: 5.431.747\nKırgızita'nın Para Birimi: Kırgızistan somu\nKırgızita'nın Alanı: 198.500km²");

			}
		});
		btnKrgzistan.setBounds(86, 407, 101, 29);
		frame.getContentPane().add(btnKrgzistan);

		JButton btnKuzeyKore = new JButton("Kuzey Kore");
		btnKuzeyKore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kuzey Kore'nin Başkenti: Pyongyang\nKuzey Kore'nin Nüfusu: 22.665.345\nKuzey Kore'nin Para Birimi: Kuzey Kore wonu\nKuzey Kore'nin Alanı: 120.540km²");

			}
		});
		btnKuzeyKore.setBounds(86, 432, 101, 29);
		frame.getContentPane().add(btnKuzeyKore);

		JButton btnLaos = new JButton("Laos");
		btnLaos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Laos'un Başkenti: Vientiane\nLaos'un Nüfusu: 6.834.942\nLaos'un Para Birimi: Kip\nLaos'un Alanı: 236.800km²");

			}
		});
		btnLaos.setBounds(178, 202, 101, 29);
		frame.getContentPane().add(btnLaos);

		JTextArea txtrAsyalkeleri = new JTextArea();
		txtrAsyalkeleri.setForeground(Color.BLUE);
		txtrAsyalkeleri.setText("            Asya Ülkeleri");
		txtrAsyalkeleri.setBackground(new Color(204, 255, 51));
		txtrAsyalkeleri.setBounds(96, 6, 175, 16);
		frame.getContentPane().add(txtrAsyalkeleri);

		JButton btnLbnan_1 = new JButton("Lübnan");
		btnLbnan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lübnan'ın Başkenti: Beyrut\nLübnan'ın Nüfusu: 4.017.095\nLübnan'ın Para Birimi: Lübnan Lirası\nLübnan'ın Alanı: 10.400km²");

			}
		});
		btnLbnan_1.setBounds(178, 228, 101, 29);
		frame.getContentPane().add(btnLbnan_1);

		JButton btnMaldivler = new JButton("Maldivler");
		btnMaldivler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Maldiveler'in Başkenti: Malé\nMaldiveler'in Nüfusu: 396.334\nMaldiveler'in Para Birimi: Rufiyaa\nMaldiveler'in Alanı: 300km²");

			}
		});
		btnMaldivler.setBounds(178, 254, 101, 29);
		frame.getContentPane().add(btnMaldivler);

		JButton btnMalezya = new JButton("Malezya");
		btnMalezya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Malezya'nın Başkenti: Kuala Lumpur\nMalezya'nın Nüfusu: 25.715.819\nMalezya'nın Para Birimi: Ringgit\nMalezya'nın Alanı: 329.750km²");

			}
		});
		btnMalezya.setBounds(178, 279, 101, 29);
		frame.getContentPane().add(btnMalezya);

		JButton btnMoolistan = new JButton("Moğolistan");
		btnMoolistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Moğolistan'ın Başkenti: Ulan Batur\nMoğolistan'ın Nüfusu: 3.041.142\nMoğolistan'ın Para Birimi: Tögrög\nMoğolistan'ın Alanı: 1.564.116km²");

			}
		});
		btnMoolistan.setBounds(178, 304, 101, 29);
		frame.getContentPane().add(btnMoolistan);

		JButton btnMyanmar = new JButton("Myanmar");
		btnMyanmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Myanmar'ın Başkenti: Naypyidaw\nMyanmar'ın Nüfusu: 48.137.741\nMyanmar'ın Para Birimi: Kyat\nMyanmar'ın Alanı: 678.500km²");

			}
		});
		btnMyanmar.setBounds(178, 330, 101, 29);
		frame.getContentPane().add(btnMyanmar);

		JButton btnNepal = new JButton("Nepal");
		btnNepal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Nepal'in Başkenti: Katmandu\nNepal'in Nüfusu: 28.563.377\nNepal'in Para Birimi: Nepal rupisi\nNepal'in Alanı: 147.181km²");

			}
		});
		btnNepal.setBounds(178, 355, 101, 29);
		frame.getContentPane().add(btnNepal);

		JButton btnzbekistan = new JButton("Özbekistan");
		btnzbekistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Özbekistan'ın Başkenti: Taşkent\nÖzbekistan'ın Nüfusu: 27.606.007\nÖzbekistan'ın Para Birimi: Özbekistan somu\nÖzbekistan'ın Alanı: 447.400km²");

			}
		});
		btnzbekistan.setBounds(178, 381, 101, 29);
		frame.getContentPane().add(btnzbekistan);

		JButton btnRusya = new JButton("Rusya");
		btnRusya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Rusya'nın Başkenti: Moskova\nRusya'nın Nüfusu: 140.041.247\nRusya'nın Para Birimi: Rus Rublesi\nRusya'nın Alanı: 17.075.200km²");

			}
		});
		btnRusya.setBounds(178, 407, 101, 29);
		frame.getContentPane().add(btnRusya);

		JButton btnSingapur = new JButton("Singapur");
		btnSingapur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Sinagapur'un Başkenti: Singapur\nSinagapur'un Nüfusu: 4.657.542\nSinagapur'un Para Birimi: Singapur Doları\nSinagapur'un Alanı: 692,7km²");
			}
		});
		btnSingapur.setBounds(178, 432, 101, 29);
		frame.getContentPane().add(btnSingapur);

		JButton btnSriLanka = new JButton("Sri Lanka");
		btnSriLanka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Sri Lanka'nın Başkenti: Kolombo\nSri Lanka'nın Nüfusu: 21.324.791\nSri Lanka'nın Para Birimi: Sri Lanka rupisi\nSri Lanka'nın Alanı: 65.610km²");
			}
		});
		btnSriLanka.setBounds(178, 22, 101, 29);
		frame.getContentPane().add(btnSriLanka);

		JButton btnTacikistan = new JButton("Tacikistan");
		btnTacikistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tacikistan'ın Başkenti: Duşanbe\nTacikistan'ın Nüfusu: 7.349.145\nTacikistan'ın Para Birimi: Somoni\nTacikistan'ın Alanı: 143.100km²");
			}
		});
		btnTacikistan.setBounds(178, 47, 101, 29);
		frame.getContentPane().add(btnTacikistan);

		JButton btnTayland = new JButton("Tayland");
		btnTayland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tayland'ın Başkenti: Bangkok\nTayland'ın Nüfusu: 65.905.410\nTayland'ın Para Birimi: Baht\nTayland'ın Alanı: 514.000km²");
			}
		});
		btnTayland.setBounds(178, 73, 101, 29);
		frame.getContentPane().add(btnTayland);

		JButton btnTrkmenistan = new JButton("Türkmenistan");
		btnTrkmenistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Türkmenistan'ın Başkenti: Aşkabat\nTürkmenistan'ın Nüfusu: 4.884.887\nTürkmenistan'ın Para Birimi\nTürkmenistan'ın Alanı: 488.100km²");
			}
		});
		btnTrkmenistan.setBounds(178, 98, 101, 29);
		frame.getContentPane().add(btnTrkmenistan);

		JButton btnUmman_1 = new JButton("Umman");
		btnUmman_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Umman'ın Başkenti: Maskat\nUmman'ın Nüfusu: 3.418.085\nUmman'ın Para Birimi: Umman Riyali\nUmman'ın Alanı: 212.460km²");
			}
		});
		btnUmman_1.setBounds(178, 125, 101, 29);
		frame.getContentPane().add(btnUmman_1);

		JButton btnVietnam = new JButton("Vietnam");
		btnVietnam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Vietnam'ın Başkenti: Hanoi\nVietnam'ın Nüfusu: 86.967.524\nVietnam'ın Para Birimi: Đồng\nVietnam'ın Alanı: 329.560km²");
			}
		});
		btnVietnam.setBounds(178, 151, 101, 29);
		frame.getContentPane().add(btnVietnam);

		JButton btnEndonezya_1 = new JButton("Endonezya");
		btnEndonezya_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Endonezya'nın Başkenti: Cakarta\nEndonezya'nın Nüfusu: 240.271.522\nEndonezya'nın Para Birimi: Endonezya rupiahı\nEndonezya'nın Alanı: 1.919.440");
			}
		});
		btnEndonezya_1.setBounds(178, 177, 101, 29);
		frame.getContentPane().add(btnEndonezya_1);

		JTextArea txtrAvrupalkeleri_1 = new JTextArea();
		txtrAvrupalkeleri_1.setForeground(new Color(153, 0, 204));
		txtrAvrupalkeleri_1.setText("Avrupa Ülkeleri");
		txtrAvrupalkeleri_1.setBackground(new Color(255, 255, 51));
		txtrAvrupalkeleri_1.setBounds(275, 6, 93, 16);
		frame.getContentPane().add(txtrAvrupalkeleri_1);

		JButton btnAlmanya = new JButton("Almanya");
		btnAlmanya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Almanya'nın Başkenti: Berlin\nAlmanya'nın Nüfusu: 81.471.834\nAlmanya'nın Para Birimi: Euro\nAlmanya'nın Alanı: 357.022km²");

			}
		});
		btnAlmanya.setBounds(272, 22, 101, 29);
		frame.getContentPane().add(btnAlmanya);

		JButton btnAvusturya = new JButton("Avusturya");
		btnAvusturya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Avusturya'nın Başkenti: Viyana\nAvusturya'nın Nüfusu: 8.217.280\nAvusturya'nın Para Birimi: Euro\nAvusturya'nın Alanı: 83.871km²");
			}
		});
		btnAvusturya.setBounds(272, 47, 101, 29);
		frame.getContentPane().add(btnAvusturya);

		JButton btnBelika = new JButton("Belçika");
		btnBelika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Belçika'nın Başkenti: Brüksel\nBelçika'nın Nüfusu: 10.431.477\nBelçika'nın Para Birimi: Euro\nBelçika'nın Alanı: 32.545km²");

			}
		});
		btnBelika.setBounds(272, 73, 101, 29);
		frame.getContentPane().add(btnBelika);

		JButton btnBirleikKrallk = new JButton("Birleşik krallık");
		btnBirleikKrallk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Birleşik Krallık'ın Başkenti: Londra\nBirleşik Krallık'ın Nüfusu: 62.698.362\nBirleşik Krallık'ın Para Birimi: İngiliz Sterlini\nBirleşik Krallık'ın Alanı: 244.820km²");

			}
		});
		btnBirleikKrallk.setBounds(272, 98, 101, 29);
		frame.getContentPane().add(btnBirleikKrallk);

		JButton btnFransa = new JButton("Fransa");
		btnFransa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Fransa'nın Başkenti: Paris\nFransa'nın Nüfusu: 65.312.249\nFransa'nın Para Birimi: Euro\nFransa'nın Alanı: 632.760km²");

			}
		});
		btnFransa.setBounds(272, 125, 101, 29);
		frame.getContentPane().add(btnFransa);

		JButton btnHollad = new JButton("Hollanda");
		btnHollad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Hollanda'nın Başkenti: Amsterdam\nHollanda'nın Nüfusu: 16.847.007\nHollanda'nın Para Birimi: Euro\nHollanda'nın Alanı: 41.526km²");

			}
		});
		btnHollad.setBounds(272, 151, 101, 29);
		frame.getContentPane().add(btnHollad);

		JButton btnIrlanda = new JButton("İrlanda");
		btnIrlanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İrlanda'nın Başkenti: Dublin\nİrlanda'nın Nüfusu: 4.670.976\nİrlanda'nın Para Birimi: Euro\nİrlanda'nın Alanı: 70.273km²");
			}
		});
		btnIrlanda.setBounds(272, 177, 101, 29);
		frame.getContentPane().add(btnIrlanda);

		JButton btnIsvire = new JButton("İsviçre");
		btnIsvire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İsviçre'nin Başkenti: Bern\nİsviçre'nin Nüfusu: 7.639.961\nİsviçre'nin Para Birimi: İsviçre frangı\nİsviçre'nin Alanı: 41.290km²");

			}
		});
		btnIsvire.setBounds(272, 202, 101, 29);
		frame.getContentPane().add(btnIsvire);

		JButton btnLihtentayn = new JButton("Lihtenştayn");
		btnLihtentayn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lihtenştayn'ın Başkenti: Vaduz\nLihtenştayn'ın Nüfusu: 35.236\nLihtenştayn'ın Para Birimi: İsviçre frangı\nLihtenştayn'ın Alanı:160km²");

			}
		});
		btnLihtentayn.setBounds(272, 228, 101, 29);
		frame.getContentPane().add(btnLihtentayn);

		JButton btnLksemburg = new JButton("Lüksemburg");
		btnLksemburg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lüksemburg'un Başkenti: Lüksembur\nLüksemburg'un Nüfusu: 503.302\nLüksemburg'un Para Birimi: Euro\nLüksemburg'un Alanı: 2.586km²");

			}
		});
		btnLksemburg.setBounds(272, 254, 101, 29);
		frame.getContentPane().add(btnLksemburg);

		JButton btnMonaco = new JButton("Monaco");
		btnMonaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Monaco'nun Başkenti: Monako\nMonaco'nun Nüfusu: 30.539\nMonaco'nun Para Birimi: Euro\nMonaco'nun Alanı: 1,95km²");

			}
		});
		btnMonaco.setBounds(272, 279, 101, 29);
		frame.getContentPane().add(btnMonaco);

		JTextArea txtrDouAvrupalkeleri = new JTextArea();
		txtrDouAvrupalkeleri.setForeground(new Color(51, 51, 102));
		txtrDouAvrupalkeleri.setText("Doğu Avrupa Ülkeleri");
		txtrDouAvrupalkeleri.setBackground(new Color(102, 204, 51));
		txtrDouAvrupalkeleri.setBounds(380, 6, 86, 16);
		frame.getContentPane().add(txtrDouAvrupalkeleri);

		JButton btnBeyazRusya = new JButton("Beyaz Rusya ");
		btnBeyazRusya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Beyaz Rusya'nın Başkenti: Minsk\nBeyaz Rusya'nın Nüfusu: 9.577.552\nBeyaz Rusya'nın Para Birimi: Beyaz Rusya rublesi\nBeyaz Rusya'nın Alanı: 207.600km²");

			}
		});
		btnBeyazRusya.setBounds(373, 22, 93, 29);
		frame.getContentPane().add(btnBeyazRusya);

		JButton btnBulgaristan = new JButton("Bulgaristan");
		btnBulgaristan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bulgaristan'ın Başkenti: Sofya\nBulgaristan'ın Nüfusu: 7.093.635\nBulgaristan'ın Para Birimi: Lev\nBulgaristan'ın Alanı: 110.910km²");

			}
		});
		btnBulgaristan.setBounds(373, 47, 93, 29);
		frame.getContentPane().add(btnBulgaristan);

		JButton btnekCumhuriyeti = new JButton("Çek Cumhuriyeti");
		btnekCumhuriyeti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Çek Cumhuriyeti'nin Başkenti: Prag\nÇek Cumhuriyeti'nin Nüfusu: 10.190.213 \nÇek Cumhuriyeti'nin Para Brimi: Çek Korunası \nÇek Cumhuriyeti'nin Alanı: 78.866km²");

			}
		});
		btnekCumhuriyeti.setBounds(373, 73, 93, 29);
		frame.getContentPane().add(btnekCumhuriyeti);

		JButton btnMacaristan = new JButton("Macaristan");
		btnMacaristan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Macaristan'ın Başkenti: Budapeşte\nMacaristan'ın Nüfusu: 9.976.062\nMacaristan'ın Para Birimi: Macar forinti\nMacaristan'ın Alanı: 93.030km²");
			}
		});
		btnMacaristan.setBounds(373, 98, 93, 29);
		frame.getContentPane().add(btnMacaristan);

		JButton btnMaldova = new JButton("Maldova");
		btnMaldova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Maldova'nın Başkenti: Kişiven\nMaldova'nın Nüfusu: 4.314.377\nMaldova'nın Para Birimi: Moldova leyi \nMaldova'nın Alanı: 33.843km²");

			}
		});
		btnMaldova.setBounds(373, 125, 93, 29);
		frame.getContentPane().add(btnMaldova);

		JButton btnPolonya = new JButton("Polonya");
		btnPolonya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Polonya'nın Başkenti: Varşova\nPolonya'nın Nüfusu: 38.441.588\nPolonya'nın Para Birimi: Polonya zlotisi\nPolonya'nın Alanı: 312.685km²");

			}
		});
		btnPolonya.setBounds(373, 151, 93, 29);
		frame.getContentPane().add(btnPolonya);

		JButton btnRomanya = new JButton("Romanya");
		btnRomanya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Romanya'nın Başkenti: Bükreş\nRomanya'nın Nüfusu: 21.904.551\nRomanya'nın Para Birimi: Rumen Leyi\nRomanya'nın Alanı: 237.500km²");

			}
		});
		btnRomanya.setBounds(373, 177, 93, 29);
		frame.getContentPane().add(btnRomanya);

		JButton btnSlovakya = new JButton("Slovakya");
		btnSlovakya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Slovakya'nın Başkenti: Bratislava\nSlovakya'nın Nüfusu: 5.477.038\nSlovakya'nın Para Birimi: Euro\nSlovakya'nın Alanı: 48.845km²");
			}
		});
		btnSlovakya.setBounds(373, 202, 93, 29);
		frame.getContentPane().add(btnSlovakya);

		JButton btnUkrayna = new JButton("Ukrayna");
		btnUkrayna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ukrayna'nın Başkenti: Kiev\nUkrayna'nın Nüfusu: 45.134.707\nUkrayna'nın Para Birimi: Grivna\nUkrayna'nın Alanı: 603.600km²");

			}
		});
		btnUkrayna.setBounds(373, 228, 93, 29);
		frame.getContentPane().add(btnUkrayna);

		JTextArea txtrKuzeyAvrupalkeleri = new JTextArea();
		txtrKuzeyAvrupalkeleri.setForeground(new Color(255, 255, 255));
		txtrKuzeyAvrupalkeleri.setText("Kuzey Avrupa Ülkeleri");
		txtrKuzeyAvrupalkeleri.setBackground(new Color(204, 102, 204));
		txtrKuzeyAvrupalkeleri.setBounds(480, 6, 86, 16);
		frame.getContentPane().add(txtrKuzeyAvrupalkeleri);

		JButton btnDanimarka = new JButton("Danimarka");
		btnDanimarka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Danimarka'nın Başkenti: Kopengah\nDanimarka'nın Nüfusu: 5.543.453\nDanimarka'nın Para Birimi: Danimarka Kronu\nDanimarka'nın Alanı: 43.094km²");
			}
		});
		btnDanimarka.setBounds(465, 22, 101, 29);
		frame.getContentPane().add(btnDanimarka);

		JButton btnEstonya = new JButton("Estonya");
		btnEstonya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Estonya'nın Başkenti: Tallinn\nEstonya'nın Nüfusu: 1.274.709\nEstonya'nın Para Birimi: Estonya Kronu\nEstonya'nın Alanı: 46.227km²");

			}
		});
		btnEstonya.setBounds(465, 73, 101, 29);
		frame.getContentPane().add(btnEstonya);

		JButton btnFinlandiya = new JButton("Finlandiya");
		btnFinlandiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Finlandiya'nın Başkenti: Helsinki\nFinlandiya'nın Nüfusu: 5.262.930\nFinlandiya'nın Para Birimi: Euro\nFinlandiya'nın Alanı: 338.145km²");

			}
		});
		btnFinlandiya.setBounds(465, 98, 101, 29);
		frame.getContentPane().add(btnFinlandiya);

		JButton btnIsve = new JButton("İsveç");
		btnIsve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İsveç'in Başkenti: Stokholm\nİsveç'in Nüfusu: 9.103.788\nİsveç'in Para Birimi: İsveç kronu\nİsveç'in Alanı: 449.964km²");

			}
		});
		btnIsve.setBounds(465, 128, 101, 23);
		frame.getContentPane().add(btnIsve);

		JButton btnIzlanda = new JButton("İzlanda");
		btnIzlanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İzlanda'nın Başkenti: Reykjavik\nİzlanda'nın Nüfusu: 313.183\nİzlanda'nın Para Birimi: İzlanda kronası\nİzlanda'nın Alanı: 103.125km²");

			}
		});
		btnIzlanda.setBounds(465, 151, 101, 29);
		frame.getContentPane().add(btnIzlanda);

		JButton btnLetony = new JButton("Letonya");
		btnLetony.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Letonya'nın Başkenti: Riga \nLetonya'nın Nüfusu: 2.191.580\nLetonya'nın Para Birimi: Euro\nLetonya'nın Alanı: 64.589km²");

			}
		});
		btnLetony.setBounds(465, 177, 99, 29);
		frame.getContentPane().add(btnLetony);

		JButton btnLitvanta = new JButton("Litvanya");
		btnLitvanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Litvanya'nın Başkenti: Vilnius\nLitvanya'nın Nüfusu: 3.525.761\nLitvanya'nın Para Birimi: Litvanya litası\nLitvanya'nın Alanı:65.200km²");

			}
		});
		btnLitvanta.setBounds(465, 202, 101, 29);
		frame.getContentPane().add(btnLitvanta);

		JButton btnNorve = new JButton("Norveç");
		btnNorve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Norveç'in Başkenti: Oslo\nNorveç'in Nüfusu: 4.707.270\nNorveç'in Para Birimi: Norveç kronu\nNorveç'in Alanı: 385.199km²");

			}
		});
		btnNorve.setBounds(465, 50, 101, 23);
		frame.getContentPane().add(btnNorve);

		JTextArea txtrGneyAvrupalkeleri = new JTextArea();
		txtrGneyAvrupalkeleri.setText("Güney Avrupa Ülkeleri");
		txtrGneyAvrupalkeleri.setBackground(new Color(51, 255, 51));
		txtrGneyAvrupalkeleri.setBounds(578, 6, 86, 16);
		frame.getContentPane().add(txtrGneyAvrupalkeleri);

		JButton btnAndorra = new JButton("Andorra");
		btnAndorra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Andorra'nın Başkenti: Andorra la Vella\nAndorra'nın Nüfusu: 85.082\nAndorra'nın Para Birimi: Avro\nAndorra'nın Alanı: 468km²");

			}
		});
		btnAndorra.setBounds(563, 22, 111, 29);
		frame.getContentPane().add(btnAndorra);

		JButton btnArnavutluk = new JButton("Arnavutluk");
		btnArnavutluk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Arnavutluk'un Başkenti: Tiran\nArnavutluk'un Nüfusu: 3.002.859\nArnavutluk'un Para Birimi: Arnavut leki\nArnavutluk'un Alanı: 28.748km²");

			}
		});
		btnArnavutluk.setBounds(563, 47, 111, 29);
		frame.getContentPane().add(btnArnavutluk);

		JButton btnBosnaHersek = new JButton("Bosna Hersek");
		btnBosnaHersek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bosna Hersek'in Başkenti: Saraybosna\nBosna Hersek'in Nüfusu: 4.622.292\nBosna Hersek'in Para Birimi: Değiştirilebilir Mark\nBosna Hersek'in Alanı: 51.197km²");

			}
		});
		btnBosnaHersek.setBounds(563, 73, 111, 29);
		frame.getContentPane().add(btnBosnaHersek);

		JButton btnHrvatistan = new JButton("Hırvatistan");
		btnHrvatistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Hırvatistan'ın Başkenti: Zagreb\nHırvatistan'ın Nüfusu: 4.480.043\nHırvatistan'ın Para Birimi: Hırvat kunası\nHırvatistan'ın Alanı: 56.542km²");

			}
		});
		btnHrvatistan.setBounds(563, 98, 111, 29);
		frame.getContentPane().add(btnHrvatistan);

		JButton btnIspanya = new JButton("İspanya");
		btnIspanya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İspanya'nın Başkenti: Madrid\nİspanya'nın Nüfusu: 47.042.984\nİspanya'nın Para Birimi: Euro\nİspanya'nın Alanı: 504.030km²");

			}
		});
		btnIspanya.setBounds(563, 125, 111, 29);
		frame.getContentPane().add(btnIspanya);

		JButton btnItalya = new JButton("İtalya");
		btnItalya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"İtalya'nın Başkenti: Roma\nİtalya'nın Nüfusu: 61.261.254\nİtalya'nın Para Birimi: Euro\nİtalya'nın Alanı: 301.318km²");

			}
		});
		btnItalya.setBounds(563, 151, 111, 29);
		frame.getContentPane().add(btnItalya);

		JButton btnKarada = new JButton("Karadağ");
		btnKarada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Karadağ'ın Başkenti: Podgorica\nKaradağ'ın Nüfusu: 657.394\nKaradağ'ın Para Birimi: Euro\nKaradağ'ın Alanı: 13.812km²");

			}
		});
		btnKarada.setBounds(563, 177, 111, 29);
		frame.getContentPane().add(btnKarada);

		JButton btnMakedonya = new JButton("Makedonya");
		btnMakedonya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Makedonya'nın Başkenti: Üsküp\nMakedonya'nın Nüfusu: 2.082.370\nMakedonya'nın Para Birimi: Makedon denarı\nMakedonya'nın Alanı: 25.713km²");

			}
		});
		btnMakedonya.setBounds(563, 202, 111, 29);
		frame.getContentPane().add(btnMakedonya);

		JButton btnMalta = new JButton("Malta");
		btnMalta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Malta'nın Başkenti: Valetta\nMalta'nın Nüfusu: 409.836\nMalta'nın Para Birimi: Euro\nMalta'nın Alanı: 316km²");

			}
		});
		btnMalta.setBounds(563, 228, 111, 29);
		frame.getContentPane().add(btnMalta);

		JButton btnPortekiz = new JButton("Portekiz");
		btnPortekiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Portekiz'in Başkenti: Lizbon\nPortekiz'in Nüfusu: 10.781.459\nPortekiz'in Para Birimi: Euro\nPortekiz'in Alanı: 92.391km²");

			}
		});
		btnPortekiz.setBounds(563, 254, 111, 29);
		frame.getContentPane().add(btnPortekiz);

		JButton btnSanMari = new JButton("San Marino");
		btnSanMari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"San Marino'nun Başkenti: San Marino\nSan Marino'nun Nüfusu: 32.140\nSan Marino'nun Para Birimi: Euro\nSan Marino'nun Alanı: 61km²");
			}
		});
		btnSanMari.setBounds(563, 279, 111, 29);
		frame.getContentPane().add(btnSanMari);

		JButton btnSrbistan = new JButton("Sırbistan");
		btnSrbistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Sırbistan'ın Başkenti: Belgrad\nSırbistan'ın Nüfusu: 7.276.604\nSırbistan'ın Para Birimi: Sırp Dinarı\nSırbistan'ın Alanı: 88.361km²");

			}
		});
		btnSrbistan.setBounds(563, 304, 111, 29);
		frame.getContentPane().add(btnSrbistan);

		JButton btnSlovenya = new JButton("Slovenya");
		btnSlovenya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Slovena'nın Başkenti: Ljubljana\nSlovena'nın Nüfusu: 1.996.617\nSlovena'nın Para Birimi: Euro\nSlovena'nın Alanı: 20.273km²");

			}
		});
		btnSlovenya.setBounds(563, 330, 111, 29);
		frame.getContentPane().add(btnSlovenya);

		JButton btnVatikan = new JButton("Vatikan");
		btnVatikan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Vatikan'ın Başkenti: Vatikan\nVatikan'ın Nüfusu: 836\nVatikan'nın Para Birimi: Euro\nVatikan'ın Alanı: 0,44km²");

			}
		});
		btnVatikan.setBounds(563, 355, 111, 29);
		frame.getContentPane().add(btnVatikan);

		JButton btnYunanistan = new JButton("Yunanistan");
		btnYunanistan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Yunanistan'ın Başkenti: Atina\nYunanistan'ın Nüfusu: 10.767.827\nYunanistan'ın Para Birimi: Euro\nYunanistan'ın Alanı: 131.990km²");

			}
		});
		btnYunanistan.setBounds(563, 381, 111, 29);
		frame.getContentPane().add(btnYunanistan);

		JTextArea txtrKuzeyAmerika = new JTextArea();
		txtrKuzeyAmerika.setText("Kuzey Amerika");
		txtrKuzeyAmerika.setBackground(new Color(51, 255, 255));
		txtrKuzeyAmerika.setBounds(676, 6, 93, 16);
		frame.getContentPane().add(txtrKuzeyAmerika);

		JButton btnAmerika = new JButton("Amerika");
		btnAmerika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Amerikan'nın Başkenti: Washington, D.C.\nAmerikan'nın Nüfusu: 310.232.863\nAmerikan'nın Para Birimi: Abd doları\nAmerikan'nın Alanı: 9.826.675km²:");
			}
		});
		btnAmerika.setBounds(669, 22, 111, 29);
		frame.getContentPane().add(btnAmerika);

		JButton btnAntiguaVeBarbuda = new JButton("Antigua ve Barbuda");
		btnAntiguaVeBarbuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Antigua ve Barbuda'nın Başkenti: Saint John's\nAntigua ve Barbuda'nın Nüfusu: 86.754\nAntigua ve Barbuda'nın Para Birimi: Doğu Karayip doları\nAntigua ve Barbuda'nın Alanı: 442,6km²");

			}
		});
		btnAntiguaVeBarbuda.setBounds(669, 47, 111, 29);
		frame.getContentPane().add(btnAntiguaVeBarbuda);

		JButton btnBahamalar = new JButton("Bahamalar");
		btnBahamalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bahamalar'ın Başkenti: Nassau\nBahamalar'ın Nüfusu: 310.426\nBahamalar'ın Para Birimi: Bahama doları\nBahamalar'ın Alanı: 13.88044km²");

			}
		});
		btnBahamalar.setBounds(669, 73, 111, 29);
		frame.getContentPane().add(btnBahamalar);

		JButton btnBarbados = new JButton("Barbados");
		btnBarbados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Barbados'un Başkenti: Bridgetown\nBarbados'un Nüfusu: 285.653\nBarbados'un Para Birimi: Barbados doları\nBarbados'un Alanı: 430km²");

			}
		});
		btnBarbados.setBounds(669, 98, 111, 29);
		frame.getContentPane().add(btnBarbados);

		JButton btnBelize = new JButton("Belize");
		btnBelize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Belize'nin Başkenti: Belmopan\nBelize'nin Nüfusu: 314.522\nBelize'nin Para Birimi: Belize doları\nBelize'nin Alanı: 22.966km²");

			}
		});
		btnBelize.setBounds(669, 125, 111, 29);
		frame.getContentPane().add(btnBelize);

		JButton btnDominikCumhuriyeti = new JButton("Dominik Cumhuriyeti");
		btnDominikCumhuriyeti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Dominik Cumhuriyeti'nin Başkenti: Santo Domingo\nDominik Cumhuriyeti'nin Nüfusu: 9.794.487\nDominik Cumhuriyeti'nin Para Birimi: Dominik pesosu\nDominik Cumhuriyeti'nin Alanı: 48.670km²");

			}
		});
		btnDominikCumhuriyeti.setBounds(669, 151, 111, 29);
		frame.getContentPane().add(btnDominikCumhuriyeti);

		JButton btnDominika = new JButton("Dominika");
		btnDominika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Dominika'nın Başkenti: Roseau\nDominika'nın Nüfusu: 72.813\nDominika'nın Para Birimi: Doğu Karayip doları\nDominika'nın Alanı: 751km²");

			}
		});
		btnDominika.setBounds(669, 177, 111, 29);
		frame.getContentPane().add(btnDominika);

		JButton btnElSalvador = new JButton("El Salvador");
		btnElSalvador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"El Salvador'un Başkenti: San Salvador\nEl Salvador'un Nüfusu: 6.052.064\nEl Salvador'un Para Birimi: Abd doları\nEl Salvador'un Alanı: 21.041km²");

			}
		});
		btnElSalvador.setBounds(669, 202, 111, 29);
		frame.getContentPane().add(btnElSalvador);

		JButton btnGreneda = new JButton("Greneda");
		btnGreneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Greneda'nın Başkenti: Saint George's\nGreneda'nın Nüfusu: 107.818\nGreneda'nın Para Birimi: Doğu Karayip doları\nGreneda'nın Alanı: 21.041km²");

			}
		});
		btnGreneda.setBounds(669, 228, 111, 29);
		frame.getContentPane().add(btnGreneda);

		JButton btnHaiti = new JButton("Guatemala");
		btnHaiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Guatemala'nın Başkenti: Guatemala\nGuatemala'nın Nüfusu: 13.550.440\nGuatemala'nın Para Birimi: Guatemala quetzalı\nGuatemala'nın Alanı: 108.889km");

			}
		});
		btnHaiti.setBounds(669, 254, 111, 29);
		frame.getContentPane().add(btnHaiti);

		JButton btnGuatemala = new JButton("Haiti");
		btnGuatemala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Haiti'nin Başkenti: Port-au-Prince\nHaiti'nin Nüfusu: 9.203.083\nHaiti'nin Para Birimi: Gourde\nHaiti'nin Alanı: 27.750km²");

			}
		});
		btnGuatemala.setBounds(669, 279, 111, 29);
		frame.getContentPane().add(btnGuatemala);

		JButton btnHonduras = new JButton("Honduras");
		btnHonduras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Honduras'ın Başkenti: Tegucigalpa\nHonduras'ın Nüfusu: 7.989.415\nHonduras'ın Para Birimi: Honduras lempirası\nHonduras'ın Alanı: 112.090km²");

			}
		});
		btnHonduras.setBounds(669, 304, 111, 29);
		frame.getContentPane().add(btnHonduras);

		JButton btnJameika = new JButton("Jameika");
		btnJameika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Jamaika'nın Başkenti: Kingston\nJamaika'nın Nüfusu: 2.847.23\nJamaika'nın Para Birimi: Jamaika doları\nJamaika'nın Alanı: 10.991km²");

			}
		});
		btnJameika.setBounds(669, 330, 111, 29);
		frame.getContentPane().add(btnJameika);

		JButton btnKanada = new JButton("Kanada");
		btnKanada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kanada'nın Başkenti: Ottawa\nKanada'nın Nüfusu: 33.759.742\nKanada'nın Para Birimi: Kanada doları\nKanada'nın Alanı: 9.984.670km²");

			}
		});
		btnKanada.setBounds(669, 355, 111, 29);
		frame.getContentPane().add(btnKanada);

		JButton btnKostaRika = new JButton("Kosta Rika");
		btnKostaRika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kosta Rika'nın Başkenti: San José\nKosta Rika'nın Nüfusu: 4.516.220\nKosta Rika'nın Para Birimi: Kosta Rika Colónu\nKosta Rika'nın Alanı: 51.100km²");

			}
		});
		btnKostaRika.setBounds(669, 381, 111, 29);
		frame.getContentPane().add(btnKostaRika);

		JButton btnKba = new JButton("Küba");
		btnKba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Küba'nın Başkenti: Havana\nKüba'nın Nüfusu: 11.477.459\nKüba'nın Para Birimi: Küba pesosu\nKüba'nın Alanı: 110.860km²");

			}
		});
		btnKba.setBounds(669, 407, 111, 29);
		frame.getContentPane().add(btnKba);

		JButton btnMeksika = new JButton("Meksika");
		btnMeksika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Meksika'nın Başkenti: Meksiko\nMeksika'nın Nüfusu: 112.468.855\nMeksika'nın Para Birimi: Meksika pesosu\nMeksika'nın Alanı: 1.964.375km²");

			}
		});
		btnMeksika.setBounds(669, 432, 111, 29);
		frame.getContentPane().add(btnMeksika);

		JButton btnNikaragua = new JButton("Nikaragua");
		btnNikaragua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Nikaragua'nın Başkenti: Managua\nNikaragua'nın Nüfusu: 5.995.928\nNikaragua'nın Para Birimi: Kordoba\nNikaragua'nın Alanı: 130.370km²");

			}
		});
		btnNikaragua.setBounds(669, 459, 111, 29);
		frame.getContentPane().add(btnNikaragua);

		JButton btnPanama = new JButton("Panama");
		btnPanama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Panama'nın Başkenti: Panama\nPanama'nın Nüfusu: 3.410.676\nPanama'nın Para Birimi: Panama balboası ve ABD doları\nPanama'nın Alanı: 75.420km²");

			}
		});
		btnPanama.setBounds(669, 483, 111, 29);
		frame.getContentPane().add(btnPanama);

		JButton btnSaintKittsVe = new JButton("Saint Kitts ve Nevis");
		btnSaintKittsVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Saint Kitts ve Nevis'in Başkenti: Basseterre\nSaint Kitts ve Nevis'in Nüfusu: 49.898\nSaint Kitts ve Nevis'in Para Birimi: Doğu Karayip doları\nSaint Kitts ve Nevis'in Alanı: 261km²");

			}
		});
		btnSaintKittsVe.setBounds(669, 508, 111, 29);
		frame.getContentPane().add(btnSaintKittsVe);

		JButton btnSaintLucia = new JButton("Saint Lucia");
		btnSaintLucia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Saint Lucia'nın Başkenti: Castries\nSaint Lucia'nın Nüfusu: 160.992\nSaint Lucia'nın Para Birimi: Doğu Karayip doları\nSaint Lucia'nın Alanı: 616km²");

			}
		});
		btnSaintLucia.setBounds(669, 535, 111, 29);
		frame.getContentPane().add(btnSaintLucia);

		JButton btnSaintVincentVe = new JButton("Saint Vincent ve Grenadinler");
		btnSaintVincentVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Saint Vincent ve Grenadinler'in Başkenti: Kingstown\nSaint Vincent ve Grenadinler'in Nüfusu: 104.217\nSaint Vincent ve Grenadinler'in Para Birimi: Doğu Karayip doları\nSaint Vincent ve Grenadinler'in Alanı: 389km²");

			}
		});
		btnSaintVincentVe.setBounds(669, 560, 111, 29);
		frame.getContentPane().add(btnSaintVincentVe);

		JButton btnTrinidadVeTobago = new JButton("Trinidad ve Tobago");
		btnTrinidadVeTobago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Trinidad ve Tobago'ın Başkenti: Port of Spain\nTrinidad ve Tobago'ın Nüfusu: 1.228.691\nTrinidad ve Tobago'ın Para Birimi: Trinidad ve Tobago doları\nTrinidad ve Tobago'ın Alanı: 5.128km²");

			}
		});
		btnTrinidadVeTobago.setBounds(669, 586, 111, 29);
		frame.getContentPane().add(btnTrinidadVeTobago);

		JTextArea txtrGneyAmerika = new JTextArea();
		txtrGneyAmerika.setForeground(Color.ORANGE);
		txtrGneyAmerika.setText("  Güney Amerika");
		txtrGneyAmerika.setBackground(Color.GRAY);
		txtrGneyAmerika.setBounds(775, 6, 111, 16);
		frame.getContentPane().add(txtrGneyAmerika);

		JButton btnArjantin = new JButton("Arjantin");
		btnArjantin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Arjanti'nin Başkenti: Buenos Aires\nArjanti'nin Nüfusu: 41.769.726\nArjanti'nin Para Birimi: Arjantin pesosu\nArjanti'nin Alanı: 2.766.890km²");
			}
		});
		btnArjantin.setBounds(775, 25, 111, 23);
		frame.getContentPane().add(btnArjantin);

		JButton btnBolivya = new JButton("Bolivya");
		btnBolivya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bolivya'nın Başkenti: La Paz ve Sucre\nBolivya'nın Nüfusu: 10.118.683\nBolivya'nın Para Birimi: Boliviano\nBolivya'nın Alanı: 1.098.581km²");
			}
		});
		btnBolivya.setBounds(775, 50, 111, 23);
		frame.getContentPane().add(btnBolivya);

		JButton btnBrezilya = new JButton("Brezilya");
		btnBrezilya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Brezilya'nın Başkenti: Brasília\nBrezilya'nın Nüfusu: 203.429.773\nBrezilya'nın Para Birimi: Brezilya reali\nBrezilya'nın Alanı: 8.514.877km²");
			}
		});
		btnBrezilya.setBounds(775, 76, 111, 23);
		frame.getContentPane().add(btnBrezilya);

		JButton btnEkvador = new JButton("Ekvador");
		btnEkvador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ekvador'un Başkenti: Quito\nEkvador'un Nüfusu: 15.007.343\nEkvador'un Para Birimi: Abd Doları\nEkvador'un Alanı: 272.046km²");
			}
		});
		btnEkvador.setBounds(775, 101, 111, 23);
		frame.getContentPane().add(btnEkvador);

		JButton btnGuyana = new JButton("Guyana");
		btnGuyana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Guyana'nın Başkenti: Georgetown\nGuyana'nın Nüfusu: 744.768\nGuyana'nın Para Birimi: Guyana doları\nGuyana'nın Alanı: 214.970km²");
			}
		});
		btnGuyana.setBounds(775, 128, 111, 23);
		frame.getContentPane().add(btnGuyana);

		JButton btnKolombiya = new JButton("Kolombiya");
		btnKolombiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kolombiya'nın Başkenti: Bogotá\nKolombiya'nın Nüfusu: 44.725.543\nKolombiya'nın Para Birimi: Kolombiya pesosu\n Kolombiya'nın Alanı: 1.141.748km²");
			}
		});
		btnKolombiya.setBounds(775, 154, 111, 23);
		frame.getContentPane().add(btnKolombiya);

		JButton btnParaguay = new JButton("Paraguay");
		btnParaguay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Paraguay'ın Başkenti: Asunción\nParaguay'ın Nüfusu: 6.459.058\nParaguay'ın Para Birimi: Paraguay guaranísi\nParaguay'ın Alanı: 406.750km²");
			}
		});
		btnParaguay.setBounds(775, 180, 111, 23);
		frame.getContentPane().add(btnParaguay);

		JButton btnPeru = new JButton("Peru");
		btnPeru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Peru'nun Başkenti: Lima\nPeru'nun Nüfusu: 29.248.943\nPeru'nun Para Birimi: Nuevo Sol\nPeru'nun Alanı: 1.285.220km²");
			}
		});
		btnPeru.setBounds(775, 205, 111, 23);
		frame.getContentPane().add(btnPeru);

		JButton btnSurinam = new JButton("Surinam");
		btnSurinam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Surinam'ın Başkenti: Paramaribo\nSurinam'ın Nüfusu: 491.989\nSurinam'ın Para Birimi: Surinam doları\nSurinam'ın Alanı: 163.270km²");
			}
		});
		btnSurinam.setBounds(775, 231, 111, 23);
		frame.getContentPane().add(btnSurinam);

		JButton btnili = new JButton("Şili");
		btnili.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Şili'nin Başkenti: Santiago\nŞili'nin Nüfusu: 16.888.760\nŞili'nin Para Birimi: Şili pesosu\nŞili'nin Alanı:756.950km²");
			}
		});
		btnili.setBounds(775, 257, 111, 23);
		frame.getContentPane().add(btnili);

		JButton btnVenezuela = new JButton("Venezuela");
		btnVenezuela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Venezuela'nın Başkenti: Caracas\nVenezuela'nın Nüfusu: 31.416.000\nVenezuela'nın Para Birimi: Venezuela bolivarı\nVenezuela'nın Alanı: 916.445km²");
			}
		});
		btnVenezuela.setBounds(775, 307, 111, 23);
		frame.getContentPane().add(btnVenezuela);

		JButton btnUruguay = new JButton("Uruguay");
		btnUruguay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Uruguay'ın Başkenti: Montevideo\nUruguay'ın Nüfusu: 3.308.535\nUruguay'ın Para Birimi: Uruguay pesosu\nUruguay'ın Alanı: 176.220km²");
			}
		});
		btnUruguay.setBounds(775, 279, 111, 29);
		frame.getContentPane().add(btnUruguay);

		JTextArea txtrAfrikalkeleri_1 = new JTextArea();
		txtrAfrikalkeleri_1.setForeground(UIManager
				.getColor("ComboBox.selectionBackground"));
		txtrAfrikalkeleri_1.setText("                     Afrika Ülkeleri");
		txtrAfrikalkeleri_1.setBackground(new Color(255, 140, 0));
		txtrAfrikalkeleri_1.setBounds(891, 6, 245, 16);
		frame.getContentPane().add(txtrAfrikalkeleri_1);

		JButton btnNewButton_1 = new JButton("Angola");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Angola'nın Başkenti: Luanda\nAngola'nın Nüfusu: 12.799.293	\nAngola'nın Para Birimi: Kwanza\nAngola'nın Alanı: 1.246.700km²");
			}
		});
		btnNewButton_1.setBounds(881, 22, 93, 29);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnGineBissau = new JButton("Gine Bissau");
		btnGineBissau.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnGineBissau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gine Bissau'nun Başkenti: Bissau\nGine Bissau'nun Nüfusu: 1.533.964\nGine Bissau'nun Para Birimi: CFA frangı\nGine Bissau'nun Alanı: 36.125km²");
			}
		});
		btnGineBissau.setBounds(965, 23, 93, 29);
		frame.getContentPane().add(btnGineBissau);

		JButton btnNijer = new JButton("Nijer");
		btnNijer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Nijer'in Başkenti: Niamey\nNijer'in Nüfusu: 15.306.252\nNijer'in Para Birimi: CFA frangı\nNijer'in Alanı: 1.267.000km²");
			}
		});
		btnNijer.setBounds(1049, 22, 93, 29);
		frame.getContentPane().add(btnNijer);

		JButton btnBenin = new JButton("Benin");
		btnBenin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Benin'in Başkenti: Porto-Novo\nBenin'in Nüfusu: 8.791.832\nBenin'in Para Birimi: CFA frangı\nBenin'in Alanı: 112.622km²");
			}
		});
		btnBenin.setBounds(881, 47, 93, 29);
		frame.getContentPane().add(btnBenin);

		JButton btnGneyAfrikaCumhuriyeti = new JButton("Güney Sudan");
		btnGneyAfrikaCumhuriyeti.setFont(new Font("Lucida Grande", Font.PLAIN,
				12));
		btnGneyAfrikaCumhuriyeti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Güney Sudan'ın Başkenti: Cuba, Sudan\nGüney Sudan'ın Nüfusu: 8.260.490\nGüney Sudan'ın Para Birimi: Sudan sterlini\nGüney Sudan'ın Alanı 644.329km²:");
			}
		});
		btnGneyAfrikaCumhuriyeti.setBounds(965, 47, 96, 29);
		frame.getContentPane().add(btnGneyAfrikaCumhuriyeti);

		JButton btnNijerya = new JButton("Nijerya");
		btnNijerya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Nijerya'nın Başkenti: Abuja\nNijerya'nın Nüfusu: 149.229.090\nNijerya'nın Para Birimi: Nijerya nairası\nNijerya'nın Alanı: 923.768km²");
			}
		});
		btnNijerya.setBounds(1049, 47, 93, 29);
		frame.getContentPane().add(btnNijerya);

		JButton btnBostvana = new JButton("Bostvana");
		btnBostvana.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnBostvana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Bostvana'nın Başkenti: Gaborone\nBostvana'nın Nüfusu: 1.990.876\nBostvana'nın Para Birimi: Botsvana pulası\nBostvana'nın Alanı: 581.730km²");
			}
		});
		btnBostvana.setBounds(881, 74, 93, 29);
		frame.getContentPane().add(btnBostvana);

		JButton btnKamerun = new JButton("Kamerun");
		btnKamerun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kamerun'un Başkenti: Yaoundé\nKamerun'un Nüfusu: 18.879.301\nKamerun'un Para Birimi: CFA frangı\nKamerun'un Alanı: 475.440km²");
			}
		});
		btnKamerun.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnKamerun.setBounds(965, 74, 93, 29);
		frame.getContentPane().add(btnKamerun);

		JButton btnOrtaAfrikaCu = new JButton("Orta Afrika");
		btnOrtaAfrikaCu.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnOrtaAfrikaCu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Orta Afrika'nın Başkenti: Bangui\nOrta Afrika'nın Nüfusu: 4.511.488\nOrta Afrika'nın Para Birimi: CFA frangı\nOrta Afrika'nın Alanı: 622.984km²");
			}
		});
		btnOrtaAfrikaCu.setBounds(1049, 74, 93, 29);
		frame.getContentPane().add(btnOrtaAfrikaCu);

		JButton btnBurkinaFaso = new JButton("Burkina Faso");
		btnBurkinaFaso.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnBurkinaFaso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Burkina Faso'nun Başkenti: Ouagadougou\nBurkina Faso'nun Nüfusu: 15.746.232\nBurkina Faso'nun Para Birimi: CFA frangı\nBurkina Faso'nun Alanı: 274.200km²");
			}
		});
		btnBurkinaFaso.setBounds(881, 99, 93, 29);
		frame.getContentPane().add(btnBurkinaFaso);

		JButton btnKenya = new JButton("Kenya");
		btnKenya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kenya'nın Başkenti: Nairobi\nKenya'nın Nüfusu: 39.002.772\nKenya'nın Para Birimi: Kenya şilini\nKenya'nın Alanı: 580.367km²");
			}
		});
		btnKenya.setBounds(965, 98, 93, 29);
		frame.getContentPane().add(btnKenya);

		JButton btnRuanda = new JButton("Ruanda");
		btnRuanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ruanda'nın Başkenti: Kigali\nRuanda'nın Nüfusu: 10.473.282\nRuanda'nın Para Birimi: Ruanda frangı\nRuanda'nın Alanı:26.338");
			}
		});
		btnRuanda.setBounds(1049, 98, 93, 29);
		frame.getContentPane().add(btnRuanda);

		JButton btnBurundi = new JButton("Burundi");
		btnBurundi.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnBurundi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Burundi'nin Başkenti: Bujumbura\nBurundi'nin Nüfusu: 8.988.091\nBurundi'nin Para Birimi: Burundi frangı\nBurundi'nin Alanı: 27.830km²");
			}
		});
		btnBurundi.setBounds(881, 126, 93, 29);
		frame.getContentPane().add(btnBurundi);

		JButton btnKomorlar = new JButton("Komorlar");
		btnKomorlar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnKomorlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Komorlar'ın Başkenti: Moroni\nKomorlar'ın Nüfusu: 752.438\nKomorlar'ın Para Birimi: Komor frangı\nKomorlar'ın Alanı: 2.235km²");
			}
		});
		btnKomorlar.setBounds(965, 126, 93, 29);
		frame.getContentPane().add(btnKomorlar);

		JButton btnSoTomVe = new JButton("São Tomé ve Príncipe");
		btnSoTomVe.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnSoTomVe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"São Tomé ve Príncipe'nın Başkenti: São Tomé\nSão Tomé ve Príncipe'nın Nüfusu: 212.679\nSão Tomé ve Príncipe'nın Para Birimi: São Tomé ve Príncipe dobrası\nSão Tomé ve Príncipe'nın Alanı: 964km²");
			}
		});
		btnSoTomVe.setBounds(1049, 125, 93, 29);
		frame.getContentPane().add(btnSoTomVe);

		JButton btnCezayir = new JButton("Cezayir");
		btnCezayir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Cezayir'in Başkenti: Cezayir\nCezayir'in Nüfusu: 34.178.188\nCezayir'in Para Birimi: Cezayir dinarı\nCezayir'in Alanı: 2.381.741km²");
			}
		});
		btnCezayir.setBounds(881, 151, 93, 29);
		frame.getContentPane().add(btnCezayir);

		JButton btnKongoCum = new JButton("Kongo Cum.");
		btnKongoCum.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnKongoCum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kongo Cumhuriyeti'nin Başkenti: Brazzavil\nKongo Cumhuriyeti'nin Nüfusu: 4.012.809\nKongo Cumhuriyeti'nin Para Birimi: CFA frangı\nKongo Cumhuriyeti'nin Alanı: 342.000km²");
			}
		});
		btnKongoCum.setBounds(965, 152, 93, 29);
		frame.getContentPane().add(btnKongoCum);

		JButton btnSenegal = new JButton("Senegal");
		btnSenegal.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnSenegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Senegal'in Başkenti: Dakar\nSenegal'in Nüfusu: 13.711.597\nSenegal'in Para Birimi: CFA frangı\nSenegal'in'nın Alanı: 196.722km²");
			}
		});
		btnSenegal.setBounds(1049, 152, 93, 29);
		frame.getContentPane().add(btnSenegal);

		JButton btneyseller = new JButton("Şeyseller");
		btneyseller.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btneyseller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Şeyseller'in Başkenti: Victoria\nŞeyseller'in Nüfusu: 87.476\nŞeyseller'in Para Birimi: Seyşeller rupisi\nŞeyseller'in Alanı: 455km²");
			}
		});
		btneyseller.setBounds(1049, 178, 93, 29);
		frame.getContentPane().add(btneyseller);

		JButton btnLesota = new JButton("Lesota");
		btnLesota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Lesoto'nun Başkenti: Maseru\nLesoto'nun Nüfusu: 2.130.819	\nLesoto'nun Para Birimi: Loti\nLesoto'nun Alanı: 30.355km²");
			}
		});
		btnLesota.setBounds(965, 177, 93, 29);
		frame.getContentPane().add(btnLesota);

		JButton btnCibuti = new JButton("Cibuti");
		btnCibuti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Cibuti'nin Başkenti: Cibuti\nCibuti'nin Nüfusu: 516.055\nCibuti'nin Para Birimi: Cibuti frangı\nCibuti'nin Alanı: 23.200km²");
			}
		});
		btnCibuti.setBounds(881, 177, 93, 29);
		frame.getContentPane().add(btnCibuti);

		JButton btnad = new JButton("Kongo Dem");
		btnad.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Demokratik Kongo Cumhuriyeti'nin Başkenti: Kinşasa\nDemokratik Kongo Cumhuriyeti'nin Nüfusu: 68.692.542\nDemokratik Kongo Cumhuriyeti'nin Para Birimi: Kongo frangı\nDemokratik Kongo Cumhuriyeti'nin Alanı: 2.344.858km²");
			}
		});
		btnad.setBounds(881, 203, 93, 29);
		frame.getContentPane().add(btnad);

		JButton btnEkvadorGinesi = new JButton("Ekvador ginesi");
		btnEkvadorGinesi.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnEkvadorGinesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Ekvador Ginesi'nin Başkenti: Malabo\nEkvador Ginesi'nin Nüfusu: 633.441\nEkvador Ginesi'nin Para Birimi: CFA frangı\nEkvador Ginesi'nin Alanı: 28.051km²");
			}
		});
		btnEkvadorGinesi.setBounds(881, 229, 93, 29);
		frame.getContentPane().add(btnEkvadorGinesi);

		JButton btnEritre = new JButton("Eritre");
		btnEritre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Eritre'nin Başkenti Başkenti: Asmara\nEritre'nin Nüfusu: 5.647.168\nEritre'nin Para Birimi: Eritre nakfası\nEritre'nin Alanı: 117.600km²");
			}
		});
		btnEritre.setBounds(881, 254, 93, 29);
		frame.getContentPane().add(btnEritre);

		JButton btnEtiyopya = new JButton("Etiyopya");
		btnEtiyopya.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnEtiyopya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Etiyopya'nın Başkenti: Addis Ababa\nEtiyopya'nın Nüfusu: 85.237.338\nEtiyopya'nın Para Birimi: Birr\nEtiyopya'nın Alanı: 1.104.300km²");
			}
		});
		btnEtiyopya.setBounds(881, 280, 93, 29);
		frame.getContentPane().add(btnEtiyopya);

		JButton btnFas = new JButton("Fas");
		btnFas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Fas'ın Başkenti: Rabat\nFas'ın Nüfusu: 34.859.364\nFas'ın Para Birimi: Fas dirhemi\nFas'ın Alanı: 446.550km²");
			}
		});
		btnFas.setBounds(881, 304, 93, 29);
		frame.getContentPane().add(btnFas);

		JButton btnFildiiSahili = new JButton("Fildişi Sahili");
		btnFildiiSahili.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Fildişi Sahili'nin Başkenti: Yamoussoukro\nFildişi Sahili'nin Nüfusu: 20.617.068\nFildişi Sahili'nin Para Birimi: CFA frangı\nFildişi Sahili'nin Alanı: 322.463km²");
			}
		});
		btnFildiiSahili.setBounds(881, 330, 93, 29);
		frame.getContentPane().add(btnFildiiSahili);

		JButton btnGabon = new JButton("Gabon");
		btnGabon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gabon'un Başkenti: Libreville\nGabon'un Nüfusu: 1.514.993\nGabon'un Para Birimi: CFA frangı\nGabon'un Alanı: 267.667km²");
			}
		});
		btnGabon.setBounds(881, 355, 93, 29);
		frame.getContentPane().add(btnGabon);

		JButton btnGambiya = new JButton("Gambiya");
		btnGambiya.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnGambiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gambiya'nın Başkenti: Banjul\nGambiya'nın Nüfusu: 1.782.893\nGambiya'nın Para Birimi: Dalasi\nGambiya'nın Alanı: 11.295km²");
			}
		});
		btnGambiya.setBounds(881, 382, 96, 29);
		frame.getContentPane().add(btnGambiya);

		JButton btnGana = new JButton("Gana");
		btnGana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gana'nın Başkenti: Akra\nGana'nın Nüfusu: 23.832.495\nGana'nın Para Birimi: Cedi\nGana'nın Alanı: 238.533km²");
			}
		});
		btnGana.setBounds(881, 407, 96, 29);
		frame.getContentPane().add(btnGana);

		JButton btnGine = new JButton("Gine");
		btnGine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Gine'nin Başkenti: Konakri\nGine'nin Nüfusu: 10.057.975\nGine'nin Para Birimi: Gine frangı\nGine'nin Alanı: 245.857km²");
			}
		});
		btnGine.setBounds(881, 432, 96, 29);
		frame.getContentPane().add(btnGine);

		JButton btnLiberya = new JButton("Liberya");
		btnLiberya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Liberya'nın Başkenti: Monrovia\nLiberya'nın Nüfusu: 3.441.790\nLiberya'nın: Para Birimi: Liberya doları\nLiberya'nın Alanı: 111.369km²");
			}
		});
		btnLiberya.setBounds(965, 202, 93, 29);
		frame.getContentPane().add(btnLiberya);

		JButton btnLibya = new JButton("Libya");
		btnLibya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Libya'nın Başkenti: Trablus\nLibya'nın Nüfusu: 6.310.434\nLibya'nın Para Birimi: Libya dinarı\nLibya'nın Alanı: 1.759.540km²");
			}
		});
		btnLibya.setBounds(965, 228, 93, 29);
		frame.getContentPane().add(btnLibya);

		JButton btnMadagaskar = new JButton("Madagaskar");
		btnMadagaskar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnMadagaskar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Madagaskar'ın Başkenti: Antananarivo\nMadagaskar'ın Nüfusu: 20.653.556\nMadagaskar'ın Para Birimi: Ariary\nMadagaskar'ın Alanı: 587.041km²");
			}
		});
		btnMadagaskar.setBounds(965, 255, 93, 29);
		frame.getContentPane().add(btnMadagaskar);

		JButton btnMalavi = new JButton("Malavi");
		btnMalavi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Malavi'nin Başkenti: Lilongwe\nMalavi'nin Nüfusu: 14.268.711\nMalavi'nin Para Birimi: Malavi kwachası\nMalavi'nin Alanı: 118.484km²");
			}
		});
		btnMalavi.setBounds(965, 279, 93, 29);
		frame.getContentPane().add(btnMalavi);

		JButton btnMali = new JButton("Mali");
		btnMali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mali'nin Başkenti: Bamako\nMali'nin Nüfusu: 12.666.987\nMali'nin Para Birimi: CFA frangı\nMali'nin Alanı: 1.240.1924km²");
			}
		});
		btnMali.setBounds(965, 304, 93, 29);
		frame.getContentPane().add(btnMali);

		JButton btnMouritius = new JButton("Mouritius");
		btnMouritius.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnMouritius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mauritius'un Başkenti: Port Louis\nMauritius'un Nüfusu: 1.284.264\nMauritius'un Para Birimi: Mauritius rupisi\nMauritius'un Alanı: 2.040km²");
			}
		});
		btnMouritius.setBounds(965, 331, 93, 29);
		frame.getContentPane().add(btnMouritius);

		JButton btnMsr_1 = new JButton("Mısır");
		btnMsr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mısır'ın Başkenti Başkenti: Kahire\nMısır'ın Nüfusu: 83.082.869\nMısır'ın Para Birimi: Mısır lirası\nMısır'ın Alanı: 1.001.450km²");
			}
		});
		btnMsr_1.setBounds(965, 355, 93, 29);
		frame.getContentPane().add(btnMsr_1);

		JButton btnMoritanya = new JButton("Moritanya");
		btnMoritanya.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnMoritanya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Moritanya'nın Başkenti: Nouakchott\nMoritanya'nın Nüfusu: 3.129.486\nMoritanya'nın Para Birimi: Ugiya\nMoritanya'nın Alanı: 1.030.700km²");
			}
		});
		btnMoritanya.setBounds(965, 381, 93, 29);
		frame.getContentPane().add(btnMoritanya);

		JButton btnMozambik = new JButton("Mozambik");
		btnMozambik.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnMozambik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mozambik'in Başkenti: Maputo\nMozambik'in Nüfusu: 21.669.278\nMozambik'in Para Birimi: Metical\nMozambik'in Alanı: 799.380km²");
			}
		});
		btnMozambik.setBounds(965, 408, 93, 29);
		frame.getContentPane().add(btnMozambik);

		JButton btnNamibya = new JButton("Namibya");
		btnNamibya.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNamibya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Namibya'nın Başkenti: Windhoek\nNamibya'nın Nüfusu: 2.108.665\nNamibya'nın Para Birimi: Namibya doları\nNamibya'nın Alanı: 824.292km²");
			}
		});
		btnNamibya.setBounds(965, 433, 93, 29);
		frame.getContentPane().add(btnNamibya);

		JButton btnSierraLeone = new JButton("Sierra Leone");
		btnSierraLeone.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnSierraLeone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Sierra Leone'nin Başkenti: Freetown\nSierra Leone'nin Nüfusu: 6.440.053\nSierra Leone'nin Para Birimi: Sierra Leone leonesi\nSierra Leone'nin'nın Alanı: 71.740km²");
			}
		});
		btnSierraLeone.setBounds(1049, 203, 93, 29);
		frame.getContentPane().add(btnSierraLeone);

		JButton btnS = new JButton("Somali");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Somali'nin Başkenti: Mogadişu\nSomali'nin Nüfusu: 9.832.017\nSomali'nin Para Birimi: Somali şilini\nSomali'nin Alanı: 637.657km²");
			}
		});
		btnS.setBounds(1049, 228, 93, 29);
		frame.getContentPane().add(btnS);

		JButton btnSvaziland = new JButton("Sudan");
		btnSvaziland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Sudan'ın Başkenti: Hartum\nSudan'ın Nüfusu: 45.047.502\nSudan'ın Para Birimi: Sudan sterlini\nSudan'ın Alanı: 1.861.484km²");
			}
		});
		btnSvaziland.setBounds(1049, 254, 93, 29);
		frame.getContentPane().add(btnSvaziland);

		JButton btnSvaziland_1 = new JButton("Svaziland");
		btnSvaziland_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnSvaziland_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Svaziland'ın Başkenti: Mbabane = İdarî\nLobamba = Krallık Ve Yasama\nSvaziland'ın Nüfusu: 1.123.913\nSvaziland'ın Para Birimi: Lilangeni\nSvaziland'ın Alanı: 17.364km²");
			}
		});
		btnSvaziland_1.setBounds(1049, 280, 93, 29);
		frame.getContentPane().add(btnSvaziland_1);

		JButton btnTanzany = new JButton("Tanzanya");
		btnTanzany.setForeground(Color.BLACK);
		btnTanzany.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnTanzany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tanzanya'nın Başkenti: Dodoma\nTanzanya'nın Nüfusu: 41.048.532\nTanzanya'nın Para Birimi: Tanzanya şilini\nTanzanya'nın Alanı: 947.300km²");
			}
		});
		btnTanzany.setBounds(1049, 305, 93, 29);
		frame.getContentPane().add(btnTanzany);

		JButton btnTogo = new JButton("Togo");
		btnTogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Togo'nun Başkenti: Lomé\nTogo'nun Nüfusu: 6.019.877\nTogo'nun Para Birimi: CFA frangı\nTogo'nun Alanı :56.785km²");
			}
		});
		btnTogo.setBounds(1049, 330, 93, 29);
		frame.getContentPane().add(btnTogo);

		JButton btnTunus = new JButton("Tunus");
		btnTunus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tusun'un Başkenti: Tunus\nTusun'un Nüfusu: 10.486.339\nTusun'un Para Birimi: Tunus dinarı\nTusun'un Alanı: 10.486.339km²");
			}
		});
		btnTunus.setBounds(1049, 355, 93, 29);
		frame.getContentPane().add(btnTunus);

		JButton btnYeilBurunAdalar = new JButton("Uganda");
		btnYeilBurunAdalar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnYeilBurunAdalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Uganda'nın Başkenti: Kampala\nUganda'nın Nüfusu: 32.369.558\nUganda'nın Para Birimi: Uganda şilini\nUganda'nın Alanı: 241.038km²");
			}
		});
		btnYeilBurunAdalar.setBounds(1049, 382, 93, 29);
		frame.getContentPane().add(btnYeilBurunAdalar);

		JButton btnYeilBurunAdalar_1 = new JButton("Yeşil Burun Adaları");
		btnYeilBurunAdalar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Yeşil Burun Adaları'nın Başkenti: Praia\nYeşil Burun Adaları'nın Nüfusu: 429.474\nYeşil Burun Adaları'nın Para Birimi: Yeşil Burun Adaları eskudosu\nYeşil Burun Adaları'nın Alanı: 4.033km²");
			}
		});
		btnYeilBurunAdalar_1.setBounds(1049, 407, 93, 29);
		frame.getContentPane().add(btnYeilBurunAdalar_1);

		JButton btnZambiya = new JButton("Zambiya");
		btnZambiya.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnZambiya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Zambiya'nın Başkenti: Lusaka\nZambiya'nın Nüfusu: 11.862.740\nZambiya'nın Para Birimi: Zambiya kwachası\nZambiya'nın Alanı: 752.618	km²");
			}
		});
		btnZambiya.setBounds(1049, 433, 93, 29);
		frame.getContentPane().add(btnZambiya);

		JTextArea txtrOkyanusya = new JTextArea();
		txtrOkyanusya.setText("  Okyanusya");
		txtrOkyanusya.setBackground(new Color(51, 255, 255));
		txtrOkyanusya.setBounds(1148, 6, 82, 16);
		frame.getContentPane().add(txtrOkyanusya);

		JButton btnAvusturalya = new JButton("Avusturalya");
		btnAvusturalya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Avusturalya'nın Başkenti: Kanberra\nAvusturalya'nın Nüfusu: 21.262.641\nAvusturalya'nın Para Birimi: Avustralya doları \nAvusturalya'nın Alanı: 7.686.850km²");
			}
		});
		btnAvusturalya.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnAvusturalya.setBounds(1135, 22, 101, 29);
		frame.getContentPane().add(btnAvusturalya);

		JButton btnEndonezya_2 = new JButton("Endonezya");
		btnEndonezya_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Endonezya'nın Başkenti: Cakarta\nEndonezya'nınn Nüfusu: 240.271.522\nEndonezya'nın Para Birimi: Endonezya rupiahı\nEndonezya'nın Alanı: 1.919.440km²");
			}
		});
		btnEndonezya_2.setBounds(1135, 47, 101, 29);
		frame.getContentPane().add(btnEndonezya_2);

		JButton btnFiji = new JButton("Fiji");
		btnFiji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Fiji'nin Başkenti: Suva\nFiji'nin Nüfusu: 944.720\nFiji'nin Para Birimi: Fiji doları\nFiji'nin Alanı: 944.720km²");
			}
		});
		btnFiji.setBounds(1135, 73, 101, 29);
		frame.getContentPane().add(btnFiji);

		JButton btnKiribati = new JButton("Kiribati");
		btnKiribati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Kiribati'nin Başkenti: Güney Tarava\nKiribati'nin Nüfusu: 112.850\nKiribati'nin Para Birimi: Avustralya doları\nKiribati'nin Alanı: 811km²");
			}
		});
		btnKiribati.setBounds(1135, 98, 101, 29);
		frame.getContentPane().add(btnKiribati);

		JButton btnMarshallAdalar = new JButton("Marshall Adaları");
		btnMarshallAdalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Marshall Adaları'nın Başkenti: Majuro\nMarshall Adaları'nın Nüfusu: 64.522\nMarshall Adaları'nın Para Birimi: ABD doları \nMarshall Adaları'nın Alanı: 181,3km²");
			}
		});
		btnMarshallAdalar.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnMarshallAdalar.setBounds(1135, 126, 101, 29);
		frame.getContentPane().add(btnMarshallAdalar);

		JButton btnMikronezyaFederalDevletleri = new JButton(
				"Mikronezya Federal Devletleri");
		btnMikronezyaFederalDevletleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Mikronezya Federal Devletleri'nin Başkenti: Palikir\nMikronezya Federal Devletleri'nin Nüfusu: 107.434\nMikronezya Federal Devletleri'nin Para Birimi: ABD doları\nMikronezya Federal Devletleri'nin Alanı: 702km²");
			}
		});
		btnMikronezyaFederalDevletleri.setBounds(1135, 151, 101, 29);
		frame.getContentPane().add(btnMikronezyaFederalDevletleri);

		JButton btnNaur = new JButton("Nauru");
		btnNaur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Nauru'nun Başkenti: X\nNauru'nun Nüfusu: 14.019\nNauru'nun Para Birimi: Avustralya doları\nNauru'nun Alanı: 21km²");
			}
		});
		btnNaur.setBounds(1135, 177, 101, 29);
		frame.getContentPane().add(btnNaur);

		JButton btnPalau = new JButton("Palau");
		btnPalau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Palau'nun Başkenti: Melekeok\nPalau'nun Nüfusu: 20.796\nPalau'nun Para Birimi: ABD doları\nPalau'nun Alanı: 458km²");
			}
		});
		btnPalau.setBounds(1135, 202, 105, 29);
		frame.getContentPane().add(btnPalau);

		JButton btnPapauYeniGine = new JButton("Papau Yeni Gine");
		btnPapauYeniGine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Papau Yeni Gine'nin Başkenti: Port Moresby\nPapau Yeni Gine'nin Nüfusu: 6.057.263\nPapau Yeni Gine'nin Para Birimi: Papua Yeni Gine kinası\nPapau Yeni Gine'nin Alanı: 462.840km²");
			}
		});
		btnPapauYeniGine.setFont(new Font("Papau Yeni Gine", Font.PLAIN, 11));
		btnPapauYeniGine.setBounds(1135, 229, 101, 29);
		frame.getContentPane().add(btnPapauYeniGine);

		JButton btnSamo = new JButton("Samoa");
		btnSamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Samoa'nın Başkenti: Apia\nSamoa'nın Nüfusu: 219.998\nSamoa'nın Para Birimi: Samoa talası\nSamoa'nın Alanı: 2.944km²");
			}
		});
		btnSamo.setBounds(1135, 254, 101, 29);
		frame.getContentPane().add(btnSamo);

		JButton btnSolomonAdalar = new JButton("Solomon Adaları");
		btnSolomonAdalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Solomon Adaları'nın Başkenti: Honiara\nSolomon Adaları'nın Nüfusu: 595.613\nSolomon Adaları'nın Para Birimi: Solomon Adaları doları \nSolomon Adaları'nın Alanı: 28.450km²");
			}
		});
		btnSolomonAdalar.setFont(new Font("Solomon Adaları", Font.PLAIN, 11));
		btnSolomonAdalar.setBounds(1135, 280, 101, 29);
		frame.getContentPane().add(btnSolomonAdalar);

		JButton btnTongo = new JButton("Tongo");
		btnTongo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tongo'nun Başkenti: Nuku'alofa\nTongo'nun Nüfusu: 120.898\nTongo'nun Para Birimi: Pa'anga\nTongo'nun Alanı: 120.898km²");
			}
		});
		btnTongo.setBounds(1135, 304, 101, 29);
		frame.getContentPane().add(btnTongo);

		JButton btnZimbabve = new JButton("Zimbabve");
		btnZimbabve.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnZimbabve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Zimbabve'nin Başkenti: Harare\nZimbabve'nin Nüfusu: 13,061,239\nZimbabve'nin Para Birimi: ABD doları\nZimbabve'nin Alanı: 390.757km²");
			}
		});
		btnZimbabve.setBounds(1049, 460, 93, 29);
		frame.getContentPane().add(btnZimbabve);

		JButton btnTuvalu = new JButton("Tuvalu");
		btnTuvalu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Tuvalu'nun Başkenti: Funafuti\nTuvalu'nun Nüfusu: 12.373\nTuvalu'nun Para Birimi: Tuvalu doları, Avustralya doları\nTuvalu'nun Alanı: 26km²");
			}
		});
		btnTuvalu.setBounds(1135, 330, 101, 29);
		frame.getContentPane().add(btnTuvalu);

		JButton btnVanuatu = new JButton("Vanuatu");
		btnVanuatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Vanuatu'nun Başkenti: Port Vila\nVanuatu'nun Nüfusu: 218.519\nVanuatu'nun Para Birimi: Vatu\nVanuatu'nun Alanı: 12.200km²");
			}
		});
		btnVanuatu.setBounds(1135, 355, 101, 29);
		frame.getContentPane().add(btnVanuatu);

		JButton btnYeniZelanda = new JButton("Yeni Zelanda");
		btnYeniZelanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Yeni Zelanda'nın Başkenti: Wellington\nYeni Zelanda'nın Nüfusu: 4.213.418\nYeni Zelanda'nın Para Birimi: Yeni Zelanda doları\nYeni Zelanda'nın Alanı: 268.680km²");
			}
		});
		btnYeniZelanda.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnYeniZelanda.setBounds(1135, 382, 101, 29);
		frame.getContentPane().add(btnYeniZelanda);

	}
}
