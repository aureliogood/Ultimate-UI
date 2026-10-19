package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.bossbar.BossbarAssets;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.bukkit.configuration.file.YamlConfiguration;

public final class Xqedii_21nanys {
   public static final String Xqedii_4stnto5f90i7 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String[] Xqedii_1xoisfr;
   public static final String Xqedii_31azpsf = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("wv27CNUEPMJ3uQUzKODFEr/bCxXqPVaQHtPbJxfaMu0vzIxPpnVOJMNTCIKARHRcAw6la4Jn");
   public static final String Xqedii_1hk4j9t = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("761GfVVvAumbuBcaPWr8TwMgY+QFcLYhndmQ1/+onNFf84944ODo2gTKehYu/EWdz6E=");
   public static final String Xqedii_2tjbow8 = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
      "idk88lwvI70bS/Hm5/GXuUfdafBjkJ9QO09qjsy95/y6skS8yg6WwO3HydfFvkI8PxNEzIIeb38YbB2iPYsn0w=="
   );
   public static final String Xqedii_38lcl4t = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("t7j+EgUR2sGytaPB4EPkBVaANVJPowAwIB5xVyNehfxCvMmy8fNp38JwiwbugFN2xAc=");
   public static final String[] Xqedii_38aphfl;
   public static final Set<String> Xqedii_2b9wdyj;
   public final UltimateUI Xqedii_m0nzvfj;
   public final BossbarAssets Xqedii_1thwoqs = new BossbarAssets();
   public final Map<String, Xqedii_3juyhjk> Xqedii_sosos42 = new LinkedHashMap<>();
   public final Map<String, byte[]> Xqedii_3kzv666 = new LinkedHashMap<>();
   public String Xqedii_16gfg65;
   public String Xqedii_2q432gd;
   public volatile boolean Xqedii_271fagi;
   public volatile List<String> Xqedii_qu8zghw;

   public Xqedii_21nanys(UltimateUI var1) {
      this.Xqedii_m0nzvfj = var1;
   }

   public boolean Xqedii_39gjfbc() {
      if ((28371733 ^ 28371733) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!this.Xqedii_7bgzqhm() && this.Xqedii_4sqpfdi().isEmpty()
            ? Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(155612305, 4)
            : Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(1192235326, 7)) != 0);
      }
   }

   public boolean Xqedii_7bgzqhm() {
      if (((1223085617 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_m0nzvfj
            .getConfig()
            .getBoolean(
               Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                  "YL3ElhGR5eS0dCjRywQBGEGpNe0ftjw49B+hsmVExbF6NT2Ta+FZLm61atUdYN886rF9SYKSykQE5jsZ2Oe76A7CwcaVmniqdlC8dffmcypkeA=="
               ),
               (Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(155612305, 12) != 0)
            );
      }
   }

   public List<String> Xqedii_4sqpfdi() {
      if ((1551425128 * (1551425128 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         List var1 = this.Xqedii_qu8zghw;
         if (var1 == null) {
            var1 = this.Xqedii_hirtos6();
            this.Xqedii_qu8zghw = var1;
         }

         return var1;
      }
   }

   public List<String> Xqedii_hirtos6() {
      if (((66725017 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList();
         String[] var2 = Xqedii_38aphfl;
         int var3 = var2.length;

         for (int var4 = Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888285996, 13); var4 < var3; var4++) {
            String var5 = var2[var4];
            File[] var6 = new File(this.Xqedii_m0nzvfj.getDataFolder(), var5).listFiles((var0, var1x) -> {
               if ((1697980287 ^ 1697980287) != 0) {
                  throw new IllegalStateException();
               } else {
                  return var1x.toLowerCase(Locale.ROOT).endsWith(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("yM2v83F19XKdZEcRdR7cek2dRllooTDGS1qXgC6rfXfLPk9D"));
               }
            });
            if (var6 != null) {
               Arrays.sort((Object[])var6);
               File[] var7 = var6;
               int var8 = var6.length;

               for (int var9 = Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(-1913505664, 26); var9 < var8; var9++) {
                  File var10 = var7[var9];
                  String var11 = var10.getName();
                  String var12 = var11.substring(
                     Xqedii_1gr7c53.Xqedii_14jjuozelu0id(-1998989557, 31), var11.length() - Xqedii_1gr7c53.Xqedii_14jjuozelu0id(227072471, 23)
                  );
                  if (!Xqedii_2b9wdyj.contains(var12.toLowerCase(Locale.ROOT))) {
                     String var13 = this.Xqedii_2b5z9sj(var10);
                     if (var13 != null
                        && var13.contains(
                           Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("CCqbQF9w7LC6SzyWMsvM088dgqWAFXQbgYPW/pYPYs2vpWYcVMIlwba7v2KOy+jFiKWpiA7JIMPBdADQ9eM=")
                        )) {
                        if (!var13.isEmpty()
                           && var13.charAt(Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888285996, 3)) == Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1328756012, 14)) {
                           var13 = var13.substring(Xqedii_1gr7c53.Xqedii_14jjuozelu0id(-343538580, 14));
                        }

                        YamlConfiguration var14 = new YamlConfiguration();

                        try {
                           var14.loadFromString(var13);
                        } catch (Exception var16) {
                           continue;
                        }

                        if (Xqedii_2r2mv4l.read(var14).enabled()) {
                           var1.add(var12);
                        }
                     }
                  }
               }
            }
         }

         return List.copyOf(var1);
      }
   }

   public BossbarAssets Xqedii_va02owx() {
      if ((-2050955104 * -2050955104 + -2050955104 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1thwoqs;
      }
   }

   public boolean Xqedii_7yidd6b() {
      if ((-1144933164 ^ -1144933164) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_271fagi && this.Xqedii_1thwoqs.isReady()
            ? Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888417068, 17)
            : Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(1871823876, 29)) != 0);
      }
   }

   public synchronized void Xqedii_3pw62lv(File var1, File var2) {
      if ((1172331233 * 1172331233 + 1172331233 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3eqofrj(var1, var2, (Xqedii_1gr7c53.Xqedii_14jjuozelu0id(-1374219853, 16) != 0));
      }
   }

   public synchronized void Xqedii_3eqofrj(File var1, File var2, boolean var3) {
      if ((1404646187 * (1404646187 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (var3) {
            this.Xqedii_qu8zghw = this.Xqedii_hirtos6();
         }

         if (!this.Xqedii_271fagi || var3 || !this.Xqedii_39gjfbc()) {
            this.Xqedii_sosos42.clear();
            this.Xqedii_3kzv666.clear();
            this.Xqedii_271fagi = (Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(155612305, 3) != 0);
            if (this.Xqedii_39gjfbc()) {
               if (var1 != null && var1.isDirectory()) {
                  if (!this.Xqedii_1thwoqs
                     .build(
                        var1,
                        var2,
                        this.Xqedii_36yolnk(
                           Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                              "rL+Y/uhIgE9IxnT8wTA6XXjMQh1qU9IwcEN3j10kXmz2xhv1/lGwmAacxjcTn2cdoYNFri778v4R0J2WbfFkO7rOsvN9khttRVSneQ=="
                           )
                        ),
                        this.Xqedii_m0nzvfj.getLogger()
                     )) {
                     this.Xqedii_m0nzvfj
                        .getLogger()
                        .warning(
                           Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                              "fFX7okNJkzX6e1QTINCNyXE0ZaDOXzoo4fJxjO35OhNUSi/UkpSwPBLPvaqEamsDIMtekCMuTP6BUyVGuupa5Qw1znekPGPAGjv8KqtTYJfbkFBKWofHwDhqVahIUWoLm7zPY3Ai3CP2eaq2U0JJJ7ywWrpdEQUPq33mZooF5h2LDozriBMy3pWdDxzy+Rx2w/npy1vapeDA8YqC+ynZX4rhZbFPwvqtwVoOFLNKHT4PiQ+3/mvW3SfEvXlG8ZXfRDHdmWDybvghSm1YdAzkG4kzsqxI8e2LuHg="
                           )
                        );
                  } else {
                     this.Xqedii_16gfg65 = this.Xqedii_36yolnk(
                        Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                           "Jhjje7Iw5jSfWBEdxSBgeT/X5q8LfE7XofjJA4NTesDeHtdgIkYZw/BgMPorA/u46fS7MLmi51ZCYdzrD4oy4pUExJL4MatnpbGD9g+Y0Mr4Yoc/"
                        )
                     );
                     this.Xqedii_2q432gd = this.Xqedii_36yolnk(
                        Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                           "7wTx80sQD52MApTZxn/GaQPJ2bI2aE/m6KIEwZvFxdR8tDjKiQmZ69hcU0VOIUqzv05fV/WDd/CnGsdzAf6L176o5vC0ZEzl1BkCUc+m2f+cdVlG"
                        )
                     );
                     if (this.Xqedii_16gfg65 != null && this.Xqedii_2q432gd != null) {
                        this.Xqedii_3kzv666.putAll(this.Xqedii_1thwoqs.packEntries());
                        int var4 = this.Xqedii_30ia0p7(var1);
                        if (var4 == 0) {
                           this.Xqedii_m0nzvfj
                              .getLogger()
                              .warning(
                                 Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                                    "mpCyfImmBGNeSHMA5HC2vH+QAkPnP7Z/eyOsRVI0Uy5zN1/Ii5EEUh2CW9v3Lt6WDkryjMipu46wqL/HzsgrLzOq2bs4109dWflqlkXOxB6IHQDwSItFWwzrmzQ1fsdQRoWcAtwEAaPpLC52jPRDEqI7vI34QKNfuT4nKJDWDRzj86gnEcwEbht8H5R1FU3H/u3Zg0Ls2UOY0lmXgR1RiP2Q1jGoXo89GHOmihtkNG3UTjRMUBZb4s+VYqNID0Wrbgg="
                                 )
                              );
                           this.Xqedii_3kzv666.clear();
                        } else {
                           this.Xqedii_271fagi = (Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(1078262044, 17) != 0);
                           this.Xqedii_m0nzvfj
                              .getLogger()
                              .info(
                                 Xqedii_114piqaiyjlqw(
                                    this.Xqedii_3kzv666.size(),
                                    var4,
                                    this.Xqedii_1thwoqs.textClassCount(),
                                    this.Xqedii_1thwoqs.detectedMaskCount(),
                                    String.valueOf(this.Xqedii_4sqpfdi()),
                                    this.Xqedii_7bgzqhm()
                                       ? Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("XZG1oXqplpKHOusilMeET1tYZF6TH0Uz1u3Ze0LOhrG/4hLXOXg+Ct0QSgxHh3zoT61nKwX873h6v9X7")
                                       : Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("+JXjBYXzwWHoa43agIdWV/ru98vYqEftBw11g9ey")
                                 )
                              );
                        }
                     } else {
                        this.Xqedii_m0nzvfj
                           .getLogger()
                           .warning(
                              Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
                                 "pJrNArQ61jQ+CaO/0vNFGD8enTQjbZi+QRH219E2rVSH+VK/1Pu/wThXx42FIGR20iyzJRZv8MuEB7wPS6SbcaMUhDnqoLC3fp+aVSwZECTTA0Qw6d+qWX+dZMOjlmDlzkZLsFBqkDpAyeF/dcMKF8qvNzD0IxwftI2PtR/GRWjT0s8kTUBgKgNXRJbYe30Wdyg6dwBAid2npJahmyzSQi25RVKHe8UpqsRPHpsxojyvW9Ggk0UmtQLhaVvOYizjnV/fvnZAOk8/2YINosqWXBf/zR5S5Jigo5jOqg=="
                              )
                           );
                     }
                  }
               } else {
                  this.Xqedii_m0nzvfj.getLogger().warning(Xqedii_f8zd65jtw9gg(String.valueOf(var1)));
               }
            }
         }
      }
   }

   public byte[] Xqedii_ruydpmf(String var1, byte[] var2) {
      if ((-2089135881 * (-2089135881 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_271fagi && var1 != null && var2 != null) {
         Xqedii_3juyhjk var3 = this.Xqedii_sosos42
            .get(var1.replace((char)Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(-155611426, 4), (char)Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(-155612295, 31)));
         if (var3 == null) {
            return null;
         } else {
            String var4 = new String(var2, StandardCharsets.UTF_8);
            String var5 = var3.vertex() ? this.Xqedii_19vvqh6(var4, var3.spirv(), var3.location()) : this.Xqedii_1hk8o8g(var4, var3.spirv(), var3.location());
            return var5 == null ? null : var5.getBytes(StandardCharsets.UTF_8);
         }
      } else {
         return null;
      }
   }

   public Map<String, byte[]> Xqedii_1umuut0() {
      if (((1462073241 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_271fagi ? this.Xqedii_3kzv666 : Map.of();
      }
   }

   public int Xqedii_30ia0p7(File var1) {
      if ((33066550 * (33066550 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888285996, 26);
         String[] var3 = Xqedii_1xoisfr;
         int var4 = var3.length;

         for (int var5 = Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(155612305, 3); var5 < var4; var5++) {
            String var6 = var3[var5];
            File var7 = new File(var1, Xqedii_6o99cck1bz6n(var6));
            if (var7.isDirectory()) {
               File[] var8 = var7.listFiles((var0, var1x) -> {
                  if (((170529904 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else {
                     return var1x.toLowerCase(Locale.ROOT).endsWith(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("QgWN6idO1wgHm1k1aXm6CdumaPqaW9Mubh6WDe7aBhykr3WV"));
                  }
               });
               if (var8 != null) {
                  File[] var9 = var8;
                  int var10 = var8.length;

                  for (int var11 = Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(-1913505664, 26); var11 < var10; var11++) {
                     File var12 = var9[var11];
                     String var13 = var12.getName();
                     String var14 = var13.substring(
                        Xqedii_1gr7c53.Xqedii_14jjuozelu0id(-2050724629, 22), var13.length() - Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888023852, 16)
                     );
                     if (var14.equals(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("fIXgCi67ravx2AJV3azEp6zkohdBApluFyoJ8mI8DdlAWVw7"))
                        || var14.startsWith(
                           Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("lNgVePVnRyueMb936U+T1dSOX2nCb2i1QUloN7JBx4UinFHbJQ6fgZbJSE84+OKG0tiMrip18H9oWA==")
                        )) {
                        File var15 = new File(var7, Xqedii_23mxvha99u0is(var14));
                        if (var15.isFile()) {
                           String var16 = this.Xqedii_2b5z9sj(var12);
                           String var17 = this.Xqedii_2b5z9sj(var15);
                           if (var16 != null
                              && var17 != null
                              && var16.contains(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("wv27CNUEPMJ3uQUzKODFEr/bCxXqPVaQHtPbJxfaMu0vzIxPpnVOJMNTCIKARHRcAw6la4Jn"))
                              && var17.contains(
                                 Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("idk88lwvI70bS/Hm5/GXuUfdafBjkJ9QO09qjsy95/y6skS8yg6WwO3HydfFvkI8PxNEzIIeb38YbB2iPYsn0w==")
                              )) {
                              if (!var16.contains(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("t7j+EgUR2sGytaPB4EPkBVaANVJPowAwIB5xVyNehfxCvMmy8fNp38JwiwbugFN2xAc="))
                                 && !var17.contains(Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("t7j+EgUR2sGytaPB4EPkBVaANVJPowAwIB5xVyNehfxCvMmy8fNp38JwiwbugFN2xAc="))
                                 )
                               {
                                 boolean var18 = Xqedii_1wyzus8.Xqedii_1br3yjd(var16);
                                 int var19 = Xqedii_1wyzus8.Xqedii_23ul7l2(var16, var17);
                                 String var20 = this.Xqedii_19vvqh6(var16, var18, var19);
                                 String var21 = this.Xqedii_1hk8o8g(var17, var18, var19);
                                 if (var20 != null && var21 != null) {
                                    String var22 = Xqedii_3k1a84c0azg9p(var6);
                                    this.Xqedii_sosos42
                                       .put(
                                          Xqedii_1nv86mq4z43ul(var22, var14),
                                          new Xqedii_3juyhjk((Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(-155612306, 6) != 0), var18, var19)
                                       );
                                    this.Xqedii_sosos42
                                       .put(
                                          Xqedii_3k4exle0bb180(var22, var14),
                                          new Xqedii_3juyhjk((Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(74420676, 21) != 0), var18, var19)
                                       );
                                    var2++;
                                 }
                              } else {
                                 this.Xqedii_m0nzvfj.getLogger().warning(Xqedii_3aydlws6rvgpo(var6, var14));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var2;
      }
   }

   public String Xqedii_19vvqh6(String var1, boolean var2, int var3) {
      if (((1788571808 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1wyzus8.Xqedii_2e9uhb4(var1, this.Xqedii_16gfg65, var2, var3);
      }
   }

   public String Xqedii_1hk8o8g(String var1, boolean var2, int var3) {
      if ((-1075167467 * -1075167467 - -1075167467 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_1wyzus8.Xqedii_20ik0bw(
            var1, this.Xqedii_2q432gd, this.Xqedii_1thwoqs.maskLeftProfiles(), this.Xqedii_1thwoqs.maskRightProfiles(), var2, var3
         );
      }
   }

   public String Xqedii_2b5z9sj(File var1) {
      if ((-521408225 ^ -521408225) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            return new String(Files.readAllBytes(var1.toPath()), StandardCharsets.UTF_8);
         } catch (Exception var3) {
            return null;
         }
      }
   }

   public String Xqedii_36yolnk(String var1) {
      if ((1003936543 * 1003936543 + 1003936543 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            String var3;
            try (InputStream var2 = this.Xqedii_m0nzvfj.getResource(var1)) {
               if (var2 == null) {
                  return null;
               }

               var3 = new String(var2.readAllBytes(), StandardCharsets.UTF_8);
            }

            return var3;
         } catch (Exception var7) {
            return null;
         }
      }
   }

   public List<String> Xqedii_39g88j9() {
      if (((-726962097 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var1 = new ArrayList();
         var1.add(Xqedii_2i3miknwpn6ow(String.valueOf(this.Xqedii_4sqpfdi())));
         var1.add(Xqedii_d3d74v4e0ek0(this.Xqedii_7bgzqhm()));
         var1.add(Xqedii_15now4vyxobaa(this.Xqedii_271fagi, this.Xqedii_1thwoqs.isReady()));
         var1.add(Xqedii_d6lf3zaq63wk(this.Xqedii_3kzv666.size()));
         var1.add(Xqedii_21w1fy4s0z2eb(this.Xqedii_sosos42.size() / Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(596117599, 6)));
         var1.add(Xqedii_3ns5g8i4hwy5c(this.Xqedii_1thwoqs.textClassCount()));
         return var1;
      }
   }

   static {
      if ((-552161345 * -552161345 + -552161345 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String[] var10000 = new String[Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(259197653, 30)];
         var10000[Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(297682704, 23)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "uwhB9wtR6HjYnXwgjKNh8cdmG5I8px4CvdRwrKJJWAXR/T0plVaCcMiQ+d5YAJcO"
         );
         var10000[Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888288044, 11)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "7kt7SniqgdLbhYKqNzChx4UQW5ptPE3DaPlYvuz7EvHXQuQ54I3/E3ocfoStDKlS"
         );
         var10000[Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(-115589054, 1)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "y+nk9vkLVmfDJjOnK4DU9OhhGCW42Atx2+LhzylbNjnSCMMm6eUdDWylhod+4G4m"
         );
         var10000[Xqedii_1gr7c53.Xqedii_14jjuozelu0id(1975730742, 13)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "JZakD5gTO+67hShsKM7v2wlRZJBO4aSbgpqiYa9UQFiLIF5MUvn4kWD+cec="
         );
         var10000[Xqedii_1gr7c53.Xqedii_1cc9aewn9aai1(-1888286060, 4)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "Y/zwQc+JLfg05z4BdDQi7TrBkmZLGL9X4QfooW/qXpO/F0jk0nHA6qOpxl8="
         );
         var10000[Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(161424264, 22)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "UUm534F6BCHPEHsFiHDQksF7rPUWCNmyxDlN6Tx13lwrGeJtG1XToPdXKCo="
         );
         Xqedii_1xoisfr = var10000;
         var10000 = new String[Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(-164000914, 23)];
         var10000[Xqedii_1gr7c53.Xqedii_3a2tccftbu5fj(596117727, 6)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "yrPftDE7pBeB2hoUSckm8tYTnk9B0gYmTwgJnOpYeMtnQib67MiVqKbBr1hSPiaG5G3OcRuUwgY="
         );
         var10000[Xqedii_1gr7c53.Xqedii_3ofunpe0al7zu(-155612306, 23)] = Xqedii_1gr7c53.Xqedii_1xdvycibax0jg(
            "R6pN/QuPYyW3MB57A2SCQoeTXewOdADESI7lb0CLcoaVYVzccYc2w7qyEImFgdA4aTEcLWpKocCv6+VtSIVhc4uQzUoS/A=="
         );
         Xqedii_38aphfl = var10000;
         Xqedii_2b9wdyj = Set.of(
            Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("Dx1HGN/MgCUXYQ74pJs0QUebC6TmWGwPLmMCKkDwGS42QbzYdlIQRw=="),
            Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("5lhxrjVarWSchtsX5NcpmACi0v6fpyc26sbxINANlVpIR07tjWGeDZ4T6ssCWK6jqFJ4lw=="),
            Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("hJuNgibG3aXalJG3esInpAd4rzAvs0CB1Z7W9QjY6bjqxiUICG8cYq5OBJ7b7LOvLK0=")
         );
      }
   }

   private static /* synthetic */ String Xqedii_f8zd65jtw9gg(String string) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("7fJYcvwFEEVwhvNZVTuE+IoRi9hYS+LfsQAIIZzgY2FUeZFq0wNRLVJUORbs6qVSCDjQt9y1dV6AQawZXPUg4V2IjQZ1nNK72odbSLX4UL2rzElEKnE90p5aZBvngtZVL4EQkBCKprtC2JJnv0pDwDW+JsOqfRKtQoUNzDmkEiTlNnUkRo6rmdycIPVH9v1CLOnskWdMHBQgJORBrWFTPwVduXMBmQ==") + string + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("AEfht/sOXNE4q0S4u2scyfi6Dtlxn3ccgZfVRjCYjtSgxrRWr3FgfJcmQIOlveP+Yu3OcloA1XVsTiGmtBeLJ5FGD5t6Tw==");
    }

    private static /* synthetic */ String Xqedii_114piqaiyjlqw(int n, int n2, int n3, int n4, String string, String string2) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("gZBMW/IufFwPs50CSA6APgL2tGojkOxSx9YJgL4bunhguPTfaSuOQTgfM6kIN8SjwXNERHw+uWnC7w+jXbtr8xj9RkolZW/5eQ2MMAZSFezXI+RzTzfzmMRipiNwtXr4wGXrFyRqVDSjS7N4cMA=") + n + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("XOlDDqomzjJYcXUk7g9P9Ewc4NG/deVhMrjSuoRdn9xIxaC1T5OTsZjLBhZK9aPHyqwBnP4bcMlOuwaa0ltW1OqdjhXdtiE+dVyuQmcP++GXJpHII9Tv9jD/") + n2 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("xD8BW8uOJO/4oz/9pkDz9d3Nsg5LGdL3iJzkXhNDciE5Y+VSe7gjU+7DZDk0wdtSPdtPs30IuHOOow==") + n3 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("p53RCqckNv3sjsP0mGL+ChX7NIHx0/RDsQD9teORhrV65J7uimgseLxLbsvMJqJm3mV9si6yAYV90SY7CeqylQ1uJFU=") + n4 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("EEOz0fwOP3ALcI288IXDFeR98Evvdv95p5gZfiW0oiuhM0nzdd9Dnv/arMZ7KB/faryb7aKnQ2xjD196/qGbq6KZkJU7Gddr3nDewD/iJoFXXneTnTgRm+8VrsSyAjETlW1tcUhtvqBcP7yiLAs4MF5/X+xe6Q==") + string + string2;
    }

    private static /* synthetic */ String Xqedii_6o99cck1bz6n(String string) {
        return string + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("xOYxhrE9NNH9dlSj7UQiJ5pMJ0QwUbp4XJyjieA84d9WJ+uUSuE7USdEbnc706V/+15fSw9Pimgt4ZcHSzZMK1nd5Ui4DF+DtVBPaWfc4WOq1/HtJr3txQ==");
    }

    private static /* synthetic */ String Xqedii_23mxvha99u0is(String string) {
        return string + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("P+FlMkt38mj0TXvmKmh6twN1MolgQs8Ldy6i66s7A1y6Ic+O");
    }

    private static /* synthetic */ String Xqedii_3aydlws6rvgpo(String string, String string2) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("HHML0Yth3XU9Bsy5FzA5PrGYBcb+eH50vamP8WK1SUAY/i/G4PCh7wUGEVAv9R+SxaTpz3Sm8HVGr3Em46ekdMAWikj1UF8Cll6MsfwI0QzyPt8iHhmW991QOgk=") + string + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("j3Rtd6ALQ0ZWNlFDbci/cFBLMz7RfDlHdHy4srOZ") + string2 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("NiwtVsAjCXcCPCqhRNuv1QdxuG2yVYDSefUBo+XaqrGHmND+J6vUIDhXTDJ8FNJomK3Xqtxh1nKoRBvV7DB+LhMcc2VCjb5prUPHqKlfn4BBh8F5RSn0OiJZSdLlPFJ3fCMne5AwtK+ME4SlpkaUfcZWuYsr0XgxdSXdZR0FE1Jc/fLHJ0o7O9bGGTgjpyci2jzsXrqUkbTEiKr+VqDXxhahEuhg/Q+bkjmIE6kc8zF2raEvQZ/2iO44ODEKy/l8X1qNinMchJpKUhOTROmxnA==");
    }

    private static /* synthetic */ String Xqedii_3k1a84c0azg9p(String string) {
        return string + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("n7XYohwAelzrW+miaWrK8YsFY2NrUDO3IaJszejLPm9ftxKmecBK96pitnYLJ25nwFsgYwSvP2WWeX+lbMcSARG4zfcbU8TYUAr+BK6esQqmKC10JlFINVh+");
    }

    private static /* synthetic */ String Xqedii_1nv86mq4z43ul(String string, String string2) {
        return string + string2 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("QgWN6idO1wgHm1k1aXm6CdumaPqaW9Mubh6WDe7aBhykr3WV");
    }

    private static /* synthetic */ String Xqedii_3k4exle0bb180(String string, String string2) {
        return string + string2 + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("P+FlMkt38mj0TXvmKmh6twN1MolgQs8Ldy6i66s7A1y6Ic+O");
    }

    private static /* synthetic */ String Xqedii_2i3miknwpn6ow(String string) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("bs3AtC9F8pvdGJh0/qaTrqROieBerz1zQmZXTu733T1SvEZFy7jtrMKHi+HGw5JjOrfgeAaor/7hUD49iAwAul0At7RclWWRBD1ExITHFZZjQKWxwKwid+0ruw/L+rNu8yFKpRJv") + string;
    }

    private static /* synthetic */ String Xqedii_d3d74v4e0ek0(boolean bl) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("U5RGwCpZMZy5rKyl6ExR4XFjAYbhUQI4dZso3davF/BIFOqzyVThUGWGuZZp2PNH6Kj8rXDM45mLwCPghS8fthqbvm8JEf09QpngwPd5pk1Sqnv/5dhU+g==") + bl;
    }

    private static /* synthetic */ String Xqedii_15now4vyxobaa(boolean bl, boolean bl2) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("fPhrzbvBwEi6y35iVQAHXt8T0muampSkOW8FnoAvs/GQx/rM4oLzf9iS3mliYSxo/zhI6rHeiV4XPTwa") + bl + Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("9GZQUASXRJ9+svH4Zb9G0hbLE6de7vQM+0oPNC1bznOxK3R7OVEg8jhcfWMnsQD+E9euxhvxSCUgIQGYcQg=") + bl2;
    }

    private static /* synthetic */ String Xqedii_d6lf3zaq63wk(int n) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("d189zZpE1MRm2IkLnOa57KucWoqvv1p+pBHhKnTIa0C/ZBce1LNKkISJOt+2cGK2AIQpMgcyTN3bjNiyOKRusn3p9FT3Dn8nuM0=") + n;
    }

    private static /* synthetic */ String Xqedii_21w1fy4s0z2eb(int n) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("rcbF4zWPEm0eSeu6GcVaSaRUtKDgFx+49DsCh59QgEoFDWYY52/Knxw1na6uNR2IhkqSq2ca4vOy45G7aluUTICKJvQR1FAaUIs=") + n;
    }

    private static /* synthetic */ String Xqedii_3ns5g8i4hwy5c(int n) {
        return Xqedii_1gr7c53.Xqedii_1xdvycibax0jg("DLwTMAv/9VQdsKtaHVD7Z81U+JGJKA076dXA56D3N55Me1YQMfnjqsxM2L7ztc8ASWDxIWldUHMpjfF0XntFDK7etbY=") + n;
    }
}
