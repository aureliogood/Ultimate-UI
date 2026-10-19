package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public abstract class ResourcePackDelivery extends LangMessages {
   public static final String Xqedii_3vtjd2hyf7ejj = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_17jv3dj = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("eFi5/qtbKwkSLfWPrA4PwB2z5d9BwKIpRa3yVHYa+N7GUcT5no4=");
   public static final String Xqedii_2u1t1st = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
      "ZFVWd21d4hglnFp6gzZeerGBwXQyq8aC5DYLq0iVZnxq4uOGVqZZQOiU26utWeAccPBfhDl4N+LxKQtMh5KZ5UcChhXPFOw7+eMi2f5i"
   );

   public void scheduleJoinResourcePackApply(Player var1) {
      if (((1718551897 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         if (this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "qhan4Bd8sYusXq10HQSkFeBW11eDqkXYD3XGjpfzNo4EM86Sf40IEsmhSgcr9/8OOEyOgqEVAAfleWE0CFdr705eWKMK8+ycdPSMN4CI7yxcyg=="
               ),
               (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-346461805, 23) != 0)
            )) {
            String var2 = this.resolveResourcePackUrl();
            if (var2 != null && !var2.isBlank()) {
               this.sendResolvedResourcePack(var1, var2, Xqedii_2q009hr.Xqedii_36m9doxs96uus(4869031879782518673L, 2));
            }
         }
      }
   }

   public String resolveResourcePackUrl() {
      if ((1397476064 * 1397476064 - 1397476064 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "B9fnTpflF+R3MwlkKEU9qbz+Y7nBht6d1t6Obq+HsdWu/eQ/W/LdsQlPYtlLymfIk299YoATwm3pg5C7OiYrpb+lVrc8vG0NgjhSyUMx7r0Rmz2j0jsTRwUS8pij3w/dlqLusE7WBB6FMw6t6ioVRgCY"
               ),
               (Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 20) != 0)
            )) {
            File var1 = new File(
               this.getDataFolder().getParentFile(),
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("qMe6g47m6BVBzQ+uLBBOHGyFP0T4ZsX96kIqXyd86OtZrlHyWJ5cj9yS6TTk3B3n1kViPw==")
            );
            if (var1.exists() && var1.isDirectory()) {
               if (this.Xqedii_391oru2 != null) {
                  this.Xqedii_391oru2.Xqedii_3d0prc5();
               }

               return null;
            }
         }

         if (this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "QWB3HzmrVcL+xEvsNa1G4sMUOZ/+nuOkWIS0whATZJbEGV7B+m/bfyKjre4j0zzYvUEAGcS2EXPJCRYAn2aVnCWd/m7TGmSgk2BYu4XaZDAwBwdkpan6dtJLR/NWdEbzMcbnfAYNZ4AXnCK7EeAX+pbS"
               ),
               (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 17) != 0)
            )) {
            if (this.Xqedii_391oru2 != null) {
               this.Xqedii_391oru2.Xqedii_3d0prc5();
            }

            return null;
         } else {
            if (this.getConfig()
               .getBoolean(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "qvi30Ryly5dUGaOZQmrEmMJouPCvStXkiGnVXqijTfYmncij6L0GUpbxu5IhewbOac4cJi23AU/jshASssLxISCxuwapn7CafSUIHIFxO0NIgiJxoMJl73//fwwo5aMeKWU8HH8tkD+S9Q=="
                  ),
                  (Xqedii_2q009hr.Xqedii_o00zcry05piz(-1828509130, 23) != 0)
               )) {
               String var2 = this.resolveSelfHostedResourcePackUrl();
               if (var2 != null && !var2.isBlank()) {
                  return var2;
               }
            }

            if (this.Xqedii_391oru2 != null) {
               this.Xqedii_391oru2.Xqedii_3d0prc5();
            }

            if (this.getConfig()
               .getBoolean(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "12OiyOeltcntQBVhYjsYyB7ugq4VB5buSj16Oa8wADucMbDMDAuei6lRybxeYVRAu8dk76kQmRiYgJpgys6iA+RYILh/JopvQ4GD8+DGID5DsnKx/il6L/7kh9pKnnV2ByJx1IkPhp2biYidhQMhXYNa"
                  ),
                  (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-1813259927, 15) != 0)
               )) {
               return this.normalizeResourcePackUrl(
                  this.getConfig()
                     .getString(
                        Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                           "pqDWBSjQgDMCbRts37bhLkA8OwOD/IzfQQ7VUYoZheh1PWJPVVy/IF8DympTV3RgwtRCmlfdegGp6+lxUVoZu3/JIHyXkRpkGJzA8+IHzZjBqbQWFxgbUjfb3rIVPTs2M2gLE+lzA+HmbA=="
                        ),
                        Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==")
                     )
               );
            } else {
               if (this.getConfig()
                  .getBoolean(
                     Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                        "l7CMD5yNCEDO9M/+FjaYsJ3uGwgJw7agm0iws9pXdDMj0rDftHjGmBQt4DcYsXJTGtuQKIlLq6HLQQRRhHJS9HDSOyA81Ryq24o8NrIlpipKVYEi99O786L+n0CHz0GbdMb0HPTtHy7REaHl6MSVOQ=="
                     ),
                     (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 16) != 0)
                  )) {
                  String var3 = this.Xqedii_1zavo1k != null ? this.Xqedii_1zavo1k.Xqedii_3c3zwyj() : null;
                  if (var3 != null && !var3.isBlank()) {
                     return this.normalizeResourcePackUrl(var3);
                  }
               }

               return null;
            }
         }
      }
   }

   public String resolveSelfHostedResourcePackUrl() {
      if (((428880996 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_391oru2 == null) {
         return null;
      } else {
         File var1 = this.ensureResourcePackFolder();
         String var2 = this.getConfig()
            .getString(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "ib2PF0e5PuHTkQxsL1gwokKxzA8b4wzgBqI7WL0ziEn+1pYjN/RLpDmS9pkXTjo/2lJv5eDBghMBadZC4H91z2Ku0dkciQxPu8mIw98+lHBCSv+f/f5a5+W7lJO064pI2Wi0BR1BPt4v7d8k+84="
               ),
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==")
            );
         int var3 = this.resolveSelfHostPort();
         String var4 = this.Xqedii_391oru2.Xqedii_3y0jx5p(var1, var2, var3);
         if (var4 != null && !var4.isBlank()) {
            return this.normalizeResourcePackUrl(var4);
         } else {
            File var5 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DEjoKNhDStBlSNgoACf1AuTs0ryGDT8/P2/2DtPd4/laEz95"));
            if (this.countFilesRecursively(var5) <= Xqedii_2q009hr.Xqedii_xb0f3tvmur7a(1662804288390353880L, 58)) {
               this.getLogger()
                  .warning(
                     Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                        "7/rz4mvMifc6JPylhKYUfp2oUS8EJpr0Rbi+l1cnBpMvfyuk0mBJtH1r+SJiQZcl1xXeMhXyKvGlJ0oK74AYKZSHulyttwnPCDGTQlhUx+AUU7RrmZHKeb+IyhX2ZrmW3frgBbhkZbfcVYai9Ari9T1R6SWvui4LAJNCvGMpo8dFnk7cxF4KG8Is8VaLbgZ54F+hEs2tlXef6uGZ+c5LuyOF7jX+qTISzV7iAVKCa6GA5j6midMIpEe9ZlBL7K+yJQgMf3pnBFqCoapq503WjcVBvSZ9dY13sGm7uiwkvNLxJP23+fLo0Jd+7nb4IcriDcOouOeAboaFvfzHWUs="
                     )
                  );
            }

            return null;
         }
      }
   }

   public int resolveSelfHostPort() {
      if ((-904300737 * (-904300737 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Object var1 = this.getConfig()
            .get(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "pAoxzRYwiSmWAxH3VNQB3qkWBijKTTAQx5hv2XS6r3/wSwrhPkADS4/dJXWVZhSNZU7y8qqYwRLG5O583vGRjuRpssJhcdZNbnaB+nLfycakwIOEPM6nmoYahUHWA3ZeNLxnLohhtRCj2TsKPUA="
               )
            );
         if (var1 instanceof Number var2) {
            return var2.intValue();
         } else {
            if (var1 != null) {
               try {
                  return Integer.parseInt(var1.toString().trim());
               } catch (NumberFormatException var3) {
                  this.getLogger().warning(Xqedii_2b3hebqk0jdzw(String.valueOf(var1)));
               }
            }

            return Xqedii_2q009hr.Xqedii_20od6grxfkria(864464787, 15);
         }
      }
   }

   public void mergeConfigDefaults() {
      if ((-1848926280 * (-1848926280 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         InputStream var1 = this.getResource(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("XXJ9qvE3d5d7E5RNyHeLwmaNtGYCvkKa6C1tifGLSWNLYitcr+MAS9H7tbmA0oXa"));
         if (var1 == null) {
            this.getLogger()
               .warning(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "vTrhcHkKh97/yJYLlLl1djDjmyAphE9reeFLXSHjjsYWZGTyFPzbX9HC0UxilMV0odTqxWDvi/MTJEP4HFgM6AYAtPITzJ8IOXVRFwFtb5CSxaM9hVpb52F+VrCfy5/JjVlvtzN+BRgD2pQ+rRbqvqYvkFOgDMbH5yWjyiGGnPRBg6nyj+X65oUcmviPNMvJXcOYKmqC2NuyFk9+hx9JomKsHBl9Tj53xXqxCN9d3KASGutrsHglbD6mxQPvWD346fDmbK/Rn6Ck1HFXMCTfDHAVOc9T73RrSwk9wohphi5loK1mALl7Md09yG0Zo2sAUFEsLBji"
                  )
               );
         } else {
            YamlConfiguration var2;
            try (InputStreamReader var3 = new InputStreamReader(var1, StandardCharsets.UTF_8)) {
               var2 = YamlConfiguration.loadConfiguration(var3);
            } catch (IOException var11) {
               this.getLogger().warning(Xqedii_2u8wzaffphh50(var11.getMessage()));
               return;
            }

            int var12 = Xqedii_2q009hr.Xqedii_o00zcry05piz(106196262, 0);
            String[] var10000 = new String[Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641171, 7)];
            var10000[Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 5)] = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "F1S7yniKywZwP6CsfLIVpV5GH2Py62CNdscqiQZxSk5VE9LoQfn0kaQEN/fNFA=="
            );
            var10000[Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935401348, 15)] = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "bsk+Jvr5+MbLjnJfQrdbrLNFiv3GawzFimy1vnHnqzlwnuVgkd68/HmUiW/BMNZHn6PJRkem"
            );
            var10000[Xqedii_2q009hr.Xqedii_o00zcry05piz(-632288088, 17)] = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "YVWazKnzsujYGtZouGIAaliotOkvYpkDApahkHHLbjgYUx1/wf2jQaYWT8XmMBIZZE69YMSB"
            );
            var10000[Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-726478041, 24)] = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "0Yoo2YLBbkbKO8pHTSgMopREQjDyacE1Lc7sO5wHr0AmlXraNMJvygMEg3W9DnmRqCwtVA=="
            );
            var10000[Xqedii_2q009hr.Xqedii_o00zcry05piz(1250006299, 22)] = Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "uX1+I6ANHgy0kZ2mQAqqmxFlrbcGk8WLXXZR52lQdlwa0+lhV7JcT81HwP69UvLTBXC9fvMk"
            );
            String[] var4 = var10000;
            int var5 = var4.length;

            for (int var6 = Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 11); var6 < var5; var6++) {
               String var7 = var4[var6];
               if (this.getConfig().contains(Xqedii_1si5bkmp4ti2h(var7))
                  && this.getConfig().getBoolean(Xqedii_ziqarhyoy509(var7), (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 12) != 0))) {
                  var12 = Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 6);
                  break;
               }
            }

            int var13 = Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 27);
            ArrayList var14 = new ArrayList();

            for (String var16 : var2.getKeys((Xqedii_2q009hr.Xqedii_o00zcry05piz(457818517, 14) != 0))) {
               if (!var2.isConfigurationSection(var16) && !this.getConfig().contains(var16, (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1398497668, 29) != 0))) {
                  Object var8 = var2.get(var16);
                  if (Boolean.TRUE.equals(var8)
                     && var12 != 0
                     && var16.startsWith(
                        Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("1+HSd1oNTIu7EYnKi1krxCcA5AOdvDJ9DQ+JVy3AVXg4Qyznx/O2HIm8Q38ubH+Kt/GQIJxKkQpxgI2IwpMjx1gId/FDdP1B")
                     )
                     && var16.endsWith(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0LDJGlnMHhsnl0BDiiolrujDRLDOHRrp4+/W6696uhlHZXAyXQLkNyVgYJ4="))) {
                     this.getConfig().set(var16, Boolean.valueOf((Xqedii_2q009hr.Xqedii_o00zcry05piz(1699140192, 4) != 0)));
                  } else {
                     this.getConfig().set(var16, var8);
                  }

                  var13 = Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 1);
                  var14.add(var16);
               }
            }

            if (var13 != 0) {
               this.saveConfig();
               this.getLogger()
                  .info(
                     Xqedii_exea7urlkrn(var14.size(), String.join(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("cSm5cdu+AtTP8087VLn0+2y5mSl18wPjIbaJslqEv2Q="), var14))
                  );
            }
         }
      }
   }

   public String normalizeResourcePackUrl(String var1) {
      if ((-1980884267 * -1980884267 + -1980884267 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         String var2 = var1.trim();
         if (var2.isBlank()) {
            return null;
         } else {
            String var3 = var2.toLowerCase(Locale.ROOT);
            return !var3.startsWith(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("M7pDi53vxvnxZy1Hei2S71LA+iwhFS/Hm1hvX3KZnj2lJsnmUolg6vUR"))
                  && !var3.startsWith(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("PQkysPQTLHyd0nQk3EwNJ0nBPS20GU/p/6f2UVGtwhkIgix9gCBwPlYgeow="))
               ? null
               : var2;
         }
      }
   }

   public Component resolveResourcePackPromptComponent() {
      if ((56813754 ^ 56813754) != 0) {
         throw new IllegalStateException();
      } else {
         List var1 = this.getLangStringList(
            Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "Urlb+c+DSJnPAozEZthDAqY80Q9h6jO12dOoyVd0LmO1FD9blACsq36XHQEM8KgR0UNOHyd1glhrieqnxKSpM05h2vxI195smWBQU0LWVAxX3kshf/4="
            )
         );
         if (var1.isEmpty()) {
            return null;
         } else {
            Component var2 = null;

            for (String var4 : (Iterable<String>) (var1)) {

               Component var5 = this.deserializeConfiguredMessage(var4);
               if (var2 == null) {
                  var2 = var5;
               } else {
                  var2 = var2.append(Component.newline()).append(var5);
               }
            }

            return var2;
         }
      }
   }

   public void rebuildUiImagesIntoResourcePack() {
      if (((1999660998 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_2ittm45 var1 = this.Xqedii_1e7k2q0.Xqedii_1hvwbjh(this.getDataFolder(), this.getLogger());
         if (var1 != null && var1.imagesByName() != null) {
            this.Xqedii_11hx7yt = new HashMap<>(var1.imagesByName());
         } else {
            this.Xqedii_11hx7yt = new HashMap<>();
         }
      }
   }

   public void ensureGeneratedResourcePackArchive(boolean var1) {
      if ((-526242071 * (-526242071 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_391oru2 != null) {
         File var2 = this.ensureResourcePackFolder();
         File var3 = this.Xqedii_391oru2.Xqedii_ec1q5pv(var2, var1);
         if (var3 == null || !var3.exists() || !var3.isFile()) {
            File var4 = new File(var2, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DEjoKNhDStBlSNgoACf1AuTs0ryGDT8/P2/2DtPd4/laEz95"));
            long var5 = this.countFilesRecursively(var4);
            if (var5 <= Xqedii_2q009hr.Xqedii_14w58xdjb31h5(2304146536772797605L, 38)) {
               this.getLogger()
                  .warning(
                     Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                        "nLqoTKjm5sJd9Jlh9d4/n2trTOhd78utu1DcrOFWos+82EanxRUsu97t6V3M4l3j76fxw/tazt9wcGI9KNraFZ7FUCSXBD0yb1shTnKmu69aRx5criMZ7Zttlh21qP2ihmogR689M+oflpBP7Qg4qmyaAwQaPgvcMFzmCGPWTBBYTV79atrM4bcHwREEwnRkeb/PLos8LpfvdLYuDfH2Y1QAVFhjI+4Q142NPN9Tl2ngQjGQdrL45+dS+3C6NigKUZxpwqWR5tJ/JA=="
                     )
                  );
            } else {
               this.getLogger()
                  .warning(
                     Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                        "aY0T+ee0A/KWSnzn4WCAIL6bLECfp2BfSxO4x+GUA42xHLajxqXRJQAlWH6V6B5OXLG0+KX7v8MLe1AnNwfW6rAws/qV27TvBZz+cbpo/3rBlM9c1HUt2Rsy42fNq/qfDS1Hm+sMIODU9BrfVYzL2G0Cd8mmFq1PW9cXzjyWpD6hKNKy0Phey6tIKzrz5lJtK8MRY+mJv0d+3bb9L6qtTAOc2hcRKl08tNPhX2DvVDU8IHV18GeGgrlkG0IdkyeQJ9bFutawpEHbzF+HoqPot1H9XvU9uYU1IFI="
                     )
                  );
            }
         }
      }
   }

   public void syncPackToXqediiSetups() {
      if ((-397231456 * -397231456 - -397231456 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "B9fnTpflF+R3MwlkKEU9qbz+Y7nBht6d1t6Obq+HsdWu/eQ/W/LdsQlPYtlLymfIk299YoATwm3pg5C7OiYrpb+lVrc8vG0NgjhSyUMx7r0Rmz2j0jsTRwUS8pij3w/dlqLusE7WBB6FMw6t6ioVRgCY"
            ),
            (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(1705398191, 1) != 0)
         )) {
         File var1 = this.getDataFolder().getParentFile();
         if (var1 != null) {
            File var2 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("qMe6g47m6BVBzQ+uLBBOHGyFP0T4ZsX96kIqXyd86OtZrlHyWJ5cj9yS6TTk3B3n1kViPw=="));
            if (var2.exists() && var2.isDirectory()) {
               File var3 = new File(this.getDataFolder(), Xqedii_tas30m367lbi(File.separator));
               File var4 = new File(var2, Xqedii_3v61hj4hww2az(File.separator));
               File var5 = new File(var3, Xqedii_2vz74886luw46(File.separator));
               if (var5.exists() && var5.isDirectory()) {
                  File var6 = new File(var4, Xqedii_u24d1rsvn4cq(File.separator));
                  File var7 = new File(var6, Xqedii_3rg4n9f91g3fc(File.separator, File.separator));
                  if (var7.exists() && var7.isDirectory()) {
                     File[] var8 = var7.listFiles();
                     if (var8 != null) {
                        File[] var9 = var8;
                        int var10 = var8.length;

                        for (int var11 = Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 26); var11 < var10; var11++) {
                           File var12 = var9[var11];
                           if (var12.isFile()) {
                              var12.delete();
                           }
                        }
                     }
                  }

                  this.syncFolderToXqediiSetups(var5.toPath(), var6.toPath());
               }

               File var13 = new File(var3, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("9nK1otApJIQE+1UKXFESk4+MuWgnjBSdeu1wAO7pJGpnLsnQmp7sUkxd"));
               if (var13.exists() && var13.isDirectory()) {
                  this.syncFolderToXqediiSetups(
                     var13.toPath(), new File(var4, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("9nK1otApJIQE+1UKXFESk4+MuWgnjBSdeu1wAO7pJGpnLsnQmp7sUkxd")).toPath()
                  );
               }

               this.getLogger()
                  .info(
                     Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                        "G9A2dUNlduj906TJ3rSR2g0Xn5BczWJTpD5clH/rinFLS/hDu9pmO2+1qu3r0/vGvHTu77BUYBmo129IbRa3HEdcUoFKtZEeHx4ykv8a0Qz3klWdF5vdIrp+bEN0S4HEMJ5TM9W04a0uFzdIbI+/od7hNpQ9dnMqfJKC/QsnOsg="
                     )
                  );
            }
         }
      }
   }

   public Xqedii_1pwigla deployPackToExternalPlugin() {
      if (((1207992669 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.getConfig()
         .getBoolean(
            Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "QWB3HzmrVcL+xEvsNa1G4sMUOZ/+nuOkWIS0whATZJbEGV7B+m/bfyKjre4j0zzYvUEAGcS2EXPJCRYAn2aVnCWd/m7TGmSgk2BYu4XaZDAwBwdkpan6dtJLR/NWdEbzMcbnfAYNZ4AXnCK7EeAX+pbS"
            ),
            (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 29) != 0)
         )) {
         return null;
      } else {
         Xqedii_hme1l2t var1 = Xqedii_hme1l2t.Xqedii_3mduzsu(
            this.getConfig()
               .getString(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "S7xo6MNBoYT7OEM94esmyntzdTODzQQ0p+HVqXFABisCe7wbZDCvpyIIP8fM2nfXFA0wAcj/pVypg9KK2Oo7zApBZmNWCUm527WYPuJymh8aNfYu8OfnOIyy1uYpsItUpdvF19R3BzPuTS9LPtsGkr8nQLSW9ks3D/Y="
                  ),
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NgCACIsBzcXZO285HBbDG1ZrwEOWKlR5MLQfDolbLBPLT+J4")
               )
         );
         if (var1 == null) {
            return null;
         } else {
            Xqedii_12bi5q4 var2 = new Xqedii_12bi5q4(this);
            File var3 = var2.Xqedii_1kxrs0m(var1);
            if (var3 != null && var3.isDirectory()) {
               File var4 = this.resolveGeneratedPackArchiveFile();
               if (var4 != null && var4.isFile()) {
                  try {
                     return var2.Xqedii_278kok9(var1, var4);
                  } catch (RuntimeException | IOException var6) {
                     this.getLogger().warning(Xqedii_2kdtvuoiyu3jh(var1.Xqedii_lho1nuv(), var6.getMessage()));
                     return null;
                  }
               } else {
                  this.getLogger().warning(Xqedii_2z4y4sef6b43h(var1.Xqedii_lho1nuv()));
                  return null;
               }
            } else {
               return null;
            }
         }
      }
   }

   public void syncFolderToXqediiSetups(Path var1, Path var2) {
      if ((1109348626 * 1109348626 - 1109348626 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try (Stream<Path> var3 = Files.walk(var1)) {
            var3.forEach(var3x -> {
               if (((-1947060556 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  try {
                     Path var4 = var1.relativize(var3x);
                     Path var5 = var2.resolve(var4);
                     if (Files.isDirectory(var3x)) {
                        if (!Files.exists(var5)) {
                           Files.createDirectories(var5);
                        }
                     } else {
                        Files.createDirectories(var5.getParent());
                        CopyOption[] var10002 = new CopyOption[Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 2)];
                        var10002[Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 29)] = StandardCopyOption.REPLACE_EXISTING;
                        Files.copy(var3x, var5, var10002);
                     }
                  } catch (IOException var6) {
                     this.getLogger().warning(Xqedii_3s3atyp10h79f(String.valueOf(var3x.getFileName()), var6.getMessage()));
                  }
               }
            });
         } catch (IOException var8) {
            this.getLogger().warning(Xqedii_21broykjb7wt3(var8.getMessage()));
         }
      }
   }

   public long countFilesRecursively(File var1) {
      if (((-1014455645 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || !var1.exists()) {
         return Xqedii_2q009hr.Xqedii_14w58xdjb31h5(-8071298768468377006L, 37);
      } else if (var1.isFile()) {
         return Xqedii_2q009hr.Xqedii_14w58xdjb31h5(2304146811650704549L, 38);
      } else {
         File[] var2 = var1.listFiles();
         if (var2 != null && var2.length != 0) {
            long var3 = Xqedii_2q009hr.Xqedii_xb0f3tvmur7a(1662804288390353880L, 63);
            File[] var5 = var2;
            int var6 = var2.length;

            for (int var7 = Xqedii_2q009hr.Xqedii_o00zcry05piz(-1462088692, 9); var7 < var6; var7++) {
               File var8 = var5[var7];
               var3 += this.countFilesRecursively(var8);
            }

            return var3;
         } else {
            return Xqedii_2q009hr.Xqedii_flahiw5qmkdv(-5951819972951998927L, 22);
         }
      }
   }

   public void resendResourcePackToOnlinePlayers(String var1) {
      if ((-1706420602 * (-1706420602 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         for (Player var3 : Bukkit.getOnlinePlayers()) {
            this.sendResolvedResourcePack(var3, var1, Xqedii_2q009hr.Xqedii_36m9doxs96uus(-6308900042668267027L, 63));
         }
      }
   }

   public void sendResolvedResourcePack(Player var1, String var2, long var3) {
      if (((526880657 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         String[] var10001 = new String[Xqedii_2q009hr.Xqedii_o00zcry05piz(654726253, 24)];
         var10001[Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 6)] = var2;
         String var5 = this.firstNonBlank(var10001);
         if (!var5.isBlank()) {
            byte[] var6 = this.resolveResourcePackHashBytes();
            Xqedii_38o2zes.Xqedii_2sj63w1(this, var1, () -> {
               if ((-1903760265 * -1903760265 + -1903760265 & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var1.isOnline()) {
                  Component var4 = this.resolveResourcePackPromptComponent();

                  try {
                     if (var4 == null) {
                        if (var6 != null && var6.length != 0) {
                           var1.setResourcePack(var5, var6);
                        } else {
                           var1.setResourcePack(var5);
                        }
                     } else {
                        Xqedii_nd6rkr3.Xqedii_29hmlg6(var1, var5, var6, var4, (Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 9) != 0));
                     }
                  } catch (Throwable var6x) {
                     this.getLogger().warning(Xqedii_f0k0z3esnc4g(var1.getName(), var6x.getMessage()));
                  }
               }
            }, Math.max(Xqedii_2q009hr.Xqedii_36m9doxs96uus(1930401523559632457L, 20), var3));
         }
      }
   }

   public String computeResourcePackDeliverySignature(String var1) {
      if ((-504057052 * -504057052 - -504057052 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = this.resolveResourcePackHostingModeKey();
         String[] var10001 = new String[Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935401348, 15)];
         var10001[Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(1052612249, 19)] = var1;
         String var3 = this.firstNonBlank(var10001);
         StringBuilder var4 = new StringBuilder();
         var4.append(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0hSiEjzMtroMNz/bwXvYsSv6oayslY3FAxD7z/7t5ndqrn0PA/g=")).append(var2);
         var4.append(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("wxrI2+Tm6RqvauCPqglYMmEtKYnkNR1UlcNraEx1UN1bHmZK3kA=")).append(var3);
         if (Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("F1S7yniKywZwP6CsfLIVpV5GH2Py62CNdscqiQZxSk5VE9LoQfn0kaQEN/fNFA==").equals(var2)) {
            File var5 = this.resolveGeneratedPackArchiveFile();
            if (var5 != null && var5.exists() && var5.isFile()) {
               var4.append(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("7TQqWL9nDmz2o4HJJjFHg+NWna5uok4b7QyV6Tkwga7P/Aboh1nLNjKVP7CSDtoUsvLnZw=="))
                  .append(this.computeFileSha256(var5));
            } else {
               var4.append(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("tzqXmniCKnn6oYZ889qgOQdU7U2aqrxQHcgH3NdUZwbRD7u9lOuyA1lvWwRk8VIbAhyAjw=="));
            }
         }

         return var4.toString();
      }
   }

   public String resolveResourcePackHostingModeKey() {
      if ((1719395654 ^ 1719395654) != 0) {
         throw new IllegalStateException();
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "QWB3HzmrVcL+xEvsNa1G4sMUOZ/+nuOkWIS0whATZJbEGV7B+m/bfyKjre4j0zzYvUEAGcS2EXPJCRYAn2aVnCWd/m7TGmSgk2BYu4XaZDAwBwdkpan6dtJLR/NWdEbzMcbnfAYNZ4AXnCK7EeAX+pbS"
            ),
            (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-161848070, 29) != 0)
         )) {
         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("YVWazKnzsujYGtZouGIAaliotOkvYpkDApahkHHLbjgYUx1/wf2jQaYWT8XmMBIZZE69YMSB");
      } else if (this.getConfig()
         .getBoolean(
            Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
               "qvi30Ryly5dUGaOZQmrEmMJouPCvStXkiGnVXqijTfYmncij6L0GUpbxu5IhewbOac4cJi23AU/jshASssLxISCxuwapn7CafSUIHIFxO0NIgiJxoMJl73//fwwo5aMeKWU8HH8tkD+S9Q=="
            ),
            (Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 0) != 0)
         )) {
         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("F1S7yniKywZwP6CsfLIVpV5GH2Py62CNdscqiQZxSk5VE9LoQfn0kaQEN/fNFA==");
      } else {
         return this.getConfig()
               .getBoolean(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "12OiyOeltcntQBVhYjsYyB7ugq4VB5buSj16Oa8wADucMbDMDAuei6lRybxeYVRAu8dk76kQmRiYgJpgys6iA+RYILh/JopvQ4GD8+DGID5DsnKx/il6L/7kh9pKnnV2ByJx1IkPhp2biYidhQMhXYNa"
                  ),
                  (Xqedii_2q009hr.Xqedii_o00zcry05piz(1370789913, 10) != 0)
               )
            ? Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("bsk+Jvr5+MbLjnJfQrdbrLNFiv3GawzFimy1vnHnqzlwnuVgkd68/HmUiW/BMNZHn6PJRkem")
            : Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("G4j8yGHXKfppvi87Zu4HuI1oCa0JgKlwFJcbhbGOh9IvutPlhxIP/2xOqkw=");
      }
   }

   public File resolveGeneratedPackArchiveFile() {
      if ((-1780220507 * (-1780220507 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(
            this.getDataFolder(), Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("4ShphMCj+UP6BB1ErH2l0Q1zEB/g+xSaRlKvwC0AOQQttLwju1t0g/uUKTwq5KWHfO8VNQ==")
         );
         File var2 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("WyS2X8hnxGdzVnHWQPze+pORSakY5Q5kRaAcbI35/sjAgAhm7UqTpBkhE4fdXw=="));
         return new File(var2, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("BKANa+1kXnOEhEr6aEqn8SThVSkbAlBrZPf7hV9hNMdZVGRx4vqnpLudBP9eW5WPuDlausPXkjVamQmG"));
      }
   }

   public byte[] resolveResourcePackHashBytes() {
      if (((1128493455 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("F1S7yniKywZwP6CsfLIVpV5GH2Py62CNdscqiQZxSk5VE9LoQfn0kaQEN/fNFA==")
         .equals(this.resolveResourcePackHostingModeKey())) {
         return null;
      } else {
         File var1 = this.resolveGeneratedPackArchiveFile();
         if (var1 != null && var1.exists() && var1.isFile()) {
            byte[] var2 = this.computeFileDigest(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("3bEFgP3ArIBZq0JPTBt295N0jgwoFTemhPqOoAaI2/QEKV+eQLo="));
            return var2 != null && var2.length == Xqedii_2q009hr.Xqedii_o00zcry05piz(-629928792, 17) ? var2 : null;
         } else {
            return null;
         }
      }
   }

   public String computeFileSha256(File var1) {
      if (((1457156407 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.exists() && var1.isFile()) {
         byte[] var2 = this.computeFileDigest(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("cr/h1BPhMGr/3QR0KsIPWpJQCF0P93NvZCkSvMHePwoqn9g2FplIEez2"));
         return var2 != null && var2.length != 0
            ? this.toLowerHex(var2)
            : Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("aWCyRIP/oXZ37EId9xSLS57b8h9OURswNMZYan+dgJTDspxvzqlMx24RDa463f/l0UyZGw==");
      } else {
         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==");
      }
   }

   public byte[] computeFileDigest(File var1, String var2) {
      if ((-2109973046 ^ -2109973046) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.exists() && var1.isFile()) {
         String[] var10001 = new String[Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1901814148, 25)];
         var10001[Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-1114203842, 27)] = var2;
         String var3 = this.firstNonBlank(var10001);
         if (var3.isBlank()) {
            return null;
         } else {
            try {
               MessageDigest var4 = MessageDigest.getInstance(var3);
               byte[] var5 = new byte[Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-647396373, 31)];

               int var7;
               try (InputStream var6 = Files.newInputStream(var1.toPath())) {
                  while ((var7 = var6.read(var5)) != Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(-1935368581, 8)) {
                     if (var7 > 0) {
                        var4.update(var5, Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-161848070, 29), var7);
                     }
                  }
               }

               return var4.digest();
            } catch (Throwable var11) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public String toLowerHex(byte[] var1) {
      if (((-51659255 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.length != 0) {
         StringBuilder var2 = new StringBuilder(var1.length * Xqedii_2q009hr.Xqedii_20od6grxfkria(475770771, 29));
         byte[] var3 = var1;
         int var4 = var1.length;

         for (int var5 = Xqedii_2q009hr.Xqedii_o00zcry05piz(708219651, 7); var5 < var4; var5++) {
            byte var6 = var3[var5];
            var2.append(
               Character.forDigit(
                  var6 >> Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935369092, 7) & Xqedii_2q009hr.Xqedii_o00zcry05piz(458047893, 14),
                  Xqedii_2q009hr.Xqedii_20od6grxfkria(1012639763, 7)
               )
            );
            var2.append(Character.forDigit(var6 & Xqedii_2q009hr.Xqedii_20od6grxfkria(-1134841968, 30), Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1934320004, 16)));
         }

         return var2.toString();
      } else {
         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==");
      }
   }

   public String firstNonBlank(String... var1) {
      if ((-1529817935 * -1529817935 - -1529817935 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.length != 0) {
         String[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(668447443, 16); var4 < var3; var4++) {
            String var5 = var2[var4];
            if (var5 != null && !var5.isBlank()) {
               return var5;
            }
         }

         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==");
      } else {
         return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NQIjdOx4ErhNFKhnvWkqgS5yF8+DeXzKEU6Csg==");
      }
   }

   public void playLoadingSounds(Player var1) {
      if ((-1519326017 * -1519326017 + -1519326017 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         float var2 = (float)Math.max(
            Double.longBitsToDouble(Xqedii_2q009hr.Xqedii_36m9doxs96uus(-1550564160126479277L, 45)),
            this.getConfig()
               .getDouble(
                  Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                     "9Acg/G+vjc5Sq3j1fwq2YUyu7CwtTgvmudXgv4YYqM1C/g5MbIMB0F5tAGEtsfKpjTIhDNOfgfaJasjPG9wa/7gx49AShiZDnIQb88DuXwYZBx9+zLV2n56vvWVAgVYP+vQ="
                  ),
                  Double.longBitsToDouble(Xqedii_2q009hr.Xqedii_flahiw5qmkdv(-5807704784876143063L, 5))
               )
         );
         var1.playSound(var1.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, var2, Float.intBitsToFloat(Xqedii_2q009hr.Xqedii_o00zcry05piz(-1553386962, 11)));
         Xqedii_38o2zes.Xqedii_2sj63w1(
            this,
            var1,
            () -> {
               if (((369018406 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  if (var1.isOnline()) {
                     var1.playSound(
                        var1.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, var2, Float.intBitsToFloat(Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-1520490810, 7))
                     );
                  }
               }
            },
            Xqedii_2q009hr.Xqedii_36m9doxs96uus(9029560312931988106L, 42)
         );
         Xqedii_38o2zes.Xqedii_2sj63w1(
            this,
            var1,
            () -> {
               if (((1745682149 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  if (var1.isOnline()) {
                     var1.playSound(
                        var1.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, var2, Float.intBitsToFloat(Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-1928124457, 0))
                     );
                  }
               }
            },
            Xqedii_2q009hr.Xqedii_xb0f3tvmur7a(1662804288390353368L, 7)
         );
      }
   }

   public void forceClearTitle(Player var1) {
      if ((-1421582346 * -1421582346 + -1421582346 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.isOnline()) {
         var1.resetTitle();
         Xqedii_nd6rkr3.Xqedii_1blyyfe(var1);
         Component var2 = Xqedii_1df0pdx.deserialize(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("c1OB9IRRpB7IpfazJ3Fl9dtcoLQgIrTGrZ9nMHudr6undJKFwDhuopq9"));
         Times var3 = Times.times(Duration.ZERO, Duration.ofMillis(Xqedii_2q009hr.Xqedii_36m9doxs96uus(-8467523551869385038L, 34)), Duration.ZERO);
         Xqedii_nd6rkr3.Xqedii_303uu75(var1, Title.title(var2, var2, var3));
      }
   }

   public boolean isResourcePackChatMessagesEnabled() {
      if ((-643156770 * (-643156770 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "8J+tCIzMNLUuPvGR+7XcslsvyWgT5o053icExQOBpP0Rsiy/ngVSCOdY6D+av6JvGmT1sA1N4HaV/JNxhb9S4Auth4Wj5QIrAhkpWsxOFLXyP5KIhrYl/40GiCTX6Av6Vps="
               ),
               (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-884170914, 2) != 0)
            );
      }
   }

   public boolean isResourcePackTitleMessagesEnabled() {
      if ((-1976022832 * -1976022832 + -1976022832 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "ftrENhKJh/YZTeoAshSsDTznK7jzcz0EclxG5UKp6pvGVyVK0sf+nTz9qF8jwQo0yocf/D1btNbnk6DuB3TdwnGQGCl5USV+4SqfFceUToJzGTnp3GUCKtK6XP8q3tIilnnzXw=="
               ),
               (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368576, 2) != 0)
            );
      }
   }

   public boolean isResourcePackSoundEnabled() {
      if ((-1884634469 * -1884634469 - -1884634469 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.getConfig()
            .getBoolean(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                  "0Hy3UJWbohBRFuw0uadpMsOFmy2FFamw/PjAJmKt/C/gg98os3f+7bBia6yYM7Yqc55fypTBYGo/AswSLF26SKRn6eCSDY8nkk34zlspZ5nv43PlNOzhwnnea6LGZe1qze/Crg=="
               ),
               (Xqedii_2q009hr.Xqedii_o00zcry05piz(-1676062284, 26) != 0)
            );
      }
   }

   public File ensureResourcePackFolder() {
      if ((1315816549 * (1315816549 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(
            this.getDataFolder(), Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("4ShphMCj+UP6BB1ErH2l0Q1zEB/g+xSaRlKvwC0AOQQttLwju1t0g/uUKTwq5KWHfO8VNQ==")
         );
         if (!var1.exists()) {
            var1.mkdirs();
         }

         File var2 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DEjoKNhDStBlSNgoACf1AuTs0ryGDT8/P2/2DtPd4/laEz95"));
         int var3 = !var2.exists() ? Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1943757188, 23) : Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(668447443, 16);
         if (var3 != 0) {
            var2.mkdirs();
         }

         File var4 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("WyS2X8hnxGdzVnHWQPze+pORSakY5Q5kRaAcbI35/sjAgAhm7UqTpBkhE4fdXw=="));
         if (!var4.exists()) {
            var4.mkdirs();
         }

         this.extractDefaultPackFiles(var2);
         this.migrateLegacyResourcePackLayout(this.getDataFolder(), var2);
         return var1;
      }
   }

   public void extractDefaultPackFiles(File var1) {
      if (((1547794593 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var2 = this.getFile();
         if (var2 != null && var2.isFile()) {
            int var3 = Xqedii_2q009hr.Xqedii_o00zcry05piz(-1060467292, 29);
            int var4 = Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(-338073197, 23);

            try (ZipFile var5 = new ZipFile(var2)) {
               Enumeration var6 = var5.entries();

               while (var6.hasMoreElements()) {
                  ZipEntry var7 = (ZipEntry)var6.nextElement();
                  String var8 = var7.getName();
                  if (var8.startsWith(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("eFi5/qtbKwkSLfWPrA4PwB2z5d9BwKIpRa3yVHYa+N7GUcT5no4="))) {
                     String var9 = var8.substring(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("eFi5/qtbKwkSLfWPrA4PwB2z5d9BwKIpRa3yVHYa+N7GUcT5no4=").length());
                     if (!var9.isEmpty()) {
                        File var10 = new File(var1, var9.replace((char)Xqedii_2q009hr.Xqedii_20od6grxfkria(937144211, 22), File.separatorChar));
                        if (var7.isDirectory()) {
                           var10.mkdirs();
                        } else {
                           var10.getParentFile().mkdirs();
                           if (!var10.exists()) {
                              try (InputStream var11 = var5.getInputStream(var7)) {
                                 Path var10001 = var10.toPath();
                                 CopyOption[] var10002 = new CopyOption[Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 10)];
                                 var10002[Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 13)] = StandardCopyOption.REPLACE_EXISTING;
                                 Files.copy(var11, var10001, var10002);
                                 var3++;
                              }
                           } else if (Xqedii_ydayab7(var9) && !Xqedii_3w4snhi(var5, var7, var10)) {
                              try (InputStream var21 = var5.getInputStream(var7)) {
                                 Path var22 = var10.toPath();
                                 CopyOption[] var23 = new CopyOption[Xqedii_2q009hr.Xqedii_o00zcry05piz(424785052, 2)];
                                 var23[Xqedii_2q009hr.Xqedii_o00zcry05piz(1370789913, 10)] = StandardCopyOption.REPLACE_EXISTING;
                                 Files.copy(var21, var22, var23);
                                 var4++;
                              }
                           }
                        }
                     }
                  }
               }
            } catch (IOException var20) {
               this.getLogger().warning(Xqedii_350e0mqakgaqt(var20.getMessage()));
            }

            if (var3 > 0) {
               this.getLogger().info(Xqedii_2qby8gxm75i38(var3));
            }

            if (var4 > 0) {
               this.getLogger().info(Xqedii_1tdoqtp90yl6r(var4));
            }
         }
      }
   }

   public static boolean Xqedii_ydayab7(String var0) {
      if ((-406741558 * (-406741558 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0.replace(File.separatorChar, (char)Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(1705398257, 1))
            .contains(
               Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("ZFVWd21d4hglnFp6gzZeerGBwXQyq8aC5DYLq0iVZnxq4uOGVqZZQOiU26utWeAccPBfhDl4N+LxKQtMh5KZ5UcChhXPFOw7+eMi2f5i")
            );
      }
   }

   public static boolean Xqedii_3w4snhi(ZipFile var0, ZipEntry var1, File var2) {
      if (((-1906281863 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         long var3 = var1.getSize();
         if (var3 >= Xqedii_2q009hr.Xqedii_14w58xdjb31h5(-54287118108683101L, 43) && var3 != var2.length()) {
            return (Xqedii_2q009hr.Xqedii_o00zcry05piz(-765434554, 20) != 0);
         } else {
            try {
               boolean var8;
               try (InputStream var5 = var0.getInputStream(var1)) {
                  byte[] var6 = var5.readAllBytes();
                  byte[] var7 = Files.readAllBytes(var2.toPath());
                  var8 = Arrays.equals(var6, var7);
               }

               return var8;
            } catch (IOException var11) {
               return (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(1705398189, 1) != 0);
            }
         }
      }
   }

   public void migrateLegacyResourcePackLayout(File var1, File var2) {
      if ((-1419896675 * -1419896675 + -1419896675 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (!this.hasCanonicalResourcePackLayout(var2)) {
            File[] var3 = var1.listFiles();
            if (var3 != null && var3.length != 0) {
               int var4 = Xqedii_2q009hr.Xqedii_o00zcry05piz(-1530869107, 21);
               File[] var5 = var3;
               int var6 = var3.length;

               for (int var7 = Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 6); var7 < var6; var7++) {
                  File var8 = var5[var7];
                  if (this.isLegacyResourcePackRootEntry(var8)) {
                     File var9 = new File(var2, var8.getName());

                     try {
                        this.copyLegacyResourcePackEntry(var8, var9);
                        var4 = Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 2);
                     } catch (IOException var11) {
                        this.getLogger().warning(Xqedii_kjv979sripvu(var8.getName(), var11.getMessage()));
                     }
                  }
               }

               if (var4 != 0) {
                  this.getLogger()
                     .info(
                        Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt(
                           "TfKoPmWOuXwF5jYne9Dtu3MVFSfk4RNv6hlI3e/Dgcw9IQeBci0bRytAcHiVEacaLfDLfql6iq8Bo56kBsrep34Xbf9iFRKsvCFhXKIFzx70wVg9rKlkJwgdndNOf2wnn4BsDGVhXYrp6I9uTPIoKuhhNjUk5dpzVfc0tRZTxRqN19lL3xAVNq1mPNSEIFTd41GXIw7lvysQ2Li9IQAEaElvx86n4Z3ru9Q4g0ah"
                        )
                     );
               }
            }
         }
      }
   }

   public boolean hasCanonicalResourcePackLayout(File var1) {
      if ((-179067875 ^ -179067875) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2q009hr.Xqedii_3o5fvemdv40t6(1336894886, 17) != 0);
      } else {
         File var2 = new File(var1, Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("tAOz9j9ajnKyBcY7ukxS5mmD4A9xQk/b+Q0ziMRTY0nYvdlvBBENC5IDG6r7Z1YsReU="));
         return ((var2.exists() && var2.isFile()
            ? Xqedii_2q009hr.Xqedii_20od6grxfkria(1012641683, 30)
            : Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 30)) != 0);
      }
   }

   public boolean isLegacyResourcePackRootEntry(File var1) {
      if (((-849384963 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var1.exists()) {
         String var2 = var1.getName();
         if (var2 == null || var2.isBlank()) {
            return (Xqedii_2q009hr.Xqedii_o00zcry05piz(1275898074, 25) != 0);
         } else if (var1.isFile()) {
            return ((!Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("tAOz9j9ajnKyBcY7ukxS5mmD4A9xQk/b+Q0ziMRTY0nYvdlvBBENC5IDG6r7Z1YsReU=")
                     .equalsIgnoreCase(var2)
                  && !Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("b1I4YTSYKGys7HM6noHFlbe2zVZ4ylj4ALiXshTdaa+Hz5h6IRCIO4QrgjU=").equalsIgnoreCase(var2)
               ? Xqedii_2q009hr.Xqedii_o00zcry05piz(106196262, 0)
               : Xqedii_2q009hr.Xqedii_o00zcry05piz(-1528771955, 21)) != 0);
         } else if (!var1.isDirectory()) {
            return (Xqedii_2q009hr.Xqedii_14qbzgzbc53rd(1935368580, 22) != 0);
         } else {
            return ((!Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("pEA2IBkhMvIe1gZiOk226yI5jjXwupoKt6fBmVdUcKz8yL/t4RPnGw==").equalsIgnoreCase(var2)
                  && !this.isLegacyVersionOverlayFolder(var2)
               ? Xqedii_2q009hr.Xqedii_o00zcry05piz(1617250002, 28)
               : Xqedii_2q009hr.Xqedii_o00zcry05piz(-2094385517, 31)) != 0);
         }
      } else {
         return (Xqedii_2q009hr.Xqedii_o00zcry05piz(-1265100463, 18) != 0);
      }
   }

   public boolean isLegacyVersionOverlayFolder(String var1) {
      if ((878518354 * 878518354 + 878518354 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && !var1.isBlank() && var1.matches(Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("9cmIxSTyzl7mK/m2X+ovs7oupfFe5bPMNzLzSyFQKkNs70o6JWJjbE1HLv6cfOTUJMpc7pmsVdix0irUF+jndg=="));
      }
   }

   public void copyLegacyResourcePackEntry(File var1, File var2) throws IOException {
      if ((-184903061 * (-184903061 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         if (var1.isDirectory()) {
            this.copyLegacyResourcePackDirectory(var1, var2);
         } else {
            File var3 = var2.getParentFile();
            if (var3 != null && !var3.exists()) {
               var3.mkdirs();
            }

            Path var10000 = var1.toPath();
            Path var10001 = var2.toPath();
            CopyOption[] var10002 = new CopyOption[Xqedii_2q009hr.Xqedii_o00zcry05piz(942842729, 27)];
            var10002[Xqedii_2q009hr.Xqedii_20od6grxfkria(-1012641684, 7)] = StandardCopyOption.REPLACE_EXISTING;
            Files.copy(var10000, var10001, var10002);
         }
      }
   }

   public void copyLegacyResourcePackDirectory(File var1, File var2) throws IOException {
      if ((1146153646 * (1146153646 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var1.exists() && var1.isDirectory()) {
         if (!var2.exists()) {
            var2.mkdirs();
         }

         File[] var3 = var1.listFiles();
         if (var3 != null && var3.length != 0) {
            File[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = Xqedii_2q009hr.Xqedii_o00zcry05piz(106196262, 0); var6 < var5; var6++) {
               File var7 = var4[var6];
               if (var7 != null) {
                  this.copyLegacyResourcePackEntry(var7, new File(var2, var7.getName()));
               }
            }
         }
      }
   }

   private static /* synthetic */ String Xqedii_2b3hebqk0jdzw(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("m9CCmkpluKeX24zVFLXnwg0DAiJ8u3tCXpm0mQjAdD/rEqYVgKQdZNJMl46jQ1dm4VSMcAbxWpR1JL9nlAkO/oHkzl3LcCVRFivvt3pywBll5ztuWwqormulteudSJbucXtLlC0174n0PBYQHwpkUdpQGa6xkVX7xKarjqkBKkyDZSeIpdjZcT02qBU=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("pWgTd+I+zuChS/Pm4fxrll0zbmuU376RPaWckMnydGUxAWwfm1gySuF5HbO2bGzjm377DEBRgQDCzimzeLqEmldnDgphxCiPmTTN+UI/uNjWf2LYnLX7/mmSiY6bJU2Ni0DnsJri/jdolzaA");
    }

    private static /* synthetic */ String Xqedii_2u8wzaffphh50(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("T173l6xa0F8LdvqnodWgXwAc90SHLaqdNUA7d0O/y+sIkmI6EsYUDqRg64bMZ2WrSlaMlQdCyVQuWIcCQZ+gPdJRNd2rFqqJTfUFMhlYQFyRcVVpfVgpWFcZ7ytzECfWvjHB76Bw9Q1Qds5BdAnNWP1TUKlVkgyKGAJqhHZ9riR3hNNkuW6dmlPoi3EZE+gBty1Y8UGcWtBnLnlGlcJdPpIVBvCRh9hNQRpm1vQ+QygFQuUysDcUidah9nQp438NP21sGPGNBR8IvTHIsKUDNfO/i7KfYCIgib9X44zEEyc=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("KbrJdqk1MoSIKUgXQUgo7Ho1/BS1lQpQhHmw6ni7S9o=");
    }

    private static /* synthetic */ String Xqedii_1si5bkmp4ti2h(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("1+HSd1oNTIu7EYnKi1krxCcA5AOdvDJ9DQ+JVy3AVXg4Qyznx/O2HIm8Q38ubH+Kt/GQIJxKkQpxgI2IwpMjx1gId/FDdP1B") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0LDJGlnMHhsnl0BDiiolrujDRLDOHRrp4+/W6696uhlHZXAyXQLkNyVgYJ4=");
    }

    private static /* synthetic */ String Xqedii_ziqarhyoy509(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("1+HSd1oNTIu7EYnKi1krxCcA5AOdvDJ9DQ+JVy3AVXg4Qyznx/O2HIm8Q38ubH+Kt/GQIJxKkQpxgI2IwpMjx1gId/FDdP1B") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0LDJGlnMHhsnl0BDiiolrujDRLDOHRrp4+/W6696uhlHZXAyXQLkNyVgYJ4=");
    }

    private static /* synthetic */ String Xqedii_exea7urlkrn(int n, String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("wZ/kn/d65zySfD959iaYAiXqQRLiqCSpJYv7J49E2bNIOaykuopNblI5ZdCqIBNNuC8BGvZaBUu0BpHqCzeV2rt/") + n + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("ZtwwLnQu7wMubq7dbMjL8rmuGBWR061ob3Z4iz55moX1g+Lu4BFr65hIaC/+xIVqo9UYe64k46F+FGB3adAQNTxkOAK+y/Ell9grZ8nP1cs/Mc/P") + string;
    }

    private static /* synthetic */ String Xqedii_tas30m367lbi(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("4ShphMCj+UP6BB1ErH2l0Q1zEB/g+xSaRlKvwC0AOQQttLwju1t0g/uUKTwq5KWHfO8VNQ==") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DEjoKNhDStBlSNgoACf1AuTs0ryGDT8/P2/2DtPd4/laEz95");
    }

    private static /* synthetic */ String Xqedii_3v61hj4hww2az(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("p6n9+dRxXnv7dW62jKTIuc7GVHZlAZFdt+CmiS0QQ03OJPuml+bo7y1nhCs=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DEjoKNhDStBlSNgoACf1AuTs0ryGDT8/P2/2DtPd4/laEz95");
    }

    private static /* synthetic */ String Xqedii_2vz74886luw46(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("pEA2IBkhMvIe1gZiOk226yI5jjXwupoKt6fBmVdUcKz8yL/t4RPnGw==") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0w7WLCwWuTJmyZuocGqlE304X8fXh2KNpcGP+tO/dqFA0KK1e54uCZYvyRMlUw==");
    }

    private static /* synthetic */ String Xqedii_u24d1rsvn4cq(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("pEA2IBkhMvIe1gZiOk226yI5jjXwupoKt6fBmVdUcKz8yL/t4RPnGw==") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0w7WLCwWuTJmyZuocGqlE304X8fXh2KNpcGP+tO/dqFA0KK1e54uCZYvyRMlUw==");
    }

    private static /* synthetic */ String Xqedii_3rg4n9f91g3fc(String string, String string2) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("Tj+tlDE0HGNYa37jy3r82K9u69uYDJUntgV3qqL7ft8bLFNn5avcU7SaY7k=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("O92FodZr98harILbIglPw09T+TXIzxRy2hcSWwGFylMEpk+n") + string2 + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("qXnXavhc/siOhTKUOtkSib39+ag4aHUpK5/huU7Dk7nrT+zJaBBvHQ==");
    }

    private static /* synthetic */ String Xqedii_2z4y4sef6b43h(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("IOLO0KqPHW/vMqMds/ggXvA4AkTHD1A7YjmWVkL/kKxS74OHqvADakKQVZAdpa44VzeWXLDgMP64vpoHO9jf3HPE9vjRQKWnLzhwEwCAOZPFWKHS") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("0HD+AwdduB+masj4QJeXTW3w/owOIrcuKUiaUYDujYWVG07t9cMl9HhpQ9yDrig/GjsR0TVgEyRId6fHicwcSISZmjxB41/9FodehysPiwO/AD7fPL2Tg8nwzQSGCdtZQi7g1OuCAZiS0xiei4r9DL4lx/Hi9erO3Z+Sl8Fo0oSpJ4uYQBXp81UjP5+Lq+4lG4xczA8acdLEfr7HEWw=");
    }

    private static /* synthetic */ String Xqedii_2kdtvuoiyu3jh(String string, String string2) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("IOLO0KqPHW/vMqMds/ggXvA4AkTHD1A7YjmWVkL/kKxS74OHqvADakKQVZAdpa44VzeWXLDgMP64vpoHO9jf3HPE9vjRQKWnLzhwEwCAOZPFWKHS") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DphR1wjtSic8bjxByZEwW+i3Xx/+Zjkg8ZEBNyvad1oBrsqGGg5zhwrUWAyFSQ==") + string2;
    }

    private static /* synthetic */ String Xqedii_21broykjb7wt3(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("E9GvvXr7RtktlDGnFiO+lSzx1Q9N49EGuVzKg5LrI1DsRZvnwMhVql4N4UxrBcouQ6ApbhAoCGAdSM7oKpD9S3bAzEVSy5dhdBC6ulvAXS+obZJdsgE4arJh+KumtAZb33wNqmyTEye7tEybGwAWvJ3IDmO5ot0xHKeiab2JUe9NUcI4") + string;
    }

    private static /* synthetic */ String Xqedii_350e0mqakgaqt(String string) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("EpDvzW3UGJLiPgXVJFD7CnGHCdX+PPezTSWMvrpX/hreq1gdL6Tcs0vywTaL3PuLNIvG6ynuXM12R07L+G6mfIhHRiFX//tAW9KEnFpZeABwIarZNvJnSzpBMB8B4sHYRW+cWUtQgQPcgSK/njNrsHcgAC//FarT/h1eATRJcsELcw==") + string;
    }

    private static /* synthetic */ String Xqedii_2qby8gxm75i38(int n) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("kBrdk3ZKO1wkbcyKCNk/iBhUHNL1XFv3TNGuy6iV3g/2QyruOimAdNcy1f0oFBGt0ri0wV881THw/RYtGgWO4nIUWCaLqZF+7NI=") + n + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("s/07oNvyaaqodCx7vg7VyyMXlp+cQ/8k987gc4a/BetVI31sqUUKq5BIpP3ntzjAhFTQlv2D4gqy99/vXHAtHN/TuM4exQc/g0zTSXDPoilrrX9xIipUEyOz+MLQRKB9J76FA16OGqRDURFdoSP0SoInMkKdezT2D+bcJzUHmpglhHC8uUM=");
    }

    private static /* synthetic */ String Xqedii_1tdoqtp90yl6r(int n) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("DhH5hkHha4+E/E61t6jKEGOEgXiK+QDJTbDww+NX9Kf6CdBeWYgfSkFMI+1NO556vT6+1vVTQwjzZfpdfrumh0baPN+hpYPHaLQ=") + n + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("NoQQh3+UDgptn7XkCSHZpA8fUW+Bud/EgzELZbuQf1O2Ao5U1ZC4BJxbK40tpLDyYcdvhVwAFe3heVydfaw3RBA1LXH03AFehWKvmBb6h4czbBgSKx8n7KDgGFNJVoeXGT7Vlmqy0E3lGtT9wdIJkY4Eq00107200qeNU21RaDK8Ewn/vNE5C45ofAAkswfxqV+4O7onGM0wmNvh6izeez+sLnxozhT5FSqZtWATdnKLjAi2pMGwCibwsMW4h/wjXWJhbi3wM6bPPgVMhjeNeAueROhsoTbsQybVLHTNQ6KxqWhBdHoKiiV0SamKz4/sIlaHSQ==");
    }

    private static /* synthetic */ String Xqedii_kjv979sripvu(String string, String string2) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("6ikVKjVUO2mIiz1QV9TJL6XDnAEJQs90eEIzLXz+1Saeh43vA9KES0gc7Es4EDyhtDnSTMgcBazEJt49ABI+l/cIgzOcb/AkHElUwMyrHjtnNIh4vxGFIvjQ9m7fb6KTufZjVFRtdXSgITeuLsC5f+vtgFwgsGWOMsg6XaqkDGBklF49Xi18HCIqa7aUI4y3KIo=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("ocpwkj2pqt+ohLrCMld6C29vnTe0/1LEqryS8KaAowYSJA==") + string2;
    }

    private static /* synthetic */ String Xqedii_f0k0z3esnc4g(String string, String string2) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("WA+Tsv4OE3CSt6NjjsdVh/m/wSS6cmcZnvqRkdysouGb3vjNZSwzQbPI61lx21o3Z69e3YDq9u1HKl2BXoF88eFqZe1wuSaR59NicpywhWwS4fuBsCDaWMD4M1Q=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("xOTrbHkti0JXs/E7mO6lwQTZTy8fvOmcxAwkPmwxr0Q=") + string2;
    }

    private static /* synthetic */ String Xqedii_3s3atyp10h79f(String string, String string2) {
        return Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("2ViBWmBf2g5LllEzeY0t9GQ4+gFiEiZZOtqVdl1e3Bu11kpnyWXwcgl0j4kBnwWyF+UYsNwTPKxVAVsZuPXw2ejkdG+cRtFTFyEq1GKuIj/lyk0FsdRjWIUGrLKUwaxR7ZnvdGdqJgVdNGXePT4Mfub3Nz1OtRidzxo=") + string + Xqedii_2q009hr.Xqedii_20u8zn3cpzfyt("xOTrbHkti0JXs/E7mO6lwQTZTy8fvOmcxAwkPmwxr0Q=") + string2;
    }
}
