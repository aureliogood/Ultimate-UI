package dev.xqedii.ultimateUI.gui.parser;

import dev.xqedii.ultimateUI.Xqedii_19ino1o;
import dev.xqedii.ultimateUI.Xqedii_2aqdh8l;
import dev.xqedii.ultimateUI.Xqedii_erdgryn;
import dev.xqedii.ultimateUI.Xqedii_f2tq14t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class TemplateListLayout extends TemplateLayout {
   public static final String Xqedii_3gkdnxzp5bnza = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String[] LIST_LAYOUT_KEYS;

   public static boolean hasListLayout(Map<?, ?> var0) {
      if ((1692173186 * 1692173186 + 1692173186 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return (Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 15) != 0);
      } else {
         String[] var1 = LIST_LAYOUT_KEYS;
         int var2 = var1.length;

         for (int var3 = Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 27); var3 < var2; var3++) {
            String var4 = var1[var3];
            if (var0.get(var4) != null) {
               return (Xqedii_erdgryn.Xqedii_2egk40122q4gj(1752335439, 24) != 0);
            }
         }

         return (Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 10) != 0);
      }
   }

   public Object Xqedii_3eedyvj(Map<String, Object> var1, String... var2) {
      if ((1942488375 * 1942488375 - 1942488375 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 17); var5 < var4; var5++) {
            String var6 = var3[var5];
            Object var7 = var1.get(var6);
            if (var7 != null) {
               return var7;
            }
         }

         return null;
      }
   }

   public String Xqedii_4rolssi(Object var1) {
      if ((803426779 * 803426779 - 803426779 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==")
            : var1.toString()
               .trim()
               .toLowerCase(Locale.ROOT)
               .replace((char)Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1907324440, 29), (char)Xqedii_erdgryn.Xqedii_2egk40122q4gj(1020906001, 18))
               .replace((char)Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1764441411, 16), (char)Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(513914037, 31));
      }
   }

   public Xqedii_19ino1o Xqedii_2dpf99p(Map<String, Object> var1) {
      if ((-854850004 * (-854850004 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Object var2 = null;
         String[] var3 = LIST_LAYOUT_KEYS;
         int var4 = var3.length;

         for (int var5 = Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 14); var5 < var4; var5++) {
            String var6 = var3[var5];
            Object var7 = var1.get(var6);
            if (var7 != null) {
               var2 = this.Xqedii_2uqaav9(var7);
               if (var2 == null && this.Xqedii_20ypwqo(var7, (Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(457726442, 11) != 0))) {
                  var2 = new LinkedHashMap();
               }
               break;
            }
         }

         if (var2 == null) {
            return null;
         } else {
            Xqedii_19ino1o var18 = new Xqedii_19ino1o();
            String[] var10003 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-456366177, 18)];
            var10003[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1921273705, 0)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "EHVkq2DXWp2ePH23s8xNJ3axeSNTonugMVLgvsyLImDG0r/ko37V/5Cl0N1KPw=="
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-2044812876, 23)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "B3lwkpsWEwQkYH2dChdYWfYyIDfd08xy3p+giPWkyPRZ6FX0IVcnJho8iLmi8Vge/0azIO5m"
            );
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152611, 1)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "Q8NBKDDCjKm7Kgo1i9izuNRRNEB0KM2Wp7eEpIxh2Z3iUAoTNJk8kbA2Zl1qMjslbLhzFnN4LKs="
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(915465172, 12)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "6MA9RIldLIu6tCnP2FeuaVIC+JZOy3MNqzU+BIAEyUKZThMb"
            );
            String var19 = this.Xqedii_4rolssi(this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003));
            var18.Xqedii_1ktl8q0 = ((!var19.equals(
                     Xqedii_erdgryn.Xqedii_1ibk8jiple36q("fcd4Az+lJtPBfMaoLN5nYreZy+yqi9/8jT11EeWU2h2Xpd/rtzxqyb3Osowk3l9j")
                  )
                  && !var19.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("JgtP3vyLjTRUmXL1ET6HMXfb86VOJz9SA5sXeRTg3Od6+w=="))
                  && !var19.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("9M2XaeGFutaQm7t8GtZwBwdbT1QK3sTohzRXCw+J"))
               ? Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1642732360, 27)
               : Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 25)) != 0);
            String[] var10004 = new String[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1109898681, 7)];
            var10004[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-633155760, 14)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "gYV0MF7Fu9Kmp0IuBpckfYpnV5CBLnrcEC1RSJngKrra1VHYmKw="
            );
            var10004[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(205341545, 24)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "3ghSygmT5vvxwYXRE+xmr282zhbfcqThjwTQWnD1+fMb/T+u"
            );
            var18.Xqedii_a8ia53f = this.Xqedii_20ypwqo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10004), (Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 22) != 0)
            );
            var10004 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-322934881, 26)];
            var10004[Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 1)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "Tfhb12r8ConcWOUbW9qo5lst1A41rlYAU7gj9ySIc2vUKItN3ABtWRlO"
            );
            var10004[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224091251, 14)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "c6W45aS2eVSSboQYAFGrZwADJmuL3hrSryEmz7zsHgrnKg=="
            );
            var10004[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(2055655962, 1)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "ENmXAWz8nMIHXzvWwzx+3V98JgaP9WMkz6UKx8J2jBhjnhEQct+nSUfWoZRL5fU9CGK7b5OsQczHDA=="
            );
            var18.Xqedii_1828yvv = this.Xqedii_3iba6vo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10004), Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(2938280056482619570L, 14))
            );
            var10004 = new String[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-734621469, 4)];
            var10004[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-631463661, 22)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "9CSuBVVbi8I90PYV8szI912Jo8jv8trDFoQEm21Lk+EZvjbpC1yW8M9u/JtCUcq1wZM="
            );
            var10004[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152609, 4)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "zIP9wqCIE2gf6B5ha2689cblYGFrDkcuo5PVUJRWPpG8gM0ShDx7bacbTLMsuzeENtvXkA=="
            );
            var10004[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1776950088, 27)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "3AdmUNaQf3eoAzuCxb516am0mb2d/HYmrykgo3dQIa0ZbuRNWx5SiDSxhw0="
            );
            var18.Xqedii_15f4fpe = this.Xqedii_3iba6vo(this.Xqedii_3eedyvj((Map<String, Object>)var2, var10004), var18.Xqedii_1828yvv);
            var10003 = new String[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1921273709, 0)];
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 20)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "mNorzRa3qBOZtts6/qiSVpa0fMrv7ojefduEIWYkqKuWYfXZYb8kEKhURi1J7Du9"
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(457728490, 11)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "l2Zvopaff9GxuU8sHZpfnXHMUf2ofA3RsxI74tiHSKoxb4tDGdlv5z/5GSRjzLgZoLGQOQ=="
            );
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-994023521, 29)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "ZHpf4UVKO/Cut5Uyo1YnZ7mZcuPyya5V/StOQsxT8UFf/PGoPPieENFG"
            );
            var10003[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1351216462, 5)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "/EXdNJ7ReYGUDWBo7T5HOBxtVeWLfhi1mcGcLhT3kGMCQaDagFSf/BjqmUw="
            );
            double var20 = this.Xqedii_3iba6vo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003), Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(8251460887705232149L, 27))
            );
            if (Double.isFinite(var20) && var20 >= Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(6429792478545064255L, 55))) {
               var18.Xqedii_2kolsgj = (int)Math.round(var20);
            }

            var10003 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457150561, 11)];
            var10003[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1109898425, 7)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "GAXukMUPY+QkwgAp+MjjkfClCS05R62yuswFu1b0AmPgmIrtF86bkQAoEQnEYg=="
            );
            var10003[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1592534500, 6)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "JqEHhdRc5A1mvTK0k1aI4SdzRMpwZp16BIfol/iqLaKX5stv8N/WLC6P/erW+f8q"
            );
            double var21 = this.Xqedii_3iba6vo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003),
               Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531808705L, 15))
            );
            var10003 = new String[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-452419882, 1)];
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1277938032, 28)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "apA1F1N43QIJlccNfaImCHpNAsyAMR1geLRXWea3jzyYYhdTbmwzQ7cjn4uEyQDY"
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(457728490, 11)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "wG9/47gtu1v90gJD23IPWUZJxunNPONnrTB8kHdww8uI+HNqaXESi6XYt+KurpDrzSg="
            );
            double var9 = this.Xqedii_3iba6vo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003), Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(5792331374633706158L, 32))
            );
            var18.Xqedii_16huv8z = Double.isFinite(var21)
               ? Math.max(Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(-5886096416676668318L, 24)), var21)
               : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622106621L, 15));
            var18.Xqedii_3us42uq = Double.isFinite(var9)
               ? Math.max(Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 31)), var9)
               : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227677194753L, 27));
            String[] var10002 = new String[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-2075170702, 8)];
            var10002[Xqedii_erdgryn.Xqedii_2egk40122q4gj(666155330, 15)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "00nm+vTU0NCuPrQMMvxlrFPI9/GjRMytNGU2IApDc5448a0lwmV1wamn"
            );
            Object var11 = this.Xqedii_3eedyvj((Map<String, Object>)var2, var10002);
            Map var12 = this.Xqedii_2uqaav9(var11);
            double var13 = var12 == null
               ? this.Xqedii_3iba6vo(var11, Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(2908223945400108185L, 51)))
               : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 8));
            String var10005 = Xqedii_erdgryn.Xqedii_1ibk8jiple36q("VtvkNTcqhIOwmALvZLYr9psKAqPDrLf0UbQiybtwmmDOcg==");
            String[] var10006 = new String[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074875, 2)];
            var10006[Xqedii_erdgryn.Xqedii_2egk40122q4gj(333077665, 14)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "ucRVD2L8GDtqrsPYCbMelsZehHsv6ka8yzR1EZOutwEp078EML4ymAjWEwvb+Sez"
            );
            var10006[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(1923408781, 31)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "rig7oZR5IW2ZjmKzQPaXm7bL4US4uac2U6P12BrvBfp04KTUQUjeoaYxRUBO/pBuUuU="
            );
            var18.Xqedii_7su7kor = this.Xqedii_1sx3t99((Map<String, Object>)var2, var12, var13, var10005, var10006);
            var10005 = Xqedii_erdgryn.Xqedii_1ibk8jiple36q("KirfKT56zDSVXl8p/dZyslFIjsGGDlEVSKxuobFWrDhffd+BQ/M=");
            var10006 = new String[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-367310743, 3)];
            var10006[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-631463661, 22)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "N452+mCsuyPNLrECBv2VxRGuHC0qjs91Ppk48++8jggAbasWTawhRTwSK4j42aUoxnTADg=="
            );
            var10006[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224070771, 12)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "LDB889IMcHW+CCSxUpQIwqOnSv/CvSEBSgneJFTCFrdtwXowWmz6ZBWH/+k1a8c0vH11PTYc"
            );
            var18.Xqedii_3o7dy83 = this.Xqedii_1sx3t99((Map<String, Object>)var2, var12, var13, var10005, var10006);
            var10005 = Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Ym3NGnKl9XAKw0wSLW3V9r80guO9llGPIlFIpUD+eWB7cCajMSkftw==");
            var10006 = new String[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(444237522, 25)];
            var10006[Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 22)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "yViAtM9qLl7PYbTRzcWF3TDudyLTX7xmdfIsUSWatXxCG7S/9Bsju5sUNRHihbHyEkeS8gzc"
            );
            var10006[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1133781627, 27)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "8Tkg9Kk9Xg7Wq6bWg+4o8Fiv2BATl3jRg3CaxJz9OulLFfrInx7yykhB5Tho8pGByov1HCnerYc="
            );
            var18.Xqedii_1d0uhx9 = this.Xqedii_1sx3t99((Map<String, Object>)var2, var12, var13, var10005, var10006);
            var10005 = Xqedii_erdgryn.Xqedii_1ibk8jiple36q("hGhi5LtAbIxY99O3c1cbn4gHJyBfFJ50Kn5rl+aDzkxsbOBE");
            var10006 = new String[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-633122992, 14)];
            var10006[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1867262922, 20)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "j0w7xe+Sp/AMam4/ZOVPmdr/8U9X2GklJRtt359hm7ujXsq9m0ktVPmDSJ1iLSTaVac="
            );
            var10006[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224075379, 9)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "s3GIH9uita1hlbZ5QuV5L5KYQ0Qlx8vTPpsBzQog8h4bKPlN1GoluJQcg5KRMKUg5dMFXQ=="
            );
            var18.Xqedii_2wfw5ku = this.Xqedii_1sx3t99((Map<String, Object>)var2, var12, var13, var10005, var10006);
            var10003 = new String[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1237761497, 23)];
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1130957629, 8)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "5PUMrND2is4G6VKYwAKhpy6F6jF9GxKA+yVYObylJxiFyHjWCxrOx3r2yv/7qA=="
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(2055655960, 1)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "u9Tzwz7xFuRv1aSZWIR9mpA3R2GQXKUkJ/moqRCwvCtSRBbzxKvvOt/VrXFqdQN/"
            );
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457021537, 17)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "T1O6CSc9g3RIgdIjdQ9MnhDORR+jMb5eb9UkDS26yvE/f2CQ"
            );
            var10003[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(1923408780, 31)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "aQXK4qYTESHNaXfIPt51DFCnu26Axp5RMMI4Q9QYbJFMCMKaCphI1g=="
            );
            var10003[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-223026291, 18)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "J8nP0g/QSGgX1fxwsFkg6/gzt2X7b+dEl8Sc8bY0prOMygTfCRQ+EfIj"
            );
            String var15 = this.Xqedii_4rolssi(this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003));
            int var17 = Xqedii_erdgryn.Xqedii_2joif5me8xnte(440375392, 24);
            switch (var15.hashCode()) {
               case -896505829:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("z+YiQEVOipO4XpkWPy7IkIyR1Q78X4yIKG7eX3Haokl5P1IWclA1/Q=="))) {
                     var17 = Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-945263327, 29);
                  }
                  break;
               case 3355:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("aiMJX1v5ESvcMNdHHiUPFt+Y3P2ksAntRstKOlVdejg="))) {
                     var17 = Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(915456980, 12);
                  }
                  break;
               case 3143036:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("n+rg30ZkOIX/fS56ZLXS/jdS40OXw2O+w+sYq7L8lwoTLenc"))) {
                     var17 = Xqedii_erdgryn.Xqedii_2joif5me8xnte(-490707041, 25);
                  }
                  break;
               case 3373707:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("T4WopixqlvPsAzxcSaMQhRFekHkkzMMUMtgyVoXCjtHzch3b"))) {
                     var17 = Xqedii_erdgryn.Xqedii_2egk40122q4gj(-631463661, 22);
                  }
                  break;
               case 3387192:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("F5Gk91NfJqMlmz4G1YgpJ9VzqigFTUyurzMMpDltFStJPUub"))) {
                     var17 = Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152610, 0);
                  }
                  break;
               case 3701415:
                  if (var15.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("DERW6XLPf3HpSa8UTn5RvL6ETjEftQqsalaZ34ZRTUyHGF2F"))) {
                     var17 = Xqedii_erdgryn.Xqedii_2egk40122q4gj(1035061777, 18);
                  }
            }
            var18.Xqedii_1zsnipi = switch (var17) {
               case 0 -> Xqedii_erdgryn.Xqedii_1ibk8jiple36q("T4WopixqlvPsAzxcSaMQhRFekHkkzMMUMtgyVoXCjtHzch3b");
               case 1 -> Xqedii_erdgryn.Xqedii_1ibk8jiple36q("aiMJX1v5ESvcMNdHHiUPFt+Y3P2ksAntRstKOlVdejg=");
               case 2, 3, 4, 5 -> Xqedii_erdgryn.Xqedii_1ibk8jiple36q("F5Gk91NfJqMlmz4G1YgpJ9VzqigFTUyurzMMpDltFStJPUub");
               default -> Xqedii_erdgryn.Xqedii_1ibk8jiple36q("twcXWzhOp56ZkIwA1J4SC1mRUQeyLLP3xEaJHTSHOkN8RjUrjmE=");
            };
            var10004 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152593, 4)];
            var10004[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 2)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "ji9NhJYFyGLlWfqIis1nTrFAYFf+JjzrNUjOV72KKPRBbHd8lmCF6/M2c8+FSFvEGASUvHwTmCw="
            );
            var10004[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224073843, 10)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "8vzBZsjiHGu/QErgLhFKd0vfEWw01N4XInzdCJNFpbXPCwS5yuWVKilskrusS1EMIjCHZQqKAnHEUg=="
            );
            var10004[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1186846795, 31)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "XTy8q8BitJWoVeKIfkPoUpechzMLUPJcRhLiqw+eOrLHjAJUDF4iEiCNBrXwS4wU"
            );
            var10004[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1921273706, 0)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "85SuPwJUakBRKHGObr9GFK1b87SXi4HpBl/RWJFDTzBEpn0QxaOd1hg4"
            );
            var18.Xqedii_38mwtzj = this.Xqedii_20ypwqo(
               this.Xqedii_3eedyvj((Map<String, Object>)var2, var10004), (Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 8) != 0)
            );
            var10003 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-390043745, 26)];
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 19)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "eLIUqf520nsv8XDf6U3tu8NG1XDgpX5FqQeKVD8HcU4sKyw5FVaOjmE+LcQjvtQjpu0="
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(915456980, 12)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "67MPxJ0AVYTr2xRzuc2VQfPkcbZEBTVlg3Bdck4yZyOs533kCKIkBXQgIJsOiXMVW2S9DQ=="
            );
            var10003[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152545, 6)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "dK3dbuaOmj5zPGnLc304WjFSWSWdW1BB8PX2OVxVgvrFUkRaRuw="
            );
            var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1830930344, 13)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "yQj5fmIbzraBI0PviMj1PgESkTVAZ/C+kqMir/rxHZg5ZeaCzwY7CQ=="
            );
            String var16 = this.Xqedii_4rolssi(this.Xqedii_3eedyvj((Map<String, Object>)var2, var10003));
            var18.Xqedii_33exyo3 = var16.contains(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("KirfKT56zDSVXl8p/dZyslFIjsGGDlEVSKxuobFWrDhffd+BQ/M="));
            var18.Xqedii_2i05vhm = var16.contains(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Ym3NGnKl9XAKw0wSLW3V9r80guO9llGPIlFIpUD+eWB7cCajMSkftw=="));
            String[] var33 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152617, 1)];
            var33[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 17)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "oq5uWrzXxMNmE/7PH/GGu0O0bM2zEfHKLZ5zTnbzeWVYKqmV7b1MBmv8OeJ8kwB4MELE4UAP50HAJtpi+NP2r+Kw"
            );
            var33[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152609, 27)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "hVIyHQUnB/AsnUBQNZqsOlv5JN+WIpIWTkKo9oNZvyLV2SPs3iDDdllZ2KfZU25XWz3PYknwN4vuWjSlqakpZftu17I="
            );
            var33[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1633569658, 31)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "51OT7nEQHMueq37vkHfVgGGzphfuWqI0Cp4oEKHvtOxobdm+FYO41A=="
            );
            var33[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1266213215, 15)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "W4D4kskgGz+eTfZCmgku/0h8XtiquefHlC/OZ10DMCkg/aHXrmMhwGlD"
            );
            var33[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457136225, 14)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "TuFg/rQO6dm7/KmuTNB8aWiKJAq3QxybJPj4HDzQEVlscRliju+lqg=="
            );
            var18.Xqedii_3ca6w0f = this.Xqedii_4evrol0(
               this.Xqedii_4rolssi(this.Xqedii_3eedyvj((Map<String, Object>)var2, var33)),
               var18.Xqedii_33exyo3
                  ? Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227621893377L, 20))
                  : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(7428876237904260242L, 6)),
               Xqedii_erdgryn.Xqedii_1ibk8jiple36q("hGhi5LtAbIxY99O3c1cbn4gHJyBfFJ50Kn5rl+aDzkxsbOBE"),
               Xqedii_erdgryn.Xqedii_1ibk8jiple36q("KirfKT56zDSVXl8p/dZyslFIjsGGDlEVSKxuobFWrDhffd+BQ/M=")
            );
            String[] var34 = new String[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1141854426, 22)];
            var34[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-734621517, 4)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "g7psA6HKYLHavDZByx9JEA3LNhpLFoBpmMC55JD9YspU23dpJ6YBGVSXjiHHYqWq/Vt0l4tUi2f4pzT+pbg="
            );
            var34[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-904839775, 2)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "qxGy9StFR56UhQSctb0rCFIfcbArlKfDQ81nPXQ/Hx+Sel9yJjlzIEh4EJlN0orkpUaKpWiUlO/R51yZmnDusg=="
            );
            var34[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152613, 2)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "CxI3maz1kWCCQuQyp3SCFiiLehE5fLulbSd4ybM1EcywUfNYAVmqmw=="
            );
            var34[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1980936624, 13)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "79psjQn9QVbif9iOdRC5m2HklwkmDWO2+BdNHAU0DuBKHpTLTkU00E9n"
            );
            var34[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152993, 7)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
               "CCUVcFa/niUR1SbFpNhBzsj8B8E15pz9WB8wC3q4m4U9cdJLjtveWw=="
            );
            var18.Xqedii_1hvbfko = this.Xqedii_4evrol0(
               this.Xqedii_4rolssi(this.Xqedii_3eedyvj((Map<String, Object>)var2, var34)),
               var18.Xqedii_2i05vhm
                  ? Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(708827845522966075L, 0))
                  : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 24)),
               Xqedii_erdgryn.Xqedii_1ibk8jiple36q("VtvkNTcqhIOwmALvZLYr9psKAqPDrLf0UbQiybtwmmDOcg=="),
               Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Ym3NGnKl9XAKw0wSLW3V9r80guO9llGPIlFIpUD+eWB7cCajMSkftw==")
            );
            return var18;
         }
      }
   }

   public double Xqedii_1sx3t99(Map<String, Object> var1, Map<String, Object> var2, double var3, String var5, String... var6) {
      if (((-642396361 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Object var7 = this.Xqedii_3eedyvj(var1, var6);
         if (var7 != null) {
            return Math.max(
               Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 42)),
               this.Xqedii_3iba6vo(var7, Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 48)))
            );
         } else {
            return var2 != null
               ? Math.max(
                  Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 40)),
                  this.Xqedii_3iba6vo(var2.get(var5), Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 2)))
               )
               : Math.max(Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(-2083633345287843252L, 11)), var3);
         }
      }
   }

   public double Xqedii_4evrol0(String var1, double var2, String var4, String var5) {
      if ((-1477080457 ^ -1477080457) != 0) {
         throw new IllegalStateException();
      } else if (var1.isEmpty()) {
         return var2;
      } else if (var1.equals(var4)) {
         return Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 12));
      } else if (var1.equals(var5)) {
         return Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3992914635783899649L, 60));
      } else {
         return !var1.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Vg6WXDd0dcuka06ZCcUPTeUGLf2I5UJqhEjXSYPwTyNDRLusx2CkpQ=="))
               && !var1.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("QW+r+fDNB0zAy9FiWh042eACI4RtUnZKT1ba77WwHXIbBMd8nXrx+Q=="))
               && !var1.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("G6fQ7+8x76GFHwVfOhw9k9rffdhgpmmtOV0+ubAH0JisjxImW7nCHg=="))
            ? var2
            : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(1791241438896198981L, 19));
      }
   }

   public Xqedii_f2tq14t Xqedii_xxecgm0(Xqedii_2aqdh8l var1, int var2, Object var3) {
      if ((316024570 * 316024570 - 316024570 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var4 = this.Xqedii_2uqaav9(var3);
         String[] var10003 = new String[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-215686259, 23)];
         var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1867262922, 20)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "eM9cK5NY9wsTskduCAq0XI6M2x0vQGBoW5d1mWbX5yxb+XbRGw7nfVhcnD8e7QAYLEw="
         );
         var10003[Xqedii_erdgryn.Xqedii_2egk40122q4gj(1752335439, 24)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "ZTHSRsqClfTImf4xKl20Qzv+Wy7wkw7a+NJQFa7nMXcjA04IFEX+LDKGQBhj6gdHG6a9gg=="
         );
         var10003[Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1027827981, 0)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "twcXWzhOp56ZkIwA1J4SC1mRUQeyLLP3xEaJHTSHOkN8RjUrjmE="
         );
         double var5 = this.Xqedii_3iba6vo(
            this.Xqedii_3eedyvj(var4, var10003), Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(5876560112965239140L, 15))
         );
         String var7 = var4 != null && var4.get(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("aiMJX1v5ESvcMNdHHiUPFt+Y3P2ksAntRstKOlVdejg=")) != null
            ? var4.get(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("aiMJX1v5ESvcMNdHHiUPFt+Y3P2ksAntRstKOlVdejg=")).toString()
            : Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==");
         String[] var10002 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152609, 28)];
         var10002[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-157865916, 20)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q("T4WopixqlvPsAzxcSaMQhRFekHkkzMMUMtgyVoXCjtHzch3b");
         Object var8 = this.Xqedii_3eedyvj(var4, var10002);
         String var9 = var8 == null ? var7 : var8.toString();
         return new Xqedii_f2tq14t(
            var1, var2, Double.isFinite(var5) ? var5 : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(1777677311406805607L, 14)), var9, var7
         );
      }
   }

   public void Xqedii_95cgte7(List<Xqedii_f2tq14t> var1, Xqedii_19ino1o var2) {
      if (((-1020610593 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (Xqedii_erdgryn.Xqedii_1ibk8jiple36q("F5Gk91NfJqMlmz4G1YgpJ9VzqigFTUyurzMMpDltFStJPUub").equals(var2.Xqedii_1zsnipi)) {
         if (var2.Xqedii_38mwtzj) {
            Collections.reverse(var1);
         }
      } else {
         String var4 = var2.Xqedii_1zsnipi;
         int var5 = Xqedii_erdgryn.Xqedii_2egk40122q4gj(-1769112656, 24);
         switch (var4.hashCode()) {
            case 3355:
               if (var4.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("aiMJX1v5ESvcMNdHHiUPFt+Y3P2ksAntRstKOlVdejg="))) {
                  var5 = Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1642732360, 27);
               }
               break;
            case 3373707:
               if (var4.equals(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("T4WopixqlvPsAzxcSaMQhRFekHkkzMMUMtgyVoXCjtHzch3b"))) {
                  var5 = Xqedii_erdgryn.Xqedii_2egk40122q4gj(2068550690, 19);
               }
         }
         Comparator<Xqedii_f2tq14t> var3 = switch (var5) {
            case 0 -> (Xqedii_f2tq14t var0, Xqedii_f2tq14t var1x) -> {
               if (((1264064490 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return Xqedii_2at84rr(var0.Xqedii_38am8fs, var1x.Xqedii_38am8fs);
               }
            };
            case 1 -> (Xqedii_f2tq14t var0, Xqedii_f2tq14t var1x) -> {
               if (((-1629357921 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return Xqedii_2at84rr(var0.Xqedii_2gy589e, var1x.Xqedii_2gy589e);
               }
            };
            default -> Comparator.comparingDouble((Xqedii_f2tq14t var0) -> {
               if ((1244840208 ^ 1244840208) != 0) {
                  throw new IllegalStateException();
               } else {
                  return var0.Xqedii_3kwaov8;
               }
            });
         };
         if (var2.Xqedii_38mwtzj) {
            var3 = var3.reversed();
         }

         var1.sort(var3.thenComparingInt((Xqedii_f2tq14t var0) -> {
            if ((-1855319274 ^ -1855319274) != 0) {
               throw new IllegalStateException();
            } else {
               return var0.Xqedii_1jxn9v3;
            }
         }));
      }
   }

   public static int Xqedii_2at84rr(String var0, String var1) {
      if (((588040364 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var0 == null ? Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==") : var0.toLowerCase(Locale.ROOT);
         String var3 = var1 == null ? Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==") : var1.toLowerCase(Locale.ROOT);
         int var4 = Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 1);
         int var5 = Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 6);

         while (var4 < var2.length() && var5 < var3.length()) {
            char var6 = var2.charAt(var4);
            char var7 = var3.charAt(var5);
            if (Character.isDigit(var6) && Character.isDigit(var7)) {
               int var8 = var4;
               int var9 = var5;

               while (var4 < var2.length() && Character.isDigit(var2.charAt(var4))) {
                  var4++;
               }

               while (var5 < var3.length() && Character.isDigit(var3.charAt(var5))) {
                  var5++;
               }

               String var10 = var2.substring(var8, var4)
                  .replaceFirst(
                     Xqedii_erdgryn.Xqedii_1ibk8jiple36q("+3xIW2iuK55rzsB9GAjcv3Z7lSdtasVCdjl/rt1atSwL36OfIrX86krzEcI="),
                     Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==")
                  );
               String var11 = var3.substring(var9, var5)
                  .replaceFirst(
                     Xqedii_erdgryn.Xqedii_1ibk8jiple36q("+3xIW2iuK55rzsB9GAjcv3Z7lSdtasVCdjl/rt1atSwL36OfIrX86krzEcI="),
                     Xqedii_erdgryn.Xqedii_1ibk8jiple36q("Q/3Gt7q6wJA1TRTkaCWYhz9ROiKpHbyIbYVaOQ==")
                  );
               if (var10.length() != var11.length()) {
                  return Integer.compare(var10.length(), var11.length());
               }

               int var12 = var10.compareTo(var11);
               if (var12 != 0) {
                  return var12;
               }
            } else {
               if (var6 != var7) {
                  return Character.compare(var6, var7);
               }

               var4++;
               var5++;
            }
         }

         return Integer.compare(var2.length() - var4, var3.length() - var5);
      }
   }

   public void Xqedii_40au2qa(
      List<Xqedii_f2tq14t> var1, double var2, double var4, double var6, double var8, Xqedii_19ino1o var10, List<Map<String, Object>> var11
   ) {
      if (((1010713696 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3px8k9n(var1, var2, var4, var6, var8, var10, var11, null);
      }
   }

   public void Xqedii_3px8k9n(
      List<Xqedii_f2tq14t> var1,
      double var2,
      double var4,
      double var6,
      double var8,
      Xqedii_19ino1o var10,
      List<Map<String, Object>> var11,
      List<List<Map<String, Object>>> var12
   ) {
      if ((1124444517 * 1124444517 - 1124444517 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!var1.isEmpty()) {
         this.Xqedii_95cgte7(var1, var10);
         double var13 = var2 + var10.Xqedii_2wfw5ku;
         double var15 = var4 + var10.Xqedii_7su7kor;
         double var17 = Math.max(
            Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(5304222961948065458L, 0)), var6 - var10.Xqedii_2wfw5ku - var10.Xqedii_3o7dy83
         );
         double var19 = Math.max(
            Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 47)), var8 - var10.Xqedii_7su7kor - var10.Xqedii_1d0uhx9
         );
         double var21 = var10.Xqedii_1ktl8q0 ? var19 : var17;
         double var23 = var10.Xqedii_1ktl8q0 ? var17 : var19;
         ArrayList var25 = new ArrayList();
         ArrayList var26 = new ArrayList();
         double var27 = Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 37));

         for (Xqedii_f2tq14t var30 : var1) {
            double var31 = this.Xqedii_3qzvzcw(var30.Xqedii_2ly5me5, var10);
            double var33 = var26.isEmpty() ? var31 : var27 + var10.Xqedii_1828yvv + var31;
            int var35 = var26.size() >= var10.Xqedii_2kolsgj
               ? Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224075379, 9)
               : Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 30);
            int var36 = var10.Xqedii_a8ia53f
                  && var21 > Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(-5609014678487743776L, 6))
                  && var33 > var21 + Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(-2738641918375706142L, 16))
               ? Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-223550579, 19)
               : Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(377128658, 25);
            if (!var26.isEmpty() && (var35 != 0 || var36 != 0)) {
               var25.add(var26);
               var26 = new ArrayList();
               var33 = var31;
            }

            var26.add(var30.Xqedii_2ly5me5);
            var27 = var33;
         }

         var25.add(var26);
         boolean var66 = var10.Xqedii_1ktl8q0 ? var10.Xqedii_2i05vhm : var10.Xqedii_33exyo3;
         boolean var67 = var10.Xqedii_1ktl8q0 ? var10.Xqedii_33exyo3 : var10.Xqedii_2i05vhm;
         double var68 = var10.Xqedii_1ktl8q0 ? var10.Xqedii_1hvbfko : var10.Xqedii_3ca6w0f;
         double var69 = var10.Xqedii_1ktl8q0 ? var10.Xqedii_3ca6w0f : var10.Xqedii_1hvbfko;
         double[] var70 = new double[var25.size()];
         double[] var71 = new double[var25.size()];
         double var37 = Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 51));
         double var39 = Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_2b5yqlb6qwkdr(-4280345594863216421L, 35));

         for (int var41 = Xqedii_erdgryn.Xqedii_2egk40122q4gj(777030125, 29); var41 < var25.size(); var41++) {
            double var42 = Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_3tnpwl7cx5j4g(-2083633345287843252L, 11));
            double var44 = Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 36));
            List var46 = (List)var25.get(var41);

            for (int var47 = Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(1739091233, 29); var47 < var46.size(); var47++) {
               var42 += this.Xqedii_3qzvzcw((Xqedii_2aqdh8l)var46.get(var47), var10)
                  + (var47 > 0 ? var10.Xqedii_1828yvv : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 55)));
               var44 = Math.max(var44, this.Xqedii_15q4pxr((Xqedii_2aqdh8l)var46.get(var47), var10));
            }

            var70[var41] = var42;
            var71[var41] = var44;
            var37 += var44 + (var41 > 0 ? var10.Xqedii_15f4fpe : Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_13i7jck3i9nwm(-3907361772531792325L, 1)));
            var39 = Math.max(var39, var42);
         }

         double var72 = var21 > Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 31)) ? var21 : var39;
         double var43 = var23 > Double.longBitsToDouble(Xqedii_erdgryn.Xqedii_l8mawijrnalc(-3789408227622095361L, 30)) ? var23 : var37;
         double var45 = var10.Xqedii_1ktl8q0 ? var15 : var13;
         double var73 = var10.Xqedii_1ktl8q0 ? var13 : var15;
         ArrayList var49 = new ArrayList();

         for (int var50 = Xqedii_erdgryn.Xqedii_2joif5me8xnte(457152608, 21); var50 < var25.size(); var50++) {
            var49.add(var50);
         }

         if (var67) {
            Collections.reverse(var49);
         }

         double var74 = var73 + (var43 - var37) * var69;
         int var52 = Xqedii_erdgryn.Xqedii_2e2zsppexvbyd(-1866214346, 20);

         for (int var54 : (Iterable<Integer>) (var49)) {

            if (var52 == 0) {
               var74 += var10.Xqedii_15f4fpe;
            }

            var52 = Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224074867, 29);
            ArrayList var55 = new ArrayList((Collection)var25.get(var54));
            if (var66) {
               Collections.reverse(var55);
            }

            double var56 = var45 + (var72 - var70[var54]) * var68;

            for (Xqedii_2aqdh8l var59 : (Iterable<Xqedii_2aqdh8l>) (var55)) {

               double var60 = var74 + (var71[var54] - this.Xqedii_15q4pxr(var59, var10)) * var69;
               double var62 = var10.Xqedii_1ktl8q0 ? var60 : var56;
               double var64 = var10.Xqedii_1ktl8q0 ? var56 : var60;
               this.Xqedii_nmw5ujl(var59.Xqedii_8lku9e2, var62, var64);
               if (var12 != null) {
                  var12.add(var59.Xqedii_8lku9e2);
               } else {
                  var11.addAll(var59.Xqedii_8lku9e2);
               }

               var56 += this.Xqedii_3qzvzcw(var59, var10) + var10.Xqedii_1828yvv;
            }

            var74 += var71[var54];
         }
      }
   }

   public double Xqedii_3qzvzcw(Xqedii_2aqdh8l var1, Xqedii_19ino1o var2) {
      if ((93456824 ^ 93456824) != 0) {
         throw new IllegalStateException();
      } else {
         return var2.Xqedii_1ktl8q0 ? this.Xqedii_2jsgod1(var1, var2) : this.Xqedii_wqnr3y9(var1, var2);
      }
   }

   public double Xqedii_15q4pxr(Xqedii_2aqdh8l var1, Xqedii_19ino1o var2) {
      if ((-1825509196 * -1825509196 - -1825509196 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var2.Xqedii_1ktl8q0 ? this.Xqedii_wqnr3y9(var1, var2) : this.Xqedii_2jsgod1(var1, var2);
      }
   }

   public double Xqedii_wqnr3y9(Xqedii_2aqdh8l var1, Xqedii_19ino1o var2) {
      if ((726325009 * (726325009 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var2.Xqedii_16huv8z) ? var2.Xqedii_16huv8z : var1.Xqedii_1twpnbn;
      }
   }

   public double Xqedii_2jsgod1(Xqedii_2aqdh8l var1, Xqedii_19ino1o var2) {
      if (((221935984 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Double.isFinite(var2.Xqedii_3us42uq) ? var2.Xqedii_3us42uq : var1.Xqedii_1gzzfwi;
      }
   }

   public boolean Xqedii_2qgfxb6(Map<String, Object> var1) {
      if ((-871974265 ^ -871974265) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 == null
               || var1.get(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("1i9dIa3oPfnQsNhBf+7AFhcXLFOaUg5hFiPWEZKjo97MXFNq")) == null
                  && var1.get(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("6vfdsXQDm+hq5pQz1RSzUfR+7b8eH0yPVFaAXLch5PJYNcde0D8=")) == null
                  && var1.get(Xqedii_erdgryn.Xqedii_1ibk8jiple36q("8YzEmzQvu1OBCl54sGtg5aX6b6Zdcx8dBrQgVbDoXio/tOJtu0s=")) == null
            ? Xqedii_erdgryn.Xqedii_2egk40122q4gj(289252810, 10)
            : Xqedii_erdgryn.Xqedii_2egk40122q4gj(240159213, 29)) != 0);
      }
   }

   static {
      if ((-1104335926 * -1104335926 + -1104335926 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457150561, 10)];
         var10000[Xqedii_erdgryn.Xqedii_2egk40122q4gj(-904839771, 2)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "f8uxG9Mnc9ahEYjwiWuvDcIJhKIYyikCRHHoJAJbUzjsHQ8xpybSJdTTJywwyT3t"
         );
         var10000[Xqedii_erdgryn.Xqedii_x5gvlytivyf4(-224083059, 13)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "T7nJwnIkaCScv7ke9pv8l4eLbJ/SBd36FQCpGCrgaQv1/QRBZvwSqZeoPBWhgJhRL/0="
         );
         var10000[Xqedii_erdgryn.Xqedii_2joif5me8xnte(-457152611, 1)] = Xqedii_erdgryn.Xqedii_1ibk8jiple36q(
            "lo6Ujd84wUQJsTyZgVHa6Kn7Nc6qJZW/D0uHlHsBbrIpdA4Rp6XoXx6ZnEOEyUdbOjg="
         );
         LIST_LAYOUT_KEYS = var10000;
      }
   }
}
