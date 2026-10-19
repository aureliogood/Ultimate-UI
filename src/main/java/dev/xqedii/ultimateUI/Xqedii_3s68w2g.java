package dev.xqedii.ultimateUI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xqedii_3s68w2g {
   public static final String Xqedii_38edqbdowgxe1 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_3i41w1u = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "5X3Q1MFmlH59HBogFm7fAObwfdwI8Cloe8uxU+r+jlhNunQiJLDfOzGmJDPCfR3x4V0X5NyogdlRjG0Yg98WSqAohE6S4Qr3CbgYGB1k+phAB1Xdw9Ot/A=="
   );
   public static final String Xqedii_228wccf = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "P5SX1KgFSgvSTpFR7WQWy5tDEGY9AeegzbIFh25MZ6PEj03SA+ax1eaeN1D6nwYWMtBwPNUvsHwDEcikC8o="
   );
   public static final String Xqedii_1eyel6w = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("UbLlX0NX8RZqcPa8b19rxc7FM/65XbjrynrIMWEoQEyYuxuHUjcE4QmCKRDRUg==");
   public static final String Xqedii_3d363ov = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "J3YaOKqjXsnAVpI6aL85E2mYm7kvE2DAJJM9ao23FOIX8V1BU//V9kenb7E7GOn0d/IAUrglZE4D270TRXkibo20JsAzXXBn8aQZNCv015oPgmE2Rjtt3/J/Et00S97nLcugZXnmi48My9Abjha1Abr0DSEVQDJD29LaC3z140ngJl0D"
   );
   public static final String Xqedii_13vm4zs = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("/BFeYdy9nGkkeiFRqA1b4ghfJLq3bEO1X+f4CrnaBVPvyObvNeJ4wmPp");
   public static final String Xqedii_kvx3wju = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "6a6S61MOqRBWZCAOJ/ZHRdS4fgu1K8XzoYATfqDJ1kpDFZOJnhFynPWy5fkXgangICnAkMJzIVwZ7JZADIywfv+Y"
   );
   public static final String Xqedii_xunv8sf = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("WD6ZxchUKOINzupdO1y8R2AajAbuE9Etlrs5Q7e2/IckEUIj9HbeipJWsQKirpdg");
   public static final String Xqedii_22djlut = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "ZCI01LoZNpCTE/TDfOyFzzwfwstnQPwQgp7AKhfM2BPS7y2IAQYDzB0npxp+5otM3QPgH44UVOqMbg=="
   );
   public static final Pattern Xqedii_21sohag;
   public static final Pattern Xqedii_3ebn067;
   public static final Pattern Xqedii_3sn0hou;
   public static final Pattern Xqedii_1yr5est;
   public static final Pattern Xqedii_18mqikn;
   public static final String Xqedii_17k72te = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "u0t+3LNrxKFOf8UnMyUgTPg6xfqDaIbm+UBoNwdERFtMxm6cKuL7NR3+pkLudiLuWO6ds/+S1zkMgiXkfhJRHc6cNZQvSlZAqMiYd5UdIwdT8LxcvlCVa5oY67nOvflBcQA="
   );
   public static final String Xqedii_zq6856j = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
      "TJeIf6hNdqlMQCqxFE+tp1/yT1hZ9qZFPKSthAV+QT8NVFsX6CQAkzLRe/pbGzgttD9QENX9B/4="
   );
   public static final List<String> Xqedii_2711xik;
   public static final String Xqedii_ype0ruy = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("oKNihKOamTT+HWpLmF4O9eHS0w36hwb+4q//yPtwnP3QS5Qy1rNu/xRv1PRmRenxuAk=");
   public static final String Xqedii_2n7d1d9 = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("uZeDqCSOUmXd3doH+oLvw4tXFUsEDsFBDlPuI+cDplImoXYDOmhkeInCdTPbqeDrp7PPD70x");
   public static final int Xqedii_17ixqvv = 56;
   public final JavaPlugin Xqedii_2ds4r1g;

   public Xqedii_3s68w2g(JavaPlugin var1) {
      this.Xqedii_2ds4r1g = var1;
   }

   public boolean Xqedii_3mpa5xq() {
      if ((1549663420 ^ 1549663420) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2ds4r1g
            .getConfig()
            .getBoolean(
               Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                  "5X3Q1MFmlH59HBogFm7fAObwfdwI8Cloe8uxU+r+jlhNunQiJLDfOzGmJDPCfR3x4V0X5NyogdlRjG0Yg98WSqAohE6S4Qr3CbgYGB1k+phAB1Xdw9Ot/A=="
               ),
               (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(1394585726, 4) != 0)
            );
      }
   }

   public File Xqedii_2wuw87l() {
      if (((-1159011805 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var1 = this.Xqedii_2ds4r1g.getDataFolder().getParentFile();
         return var1 == null ? null : new File(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("UbLlX0NX8RZqcPa8b19rxc7FM/65XbjrynrIMWEoQEyYuxuHUjcE4QmCKRDRUg=="));
      }
   }

   public File Xqedii_2kbxz97(File var1) {
      if ((-1873641201 * (-1873641201 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null
            ? null
            : new File(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("P5SX1KgFSgvSTpFR7WQWy5tDEGY9AeegzbIFh25MZ6PEj03SA+ax1eaeN1D6nwYWMtBwPNUvsHwDEcikC8o="));
      }
   }

   public void Xqedii_13zsdhk(File var1) {
      if ((1208752553 ^ 1208752553) != 0) {
         throw new IllegalStateException();
      } else {
         File var2 = this.Xqedii_2kbxz97(var1);
         if (var2 != null) {
            if (!this.Xqedii_3mpa5xq()) {
               this.Xqedii_2hclelv(var2);
            } else {
               File var3 = this.Xqedii_2wuw87l();
               if (var3 != null && var3.isDirectory()) {
                  if (!var2.exists()) {
                     var2.mkdirs();
                  }

                  this.Xqedii_1obpfd4(var3, var2);
                  this.Xqedii_1ldniqr(var3, var2);
               }
            }
         }
      }
   }

   public boolean Xqedii_21a7gm4(File var1, Map<String, byte[]> var2) {
      if ((670256389 * 670256389 - 670256389 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var3 = this.Xqedii_2kbxz97(var1);
         File var4 = this.Xqedii_2wuw87l();
         if (this.Xqedii_3mpa5xq() && var3 != null && var4 != null && var2 != null && !var2.isEmpty()) {
            boolean var5 = var2.keySet()
               .stream()
               .map(Xqedii_3s68w2g::Xqedii_17hk53d)
               .anyMatch(
                  var0 -> {
                     if ((433685934 ^ 433685934) != 0) {
                        throw new IllegalStateException();
                     } else {
                        return ((!var0.equals(
                                 Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("2m14eHTRbmh+R8X8bNyR5X+JT/cn1W2TK16No2uyQ8gLiLAhWmzdTtJy+oiZilvAwO0=")
                              )
                              && !var0.endsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("1EAdySBiSdIwKbRgZIJzhhFNaOyRJHuKpAkcNQe7rHTKYcEBLIUqMrg7hFR4t8RCfOvEyg=="))
                           ? Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-224854653, 31)
                           : Xqedii_j9phx7b.Xqedii_1bf038et8v68o(1283375673, 6)) != 0);
                     }
                  }
               );
            if (!var5) {
               return (Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1572530159, 5) != 0);
            } else {
               try {
                  Xqedii_q3cx0a5 var6 = this.Xqedii_5xza4zl(var4);
                  String var7 = var6 == null ? Xqedii_3b4y8oj4w98ky(System.currentTimeMillis()) : var6.signature();
                  this.Xqedii_y72mhw6(var3, var2, var7);
                  this.Xqedii_1ldniqr(var4, var3);
                  return (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-1881651415, 11) != 0);
               } catch (IOException var8) {
                  this.Xqedii_2ds4r1g.getLogger().warning(Xqedii_8a8y5a27je1p(var8.getMessage()));
                  return (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-666949233, 19) != 0);
               }
            }
         } else {
            return (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 7) != 0);
         }
      }
   }

   public boolean Xqedii_3ihj4ot() {
      if ((1217557037 * 1217557037 - 1217557037 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = this.Xqedii_2wuw87l();
         if (var1 == null) {
            return (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-83368655, 16) != 0);
         } else {
            File var2 = new File(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("WD6ZxchUKOINzupdO1y8R2AajAbuE9Etlrs5Q7e2/IckEUIj9HbeipJWsQKirpdg"));
            return (!var2.isFile()
               ? (Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1572530159, 26) != 0)
               : YamlConfiguration.loadConfiguration(var2)
                  .getBoolean(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("46fEG+KCdaIoCOYOo2LqtRkQ+uzLCIeAqldDJW/gRFRedjK57qTj5GhGUJXRXrXsqVopzvYPOVW0667D"),
                     (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-112427327, 30) != 0)
                  ));
         }
      }
   }

   public long Xqedii_13iri1g(File var1) {
      if ((-1555194536 * -1555194536 - -1555194536 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_3mpa5xq()) {
         return Xqedii_j9phx7b.Xqedii_2j7i3equ8k3uk(3854624543892856825L, 34);
      } else {
         File var2 = this.Xqedii_2kbxz97(var1);
         long var3 = Xqedii_j9phx7b.Xqedii_26jt5qdxuuv8u(-9152056851260224364L, 25);

         for (Path var6 : this.Xqedii_29giocr(var2)) {
            File var7 = var6.toFile();
            var3 = Xqedii_j9phx7b.Xqedii_2j7i3equ8k3uk(3854624543892848889L, 8) * var3 + Xqedii_3c4jmju(var2.toPath(), var6).hashCode();
            var3 = Xqedii_j9phx7b.Xqedii_2j7i3equ8k3uk(-3639365236051648519L, 59) * var3 + Long.hashCode(var7.lastModified());
            var3 = Xqedii_j9phx7b.Xqedii_26jt5qdxuuv8u(-9152056659127546712L, 1) * var3 + Long.hashCode(var7.length());
         }

         return var3;
      }
   }

   public Xqedii_2om8ulg Xqedii_cl3zryp(File var1, File var2) {
      if (((-657856671 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_3mpa5xq()) {
         return null;
      } else {
         File var3 = this.Xqedii_2kbxz97(var1);
         List var4 = this.Xqedii_29giocr(var3);
         if (var4.isEmpty()) {
            return null;
         } else {
            Set var5 = this.Xqedii_390vif1(
               new File(var3, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("2m14eHTRbmh+R8X8bNyR5X+JT/cn1W2TK16No2uyQ8gLiLAhWmzdTtJy+oiZilvAwO0="))
            );
            Xqedii_3vpi3ac var6 = this.Xqedii_1m7vvf7(var3.toPath(), var4);
            if (var6 == null) {
               this.Xqedii_2ds4r1g
                  .getLogger()
                  .warning(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                        "Y1KdY4jBZ4oZ9usO+DXJNntgVVatKwvIhdY4B9ZfW5bQPB5YAeV3P3OsvSG14epXTHJaOOblDz2vR6WxeKpPTD3/Uo2J806GGoCqI4kkU/kfVJVrxNL0Nwcc93wZ1Cf/BQZqiyFada76kV5QVPFtDyGElGIhBZQ/gywBpO/e3PlNsdvngx1EG/OB24WX7ZMoF3XW0XDwJZH8xFriU4olaMcG9ne5LeUfg+XATECeJ0yfY3WvyShTfRhXoevG7MLLE3Bh12x8WPxLBXO7uJuH/HYdFasB534/XY8EdhO0KRhIZZAkUytRJBtbzlIuZqfnAo4zlqSqg+7ncoC9MIfEsc4PwEUdLTmib8pNYgY4rhL4F4V/S70Eoz7YSGlA4AjWX17vnTQu/AK2FCfnBY+K8lRISgGzfVlmIocImuEH9pp43LpY"
                     )
                  );
            }

            Set var7 = this.Xqedii_1k1y33b(
               new File(var2, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("2m14eHTRbmh+R8X8bNyR5X+JT/cn1W2TK16No2uyQ8gLiLAhWmzdTtJy+oiZilvAwO0="))
            );
            return new Xqedii_2om8ulg(var3.toPath(), var4, var5, var7, var6);
         }
      }
   }

   public static Map<String, byte[]> Xqedii_yudau0p(Object var0) {
      if ((621945707 * 621945707 + 621945707 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return null;
      } else {
         try {
            Method var1 = var0.getClass().getMethod(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("lv/Oexcx+B6MqRp5Iy+3ICVbVu49A9sIQ5C6LTYje2hnWrHhJdb+TqYlCfA="));
            Object var2 = var1.invoke(var0);
            if (var2 == null) {
               return null;
            } else {
               Method var3;
               try {
                  var3 = var2.getClass()
                     .getMethod(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("9o+azeJTroMwzgaGODkexQwnuhGz/ALqvIss7QiJ2Tykodnshnwxb77biC8FN8u53LRc0A=="));
               } catch (NoSuchMethodException var11) {
                  return null;
               }

               if (var3.invoke(var2) instanceof Map var5) {
                  LinkedHashMap var6 = new LinkedHashMap();

                  for (Entry var8 : (Iterable<Entry>) (var5.entrySet())) {

                     if (var8.getKey() != null && var8.getValue() instanceof byte[] var9) {
                        var6.put(var8.getKey().toString(), var9);
                     }
                  }

                  return var6;
               } else {
                  return null;
               }
            }
         } catch (RuntimeException | ReflectiveOperationException var12) {
            return null;
         }
      }
   }

   public void Xqedii_1obpfd4(File var1, File var2) {
      if (((-7877176 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_q3cx0a5 var3 = this.Xqedii_5xza4zl(var1);
         if (var3 == null) {
            if (this.Xqedii_29giocr(var2).isEmpty()) {
               this.Xqedii_2ds4r1g
                  .getLogger()
                  .warning(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                        "s36/GCpeTWDeg9+86mEahNT+AW8FwHlQsLNMgWa4LqUpOJZ861L2GpBmLR/nxM+e02Co+2zG7T3Mb13ZYO+tm8B/uiAPp8iusBUf9dezhNf6ZF3EtM/0/Zg0Kv7qa9O17pZCd4iBKD2IEY1n/2K9cEINxseJas1dP0631IT9+k2zsTnnYMn5E7doT7Y+X7kpYoc/n6j1afJHBcobkV6pqIb8NTjHhk3ogE5RkJekZ2SMZJEtS6kuTaj4nX947r2DbEoioglSlpbLXLzWqc1R+YW+fc2YPLeN2BNQDVy/ikbHypOnNEc8k3b4IChF1VQi6idN7Q5FfzlbimhG5DK0DC3jgcBN6rqWfPrZ9ZUHEE1RBcyfMIMj2v0jNK0gYvPHJ3LHLnhU"
                     )
                  );
            }
         } else {
            String var4 = var3.signature();
            if (!var4.equals(this.Xqedii_2yk5vms(var2, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("/BFeYdy9nGkkeiFRqA1b4ghfJLq3bEO1X+f4CrnaBVPvyObvNeJ4wmPp")))
               || this.Xqedii_29giocr(var2).isEmpty()) {
               try {
                  Map var5 = var3.read();
                  if (var5.isEmpty() || !this.Xqedii_y72mhw6(var2, var5, var4)) {
                     return;
                  }

                  this.Xqedii_2ds4r1g.getLogger().info(Xqedii_367l7l3ah05cc(var5.size()));
               } catch (IOException var6) {
                  this.Xqedii_2ds4r1g.getLogger().warning(Xqedii_2ss459xuhxrpl(var6.getMessage()));
               }
            }
         }
      }
   }

   public Xqedii_q3cx0a5 Xqedii_5xza4zl(File var1) {
      if (((-1452383298 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = var1.getParentFile();
         if (var2 == null) {
            return null;
         } else {
            YamlConfiguration var3 = YamlConfiguration.loadConfiguration(
               new File(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("WD6ZxchUKOINzupdO1y8R2AajAbuE9Etlrs5Q7e2/IckEUIj9HbeipJWsQKirpdg"))
            );
            String var4 = var3.getString(
               Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("mz78cZqTe2RvOu1lvURkx5WN4t6TWbFqLs5Fz+wEU5hI5IaLNR1k008jggsKqVft2USz6IGdmSz+7oYaXUa3KYAvrfvedQ=="),
               Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("ZCI01LoZNpCTE/TDfOyFzzwfwstnQPwQgp7AKhfM2BPS7y2IAQYDzB0npxp+5otM3QPgH44UVOqMbg==")
            );
            if (var4 == null || var4.isBlank()) {
               var4 = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("ZCI01LoZNpCTE/TDfOyFzzwfwstnQPwQgp7AKhfM2BPS7y2IAQYDzB0npxp+5otM3QPgH44UVOqMbg==");
            }

            File var5 = new File(var2, Xqedii_mua4vden5em3(var4));
            File var6 = new File(var2, var4);
            boolean var7 = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("c1ZwV/N7Ugg1hmUxiGBiFFs0SFk1+HD+xJ+tdVv4YA8Z8rNlXQ00Yw==")
               .equalsIgnoreCase(
                  var3.getString(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("ToX65jER5c6tyNtufPQX5ki05nLNRMubLp/Mb+u+Ae2ncCV8rnU/98Onf27UCw=="),
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("LyQBqULTW4L9OreXhaCVgBjzP8XmREnQzNrlerp4J00Mow==")
                  )
               );
            if (var7 && this.Xqedii_leqvfr8(var6)) {
               return new Xqedii_q3cx0a5(var6, (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 29) != 0));
            } else if (var5.isFile()) {
               return new Xqedii_q3cx0a5(var5, (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1699919129, 13) != 0));
            } else {
               return this.Xqedii_leqvfr8(var6) ? new Xqedii_q3cx0a5(var6, (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(1627170367, 21) != 0)) : null;
            }
         }
      }
   }

   public boolean Xqedii_leqvfr8(File var1) {
      if ((-347412034 * -347412034 + -347412034 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && var1.isDirectory() && !this.Xqedii_320jcu7(var1).isEmpty()
            ? Xqedii_j9phx7b.Xqedii_ar3tio945bmp(952418360, 25)
            : Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 3)) != 0);
      }
   }

   public boolean Xqedii_y72mhw6(File var1, Map<String, byte[]> var2, String var3) throws IOException {
      if ((-492437918 * -492437918 + -492437918 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Map var4 = this.Xqedii_2r8bb1p(var2);
         if (var4.isEmpty()) {
            return (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 1) != 0);
         } else {
            Files.createDirectories(var1.toPath());
            if (this.Xqedii_e66zzcu(var1, var4)) {
               this.Xqedii_3iime3y(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("/BFeYdy9nGkkeiFRqA1b4ghfJLq3bEO1X+f4CrnaBVPvyObvNeJ4wmPp"), var3);
               return (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 21) != 0);
            } else {
               this.Xqedii_1inzgp4(var1);
               Path var5 = var1.toPath().toAbsolutePath().normalize();

               for (Entry var7 : (Iterable<Entry>) (var4.entrySet())) {

                  Path var8 = var5.resolve((String)var7.getKey()).normalize();
                  if (var8.startsWith(var5) && !var8.equals(var5)) {
                     Files.createDirectories(var8.getParent());
                     Files.write(var8, (byte[])var7.getValue());
                  }
               }

               this.Xqedii_3iime3y(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("/BFeYdy9nGkkeiFRqA1b4ghfJLq3bEO1X+f4CrnaBVPvyObvNeJ4wmPp"), var3);
               return (Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1572529903, 8) != 0);
            }
         }
      }
   }

   public boolean Xqedii_e66zzcu(File var1, Map<String, byte[]> var2) throws IOException {
      if ((1465118745 * 1465118745 + 1465118745 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         List var3 = this.Xqedii_29giocr(var1);
         if (var3.size() != var2.size()) {
            return (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 18) != 0);
         } else {
            Path var4 = var1.toPath();

            for (Path var6 : (Iterable<Path>) (var3)) {

               byte[] var7 = (byte[])var2.get(Xqedii_3c4jmju(var4, var6));
               if (var7 == null || !Arrays.equals(var7, Files.readAllBytes(var6))) {
                  return (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-1505795844, 5) != 0);
               }
            }

            return (Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1699919129, 19) != 0);
         }
      }
   }

   public Map<String, byte[]> Xqedii_2r8bb1p(Map<String, byte[]> var1) {
      if ((-2002535762 * -2002535762 + -2002535762 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==");
         int var3 = Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1521306342, 31);

         for (String var5 : var1.keySet()) {
            String var6 = Xqedii_17hk53d(var5);
            if ((
                  var6.equals(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("2m14eHTRbmh+R8X8bNyR5X+JT/cn1W2TK16No2uyQ8gLiLAhWmzdTtJy+oiZilvAwO0="))
                     || var6.endsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("1EAdySBiSdIwKbRgZIJzhhFNaOyRJHuKpAkcNQe7rHTKYcEBLIUqMrg7hFR4t8RCfOvEyg=="))
               )
               && var6.length() < var3) {
               var3 = var6.length();
               var2 = var6.substring(
                  Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-112427327, 30),
                  var6.length() - Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("2m14eHTRbmh+R8X8bNyR5X+JT/cn1W2TK16No2uyQ8gLiLAhWmzdTtJy+oiZilvAwO0=").length()
               );
            }
         }

         LinkedHashMap var8 = new LinkedHashMap();

         for (Entry var10 : var1.entrySet()) {
            String var7 = Xqedii_17hk53d((String)var10.getKey());
            if (!var2.isEmpty()) {
               if (!var7.startsWith(var2)) {
                  continue;
               }

               var7 = var7.substring(var2.length());
            }

            if (!var7.isBlank() && !var7.endsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("1lU1Y6ja0wLbIwq/StzxM3stKjCkkH7s2oXMziK3")) && var10.getValue() != null) {
               var8.put(var7, (byte[])var10.getValue());
            }
         }

         return var8;
      }
   }

   public static String Xqedii_17hk53d(String var0) {
      if (((-1594735105 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0 == null
            ? Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==")
            : var0.replace((char)Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-1309501187, 23), (char)Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(961721625, 25)).trim();

         while (var1.startsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("1lU1Y6ja0wLbIwq/StzxM3stKjCkkH7s2oXMziK3"))) {
            var1 = var1.substring(Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1572529903, 8));
         }

         return var1;
      }
   }

   public void Xqedii_1inzgp4(File var1) throws IOException {
      if ((982321812 * (982321812 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File[] var2 = var1.listFiles();
         if (var2 != null) {
            File[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(-994035654, 1); var5 < var4; var5++) {
               File var6 = var3[var5];
               if (!var6.getName().startsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("X6ri8gD5/Sh131jlGKb6dBWmtUVjdXrlU558yw5b"))) {
                  this.Xqedii_vprrvg3(var6.toPath());
               }
            }
         }
      }
   }

   public void Xqedii_vprrvg3(Path var1) throws IOException {
      if (((1302223834 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (Files.exists(var1)) {
         try (Stream var2 = Files.walk(var1)) {
            for (Path var5 : (Iterable<Path>) (var2.sorted(Comparator.reverseOrder()).toList())) {

               Files.deleteIfExists(var5);
            }
         }
      }
   }

   public List<Path> Xqedii_29giocr(File var1) {
      if (((1534613013 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();
         if (var1 != null && var1.isDirectory()) {
            Path var3 = var1.toPath();

            for (Path var5 : this.Xqedii_320jcu7(var1)) {
               if (!Xqedii_3c4jmju(var3, var5).startsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("X6ri8gD5/Sh131jlGKb6dBWmtUVjdXrlU558yw5b"))) {
                  var2.add(var5);
               }
            }

            return var2;
         } else {
            return var2;
         }
      }
   }

   public List<Path> Xqedii_320jcu7(File var1) {
      if (((229102900 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isDirectory()) {
         try {
            List var3;
            try (Stream<Path> var2 = Files.walk(var1.toPath())) {
               var3 = var2.filter(var0 -> {
                  if (((-118107396 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     return Files.isRegularFile(var0);
                  }
               }).sorted(Comparator.comparing(var0 -> {
                  if (((349643747 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     return var0.toString().toLowerCase(Locale.ROOT);
                  }
               })).toList();
            }

            return var3;
         } catch (IOException var7) {
            return new ArrayList<>();
         }
      } else {
         return new ArrayList<>();
      }
   }

   public static String Xqedii_3c4jmju(Path var0, Path var1) {
      if ((-20603009 ^ -20603009) != 0) {
         throw new IllegalStateException();
      } else {
         return var0.relativize(var1)
            .toString()
            .replace((char)Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1699933721, 8), (char)Xqedii_j9phx7b.Xqedii_ar3tio945bmp(845307932, 24));
      }
   }

   public String Xqedii_2yk5vms(File var1, String var2) {
      if ((-1771036066 * (-1771036066 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var3 = new File(var1, var2);
         if (!var3.isFile()) {
            return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==");
         } else {
            try {
               return Files.readString(var3.toPath(), StandardCharsets.UTF_8).trim();
            } catch (IOException var5) {
               return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==");
            }
         }
      }
   }

   public void Xqedii_3iime3y(File var1, String var2, String var3) throws IOException {
      if (((305886369 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Files.writeString(
            new File(var1, var2).toPath(),
            var3 == null ? Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==") : var3,
            StandardCharsets.UTF_8
         );
      }
   }

   public void Xqedii_1ldniqr(File var1, File var2) {
      if ((-521127974 * (-521127974 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var3 = new File(var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("WD6ZxchUKOINzupdO1y8R2AajAbuE9Etlrs5Q7e2/IckEUIj9HbeipJWsQKirpdg"));

         try {
            if (this.Xqedii_3uwlsf9(var3, (Xqedii_j9phx7b.Xqedii_ar3tio945bmp(318824683, 3) != 0))) {
               this.Xqedii_3iime3y(
                  var2,
                  Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("6a6S61MOqRBWZCAOJ/ZHRdS4fgu1K8XzoYATfqDJ1kpDFZOJnhFynPWy5fkXgangICnAkMJzIVwZ7JZADIywfv+Y"),
                  Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("NNmOCv9mKI+DUMkfva7XlzUxXbI6xT2QU7VOC+ZLgWN5+RH7")
               );
               this.Xqedii_2ds4r1g
                  .getLogger()
                  .info(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                        "/VTe3b4ZbvCPa+565FTc3m1Na0ZVJ7dHeG5J7IdM6HS++Dh0IV6sHcVzo5W2Fy4tsKnR8GhGDKPYIBCbisyQynpCz7F8bzk9NqHAI75TVz1PAUYh3kEBTK5N4vsZEcPNncnYRS4IbaKxKwqrYJ4yN3k7cO7Ig1V77aFS4+muGAYPgEgYNheU2k1LeckgaMi+hC0V7vZkz1uKG7g97cUxkL6tpwsAlpwOAEmIfIvG/2X+h3qdjyTeaAOUYKFGenw/NSJEKh86lasxmSQIMqiX9TUI/bZE/S90Vva7yCDD/8t74LaEHPp6aC8/3Wpze0egXVv5R5Z6xXKaCrPUt7cIi2Zb8WzYnvWItYznCBdRwMbWEQ3o+RYxZ7+rfR+iNtHgNtyGx6liGMS8k2fkNki6HzS5aI+k0zFeYocEC5MpZNoqbHC6QgWC4Oipawrb9JVmKOUssnzyQFffjPKq0dU="
                     )
                  );
            }
         } catch (IOException var5) {
            this.Xqedii_2ds4r1g.getLogger().warning(Xqedii_3jm1abql1fe6y(var5.getMessage()));
         }
      }
   }

   public void Xqedii_2hclelv(File var1) {
      if ((2002044575 * 2002044575 + 2002044575 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var2 = new File(
            var1, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("6a6S61MOqRBWZCAOJ/ZHRdS4fgu1K8XzoYATfqDJ1kpDFZOJnhFynPWy5fkXgangICnAkMJzIVwZ7JZADIywfv+Y")
         );
         if (var2.isFile()) {
            File var3 = this.Xqedii_2wuw87l();

            try {
               if (var3 != null
                  && this.Xqedii_3uwlsf9(
                     new File(var3, Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("WD6ZxchUKOINzupdO1y8R2AajAbuE9Etlrs5Q7e2/IckEUIj9HbeipJWsQKirpdg")),
                     (Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1304094703, 28) != 0)
                  )) {
                  this.Xqedii_2ds4r1g
                     .getLogger()
                     .info(
                        Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                           "VP6jhIPN60mmqIHIcWLs0xTQAd9LOYNb6PnSLIspizNOxERA0qyCkhym8/3wDEMmXWc7u9SFr+cBeCn4JITZTpCHIx7nWgtOKTS0FOiCRjLNWkCAVI1KnytvyEpD0Tu4sNAA1AkNoudZ3s2g/qXoDeD69cCiVXlZvDwjB5iiA8Yz0HHT+liMIJigoO+vMmqpHmjCbs3krDWC6NRF1ugWM1oPMtlyj9y2CzSWwNBlL1N79y+iHh75urWKh4g2o6lnt7uD3HTzG7ik9neXbDkswnQqMd/WI36jRMbCGTf995KW8hPDoH4cBq/WdqiwSkVKis4LOGJE04MX8cXO8LkyLgXEnPeH7aRg6OlgAjI01inX1g2E/pfSv4tH0S4rDw=="
                        )
                     );
               }

               Files.deleteIfExists(var2.toPath());
            } catch (IOException var5) {
               this.Xqedii_2ds4r1g.getLogger().warning(Xqedii_3y6nf3zehy3o(var5.getMessage()));
            }
         }
      }
   }

   public boolean Xqedii_3uwlsf9(File var1, boolean var2) throws IOException {
      if (((-1275231305 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isFile()) {
         String var3 = Files.readString(var1.toPath(), StandardCharsets.UTF_8);
         String var4 = var3.contains(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("GNVxCaxUcybNB/t0MZETgJz4k8lvAjTtZ+g02eEeiu8="))
            ? Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("GNVxCaxUcybNB/t0MZETgJz4k8lvAjTtZ+g02eEeiu8=")
            : Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("LjnvQ+quXB65OL69K7eQ0vTR0hRhKiL4Mei0uafJ");
         String[] var5 = var3.split(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("cTxap0SKjwmJbXPAafMFw7UFUKK4YsTYw/BLrbzORt7lyw=="), Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(1572530158, 19)
         );
         String var6 = Boolean.toString(var2);
         int var7 = Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 26);

         for (int var8 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(318824683, 3); var8 < var5.length; var8++) {
            Matcher var9 = Xqedii_21sohag.matcher(var5[var8]);
            if (var9.matches()) {
               String var10 = var9.group(Xqedii_j9phx7b.Xqedii_1bf038et8v68o(-1798837213, 2))
                  .replace(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("128XdcZSWxvVBTQD7ohqsxlZhVRPuzw8zbMRcMjr"),
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==")
                  )
                  .replace(
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("Y8In21IlYdTE72S0YMjjDgdGyrYCU6euUt1iJUTk"),
                     Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("68t/g2BkcQsPIA25TbrcWi8vaOXa1BKT8z1Zfw==")
                  );
               if (!var10.equalsIgnoreCase(var6)) {
                  var5[var8] = Xqedii_2irrdsz2ywswy(var6, var9.group(Xqedii_j9phx7b.Xqedii_ar3tio945bmp(29488678, 12)));
                  var7 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(1275298700, 5);
               }
               break;
            }
         }

         if (var7 != 0) {
            Files.writeString(var1.toPath(), String.join(var4, var5), StandardCharsets.UTF_8);
         }

         return (var7 != 0);
      } else {
         return (Xqedii_j9phx7b.Xqedii_1bf038et8v68o(1677070282, 9) != 0);
      }
   }

   public Set<String> Xqedii_390vif1(File var1) {
      if (((442853906 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         HashSet var2 = new HashSet();
         JsonObject var3 = this.Xqedii_32zucky(var1);
         JsonArray var4 = this.Xqedii_1r7v5u7(var3);
         if (var4 == null) {
            return var2;
         } else {
            for (JsonElement var6 : var4) {
               if (var6.isJsonObject()
                  && var6.getAsJsonObject().has(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("5O2D5NQXMk/8TEh1zp2eOt3pBl55qq+dnGQoC1xL9pw+BMxwBKlphNVOyNXjqA=="))) {
                  var2.add(
                     var6.getAsJsonObject()
                        .get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("5O2D5NQXMk/8TEh1zp2eOt3pBl55qq+dnGQoC1xL9pw+BMxwBKlphNVOyNXjqA=="))
                        .getAsString()
                  );
               }
            }

            return var2;
         }
      }
   }

   public Set<String> Xqedii_1k1y33b(File var1) {
      if ((-720109585 ^ -720109585) != 0) {
         throw new IllegalStateException();
      } else {
         HashSet var2 = new HashSet();
         JsonArray var3 = this.Xqedii_1r7v5u7(this.Xqedii_32zucky(var1));
         if (var3 == null) {
            return var2;
         } else {
            for (JsonElement var5 : var3) {
               if (var5.isJsonObject()) {
                  JsonObject var6 = var5.getAsJsonObject();
                  if (var6.has(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("5O2D5NQXMk/8TEh1zp2eOt3pBl55qq+dnGQoC1xL9pw+BMxwBKlphNVOyNXjqA=="))) {
                     int var7 = this.Xqedii_sbqnvji(var6);
                     if (var7 >= 0 && var7 < Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1102768111, 23)) {
                        var2.add(
                           var6.get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("5O2D5NQXMk/8TEh1zp2eOt3pBl55qq+dnGQoC1xL9pw+BMxwBKlphNVOyNXjqA==")).getAsString()
                        );
                     }
                  }
               }
            }

            return var2;
         }
      }
   }

   public int Xqedii_sbqnvji(JsonObject var1) {
      if ((1594323820 * 1594323820 - 1594323820 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            if (var1.has(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("EOntZrVA/lQ7NOpN6kFCbUqoOCdC78k6uibAiFr4mKwqAougnUEn6hWK5co28Uf0"))
               && var1.get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("EOntZrVA/lQ7NOpN6kFCbUqoOCdC78k6uibAiFr4mKwqAougnUEn6hWK5co28Uf0")).isJsonPrimitive()) {
               return var1.get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("EOntZrVA/lQ7NOpN6kFCbUqoOCdC78k6uibAiFr4mKwqAougnUEn6hWK5co28Uf0")).getAsInt();
            }

            JsonElement var2 = var1.get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("hFxxFyZd+GyNUyXvua4gK5rWtogIuIKPyGEmSBVWcDTWEFTxX3GZbILZ"));
            if (var2 == null) {
               return Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(1572530158, 10);
            }

            if (var2.isJsonPrimitive()) {
               return var2.getAsInt();
            }

            if (var2.isJsonArray() && var2.getAsJsonArray().size() > 0) {
               JsonArray var3 = var2.getAsJsonArray();
               return var3.get(var3.size() - Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1699919129, 14)).getAsInt();
            }

            if (var2.isJsonObject()
               && var2.getAsJsonObject().has(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("6/LPYRRXPBulcw2Im/0bJLNcSV1RYpr2bYXAthu2ZuXMxQBoipDWt9TQyHIONHLfPefLz0tk"))) {
               return var2.getAsJsonObject()
                  .get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("6/LPYRRXPBulcw2Im/0bJLNcSV1RYpr2bYXAthu2ZuXMxQBoipDWt9TQyHIONHLfPefLz0tk"))
                  .getAsInt();
            }
         } catch (RuntimeException var4) {
         }

         return Xqedii_j9phx7b.Xqedii_ar3tio945bmp(2085860348, 21);
      }
   }

   public JsonArray Xqedii_1r7v5u7(JsonObject var1) {
      if ((129259155 * 129259155 - 129259155 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var1.has(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("qyqR6BsRUpThA9mJ6inDnm5AWF6cmMohguuG+JZH7d2+k33KCfwL8R3Bc3o="))
         && var1.get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("qyqR6BsRUpThA9mJ6inDnm5AWF6cmMohguuG+JZH7d2+k33KCfwL8R3Bc3o=")).isJsonObject()) {
         JsonElement var2 = var1.getAsJsonObject(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("qyqR6BsRUpThA9mJ6inDnm5AWF6cmMohguuG+JZH7d2+k33KCfwL8R3Bc3o="))
            .get(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("Avd45sKUriCRqY7Tt3JmhpKi7oC/DuRs9ldqMe/MgIPa9RQtLcF6S6SG"));
         return var2 != null && var2.isJsonArray() ? var2.getAsJsonArray() : null;
      } else {
         return null;
      }
   }

   public JsonObject Xqedii_32zucky(File var1) {
      if (((135499207 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isFile()) {
         try {
            JsonElement var2 = new JsonParser().parse(Files.readString(var1.toPath(), StandardCharsets.UTF_8));
            return var2.isJsonObject() ? var2.getAsJsonObject() : null;
         } catch (RuntimeException | IOException var3) {
            return null;
         }
      } else {
         return null;
      }
   }

   public Xqedii_3vpi3ac Xqedii_1m7vvf7(Path var1, List<Path> var2) {
      if (((-2116454553 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Iterator var3 = var2.iterator();

         while (true) {
            String var5;
            while (true) {
               if (!var3.hasNext()) {
                  return null;
               }

               Path var4 = (Path)var3.next();
               if (Xqedii_1yr5est.matcher(Xqedii_3c4jmju(var1, var4)).matches()) {
                  try {
                     var5 = Files.readString(var4, StandardCharsets.UTF_8);
                     break;
                  } catch (IOException var15) {
                  }
               }
            }

            String var6 = this.Xqedii_2ok16kq(var5);
            if (var6 != null) {
               ArrayList var7 = new ArrayList();
               HashSet var8 = new HashSet();
               int var9 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(123246599, 22);
               String[] var10 = var5.split(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("cTxap0SKjwmJbXPAafMFw7UFUKK4YsTYw/BLrbzORt7lyw=="));
               int var11 = var10.length;

               for (int var12 = Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(-1699919130, 13); var12 < var11; var12++) {
                  String var13 = var10[var12];
                  Matcher var14 = Xqedii_3sn0hou.matcher(var13);
                  if (var14.matches()
                     && !Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("TJeIf6hNdqlMQCqxFE+tp1/yT1hZ9qZFPKSthAV+QT8NVFsX6CQAkzLRe/pbGzgttD9QENX9B/4=")
                        .equals(var14.group(Xqedii_j9phx7b.Xqedii_2j7bvmyr1yhuj(1699919129, 18)))) {
                     var7.add(var13.trim());
                     var8.add(var14.group(Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1572530160, 0)));
                  }

                  if (var13.contains(
                        Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
                           "u0t+3LNrxKFOf8UnMyUgTPg6xfqDaIbm+UBoNwdERFtMxm6cKuL7NR3+pkLudiLuWO6ds/+S1zkMgiXkfhJRHc6cNZQvSlZAqMiYd5UdIwdT8LxcvlCVa5oY67nOvflBcQA="
                        )
                     )
                     && !var13.trim().startsWith(Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("0EJclf1delciJPz4H/7RxQUAhq+SB8/Edeb6HqEpXyA="))) {
                     var9 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(117905560, 14);
                  }
               }

               if (var8.containsAll(Xqedii_2711xik)) {
                  return new Xqedii_3vpi3ac(var7, var6, (var9 != 0));
               }
            }
         }
      }
   }

   public String Xqedii_2ok16kq(String var1) {
      if ((-39589828 ^ -39589828) != 0) {
         throw new IllegalStateException();
      } else {
         Matcher var2 = Xqedii_3ebn067.matcher(var1);
         if (!var2.find()) {
            return null;
         } else {
            int var3 = var2.end();
            int var4 = Xqedii_j9phx7b.Xqedii_ar3tio945bmp(952418360, 25);

            for (int var5 = var3; var5 < var1.length(); var5++) {
               char var6 = var1.charAt(var5);
               if (var6 == Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1614473199, 23)) {
                  var4++;
               } else if (var6 == Xqedii_j9phx7b.Xqedii_16kugrkdo0q7e(-1582491631, 19)) {
                  if (--var4 == 0) {
                     return var1.substring(var3, var5).trim();
                  }
               }
            }

            return null;
         }
      }
   }

   static {
      if ((-61475668 * -61475668 - -61475668 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_21sohag = Pattern.compile(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
               "ttrueSwVTL4XtzoJu7WYgwOyhdlnEOYzHsY2IZpOaJhZ5/fR3RizCOk8NUUwMik0WQCvHS7p5y8edLEptnfNzebSSm9UyPKb8+ETVuVqlmkM5VM6J9W1T7Xt3CHxihutcvqAAetBvSg="
            )
         );
         Xqedii_3ebn067 = Pattern.compile(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("z/D8rcC1HMuLHc4Ioz8+Kv4Weq7tAfXeNNsOSYv1NdueG0XEPfWO2EmVoGILKKWdCoaL/LR8u36wT6cHfdPGXspAODwX1/D47scdBBO0wq0=")
         );
         Xqedii_3sn0hou = Pattern.compile(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
               "ndm/d8wWhjekoIrTap7MouN5SlQ+hVGasptgEqcc/Afk+dwmw3rSSPc5i/5aA53cP+cY/YT7L5obXG2pB9q+HHDCcNmTNNkpvxEJQSW3EuMN40dEcLtMxkhv5D0ZW2npFLeia0Pjmp0DlDIuaXlLbtR74Pb9iYLt5PRZsw=="
            )
         );
         Xqedii_1yr5est = Pattern.compile(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
               "zLyGAiYxe9EW7S7BrfeX2T+/LxFKdEpZz65LztCqMUPdYDNwAS2NH3lQb/5lMRN7b9kBlIfNR5UiY0f7jXhe983VEnFCC6zY/1CmbHhyMaYC0otnC8pRCVU/OS3xXQI3QqkgUKBtFKo4hyg9W5I1oOTvwV+sQDg1rYH+mcSzqTE6XHfpOUTIL15eyS2ck3hk7wv6z+ELt9o8Q2BclLZp9GZQ99cR7M0lThX0lg=="
            )
         );
         Xqedii_18mqikn = Pattern.compile(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58(
               "/C2bQIaWPeHz9E7JNkdAALQscDy+nEqNfStfHsW631wCQNr+5ZMrkYAVN+s7srvDeK6jvvT8fg3J7uwE0ZZdT6MoUdcSwa1Omqfkhd23PtU/f/AKmkqBBtjtrf0Wb/sK8AX2wMTk22YPL3iGlCbxCtD4CMXHp1t+m8VA/CZvsiH2BiQEQIlkoVXcoP00AeDKv0LfMml9j3CFFsl8ebd1LayNl2YQDn++iu59QVLrPAI="
            )
         );
         Xqedii_2711xik = List.of(
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("H4lcS4SyIgNRFKAy0NdtbvjnmDznsgxlXQlvKE9oJTqO7OU03Vk/nL+bypAOuJ1n"),
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("PQmbRlLo8kMA9vFxFqDUfGwRAL+eO9JE4U7rbraHNJ029F6P1TAv2cod"),
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("xVa9ySjV5atfufv/JCkbeE0OhEVxSXAiCWjLN0X2i+wNl1C3mzpM3+KKOMblm72H"),
            Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("V1XVa20iI8vXMvrxLBHpE3nx82cANFc6UVqBqi9crb+bKWNRdPHd/KpAYuVz6Ea5pPjCGEV927g=")
         );
      }
   }

   private static /* synthetic */ String Xqedii_3b4y8oj4w98ky(long l) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("FW7UeKQ5OfVXq0jv3lBSqf4OygAG7JQTsq4J4GhGHIuI84ZqoovpCw==") + l;
    }

    private static /* synthetic */ String Xqedii_8a8y5a27je1p(String string) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("yvrlbIWRJD3HlAtx/C3RZ1f48+OqElexWJs1r+YGlyv8zmqtPbD6WJg+TC2jTEw54RxboYfG00iEFCVGd6wIJ5aTfnZRAq77WJD3eFZzU27M+mRnKgqLDhwtQcDxbSYONWm6zzJIWxDywCwwqttGljGGg7MD9Bb6GEcKbCgvElrOO0kdKYSDyUjw1I9zwFPED5+qhjjb1cjnTqyr1B01vE6ZS8XqIAHVe46Vx+s1BVt02EwgtqA=") + string;
    }

    private static /* synthetic */ String Xqedii_367l7l3ah05cc(int n) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("U37QWGrbk7pJ/kfSyMFm+xsd26/oCs2WQTWJqVTaXjrvr9GLWFxHkSr6P8ZsJXcdxjBVgi5ic7ZXNgkOll4iD+/SJxCnc8LuC97BnvvOjq/kx0P7j2tuE7fxV1wvnoJsN7jPQg5HAZCH6OKiiKLeSxM21RFdJl4YpniBMsAY3JE2wbXQPflHmnkCTGcU6kpK2LOu0v6wZ7DTkL9CQVSVp60DV1gbjNI/ymMIMWs60n78goaBR4756WsAmOuwx7rMx87M1FK3jMpNXSOxe1kQHhjlnMOT1y3DAiKXjjqBIGu36h7vhaaEDVMEvcc=") + n + Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("ct1vbJL66d8ZIq8g8Mm2FPI0ZTr2qMvDAdSUHOvs6qfLcboxVlFFfpo3ZhE=");
    }

    private static /* synthetic */ String Xqedii_2ss459xuhxrpl(String string) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("tFVxqdWmSx6Q84Q8BN58HDF7Dp4oyQjdMZvPioODwdpUJbU1Ae3sktPNeR5AyijZuhQ+SFZ+WsGBEiYeVfJ2eda9BphnKufrqO87iVpGoj2a4trBtfwRnusv1+PiVVSSD/AAx20AthxaN0aOYZpq/Iao7anaoRW/wXeD9NU6vCoVpSJP3/OqXG82QLQRcTYCWdWOIhVJaWH3yMlUN/S56fHf3tGm0KUi69gfXdRMSgszJG7M") + string;
    }

    private static /* synthetic */ String Xqedii_mua4vden5em3(String string) {
        return string + Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("fx9i0kBJGsTgHpicHviOez0KzBM/2slCiGg3yZ+7adjB+P5n");
    }

    private static /* synthetic */ String Xqedii_3jm1abql1fe6y(String string) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("NZRArkwb24hoyvWIXulwQeg3En6RO94+JCr3O75TW+AVPCLtr2L+c/V8o+POAHzuJe4N2e66jkBFlQcTyMQ7icqXKy5X05cg9Hg1FPHi1uX1xhQw4nonvBTJRRn2/U2DwrF4W+RXM+w5d6kOh3kblVmT4iK5a9TJS4NbGdvzHdM+q8jA+2LfopdgsVBl51swfvPBJlS/z2Fn/9uSGQJ4zLaWLIKoY7gCVkwx0w==") + string;
    }

    private static /* synthetic */ String Xqedii_3y6nf3zehy3o(String string) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("zg6lIwX2E8cQkJnSxHAzSLUUm4d+h3WWvQULNKBqQjU3lBngOJjH9IGFd/E1/+Tm4uUdjEVoXBNoZagwJ1TZx34cz7m+KKEE/xGqqfXo/CU89BFfbNiLQYGgCkNggQeAmKmZpCoyXZ732SQrG0QzqdzzJGIgM8VDQ/ekXXzCk4z293PWP1nIc4iaz1swv9TVmGmz+N418IayKtoSgpo+GETQOWdP4bfQv7o=") + string;
    }

    private static /* synthetic */ String Xqedii_2irrdsz2ywswy(String string, String string2) {
        return Xqedii_j9phx7b.Xqedii_266ohtu8zxb58("AbHh6FRHEoCyKDD0QFZV8Jte3wEOa/eMhqcplmG8ptd4VNPJEmYivFhMAN6I5jvKq9OV+LWpz+6diK+megl8CQ==") + string + string2;
    }
}
