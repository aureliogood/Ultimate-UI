package dev.xqedii.ultimateUI.service.head;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_fgjx9wa;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.imageio.ImageIO;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.profile.PlayerTextures;

public class PlayerHeadFontService {
   public static final String Xqedii_3rbvzrqzbnbck = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String PLACEHOLDER = Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("71Rco018hHzJZ6j/AHv4KTMMW1FGZYxXsROZwhZQuhe7wxznOoGYl+MSPvQ1HkDeZEH6LfAu");
   public static final String Xqedii_49htqcs = Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("bfvk/afIUigWt5vEnhLrGAg/6zaO8yqT8J56bml18swzWbBE+/1kmbpuQo+xAJxWSleBgw==");
   public static final int HEAD_TEXT_WRAP_LINE_WIDTH = 70;
   public static final char Xqedii_1ig3pf2 = '\uef70';
   public static final char Xqedii_1bpu23a = '\uef71';
   public static final int Xqedii_lhny5fi = 8;
   public static final int Xqedii_hp6lwgq = 8;
   public static final int Xqedii_3spmndt = 8;
   public static final int Xqedii_n03zlsa = 40;
   public static final int Xqedii_2vuzsfj = 8;
   public static final int Xqedii_23i10r1 = 128;
   public static final long Xqedii_2xcitgo = 600000L;
   public static final long Xqedii_1lwa8su = 30000L;
   public static final int Xqedii_3pidch6 = 5000;
   public static final int Xqedii_323k81c = 5000;
   public static final long Xqedii_2hm6lvq = 10L;
   public static final int[][] Xqedii_3dbu3uu;
   public final UltimateUI Xqedii_3cadqba;
   public final Consumer<Player> Xqedii_2lwkq6x;
   public final String Xqedii_csp3w91;
   public final Map<String, String> Xqedii_wvr8f85 = new ConcurrentHashMap<>();
   public final Map<String, Long> Xqedii_3pv74nz = new ConcurrentHashMap<>();
   public final Set<String> Xqedii_3riftro = ConcurrentHashMap.newKeySet();
   public final Map<String, Set<UUID>> Xqedii_3oaz9jz = new ConcurrentHashMap<>();

   public PlayerHeadFontService(UltimateUI var1, Consumer<Player> var2) {
      this.Xqedii_3cadqba = var1;
      this.Xqedii_2lwkq6x = var2;
      this.Xqedii_csp3w91 = this.Xqedii_3032hqy(Xqedii_3dbu3uu);
   }

