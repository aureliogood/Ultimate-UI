package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_1tv8uy8;
import dev.xqedii.ultimateUI.Xqedii_ydhb08o;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class TemplateBase {
   public static final String Xqedii_2ygilo890otxl = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String EDITOR_TARGET_ID_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "f17hLJC2ZgVpJo3zIghYkNHy1UWqHA3PRsj/m80iYbb7WMDl9GCbIGzq/4z3RPrVcUUXtyMkvvJxjjCATXr7Iw=="
   );
   public static final String EDITOR_TARGET_KIND_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "T4pbU9AoJFYdq/bp6e/tcHrv1Atz8gqNvi1Kj4wUM/Xha5AAwM2H9A3Zl9TdG7tayf/niC7YX88Px/R9rMjbLglGzCc="
   );
   public static final String EDITOR_TARGET_PATH_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "wqcn2TqPJuOL737G7KYTKBpASrahYaJDeWuY1D/lo7MDag/zwgsbDDVjnxyZ0MyrSIaOrv3OuV1STn5LImaIjE5lo0Y="
   );
   public static final String EDITOR_INHERIT_TARGET_TO_CHILDREN_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "Nf9AzjUt7ze/acj0+OHKQfRpg+QZo53BddfLwx3bGra2Cafteo40XZ1Iqdp9o9CmVIvMKz+e1eK4aiJgINA6tMoqDD8KhsffwxiOLDehO1NPRwSsb6iFGdnAV4pcGzl4iiw="
   );
   public static final String EDITOR_BLOCK_PATH_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "qNzEQEivG9Ze1QRJtnjJPsbAVaCwDy0zGvgChBmYAHtSQdTOzVPUG8AlIm/UDqfYGI4rPB/p9aJubm6xCEuPB3Xk"
   );
   public static final String EDITOR_COMPONENT_NAME_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "KtFSFlBWRup7+MM8y3zKjd+UoyTj08D1nSHOljlamlnlMxtP43qoukF2crBct733NawvUviI7+BW1qw9sJUjBHXub67FPx2Vjsk="
   );
   public static final String EDITOR_BINDING_X_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "6PlcdDXTMAwXIrQ8cv1DFtn1G8/oVDJIP9e4Kmz4jWAiojDWZYnFfoioSbkaAwCS/hkNZS4p+cAsGoKxMGIivA=="
   );
   public static final String EDITOR_BINDING_Y_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "rw0EcTSXn6r/rar4UqaKEG0+kkry3d2xnNqZ+djZF8OhaE1uR0rqdbdRC5laGRski7Aj4qAN2MCTOUt54XM06g=="
   );
   public static final String EDITOR_BINDING_WIDTH_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "SPmQNN5/s4o01yoYd7SbJUqez8ILtj1nOcuNN6llBECPhN5yB7u6Mpwf7wGmFgu+kyUiTImx2UhqWSLStNWbTcutvWXdOOc0"
   );
   public static final String EDITOR_BINDING_HEIGHT_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "MJY/UqAtFhoG3PizR1wEOZQv7EdiHXvAA/3FmyFQFLfxes78fs0MyUN+r0jFTkmONA0dYMZbIL1iyw/ZIXWHP5/bQsMGt8DF0GM="
   );
   public static final String EDITOR_HOVER_STATE_KEY = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
      "SYlYNO86tYixKgxfsNfXjwMXIYHuGsJpD9fx4zd45olHPqu8uYJYlY97y0yVLfeQ5bMpOnKV5PN/uJt8hRC6Rz2ARD8="
   );
   public static final String COMPONENT_HOVER_PARAM = Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z("AFMyOvebRQNWUOAdDC4sUg0M+VN3iivhatmp62xPPtZEm9VaiZA6rpuQ");
   public static final int Xqedii_31agork = 12;
   public static final int Xqedii_2xuymen = 2048;
   public static final Pattern Xqedii_3fa20jc;
   public static final Pattern Xqedii_3bp13i7;
   public final Map<YamlConfiguration, Set<String>> Xqedii_235jrwm = new WeakHashMap<>();
   public static final Map<String, String[]> Xqedii_cblp5q9;

   public abstract void Xqedii_36bgtf6(
      List<?> var1,
      Map<String, YamlConfiguration> var2,
      Map<String, Object> var3,
      double var4,
      double var6,
      List<Map<String, Object>> var8,
      int var9,
      String var10,
      Xqedii_1tv8uy8 var11,
      String var12
   );

   public abstract List<Map<String, Object>> Xqedii_301griu(
      Object var1,
      Map<String, YamlConfiguration> var2,
      Map<String, Object> var3,
      double var4,
      double var6,
      int var8,
      String var9,
      Xqedii_1tv8uy8 var10,
      String var11
   );

   static {
      if ((-1163852387 * -1163852387 + -1163852387 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3fa20jc = Pattern.compile(
            Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z(
               "y0dkrU0hCpK1QmCZcVOUpLJpKdj743LV1h2LKFgscetKMABP1OSVdDEk7tsZEkKOwqKlWrLMXIaI+LoUqo9wiWpNAFg8YeifdSX4ayNFO5YfCMdCpt/UF1NKp9xpOwDI/+jrhYv80jwXo6oW5Lu1bvL2wbp1wcRNdfQicxXKMlEo2jbe0c9P6WSVcAjbpL06llVMMRG3+A0xLLqzsJL/ZT+q"
            )
         );
         Xqedii_3bp13i7 = Pattern.compile(
            Xqedii_ydhb08o.Xqedii_3g7y7sh7nil7z("13Sba+q5GkdCRuwEaFxGNxX39H8yVarxBmOaIFGtTtmZmjcvwgSEVwD2+lS7ek43OECA9/AtABMqwjutYIM=")
         );
         Xqedii_cblp5q9 = new ConcurrentHashMap<>();
      }
   }
}
