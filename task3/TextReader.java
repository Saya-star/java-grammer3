import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	// 列挙型を使う
	public enum Mark {
		START, END
	};

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		// 総称型を利用
		List<Integer> valueList = new ObjectList<>();

		// リソース付きtry文へ変更
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr);) {

			String line = null;

			while ((line = br.readLine()) != null) {
				// オートボクシングを使う
				valueList.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 拡張for文へ変更
		for (int value : valueList) {
			System.out.println(value);
		}
	}

	// 可変長引数を使う
	public static void main(String... args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}
}