   public static boolean containsPlaceholder(String var0) {
      if ((-1148199666 * -1148199666 + -1148199666 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var0 != null
               && var0.toLowerCase(Locale.ROOT)
                  .contains(Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("bfvk/afIUigWt5vEnhLrGAg/6zaO8yqT8J56bml18swzWbBE+/1kmbpuQo+xAJxWSleBgw=="))
            ? Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554899, 4)
            : Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(449010053, 2)) != 0);
      }
   }

   public String apply(Player var1, String var2) {
      if ((2016818579 * 2016818579 - 2016818579 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.apply(var1, var2, UnaryOperator.identity());
      }
   }

   public String apply(Player var1, String var2, UnaryOperator<String> var3) {
      if ((-1483017745 ^ -1483017745) != 0) {
         throw new IllegalStateException();
      } else if (!containsPlaceholder(var2)) {
         return var2;
      } else {
         String var4 = var2.toLowerCase(Locale.ROOT);
         StringBuilder var5 = new StringBuilder(var2.length() + Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1869011535, 10));
         int var6 = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1284289404, 21);
         int var7 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554883, 0);

         while (true) {
            int var8 = var4.indexOf(Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("bfvk/afIUigWt5vEnhLrGAg/6zaO8yqT8J56bml18swzWbBE+/1kmbpuQo+xAJxWSleBgw=="), var7);
            if (var8 < 0) {
               break;
            }

            int var9 = var8 + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("bfvk/afIUigWt5vEnhLrGAg/6zaO8yqT8J56bml18swzWbBE+/1kmbpuQo+xAJxWSleBgw==").length();
            if (var9 >= var2.length()) {
               break;
            }

            char var10 = var2.charAt(var9);
            String var11;
            int var12;
            if (var10 == Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819841603, 13)) {
               var11 = this.Xqedii_21nj6h0(var1);
               var12 = var9 + Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554819, 6);
            } else {
               if (var10 != Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1629824591, 22)) {
                  var7 = var9;
                  continue;
               }

               int var13 = Xqedii_3fmfqpd(var2, var9 + Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1483419683, 7));
               if (var13 < 0) {
                  var7 = var9;
                  continue;
               }

               String var14 = var2.substring(var9 + Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(899158444, 14), var13);
               var11 = this.Xqedii_u0j1qcy(var1, var14, var3);
               var12 = var13 + Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-839830862, 7);
            }

            var5.append(var2, var6, var8).append(var11);
            var6 = var12;
            var7 = var12;
         }

         var5.append(var2, var6, var2.length());
         return var5.toString();
      }
   }

   public static int Xqedii_3fmfqpd(String var0, int var1) {
      if ((830331240 * 830331240 - 830331240 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         int var2 = var1;

         while (var2 < var0.length()) {
            if (var0.charAt(var2) == Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(366570051, 24)) {
               int var3 = var0.indexOf(Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899947, 0), var2 + Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819546691, 13));
               if (var3 <= var2 + Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 23)
                  || !Xqedii_3976a40(var0, var2 + Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(296498584, 30), var3)
                  || var0.indexOf(Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1796039748, 4), var3 + Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819489347, 16)) < 0) {
                  return var2;
               }

               var2 = var3 + Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1396667039, 17);
            } else {
               var2++;
            }
         }

         return Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868916304, 14);
      }
   }

   public static boolean Xqedii_3976a40(String var0, int var1, int var2) {
      if ((-439766117 * -439766117 - -439766117 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var3 = var1; var3 < var2; var3++) {
            char var4 = var0.charAt(var3);
            if (!Character.isLetterOrDigit(var4)
               && var4 != Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-2033502267, 25)
               && var4 != Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868922447, 9)
               && var4 != Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1869506127, 14)
               && var4 != Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868695119, 13)) {
               return (Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-993473737, 17) != 0);
            }
         }

         return (Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 28) != 0);
      }
   }

   public void forget(Player var1) {
      if (((1146127859 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         UUID var2 = var1.getUniqueId();
         String var3 = Xqedii_36hhl80(var2);
         this.Xqedii_wvr8f85.remove(var3);
         this.Xqedii_3pv74nz.remove(var3);
         this.Xqedii_3riftro.remove(var3);

         for (Set var5 : this.Xqedii_3oaz9jz.values()) {
            var5.remove(var2);
         }
      }
   }

   public String Xqedii_21nj6h0(Player var1) {
      if ((2008476546 * 2008476546 + 2008476546 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? this.Xqedii_csp3w91 : this.Xqedii_hc2mfxl(var1, var1);
      }
   }

   public String Xqedii_u0j1qcy(Player var1, String var2, UnaryOperator<String> var3) {
      if ((-2016880552 * -2016880552 + -2016880552 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = var2 == null ? Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("emKWo93rCPDaV2jb+YqCo9Ez/kCcOmJ59O0fDA==") : var2.trim();
         if (var3 != null && var4.indexOf(Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035146187, 11)) >= 0) {
            try {
               var4 = Xqedii_47nzbsd(var3.apply(var4), Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("emKWo93rCPDaV2jb+YqCo9Ez/kCcOmJ59O0fDA==")).trim();
            } catch (Throwable var8) {
               var4 = Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("emKWo93rCPDaV2jb+YqCo9Ez/kCcOmJ59O0fDA==");
            }
         }

         if (var4.isEmpty()) {
            return this.Xqedii_21nj6h0(var1);
         } else if (var4.indexOf(Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(935662283, 9)) >= 0) {
            return this.Xqedii_csp3w91;
         } else {
            Player var5 = Bukkit.getPlayerExact(var4);
            if (var5 == null) {
               UUID var6 = Xqedii_gwkm8bq(var4);
               var5 = var6 == null ? null : Bukkit.getPlayer(var6);
            }

            if (var5 != null) {
               return this.Xqedii_hc2mfxl(var5, var1);
            } else {
               UUID var9 = Xqedii_gwkm8bq(var4);
               if (var9 != null) {
                  return this.Xqedii_v87dfhk(Xqedii_36hhl80(var9), var1, () -> {
                     if ((-342719666 * -342719666 - -342719666 & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        return this.Xqedii_3j0kyj0(var9, null);
                     }
                  });
               } else if (!Xqedii_2ixwjae(var4)) {
                  return this.Xqedii_csp3w91;
               } else {
                  String var7 = var4;
                  return this.Xqedii_v87dfhk(Xqedii_23nqqjk91xzh(var7.toLowerCase(Locale.ROOT)), var1, () -> {
                     if ((-637298695 * -637298695 - -637298695 & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        return this.Xqedii_3j0kyj0(null, var7);
                     }
                  });
               }
            }
         }
      }
   }

   public String Xqedii_hc2mfxl(Player var1, Player var2) {
      if ((-989994338 * (-989994338 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         URL var3 = this.Xqedii_jjr7grp(var1);
         return this.Xqedii_v87dfhk(Xqedii_36hhl80(var1.getUniqueId()), var2, () -> {
            if ((-1401391730 * -1401391730 + -1401391730 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         });
      }
   }

   public String Xqedii_v87dfhk(String var1, Player var2, Supplier<URL> var3) {
      if ((-791415416 * -791415416 - -791415416 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var4 = this.Xqedii_wvr8f85.get(var1);
         if (var4 != null && !this.Xqedii_14oqn5r(var1)) {
            return var4;
         } else {
            if (var2 != null) {
               this.Xqedii_3oaz9jz.computeIfAbsent(var1, var0 -> {
                  if ((1243993259 * 1243993259 - 1243993259 & 1) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return ConcurrentHashMap.newKeySet();
                  }
               }).add(var2.getUniqueId());
            }

            if (this.Xqedii_14oqn5r(var1)) {
               this.Xqedii_22ss3ou(var1, var3);
            }

            return var4 == null ? this.Xqedii_csp3w91 : var4;
         }
      }
   }

   public boolean Xqedii_14oqn5r(String var1) {
      if ((-437571854 * -437571854 - -437571854 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Long var2 = this.Xqedii_3pv74nz.get(var1);
         return ((var2 != null && System.currentTimeMillis() < var2
            ? Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 16)
            : Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1448721958, 28)) != 0);
      }
   }

   public void Xqedii_aid9a04(String var1, long var2) {
      if ((-1391071293 * -1391071293 - -1391071293 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3pv74nz.put(var1, System.currentTimeMillis() + Math.max(Xqedii_fgjx9wa.Xqedii_2d75oujd3y9zf(-9163787265657131838L, 25), var2));
      }
   }

   public void Xqedii_22ss3ou(String var1, Supplier<URL> var2) {
      if ((157383321 ^ 157383321) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3riftro.add(var1)) {
         Xqedii_38o2zes.Xqedii_u043a3q(this.Xqedii_3cadqba, () -> {
            if ((-1215563730 ^ -1215563730) != 0) {
               throw new IllegalStateException();
            } else {
               String var3 = null;

               try {
                  URL var4 = (URL)var2.get();
                  if (var4 != null) {
                     var3 = this.Xqedii_r4lh3lu(this.Xqedii_2l8w20d(var4));
                  }
               } catch (Throwable var8) {
                  this.Xqedii_3cadqba.getLogger().warning(Xqedii_6evl296gl0qj(var1, var8.getMessage()));
               } finally {
                  this.Xqedii_3riftro.remove(var1);
               }

               if (var3 == null) {
                  this.Xqedii_aid9a04(var1, Xqedii_fgjx9wa.Xqedii_273ezm3vnno6f(-7586196477916242244L, 22));
               } else {
                  String var10 = this.Xqedii_wvr8f85.put(var1, var3);
                  this.Xqedii_aid9a04(var1, Xqedii_fgjx9wa.Xqedii_2d75oujd3y9zf(9164098467713110845L, 29));
                  Set var5 = this.Xqedii_3oaz9jz.remove(var1);
                  if (!var3.equals(var10) && var5 != null && !var5.isEmpty()) {
                     Xqedii_38o2zes.Xqedii_34mipix(this.Xqedii_3cadqba, () -> {
                        if ((-2088637203 * (-2088637203 + 1) & 1) != 0) {
                           throw new IllegalStateException();
                        } else {
                           for (UUID var3x : (Iterable<UUID>) (var5)) {

                              Player var4x = Bukkit.getPlayer(var3x);
                              if (var4x != null && var4x.isOnline() && this.Xqedii_2lwkq6x != null) {
                                 Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_3cadqba, var4x, () -> {
                                    if ((-1632079353 * -1632079353 - -1632079353 & 1) != 0) {
                                       throw new IllegalStateException();
                                    } else {
                                       this.Xqedii_2lwkq6x.accept(var4x);
                                    }
                                 });
                              }
                           }
                        }
                     });
                  }
               }
            }
         });
      }
   }

   public URL Xqedii_3j0kyj0(UUID var1, String var2) {
      if ((1517969864 * 1517969864 - 1517969864 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            PlayerProfile var3 = var1 != null ? Bukkit.createPlayerProfile(var1) : Bukkit.createPlayerProfile(var2);
            PlayerProfile var4 = (PlayerProfile)var3.update().get(Xqedii_fgjx9wa.Xqedii_2d75oujd3y9zf(9163787265657131949L, 4), TimeUnit.SECONDS);
            PlayerTextures var5 = var4 == null ? null : var4.getTextures();
            return var5 == null ? null : var5.getSkin();
         } catch (Throwable var6) {
            return null;
         }
      }
   }

   public URL Xqedii_jjr7grp(Player var1) {
      if (((-64681549 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            PlayerProfile var2 = Xqedii_38o2zes.Xqedii_a93o0le(var1);
            if (var2 == null) {
               return null;
            } else {
               PlayerTextures var3 = var2.getTextures();
               return var3 == null ? null : var3.getSkin();
            }
         } catch (Throwable var4) {
            return null;
         }
      }
   }

   public BufferedImage Xqedii_2l8w20d(URL var1) throws Exception {
      if ((-105189676 ^ -105189676) != 0) {
         throw new IllegalStateException();
      } else {
         URLConnection var2 = var1.openConnection();
         var2.setConnectTimeout(Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(852359926, 31));
         var2.setReadTimeout(Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-885527592, 1));
         var2.setRequestProperty(
            Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("pUtP65V9PA+1718hJxJUhzZmE+pj4K2dvV3YaXaJ5rmlhyA8JR66ply6Rv2iHCUX"),
            Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("g4vVKmW4Ml0F7sOfYR3quXWZzm/5ZbnUPQnKi9zgmqzM2JoTugj/GsOgcJvMz7EG")
         );

         BufferedImage var4;
         try (InputStream var3 = var2.getInputStream()) {
            var4 = ImageIO.read(var3);
         } finally {
            if (var2 instanceof HttpURLConnection var7) {
               var7.disconnect();
            }
         }

         return var4;
      }
   }

   public String Xqedii_r4lh3lu(BufferedImage var1) {
      if ((-69119474 * -69119474 + -69119474 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null
         && var1.getWidth() >= Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819555395, 5)
         && var1.getHeight() >= Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868900031, 4)) {
         int[][] var2 = new int[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035070411, 11)][Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819538499, 11)];

         for (int var3 = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1180286502, 28); var3 < Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819685955, 14); var3++) {
            for (int var4 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554883, 29); var4 < Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899959, 3); var4++) {
               int var5 = var1.getRGB(Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554882, 29) + var4, Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819685955, 14) + var3);
               int var6 = var1.getRGB(Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1283698292, 5) + var4, Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1327928765, 28) + var3);
               int var7 = (var6 >>> Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1704714876, 0) & Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-254186884, 30))
                     >= Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(426178745, 30)
                  ? Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 3)
                  : Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(752816931, 3);
               var2[var3][var4] = (var7 != 0 ? var6 : var5) & Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1871285658, 10);
            }
         }

         return this.Xqedii_3032hqy(var2);
      } else {
         return null;
      }
   }

   public String Xqedii_3032hqy(int[][] var1) {
      if ((1361968069 * 1361968069 - 1361968069 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         StringBuilder var2 = new StringBuilder(Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1876616783, 14));

         for (int var3 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(836332099, 21); var3 >= Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 1); var3--) {
            var2.append(Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("R8veQdFMBBUdkhtnDWVWhoLMJQ9u2wJPZX/FCRn0tIADXFQkbq0FDi7PxQA/I7Dvj6c="))
               .append(var3)
               .append((char)Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-123168410, 14));
            int[] var4 = var1[var3 - Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554819, 6)];

            for (int var5 = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1284289404, 21); var5 < Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-278583732, 31); var5++) {
               if (var5 > 0) {
                  var2.append((char)Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-2124077486, 21));
               }

               StringBuilder var10000 = var2.append(Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("yLnEBN4wJvnBvHsV9M8JstYYnyLwzb+6oDYKd9BFLxA="));
               String var10001 = Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("340FAH82+45VmiwZJiYlDBzP68tLZr8b7ipQ3BmeQ74tA3WG");
               Object[] var10002 = new Object[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 21)];
               var10002[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 6)] = var4[var5] & Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-819555262, 9);
               var10000.append(String.format(var10001, var10002))
                  .append((char)Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-552266964, 11))
                  .append((char)Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-704175576, 5));
            }
         }

         return var2.toString();
      }
   }

   public static String Xqedii_36hhl80(UUID var0) {
      if ((1960947408 ^ 1960947408) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_370zhddz6ltrr(String.valueOf(var0));
      }
   }

   public static UUID Xqedii_gwkm8bq(String var0) {
      if ((2124967030 ^ 2124967030) != 0) {
         throw new IllegalStateException();
      } else {
         String var1 = var0 == null ? Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("emKWo93rCPDaV2jb+YqCo9Ez/kCcOmJ59O0fDA==") : var0.trim();
         if (var1.length() == Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(342560100, 28) && var1.indexOf(Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1638701197, 9)) < 0) {
            var1 = Xqedii_26o8tcv6fd1r9(
               var1.substring(Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 8), Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1505633990, 4)),
               var1.substring(Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1804923546, 28), Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-991900873, 17)),
               var1.substring(Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-247975219, 15), Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868900031, 4)),
               var1.substring(Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(899436972, 14), Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1851074127, 20)),
               var1.substring(Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(813263427, 19))
            );
         }

         if (var1.length() != Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1327928761, 29)) {
            return null;
         } else {
            try {
               return UUID.fromString(var1);
            } catch (IllegalArgumentException var3) {
               return null;
            }
         }
      }
   }

   public static boolean Xqedii_2ixwjae(String var0) {
      if ((796012279 ^ 796012279) != 0) {
         throw new IllegalStateException();
      } else if (var0 != null && !var0.isEmpty() && var0.length() <= Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035054027, 11)) {
         for (int var1 = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1679661979, 8); var1 < var0.length(); var1++) {
            char var2 = var0.charAt(var1);
            if (!Character.isLetterOrDigit(var2) && var2 != Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819555069, 1)) {
               return (Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 25) != 0);
            }
         }

         return (Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 12) != 0);
      } else {
         return (Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(842190321, 23) != 0);
      }
   }

   public static <T> T Xqedii_47nzbsd(T var0, T var1) {
      if (((-1800188103 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (T)(var0 != null ? var0 : var1);
      }
   }

   static {
      if ((-1771151169 ^ -1771151169) != 0) {
         throw new IllegalStateException();
      } else {
         int[][] var10000 = new int[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035070411, 11)][];
         int var10002 = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1632022742, 24);
         int[] var10003 = new int[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1245021875, 27)];
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1396535967, 17)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(1960421075, 26);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(148249292, 29)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1293450438, 31);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(752816947, 3)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(785933259, 3);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(869886531, 24)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(1058270979, 6);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868906063, 11)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(2145624628, 11);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(898020130, 3)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(858508051, 4);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819550787, 11)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(1960421075, 26);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899983, 5)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1062114533, 19);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819538499, 14);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1771075151, 2)];
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 7)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(853540150, 31);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 7)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(866856568, 19);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554881, 0)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1995910735, 7);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554907, 3)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1543561967, 6);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1328126650, 8)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(267616067, 8);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868900047, 5)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(826297035, 3);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554885, 0)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1021421194, 14);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554755, 7)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-455045881, 17);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819538499, 13);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1751459407, 24)];
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-1868899920, 2)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1999406835, 29);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1064476244, 25)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(51127900, 13);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(551119427, 27)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(846913043, 3);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819550787, 12)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-2040973567, 23);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868906063, 11)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(813749996, 31);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868901967, 9)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-518493552, 26);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(449636566, 13)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1878934791, 0);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-248139059, 15)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1596404885, 27);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1483419939, 7);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819030595, 16)];
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1554486480, 31)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1413864637, 8);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035088843, 11)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1132749226, 20);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868834383, 16)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1632140084, 9);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554907, 3)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(247266584, 10);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899663, 8)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1502713135, 30);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554889, 1)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(-547065173, 25);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-724879420, 25)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(167111190, 15);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(823749187, 22)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1384407739, 20);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1793408167, 26);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868998223, 15)];
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1185994337, 0)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-174515886, 26);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1798316888, 15)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-820423236, 22);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819558979, 11)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1158016584, 14);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-2035084747, 11)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1715885245, 0);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554371, 7)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1783663703, 17);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554835, 4)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(2137358900, 25);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819556931, 10)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1104791959, 12);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1503206083, 18)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1036987103, 27);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819544643, 11);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(935647435, 9)];
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554883, 7)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(963600083, 4);
         var10003[Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1868899919, 3)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(167111190, 15);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1871288726, 10)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(1665901126, 11);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(14248515, 28)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1713788350, 10);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1871290774, 10)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1230662575, 6);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1516867703, 26)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(630661475, 5);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1718905613, 20)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-698063541, 28);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(224814187, 12)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-2031224246, 12);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1718905613, 20);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554881, 30)];
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1030921812, 25)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-169582072, 20);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(836332099, 24)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-866746044, 1);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1718194295, 26)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1567405501, 9);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-552387796, 11)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1745945871, 4);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1462363444, 29)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(192442563, 7);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(2085432499, 13)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-1074934597, 13);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(819554931, 3)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(358889715, 25);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1328126394, 8)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1316334781, 8);
         var10000[var10002] = var10003;
         var10002 = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(861497923, 23);
         var10003 = new int[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1798611800, 15)];
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(898020106, 3)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(2003461738, 14);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1286386556, 21)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(1877243255, 0);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(1796040244, 4)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(2004867993, 6);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-647563111, 30)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-904992565, 9);
         var10003[Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1327928765, 29)] = Xqedii_fgjx9wa.Xqedii_1but7k7w6oeto(2139975245, 11);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1860517031, 26)] = Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(-226248142, 7);
         var10003[Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(-1554486477, 31)] = Xqedii_fgjx9wa.Xqedii_theiuu3nrmch(-1596883088, 28);
         var10003[Xqedii_fgjx9wa.Xqedii_3ny0osubqpgi4(1801821154, 24)] = Xqedii_fgjx9wa.Xqedii_vs3tkuiqfknh(2098789921, 26);
         var10000[var10002] = var10003;
         Xqedii_3dbu3uu = var10000;
      }
   }

   private static /* synthetic */ String Xqedii_23nqqjk91xzh(String string) {
        return Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("KRY/8cSgMg0K3P/cw29znMJBWBWzSoxWtDPJ4vL0v4d/MWekg1M=") + string;
    }

    private static /* synthetic */ String Xqedii_370zhddz6ltrr(String string) {
        return Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("76N+VqOfWMmCQt+LZXLM7VFPVjGOpzpShb2miSWtIfuiLJwaZcU=") + string;
    }

    private static /* synthetic */ String Xqedii_26o8tcv6fd1r9(String string, String string2, String string3, String string4, String string5) {
        return string + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("SZHgM/oZPB9TYnQYXrgO6sDyKkqrRkoOVHdzUrok") + string2 + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("SZHgM/oZPB9TYnQYXrgO6sDyKkqrRkoOVHdzUrok") + string3 + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("SZHgM/oZPB9TYnQYXrgO6sDyKkqrRkoOVHdzUrok") + string4 + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("SZHgM/oZPB9TYnQYXrgO6sDyKkqrRkoOVHdzUrok") + string5;
    }

    private static /* synthetic */ String Xqedii_6evl296gl0qj(String string, String string2) {
        return Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("nAoj4YOPPTupegY/n9kEJVKyFVo12+wv5h7BTzz4SPGXJVuJYsWWc+W5eBZwGLZEb+O5LsbRCt6RNOsw9Mn7W708vyqCCjDZJ+6j73GDYImtgiNX3yc/vzmGSRLfPs/BiptW7+FeAyvdd4MP0+DVvw==") + string + Xqedii_fgjx9wa.Xqedii_1s747t5zb65is("NOwb2a64/THllsWIuocNHYDKv2YQXIvux0srb/8+pBk=") + string2;
    }
}
