package proxy.virualproxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

public class ImageProxyTestDrive {

    public static void main(String[] args) throws MalformedURLException {
        URL imageUrl = new URL("https://www.baidu.com/link?url=SqRH0BHItFMASZJXW1EgRuYITqfYiWFm7EOvHAxoOOo83DC_3UR6o6Z-MaVj4j-d_FJXw4WMxyKGWdCVimsB_CLb2J08WMsavsrvvBEwWwC5X1VT0dbXZ24L9Lxdayk3u_JpEmjIHUlDOVImwh58wqIDer1q30RZJLEBkQPLnYqLFGMFzg_uBMngVHS9yAbyLT-aWVFBl_uUh0CO_tQhzEZDiECv04ylUP7uUoWpqQEGIP6HKq7R5J-Wvo9wp0lvqaAFw2PW9pNCIR8jLU8SVINrCJPLwb1PN_sUG7UtZ-3tRD60V8JeB3n-K7MfVJR-oBcTNx7urcbcQVllDrdwLg4IGvHr8DCGZQ9Je-iYWrd4DLOKrPocpGQO_xwk15bRdPFeJjB5cLb2ZtMsuvaJKes0EcSB-hqZIRmSPQm67w_ZzmGp3RT1jkKtxbMTs-C5ValIOhmlQ_i3iumP1JCaTLWHqoBzlBfJlEtbP-SYNcKgbFFe3VVJZrNsY0AVjBprZXBalf5EY9PCtbtTNNS0KBtvohZkGh-O5KYCXh0zB0hnVvSu7FPl5KaEda3vGALcxYW51hGZXJQIERF9hC-Q3_&wd=&eqid=b08a885900002e3e000000065bf266ed");
        ImageProxy imageProxy = new ImageProxy(imageUrl);
        ImageComponent imageComponent = new ImageComponent(imageProxy);
        JFrame frame = new JFrame("CD cover");
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

    }
}
