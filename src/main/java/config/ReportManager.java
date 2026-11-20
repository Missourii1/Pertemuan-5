package config;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportManager {

    /**
     * Menampilkan jendela cetak / preview struk transaksi menggunakan JasperViewer.
     */
    public static void cetakStruk(int idTransaksi, String kasir, String tanggal, String total, List<?> listItems) {
        SwingUtilities.invokeLater(() -> {
            try {
                InputStream reportStream = null;

                // 1. Coba baca dari classpath resources
                reportStream = ReportManager.class.getResourceAsStream("/reports/struk_pembelian.jrxml");

                // 2. Fallback baca langsung dari lokasi file disk jika getResourceAsStream null
                if (reportStream == null) {
                    File[] potentialPaths = new File[] {
                        new File("src/main/resources/reports/struk_pembelian.jrxml"),
                        new File("src/reports/struk_pembelian.jrxml"),
                        new File("reports/struk_pembelian.jrxml")
                    };
                    for (File f : potentialPaths) {
                        if (f.exists()) {
                            reportStream = new FileInputStream(f);
                            break;
                        }
                    }
                }

                if (reportStream == null) {
                    JOptionPane.showMessageDialog(null, 
                        "Template struk (struk_pembelian.jrxml) tidak ditemukan!", 
                        "Error Cetak Struk", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Kompilasi template jrxml
                JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

                // Parameter nota
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("PARAM_ID_TRANSAKSI", idTransaksi);
                parameters.put("PARAM_KASIR", kasir);
                parameters.put("PARAM_TANGGAL", tanggal);
                parameters.put("PARAM_TOTAL", total);

                // Data source
                JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listItems);

                // Fill report
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

                // Tampilkan JasperViewer
                JasperViewer viewer = new JasperViewer(jasperPrint, false);
                viewer.setTitle("Preview Struk Pembelian - TX-" + idTransaksi);
                viewer.setSize(500, 650);
                viewer.setLocationRelativeTo(null);
                viewer.setAlwaysOnTop(true); // Memastikan jendela muncul di depan
                viewer.setVisible(true);

            } catch (Throwable e) {
                System.err.println("Gagal menampilkan JasperViewer: " + e.getMessage());
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, 
                    "Gagal memuat jendela cetak struk: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
