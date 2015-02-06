package ejemplos;

import javax.xml.parsers.DocumentBuilder;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.XPatherException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PalabraAleatoria {
	public static String palabra() {
		String urlPalabraAleatoria = "http://www.palabrasque.com/palabra-aleatoria.php";
		// Clean Builder
		CleanerProperties props = new CleanerProperties();
		// set some properties to non-default values
		props.setTranslateSpecialEntities(true);
		props.setTransResCharsToNCR(true);
		props.setOmitComments(true);
		// Object[]
		// palabra=tagNode.evaluateXPath("/html/body/center/font[1]/strong");
		Object[] palabra = null;
		try {
			URL url = new URL(urlPalabraAleatoria);
			HttpURLConnection httpcon = (HttpURLConnection) url
					.openConnection();
			httpcon.addRequestProperty("User-Agent", "Mozilla/4.76");
			TagNode tagNode = new HtmlCleaner(props).clean(httpcon
					.getInputStream());
			// guardar una copia
			// new PrettyXmlSerializer(props).writeToFile(
			// tagNode, "archivos/palabra.xml", "utf-8");
			palabra = tagNode.evaluateXPath("//strong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ((StringBuilder) ((TagNode) palabra[1]).getText()).toString();
	}

	public static void main(String[] args) throws IOException, XPatherException {
		System.out.println("Palabra:" + palabra());
	}
}
