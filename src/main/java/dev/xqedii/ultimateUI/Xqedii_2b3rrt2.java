package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import dev.xqedii.ultimateUI.api.event.UltimateUIBlockClickEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUICloseEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUICursorMoveEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIDragEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIHoverEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIInputSubmitEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIKeyEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIOpenEvent;
import dev.xqedii.ultimateUI.api.event.UltimateUIOpenedEvent;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xqedii_2b3rrt2 {
   public static final String Xqedii_1v8qi9z0nozjq = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_1v33b58 = Xqedii_344dfpu.Xqedii_julonwejv4mf(
      "i/sXvfHfc1y3BuH6PgoHiBaGKnNstMsPj9fKeet8CNcTUK/32YgO92ENZ4Dp25j0yHjTfkizGA4X2IaL"
   );
   public static final String Xqedii_92kgeok = Xqedii_344dfpu.Xqedii_julonwejv4mf("SMLbjnA/jbb6eXSikVs35W5y584QVfUyrDGVCJHHAZ9eosxG");
   public static final String Xqedii_30v19gf = Xqedii_344dfpu.Xqedii_julonwejv4mf(
      "9bK3lyBQQ9fZue753KSLcyLotWKhQnerL6s3DPxCOqKA6+uFSHugTV6NCVB/Dl+Hb4WQ7y6cnT9i9Q=="
   );
   public static final String Xqedii_1x147qt = Xqedii_344dfpu.Xqedii_julonwejv4mf(
      "a2cJx1r7Lq2PN23kvWRwpA5Umgvd6qU/k64rcj4MgPxJbw9vSEkLAdIvRiwgNcnJ+NznK+40WDkG0oji7OI="
   );
   public static final long Xqedii_29iwr60 = 6000L;
   public static final long Xqedii_1nngdqp = 10000L;
   public final JavaPlugin Xqedii_1bs4d2x;
   public final File Xqedii_2ie53s9;
   public final File Xqedii_73sb6rc;
   public final List<Xqedii_1kffk3z> Xqedii_g32rhpa = new ArrayList<>();
   public final Map<String, List<Xqedii_3tcqkw2>> Xqedii_1hrsxi5 = new HashMap<>();
   public final List<Xqedii_3tcqkw2> Xqedii_3c71sgp = new ArrayList<>();
   public final Map<String, Xqedii_bflxzg9> Xqedii_2u229x4 = new LinkedHashMap<>();
   public final Map<UUID, Map<String, Object>> Xqedii_18ebdik = new ConcurrentHashMap<>();
   public final Map<UUID, Map<String, Object>> data = new ConcurrentHashMap<>();
   public final Map<String, Object> Xqedii_2gg9i2g = Collections.synchronizedMap(new LinkedHashMap<>());
   public final Map<String, Long> Xqedii_2evhzeq = new ConcurrentHashMap<>();
   public final Listener Xqedii_iulk2h1 = new Listener() {
      public static final String Xqedii_2pn6y7dhq5422 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   };
   public volatile int Xqedii_aj0mxfz;
   public long Xqedii_1zrzxna;
   public boolean Xqedii_140q75q;
   public final Map<UUID, List<Xqedii_2awqdkk>> Xqedii_tr2wpfg = new ConcurrentHashMap<>();
   public boolean Xqedii_2g291o6;
   public Xqedii_1zgvf22 Xqedii_2n5ltd1 = new Xqedii_1zgvf22(
      Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 3), Xqedii_344dfpu.Xqedii_23pkazknxxor3(-1796635934, 16), List.of()
   );

   public Xqedii_2b3rrt2(JavaPlugin var1) {
      this.Xqedii_1bs4d2x = var1;
      this.Xqedii_2ie53s9 = new File(
         var1.getDataFolder(), Xqedii_344dfpu.Xqedii_julonwejv4mf("i/sXvfHfc1y3BuH6PgoHiBaGKnNstMsPj9fKeet8CNcTUK/32YgO92ENZ4Dp25j0yHjTfkizGA4X2IaL")
      );
      this.Xqedii_73sb6rc = new File(
         var1.getDataFolder(), Xqedii_344dfpu.Xqedii_julonwejv4mf("9bK3lyBQQ9fZue753KSLcyLotWKhQnerL6s3DPxCOqKA6+uFSHugTV6NCVB/Dl+Hb4WQ7y6cnT9i9Q==")
      );
   }

   public Plugin Xqedii_3892wz7() {
      if ((-1973427511 * -1973427511 + -1973427511 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1bs4d2x;
      }
   }

   public File Xqedii_2h6quir() {
      if ((-897870896 * -897870896 - -897870896 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2ie53s9;
      }
   }

   public Xqedii_1zgvf22 Xqedii_2cgj5ej() {
      if ((-84323054 * (-84323054 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2n5ltd1;
      }
   }

   public synchronized Xqedii_1zgvf22 Xqedii_7murfs0() {
      if ((355381125 * 355381125 - 355381125 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_dtoug18();
         this.Xqedii_aj0mxfz = this.Xqedii_aj0mxfz + Xqedii_344dfpu.Xqedii_23pkazknxxor3(983611557, 22);
         if (!this.Xqedii_2ie53s9.exists()) {
            this.Xqedii_2ie53s9.mkdirs();
            this.Xqedii_198ljgl();
         }

         if (!this.Xqedii_2g291o6) {
            this.Xqedii_2yvqp6m();
            this.Xqedii_2g291o6 = (Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-825905154, 2) != 0);
         }

         ArrayList var1 = new ArrayList();
         ArrayList var2 = new ArrayList();
         this.Xqedii_147w9mi(this.Xqedii_2ie53s9, var2);
         var2.sort(null);
         int var3 = Xqedii_344dfpu.Xqedii_23pkazknxxor3(193614758, 2);

         for (File var5 : (Iterable<File>) (var2)) {

            String var6 = this.Xqedii_2ie53s9
               .toPath()
               .relativize(var5.toPath())
               .toString()
               .replace((char)Xqedii_344dfpu.Xqedii_o5hmly3nit02(-832558233, 26), (char)Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-388376395, 23));

            String var7;
            try {
               var7 = Files.readString(var5.toPath(), StandardCharsets.UTF_8);
            } catch (IOException var12) {
               var1.add(
                  new Xqedii_3jb0tcl(var6, new Xqedii_3vsk7zm(Xqedii_2cpve3e2scybj(var12.getMessage()), Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 7)))
               );
               continue;
            }

            ArrayList var8 = new ArrayList();
            Xqedii_1kffk3z var9 = Xqedii_2thoio4.Xqedii_2owkzy2(var6, var7, var8);

            for (Xqedii_3vsk7zm var11 : (Iterable<Xqedii_3vsk7zm>) (var8)) {

               var1.add(new Xqedii_3jb0tcl(var6, var11));
            }

            if (var8.isEmpty()) {
               this.Xqedii_g32rhpa.add(var9);
               var3 += var9.Xqedii_39uxme9.size();

               for (Xqedii_3tcqkw2 var18 : var9.Xqedii_39uxme9) {
                  if (var18.Xqedii_27kq3c6.equals(Xqedii_344dfpu.Xqedii_julonwejv4mf("QQjjV42JuiwlPzKt7TbxnNlkXSuKTWsphoYsYiUOCG9ME3u1Sio="))) {
                     this.Xqedii_3c71sgp.add(var18);
                  } else if (var18.Xqedii_27kq3c6.equals(Xqedii_344dfpu.Xqedii_julonwejv4mf("JUn5+oH4kws6jSglyqrHXhRdKQe3eTOU6hiNjza6MwI9sVUVq4ERMKv/"))) {
                     this.Xqedii_2u229x4.computeIfAbsent(var18.Xqedii_ne1a52s, var2x -> {
                        if (((-1995489817 | 1) & 1) == 0) {
                           throw new IllegalStateException();
                        } else {
                           return new Xqedii_bflxzg9(this, var2x, var18);
                        }
                     });
                  } else {
                     this.Xqedii_1hrsxi5.computeIfAbsent(var18.Xqedii_dg8qjon(), var0 -> {
                        if ((-479105312 * -479105312 - -479105312 & 1) != 0) {
                           throw new IllegalStateException();
                        } else {
                           return new ArrayList<>();
                        }
                     }).add(var18);
                  }
               }
            }
         }

         for (Xqedii_1kffk3z var15 : this.Xqedii_g32rhpa) {
            this.Xqedii_3pyerce(var15);
         }

         this.Xqedii_2v12pbw();
         this.Xqedii_2am6bju();
         this.Xqedii_1hvc3pb();
         this.Xqedii_2n5ltd1 = new Xqedii_1zgvf22(this.Xqedii_g32rhpa.size(), var3, List.copyOf(var1));

         for (Xqedii_3tcqkw2 var16 : this.Xqedii_1hrsxi5
            .getOrDefault(Xqedii_344dfpu.Xqedii_julonwejv4mf("Zh+lxwffo9gItKhDfXxXmUqH8rXSdcm3JIv89AOohpoDWLFt"), List.of())) {
            this.run(var16, null, null, null, null);
         }

         return this.Xqedii_2n5ltd1;
      }
   }

   public void Xqedii_147w9mi(File var1, List<File> var2) {
      if (((-206208244 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File[] var3 = var1.listFiles();
         if (var3 != null) {
            File[] var4 = var3;
            int var5 = var3.length;

            for (int var6 = Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(381676347, 12); var6 < var5; var6++) {
               File var7 = var4[var6];
               if (!var7.getName().startsWith(Xqedii_344dfpu.Xqedii_julonwejv4mf("a23uduQEy2TTtKYAcIj/SjogiAugP22olMtyy6v5"))
                  && !var7.getName().startsWith(Xqedii_344dfpu.Xqedii_julonwejv4mf("LteCHbUN4wtQlWym3FIFUzxvI+eQB3FEOq84mb1S"))) {
                  if (var7.isDirectory()) {
                     this.Xqedii_147w9mi(var7, var2);
                  } else if (var7.getName()
                     .toLowerCase(Locale.ROOT)
                     .endsWith(Xqedii_344dfpu.Xqedii_julonwejv4mf("SMLbjnA/jbb6eXSikVs35W5y584QVfUyrDGVCJHHAZ9eosxG"))) {
                     var2.add(var7);
                  }
               }
            }
         }
      }
   }

   public void Xqedii_198ljgl() {
      if (((-849797463 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         File var1 = new File(this.Xqedii_2ie53s9, Xqedii_344dfpu.Xqedii_julonwejv4mf("B21EzXhtjbZA9dgW8LIxDyhAVBQ5XDgDtYDkWjmb4MfTFUYevjF25vO2M2LoKcqJ7jU="));
         String var10000 = Xqedii_344dfpu.Xqedii_julonwejv4mf("BM1YxbjBqfjIpk0YxbF7hyCHxxwU0jvfqFWHKSh1");
         CharSequence[] var10001 = new CharSequence[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-1241785896, 15)];
         var10001[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(-748662457, 18)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "h2e45vTXuHTsf15vUBVJMb5md4WxS6KE+G/TDTN7lbcQy+QdIdQaBF/8AI0XSGPGOzYufhkkO88rPsQoN/hyP0GS38wARcp2/C80Uu9eIee5236VlqF9Y9NHgQR667+D0LmCPB6si+3zMhBc/cxWcuUt6UPPwzexEgXIvc777aStoMEhhBBamizct73eLWSovj+bKS3B1/M5XXlA79Ib+obs75O6Hb39pZf8z45Ef9sVAgIh"
         );
         var10001[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 25)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "B2zJ4EVazCq717tQZJzeDk4FsfIIa9yWS5JdrpPLaGkMpa25Uxt4CiDfd1h6BlMTfVtAeQGNjxkDBcVJxAx3vMBDwRo/0cBaGBiRGABIL3pvMFh4vt277AWSGokJEhBSrmw9XnCuxf/WKWd2k9Tpwtk07bTFrzpi2RM="
         );
         var10001[Xqedii_344dfpu.Xqedii_23pkazknxxor3(1320693289, 20)] = Xqedii_344dfpu.Xqedii_julonwejv4mf("C7ikLUHlueoJ8fmufibcp5aRhpUdvE9bGukFBg==");
         var10001[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(1526689004, 14)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "HoJUc16L0DRZs2s/Hm3Y46fRxA9S0pFL2zMWRI3oEnc5J+49M/BYaQFlk90="
         );
         var10001[Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1101001882, 11)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "rxDXdb1yZbKVxNBTJbWJXygQRM+olLyLJL9NcMOfbS6civWCWvQc4QU+FAFvcFEJzyT5DIDwN6zaDX7qfsUnOKwSUJk51URTLUxe3VCLyWPvxxR7Ze6ILmj7poppL7omSlk1AF4x3ziNHeRk"
         );
         var10001[Xqedii_344dfpu.Xqedii_23pkazknxxor3(-1647289262, 21)] = Xqedii_344dfpu.Xqedii_julonwejv4mf("C7ikLUHlueoJ8fmufibcp5aRhpUdvE9bGukFBg==");
         var10001[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748661688, 8)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "vcjQwUNlFV49wE5H363mT16xqvkhEORLdvoRZXZwxiagLt/1Mt07KZAxUUYfbhQlsJnD7ueQXZ4Hi8de"
         );
         var10001[Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993658, 5)] = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "NG/sC5gbwhRvStOx4Z7oEVGq6l/nZ0eEa8iuJO9Z1mrJxH+K92+tTLb2u+yv/yGPoGD51r5WaalObkfW9cxGaEfVQl7axTbmZHKAkStgNJGxvJGDPb1ku6Vi4migRQIyKw4Qkgko+v+DUx8SKJSvpiJJs9TzsNhG/KzE5g=="
         );
         var10001[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(346009272, 27)] = Xqedii_344dfpu.Xqedii_julonwejv4mf("C7ikLUHlueoJ8fmufibcp5aRhpUdvE9bGukFBg==");
         String var2 = String.join(var10000, var10001);

         try {
            Files.writeString(var1.toPath(), var2, StandardCharsets.UTF_8);
         } catch (IOException var4) {
         }
      }
   }

   public void Xqedii_3pyerce(Xqedii_1kffk3z var1) {
      if ((1659232566 * 1659232566 - 1659232566 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var2 = new Xqedii_1yqm9k3(this, var1, null, Bukkit.getConsoleSender(), null, null);
         Xqedii_y5pr2ec var3 = new Xqedii_y5pr2ec(
            var2, new Xqedii_3nlck21[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-1241556520, 15)], (Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(-748662457, 17) != 0)
         );

         for (Entry var5 : var1.Xqedii_2buerqn.entrySet()) {
            try {
               var1.Xqedii_3i3ujw9.put((String)var5.getKey(), ((Xqedii_ev3jp8w)var5.getValue()).Xqedii_28g36j3(var3));
            } catch (Xqedii_3vsk7zm var7) {
               this.Xqedii_3kgc99t(var1, var7);
               var1.Xqedii_3i3ujw9.put((String)var5.getKey(), null);
            }
         }
      }
   }

   public synchronized void Xqedii_oe61gxm() {
      if ((1431007005 * 1431007005 + 1431007005 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_dtoug18();
         this.Xqedii_1dijqtn();
      }
   }

   public void Xqedii_dtoug18() {
      if (((-1039764274 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_aj0mxfz = this.Xqedii_aj0mxfz + Xqedii_344dfpu.Xqedii_23pkazknxxor3(-1796570398, 16);
         HandlerList.unregisterAll(this.Xqedii_iulk2h1);
         this.Xqedii_3d4ydyl();
         this.Xqedii_g32rhpa.clear();
         this.Xqedii_1hrsxi5.clear();
         this.Xqedii_3c71sgp.clear();
         this.Xqedii_tr2wpfg.clear();
         this.Xqedii_140q75q = (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 16) != 0);
      }
   }

   public long Xqedii_3b3clqv() {
      if (((-1601664388 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1zrzxna;
      }
   }

   public void Xqedii_3uyxvgz(Player var1, Xqedii_2awqdkk var2) {
      if ((-1870549105 * (-1870549105 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         while (true) {
            List<Xqedii_2awqdkk> var3 = this.Xqedii_tr2wpfg.computeIfAbsent(var1.getUniqueId(), var0 -> {
               if (((-1897807079 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return new ArrayList<>();
               }
            });
            synchronized (var3) {
               if (this.Xqedii_tr2wpfg.get(var1.getUniqueId()) == var3) {
                  var3.removeIf(
                     (Xqedii_2awqdkk var1x) -> {
                        if ((-1317295417 * -1317295417 + -1317295417 & 1) != 0) {
                           throw new IllegalStateException();
                        } else {
                           return ((var1x.Xqedii_2kw8m64.equals(var2.Xqedii_2kw8m64) && var1x.Xqedii_2dwrrc7.equals(var2.Xqedii_2dwrrc7)
                              ? Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 2)
                              : Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(-748662457, 22)) != 0);
                        }
                     }
                  );
                  var3.add(var2);
                  return;
               }
            }
         }
      }
   }

   public void Xqedii_3032p5i(Player var1, String var2, String... var3) {
      if ((-1747959926 ^ -1747959926) != 0) {
         throw new IllegalStateException();
      } else {
         List<Xqedii_2awqdkk> var4 = this.Xqedii_tr2wpfg.get(var1.getUniqueId());
         if (var4 != null) {
            Set var5 = var3.length == 0 ? null : Set.of(var3);
            synchronized (var4) {
               var4.removeIf(
                  (Xqedii_2awqdkk var2x) -> {
                     if (((305815817 << 1 | 1) & 1) == 0) {
                        throw new IllegalStateException();
                     } else {
                        return ((var2 != null && !var2x.Xqedii_2kw8m64.equals(var2) || var5 != null && !var5.contains(var2x.Xqedii_2dwrrc7)
                           ? Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 17)
                           : Xqedii_344dfpu.Xqedii_23pkazknxxor3(1900705089, 7)) != 0);
                     }
                  }
               );
            }
         }
      }
   }

   public void Xqedii_2vdmdmn(int var1) {
      if ((-650750552 * -650750552 - -650750552 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (Entry var3 : this.Xqedii_tr2wpfg.entrySet()) {
            Player var4 = Bukkit.getPlayer((UUID)var3.getKey());
            if (var4 != null && var4.isOnline()) {
               List var5 = (List)var3.getValue();
               long var6 = this.Xqedii_1zrzxna;
               Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_1bs4d2x, var4, () -> {
                  if ((458523495 * 458523495 - 458523495 & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (var1 == this.Xqedii_aj0mxfz && UltimateUIAPI.isAvailable()) {
                     if (!UltimateUIAPI.get().isGuiOpen(var4)) {
                        this.Xqedii_tr2wpfg.remove(var4.getUniqueId(), var5);
                     } else {
                        ArrayList var6x = new ArrayList();
                        synchronized (var5) {
                           Iterator var8 = var5.iterator();

                           while (var8.hasNext()) {
                              Xqedii_2awqdkk var9 = (Xqedii_2awqdkk)var8.next();
                              var6x.add(var9.Xqedii_s2v6yoo(var6));
                              if (var9.Xqedii_3oq00gt(var6)) {
                                 var8.remove();
                              }
                           }

                           if (var5.isEmpty()) {
                              this.Xqedii_tr2wpfg.remove(var4.getUniqueId(), var5);
                           }
                        }

                        if (!var6x.isEmpty()) {
                           UltimateUIAPI.get().applyElementWrites(var4, var6x);
                        }
                     }
                  }
               });
            } else {
               this.Xqedii_tr2wpfg.remove(var3.getKey());
            }
         }
      }
   }

   public boolean Xqedii_3izlism(String var1) {
      if ((2128759204 * 2128759204 + 2128759204 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1hrsxi5.containsKey(var1);
      }
   }

   public void Xqedii_2v12pbw() {
      if ((-293216791 * -293216791 + -293216791 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("d2xwgl2HD1hCEEbdHbUXRSC7UPkJdIfYxfK1kaeO5PKA0g4boKrIbmaq"))) {
            this.Xqedii_euucjux(UltimateUIOpenEvent.class, this::Xqedii_19hqwsk);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("IbbLEbn8ZgqdI0B3Y8GhURAtFl68iznHsplfFemGTY5cq7aj"))) {
            this.Xqedii_euucjux(UltimateUIOpenedEvent.class, this::Xqedii_5qh5412);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("iZbpoa/FJ7gZQ4xluuSjJLhLy47Ii1Kv9BX9X9n186Kciu2/cIQ="))) {
            this.Xqedii_euucjux(UltimateUICloseEvent.class, this::Xqedii_y1cxf0z);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("rzDat1TfCiVbxvJWthgwWb3YTuN+puJDQ01OhWyiIoK92XEggcM="))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("AHY2/BtTkXaiDY73rWUFXiX0dqzkixs+VESfWbLROvkOwOOgv/t/n0mlBxlQTS6/"))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("qmNc+mxFhA+uEY+Ew3XoVqRGzzUkmpm1nBXZm7Wvx1aq5t6eWoRjCIXgbX6oej1fl5E="))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("AFmYI1wrUznHlZv9PDSgoxWM3WmbtINYuH8GVLI4oOUCfr868kZOVg=="))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("wRty/FIq/WwVlWDZUHQjUQ34lTo2Rqnq8efFXeMaZ/YRdY5CjRBnYwn6gfWZYQ=="))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("KzHjs61wqhFOrQIRQQ7UdsUy9jcH07xMhduWe1/67LMmaVKHsjZKJICtnwcSrvvRO0M="))) {
            this.Xqedii_euucjux(UltimateUIBlockClickEvent.class, this::Xqedii_2rb9uqo);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("uYxv5KBeq79Ku7YUdW3KHL2bqzTrbk4VLfy3mdydak8b1uHPxgk="))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("ydzdIC8GGrd14ZgLPEFTN9GMtTqo6dc7BIuMlRMG95kcajXJVv49EDxD"))) {
            this.Xqedii_euucjux(UltimateUIHoverEvent.class, this::Xqedii_3hyd70f);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("YoxuKex4BIb6MxFOIKdmtNc+35SJh2jbWuSqwNyuJ8Bkqg2o5tO1/HkGH4RFFlMz"))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("CRAbOy5E6TYM8HbH5tF/fMgDvVMmz/EpuQYQ9vrfahBvAtJd"))
            || this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("CswjRXeD5N/CPBDHx5TRaA5zMFuDiF4hi38DKiXgUTgl0MDP"))) {
            this.Xqedii_euucjux(UltimateUIDragEvent.class, this::Xqedii_2lzyz2p);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("sHUjwXb0Tai+s4UiGUq1SVjr/tVnKD8laPgsZQvq+QaG+ilSVnyW1+tDHLwyX6ljryk="))) {
            this.Xqedii_euucjux(UltimateUICursorMoveEvent.class, this::Xqedii_ot25639);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("N7J5NIT7yJNi+OeTaOR3OFbeN+WlycGdVPUeJfaRuHYpXw=="))) {
            this.Xqedii_euucjux(UltimateUIKeyEvent.class, this::Xqedii_2p98a7o);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("RpcgvOkGYaYSOYa62mODixyo34qV7wo//fB5fCwgflVpAYNVNpI="))) {
            this.Xqedii_euucjux(UltimateUIInputSubmitEvent.class, this::Xqedii_2s56q5q);
         }

         if (this.Xqedii_3izlism(Xqedii_344dfpu.Xqedii_julonwejv4mf("OHRTN/ZPTeX5gxVCaL28K2PtYEqPGaeUSxvry+Y+dB6z59RZ"))) {
            this.Xqedii_euucjux(PlayerJoinEvent.class, this::Xqedii_3it2h16);
         }

         this.Xqedii_euucjux(PlayerQuitEvent.class, this::Xqedii_3m8skc3);
      }
   }

   public <T extends Event> void Xqedii_euucjux(Class<T> var1, Consumer<T> var2) {
      if ((1468736170 * 1468736170 + 1468736170 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Bukkit.getPluginManager().registerEvent(var1, this.Xqedii_iulk2h1, EventPriority.NORMAL, (var2x, var3) -> {
            if (((-1343090298 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               if (var1.isInstance(var3)) {
                  var2.accept(var1.cast(var3));
               }
            }
         }, this.Xqedii_1bs4d2x, (Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(1507374591, 31) != 0));
      }
   }

   public Xqedii_36oytze Xqedii_2jdoztn(String var1, UltimateUIEvent var2) {
      if ((-46672329 ^ -46672329) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var3 = new Xqedii_36oytze(var1, var2);
         var3.Xqedii_3rt5h0f = var2.getPageName();
         var3.Xqedii_lc1i2g8 = var2.getBlockId();
         var3.Xqedii_vkzqb40 = var2.getPageX();
         var3.Xqedii_yhwhrno = var2.getPageY();
         var3.Xqedii_2rqqsu9 = var2.getCursorX();
         var3.Xqedii_2qxc6az = var2.getCursorY();
         return var3;
      }
   }

   public void Xqedii_19hqwsk(UltimateUIOpenEvent var1) {
      if ((-1384534566 ^ -1384534566) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("d2xwgl2HD1hCEEbdHbUXRSC7UPkJdIfYxfK1kaeO5PKA0g4boKrIbmaq"), var1);
         var2.Xqedii_1zx8kgx = var1.isHudMode();
         this.Xqedii_21ptbt1(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("d2xwgl2HD1hCEEbdHbUXRSC7UPkJdIfYxfK1kaeO5PKA0g4boKrIbmaq"),
            var1.getPlayer(),
            var2,
            (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 21) != 0)
         );
      }
   }

   public void Xqedii_5qh5412(UltimateUIOpenedEvent var1) {
      if ((-1264746721 * -1264746721 - -1264746721 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("IbbLEbn8ZgqdI0B3Y8GhURAtFl68iznHsplfFemGTY5cq7aj"), var1);
         var2.Xqedii_1zx8kgx = var1.isHudMode();
         this.Xqedii_21ptbt1(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("IbbLEbn8ZgqdI0B3Y8GhURAtFl68iznHsplfFemGTY5cq7aj"),
            var1.getPlayer(),
            var2,
            (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 10) != 0)
         );
      }
   }

   public void Xqedii_y1cxf0z(UltimateUICloseEvent var1) {
      if ((1454498226 * 1454498226 + 1454498226 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_21ptbt1(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("iZbpoa/FJ7gZQ4xluuSjJLhLy47Ii1Kv9BX9X9n186Kciu2/cIQ="),
            var1.getPlayer(),
            this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("iZbpoa/FJ7gZQ4xluuSjJLhLy47Ii1Kv9BX9X9n186Kciu2/cIQ="), var1),
            (Xqedii_344dfpu.Xqedii_23pkazknxxor3(193614758, 2) != 0)
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Xqedii_2rb9uqo(UltimateUIBlockClickEvent var1) {
      if ((-626349677 * -626349677 + -626349677 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("rzDat1TfCiVbxvJWthgwWb3YTuN+puJDQ01OhWyiIoK92XEggcM="), var1);
         var2.Xqedii_16npco2 = var1.getClickType()
            .name()
            .toLowerCase(Locale.ROOT)
            .replace((char)Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(913714548, 29), (char)Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(727690936, 22));
         var2.Xqedii_19v5iy3 = var1.isShiftClick();
         switch (dev.xqedii.ultimateUI.Xqedii_18eapie.Xqedii_1xl6h0t[var1.getClickType().ordinal()]) {
            case 1:
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("rzDat1TfCiVbxvJWthgwWb3YTuN+puJDQ01OhWyiIoK92XEggcM="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_23pkazknxxor3(-360521068, 24) != 0)
               );
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("AHY2/BtTkXaiDY73rWUFXiX0dqzkixs+VESfWbLROvkOwOOgv/t/n0mlBxlQTS6/"),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_23pkazknxxor3(1348227741, 29) != 0)
               );
               break;
            case 2:
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("rzDat1TfCiVbxvJWthgwWb3YTuN+puJDQ01OhWyiIoK92XEggcM="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 3) != 0)
               );
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("qmNc+mxFhA+uEY+Ew3XoVqRGzzUkmpm1nBXZm7Wvx1aq5t6eWoRjCIXgbX6oej1fl5E="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-978321714, 10) != 0)
               );
               break;
            case 3:
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("AFmYI1wrUznHlZv9PDSgoxWM3WmbtINYuH8GVLI4oOUCfr868kZOVg=="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_23pkazknxxor3(-360521068, 24) != 0)
               );
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("wRty/FIq/WwVlWDZUHQjUQ34lTo2Rqnq8efFXeMaZ/YRdY5CjRBnYwn6gfWZYQ=="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-1956643427, 11) != 0)
               );
               break;
            case 4:
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("AFmYI1wrUznHlZv9PDSgoxWM3WmbtINYuH8GVLI4oOUCfr868kZOVg=="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_23pkazknxxor3(-1796570398, 16) != 0)
               );
               this.Xqedii_21ptbt1(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("KzHjs61wqhFOrQIRQQ7UdsUy9jcH07xMhduWe1/67LMmaVKHsjZKJICtnwcSrvvRO0M="),
                  var1.getPlayer(),
                  var2,
                  (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1103090842, 21) != 0)
               );
         }
      }
   }

   public void Xqedii_3hyd70f(UltimateUIHoverEvent var1) {
      if (((-324585380 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(
            var1.isEnter()
               ? Xqedii_344dfpu.Xqedii_julonwejv4mf("uYxv5KBeq79Ku7YUdW3KHL2bqzTrbk4VLfy3mdydak8b1uHPxgk=")
               : Xqedii_344dfpu.Xqedii_julonwejv4mf("ydzdIC8GGrd14ZgLPEFTN9GMtTqo6dc7BIuMlRMG95kcajXJVv49EDxD"),
            var1
         );
         var2.Xqedii_12aqqzl = Xqedii_3rjux1w(var1.getPreviousBlockId());
         var2.Xqedii_2f19s3n = Xqedii_3rjux1w(var1.getNextBlockId());
         this.Xqedii_21ptbt1(var2.Xqedii_1x9ad7s, var1.getPlayer(), var2, (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993674, 4) != 0));
      }
   }

   public void Xqedii_2lzyz2p(UltimateUIDragEvent var1) {
      if ((2036578199 * 2036578199 - 2036578199 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1.isStart()
            ? Xqedii_344dfpu.Xqedii_julonwejv4mf("YoxuKex4BIb6MxFOIKdmtNc+35SJh2jbWuSqwNyuJ8Bkqg2o5tO1/HkGH4RFFlMz")
            : (
               var1.isEnd()
                  ? Xqedii_344dfpu.Xqedii_julonwejv4mf("CswjRXeD5N/CPBDHx5TRaA5zMFuDiF4hi38DKiXgUTgl0MDP")
                  : Xqedii_344dfpu.Xqedii_julonwejv4mf("CRAbOy5E6TYM8HbH5tF/fMgDvVMmz/EpuQYQ9vrfahBvAtJd")
            );
         Xqedii_36oytze var3 = this.Xqedii_2jdoztn(var2, var1);
         var3.Xqedii_17k9l69 = var1.getPhase().name().toLowerCase(Locale.ROOT);
         var3.Xqedii_pxsnga0 = var1.getStartX();
         var3.Xqedii_25xm6yv = var1.getStartY();
         var3.Xqedii_jq9ubxh = var1.getStepX();
         var3.Xqedii_1t9vphc = var1.getStepY();
         var3.Xqedii_3464tdf = Xqedii_3rjux1w(var1.getDropBlockId());
         var3.Xqedii_35rn1ti = Xqedii_3rjux1w(var1.getDropContainerId());
         this.Xqedii_21ptbt1(var2, var1.getPlayer(), var3, (Xqedii_344dfpu.Xqedii_23pkazknxxor3(701826501, 17) != 0));
      }
   }

   public void Xqedii_ot25639(UltimateUICursorMoveEvent var1) {
      if ((-1414943217 ^ -1414943217) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("sHUjwXb0Tai+s4UiGUq1SVjr/tVnKD8laPgsZQvq+QaG+ilSVnyW1+tDHLwyX6ljryk="), var1
         );
         var2.Xqedii_jq9ubxh = var1.getPageX() - var1.getPreviousPageX();
         var2.Xqedii_1t9vphc = var1.getPageY() - var1.getPreviousPageY();
         this.Xqedii_21ptbt1(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("sHUjwXb0Tai+s4UiGUq1SVjr/tVnKD8laPgsZQvq+QaG+ilSVnyW1+tDHLwyX6ljryk="),
            var1.getPlayer(),
            var2,
            (Xqedii_344dfpu.Xqedii_23pkazknxxor3(979417253, 22) != 0)
         );
      }
   }

   public void Xqedii_2p98a7o(UltimateUIKeyEvent var1) {
      if (((519972279 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("N7J5NIT7yJNi+OeTaOR3OFbeN+WlycGdVPUeJfaRuHYpXw=="), var1);
         var2.Xqedii_2afs9at = Xqedii_3rjux1w(var1.getKey());
         var2.Xqedii_19v5iy3 = var1.isShift();
         List var3 = this.Xqedii_1hrsxi5.get(Xqedii_344dfpu.Xqedii_julonwejv4mf("N7J5NIT7yJNi+OeTaOR3OFbeN+WlycGdVPUeJfaRuHYpXw=="));
         if (var3 != null) {
            for (Xqedii_3tcqkw2 var5 : (Iterable<Xqedii_3tcqkw2>) (var3)) {

               if (var5.Xqedii_21qp861(var2.Xqedii_3rt5h0f) && (var5.Xqedii_2f871ze(var2.Xqedii_2afs9at) || var5.Xqedii_2f871ze(var1.getBaseKey()))) {
                  this.run(var5, var1.getPlayer(), null, var2, null);
               }
            }
         }
      }
   }

   public void Xqedii_2s56q5q(UltimateUIInputSubmitEvent var1) {
      if (((-1588730417 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = this.Xqedii_2jdoztn(Xqedii_344dfpu.Xqedii_julonwejv4mf("RpcgvOkGYaYSOYa62mODixyo34qV7wo//fB5fCwgflVpAYNVNpI="), var1);
         var2.Xqedii_lc1i2g8 = Xqedii_3rjux1w(var1.getInputId());
         var2.Xqedii_a9in0yy = Xqedii_3rjux1w(var1.getValue());
         var2.Xqedii_1p91ipf = Xqedii_3rjux1w(var1.getPreviousValue());
         this.Xqedii_21ptbt1(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("RpcgvOkGYaYSOYa62mODixyo34qV7wo//fB5fCwgflVpAYNVNpI="),
            var1.getPlayer(),
            var2,
            (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 5) != 0)
         );
      }
   }

   public void Xqedii_3it2h16(PlayerJoinEvent var1) {
      if (((1242566181 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_36oytze var2 = new Xqedii_36oytze(Xqedii_344dfpu.Xqedii_julonwejv4mf("OHRTN/ZPTeX5gxVCaL28K2PtYEqPGaeUSxvry+Y+dB6z59RZ"), var1);

         for (Xqedii_3tcqkw2 var4 : this.Xqedii_1hrsxi5
            .getOrDefault(Xqedii_344dfpu.Xqedii_julonwejv4mf("OHRTN/ZPTeX5gxVCaL28K2PtYEqPGaeUSxvry+Y+dB6z59RZ"), List.of())) {
            this.run(var4, var1.getPlayer(), null, var2, null);
         }
      }
   }

   public void Xqedii_3m8skc3(PlayerQuitEvent var1) {
      if ((-1394249880 * (-1394249880 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Player var2 = var1.getPlayer();
         Xqedii_36oytze var3 = new Xqedii_36oytze(Xqedii_344dfpu.Xqedii_julonwejv4mf("7dDXyBNtecrBORA6CpNzm0ibKYh1t2rdLHwr1CQ6VW2T5+N1"), var1);

         for (Xqedii_3tcqkw2 var5 : this.Xqedii_1hrsxi5
            .getOrDefault(Xqedii_344dfpu.Xqedii_julonwejv4mf("7dDXyBNtecrBORA6CpNzm0ibKYh1t2rdLHwr1CQ6VW2T5+N1"), List.of())) {
            this.run(var5, var2, null, var3, null);
         }

         this.Xqedii_18ebdik.remove(var2.getUniqueId());
         this.Xqedii_tr2wpfg.remove(var2.getUniqueId());
      }
   }

   public static String Xqedii_3rjux1w(String var0) {
      if ((-849256254 * -849256254 + -849256254 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 == null ? Xqedii_344dfpu.Xqedii_julonwejv4mf("C7ikLUHlueoJ8fmufibcp5aRhpUdvE9bGukFBg==") : var0;
      }
   }

   public void Xqedii_21ptbt1(String var1, Player var2, Xqedii_36oytze var3, boolean var4) {
      if (((1114258281 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         List var5 = this.Xqedii_1hrsxi5.get(var1);
         if (var5 != null && var2 != null) {
            for (Xqedii_3tcqkw2 var7 : (Iterable<Xqedii_3tcqkw2>) (var5)) {

               if (var7.Xqedii_21qp861(var3.Xqedii_3rt5h0f)) {
                  String var8 = this.Xqedii_32nippv(var7, var2, var3, var4);
                  if (var8 != null) {
                     var3.Xqedii_1z2rxkd = var8;
                     this.run(var7, var2, null, var3, null);
                  }
               }
            }
         }
      }
   }

   public String Xqedii_32nippv(Xqedii_3tcqkw2 var1, Player var2, Xqedii_36oytze var3, boolean var4) {
      if ((1725819694 * 1725819694 - 1725819694 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.Xqedii_2t32j8y == null) {
         return var3.Xqedii_lc1i2g8;
      } else if (var1.Xqedii_2f871ze(var3.Xqedii_lc1i2g8)) {
         return var3.Xqedii_lc1i2g8;
      } else if (var4 && !var3.Xqedii_lc1i2g8.isEmpty()) {
         if (var3.Xqedii_2f8w5mf == null) {
            ArrayList var5 = new ArrayList();
            if (UltimateUIAPI.isAvailable()) {
               String var6 = var3.Xqedii_lc1i2g8;
               LinkedHashSet var7 = new LinkedHashSet();

               while (var7.add(var6) && var5.size() < Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1369429146, 23)) {
                  String var8 = UltimateUIAPI.get().getElementParent(var2, var6);
                  if (var8 == null || var8.isEmpty()) {
                     break;
                  }

                  var5.add(var8);
                  var6 = var8;
               }
            }

            var3.Xqedii_2f8w5mf = var5;
         }

         for (String var10 : var3.Xqedii_2f8w5mf) {
            if (var1.Xqedii_2f871ze(var10)) {
               return var10;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public void run(Xqedii_3tcqkw2 var1, Player var2, CommandSender var3, Xqedii_36oytze var4, List<Object> var5) {
      if ((1511977868 * (1511977868 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_1yqm9k3 var6 = new Xqedii_1yqm9k3(this, var1.Xqedii_1swqvpn, var2, var3, var4, var5);
         this.Xqedii_10b4lvn(new Xqedii_y5pr2ec(var6, var1.Xqedii_fw60fwr, (Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 6) != 0)), this.Xqedii_aj0mxfz);
      }
   }

   public void Xqedii_10b4lvn(Xqedii_y5pr2ec var1, int var2) {
      if ((1172339673 * 1172339673 - 1172339673 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var2 == this.Xqedii_aj0mxfz) {
         Xqedii_1yqm9k3 var3 = var1.Xqedii_3a9kp91;

         try {
            boolean var4 = var1.run();
            var3.Xqedii_3u9m9cl();
            if (var4) {
               return;
            }

            long var5 = Math.max(Xqedii_344dfpu.Xqedii_15hg6uxjybve3(1565672827909915349L, 43), var1.Xqedii_1gzo1er);
            Runnable var7 = () -> {
               if ((-314010911 * (-314010911 + 1) & 1) != 0) {
                  throw new IllegalStateException();
               } else if (var3.Xqedii_1v4ue4a == null || var3.Xqedii_1v4ue4a.isOnline()) {
                  this.Xqedii_10b4lvn(var1, var2);
               }
            };
            if (var3.Xqedii_1v4ue4a != null) {
               Xqedii_38o2zes.Xqedii_2sj63w1(this.Xqedii_1bs4d2x, var3.Xqedii_1v4ue4a, var7, var5);
            } else {
               Xqedii_38o2zes.Xqedii_3npx6fi(this.Xqedii_1bs4d2x, var7, var5);
            }
         } catch (Xqedii_3vsk7zm var9) {
            try {
               var3.Xqedii_3u9m9cl();
            } catch (RuntimeException var8) {
            }

            this.Xqedii_3kgc99t(var3.Xqedii_2q97y6i, var9);
         } catch (RuntimeException var10) {
            this.Xqedii_3kgc99t(var3.Xqedii_2q97y6i, new Xqedii_3vsk7zm(Xqedii_tcfzmwdb4z5o(String.valueOf(var10)), var1.Xqedii_18k2h4u));
         }
      }
   }

   public void Xqedii_1hvc3pb() {
      if ((1125798620 * 1125798620 + 1125798620 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_140q75q = (Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993946, 8) != 0);
         int var1 = this.Xqedii_aj0mxfz;
         Xqedii_38o2zes.Xqedii_3npx6fi(this.Xqedii_1bs4d2x, () -> {
            if (((1327570003 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               this.Xqedii_2z1vkt1(var1);
            }
         }, Xqedii_344dfpu.Xqedii_2dww6h28cx16q(7297352749240238283L, 9));
      }
   }

   public void Xqedii_2z1vkt1(int var1) {
      if ((688695604 ^ 688695604) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_140q75q && var1 == this.Xqedii_aj0mxfz) {
         this.Xqedii_1zrzxna = this.Xqedii_1zrzxna + Xqedii_344dfpu.Xqedii_1qfa9u49jo3xv(4842612877476493316L, 17);

         for (Xqedii_3tcqkw2 var3 : this.Xqedii_3c71sgp) {
            if (this.Xqedii_1zrzxna % var3.Xqedii_3gg5za6 == Xqedii_344dfpu.Xqedii_1qfa9u49jo3xv(4842612877476362244L, 9)) {
               if (var3.Xqedii_nyxmub2 == null) {
                  this.run(
                     var3,
                     null,
                     Bukkit.getConsoleSender(),
                     new Xqedii_36oytze(Xqedii_344dfpu.Xqedii_julonwejv4mf("QQjjV42JuiwlPzKt7TbxnNlkXSuKTWsphoYsYiUOCG9ME3u1Sio="), null),
                     null
                  );
               } else {
                  for (Player var5 : Bukkit.getOnlinePlayers()) {
                     Xqedii_38o2zes.Xqedii_1avvt9e(
                        this.Xqedii_1bs4d2x,
                        var5,
                        () -> {
                           if ((-1644959049 * -1644959049 - -1644959049 & 1) != 0) {
                              throw new IllegalStateException();
                           } else if (var1 == this.Xqedii_aj0mxfz && UltimateUIAPI.isAvailable()) {
                              String var4 = UltimateUIAPI.get().getOpenGuiName(var5);
                              if (var4 != null && var4.equalsIgnoreCase(var3.Xqedii_nyxmub2)) {
                                 Xqedii_36oytze var5x = new Xqedii_36oytze(
                                    Xqedii_344dfpu.Xqedii_julonwejv4mf("QQjjV42JuiwlPzKt7TbxnNlkXSuKTWsphoYsYiUOCG9ME3u1Sio="), null
                                 );
                                 var5x.Xqedii_3rt5h0f = var4;
                                 this.run(var3, var5, null, var5x, null);
                              }
                           }
                        }
                     );
                  }
               }
            }
         }

         if (!this.Xqedii_tr2wpfg.isEmpty()) {
            this.Xqedii_2vdmdmn(var1);
         }

         if (this.Xqedii_1zrzxna % Xqedii_344dfpu.Xqedii_1qfa9u49jo3xv(4842612877476353764L, 1)
            == Xqedii_344dfpu.Xqedii_1qfa9u49jo3xv(4842612877476362244L, 17)) {
            this.Xqedii_2ux70w3();
         }

         Xqedii_38o2zes.Xqedii_3npx6fi(this.Xqedii_1bs4d2x, () -> {
            if ((1098663798 * (1098663798 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               this.Xqedii_2z1vkt1(var1);
            }
         }, Xqedii_344dfpu.Xqedii_opgogeqb5vk0(-8617562204412081572L, 63));
      }
   }

   public String Xqedii_14ikmfz(Player var1, String var2) {
      if (((501228839 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var2 != null && var2.indexOf(Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(739225272, 18)) >= 0 && UltimateUIAPI.isAvailable()
            ? UltimateUIAPI.get().resolvePlaceholders(var1, var2)
            : var2;
      }
   }

   public Map<String, Object> Xqedii_1u89z52(Player var1) {
      if ((-351655609 * -351655609 + -351655609 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_18ebdik.computeIfAbsent(var1.getUniqueId(), var0 -> {
            if ((-657450731 * -657450731 - -657450731 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return new LinkedHashMap<>();
            }
         });
      }
   }

   public Map<String, Object> Xqedii_nm0vadd(Player var1) {
      if (((802900379 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.data.computeIfAbsent(var1.getUniqueId(), var0 -> {
            if (((-527014500 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return new LinkedHashMap<>();
            }
         });
      }
   }

   public Map<String, Object> Xqedii_2e6s6rg() {
      if ((755832568 * 755832568 - 755832568 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2gg9i2g;
      }
   }

   public void Xqedii_34ytbys(Xqedii_1kffk3z var1, int var2, String var3) {
      if (((-2083953206 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1bs4d2x.getLogger().info(Xqedii_1e6i7in93boo2(var1.Xqedii_1gnbwtp, var2, var3));
      }
   }

   public void Xqedii_3kgc99t(Xqedii_1kffk3z var1, Xqedii_3vsk7zm var2) {
      if (((2083691932 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var3 = var1 == null ? Xqedii_344dfpu.Xqedii_julonwejv4mf("8iiGsPW6/8EgnkA/Kr3/UOM7P/ZZRGBII1ITC19TZzTUuyByV+QCQA==") : var1.Xqedii_1gnbwtp;
         String var4 = Xqedii_8pdvollsugc1(var3, var2.Xqedii_2ei61uy(), var2.getMessage());
         long var5 = System.currentTimeMillis();
         Long var7 = this.Xqedii_2evhzeq.get(var4);
         if (var7 == null || var5 - var7 >= Xqedii_344dfpu.Xqedii_2dww6h28cx16q(-3790547199833448094L, 1)) {
            this.Xqedii_2evhzeq.put(var4, var5);
            if (this.Xqedii_2evhzeq.size() > Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-329597012, 6)) {
               this.Xqedii_2evhzeq.clear();
            }

            this.Xqedii_1bs4d2x.getLogger().warning(Xqedii_a0xrmet1n0d8(var3, var2.Xqedii_2ei61uy(), var2.getMessage()));

            for (Player var9 : Bukkit.getOnlinePlayers()) {
               if (var9.hasPermission(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("a2cJx1r7Lq2PN23kvWRwpA5Umgvd6qU/k64rcj4MgPxJbw9vSEkLAdIvRiwgNcnJ+NznK+40WDkG0oji7OI=")
               )) {
                  String var10001 = Xqedii_344dfpu.Xqedii_julonwejv4mf(
                     "63hSQNr3xlFEN9D7j2UgIBIsWr5qk4VbQbRQi4sfhEgT/DBihzo+KDK4BU7vpA/IfyiIANqC3Vqh3irf6quPjhcNSXQ/334zq9IX+UXPODKrOGRF7rxIZRc3CDmFeA=="
                  );
                  Object[] var10002 = new Object[Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993626, 6)];
                  var10002[Xqedii_344dfpu.Xqedii_23pkazknxxor3(193614758, 2)] = var3;
                  var10002[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 1)] = var2.Xqedii_2ei61uy();
                  var10002[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-55332501, 24)] = var2.getMessage();
                  Xqedii_3ul4hqj.Xqedii_2dtmver(var9, var10001, var10002);
               }
            }
         }
      }
   }

   public void Xqedii_1wahnsk(CommandSender var1, Xqedii_1zgvf22 var2) {
      if ((653027969 * 653027969 + 653027969 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!var2.errors().isEmpty()) {
         ArrayList var3 = new ArrayList();
         int var4 = Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-671258782, 17);

         for (Xqedii_3jb0tcl var6 : var2.errors()) {
            if (var4++ >= Xqedii_344dfpu.Xqedii_23pkazknxxor3(2059497802, 23)) {
               String var7 = Xqedii_344dfpu.Xqedii_julonwejv4mf(
                  "VWC0wyQhm5xGxRs3wygbaChmQiDaWaDddEsp3JqqynIKrf1NRelUhQiHMnazy2vhAx1swgE0Yw4ZciqHh+suzfCRcumMfGPfHh1IkmoJf8++fZHi6xXLX90foYCMEQ=="
               );
               Object[] var9 = new Object[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 28)];
               var9[Xqedii_344dfpu.Xqedii_o5hmly3nit02(-1100993690, 22)] = var2.errors().size() - Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662280, 4);
               var3.add(Xqedii_3ul4hqj.Xqedii_l0arb10(var7, var9));
               break;
            }

            String var10001 = Xqedii_344dfpu.Xqedii_julonwejv4mf("xoBqDlv3UgniNuV1W6v4cdrzXd9iWpgaf2l9gf1eYfUYH8+Th0o2nSLt6QzSufff/x03IBHkY7csme2g9sY=");
            Object[] var10002 = new Object[Xqedii_344dfpu.Xqedii_23pkazknxxor3(-2099079956, 0)];
            var10002[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-329580628, 6)] = var6.file();
            var10002[Xqedii_344dfpu.Xqedii_23pkazknxxor3(-493557118, 8)] = var6.error().Xqedii_2ei61uy();
            var10002[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-825905166, 2)] = var6.error().getMessage();
            var3.add(Xqedii_3ul4hqj.Xqedii_l0arb10(var10001, var10002));
         }

         String var8 = Xqedii_344dfpu.Xqedii_julonwejv4mf(
            "/Ttq0OHNJtQT/eT4XgHMPN81UFg8NBSJd768Xw8zWIimSl8tpMrOSeifJcLNB6Se28H0WMc5ooYVUrkz4bU9AWgV0M4o2iTX6cY2z8dgC5duxRyDbJU="
         );
         Object[] var10 = new Object[Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-329580564, 6)];
         var10[Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(-748662457, 21)] = var2.errors().size();
         Xqedii_3ul4hqj.Xqedii_wmipi15(var1, Xqedii_3ul4hqj.Xqedii_l0arb10(var8, var10), var3);
      }
   }

   public void Xqedii_woa4jl4(Xqedii_1zgvf22 var1) {
      if ((-888258372 ^ -888258372) != 0) {
         throw new IllegalStateException();
      } else {
         for (Xqedii_3jb0tcl var3 : var1.errors()) {
            this.Xqedii_1bs4d2x
               .getLogger()
               .warning(
                  Xqedii_2qf972rv0xc2m(
                     var3.file(),
                     var3.error().Xqedii_2ei61uy(),
                     var3.error().Xqedii_1rkxiyu() > 0
                        ? Xqedii_2p5wcdd3xgzr5(var3.error().Xqedii_1rkxiyu())
                        : Xqedii_344dfpu.Xqedii_julonwejv4mf("C7ikLUHlueoJ8fmufibcp5aRhpUdvE9bGukFBg=="),
                     var3.error().getMessage()
                  )
               );
         }
      }
   }

   public void Xqedii_2yvqp6m() {
      if (((-325449909 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_73sb6rc.isFile()) {
         YamlConfiguration var1 = YamlConfiguration.loadConfiguration(this.Xqedii_73sb6rc);
         ConfigurationSection var2 = var1.getConfigurationSection(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("r+kL+MOL501KYryo9eYo3PVgjYqXTHjGXwv/QpzvKkzo6rm2Cl5gsxR1")
         );
         if (var2 != null) {
            for (String var4 : var2.getKeys((Xqedii_344dfpu.Xqedii_23pkazknxxor3(811356829, 29) != 0))) {
               try {
                  ConfigurationSection var5 = var2.getConfigurationSection(var4);
                  if (var5 != null) {
                     this.data.put(UUID.fromString(var4), this.Xqedii_j4z1k5h(var5));
                  }
               } catch (IllegalArgumentException var6) {
               }
            }
         }

         ConfigurationSection var7 = var1.getConfigurationSection(
            Xqedii_344dfpu.Xqedii_julonwejv4mf("udoRNEgZduTEPlWq4ZvgKPtEIKpeQHJJe+/fP9cO4Bi9AYgX2oTzlQ==")
         );
         if (var7 != null) {
            this.Xqedii_2gg9i2g.putAll(this.Xqedii_j4z1k5h(var7));
         }
      }
   }

   public Map<String, Object> Xqedii_j4z1k5h(ConfigurationSection var1) {
      if ((-522134066 * -522134066 - -522134066 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (String var4 : var1.getKeys((Xqedii_344dfpu.Xqedii_23pkazknxxor3(701695429, 17) != 0))) {
            var2.put(var4, this.Xqedii_gnyai36(var1.get(var4)));
         }

         return var2;
      }
   }

   public Object Xqedii_gnyai36(Object var1) {
      if (((-1677021169 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 instanceof ConfigurationSection var8) {
         return this.Xqedii_j4z1k5h(var8);
      } else if (var1 instanceof Number var7) {
         return var7.doubleValue();
      } else if (var1 instanceof List var6) {
         ArrayList var9 = new ArrayList(var6.size());

         for (Object var11 : var6) {
            var9.add(this.Xqedii_gnyai36(var11));
         }

         return var9;
      } else if (!(var1 instanceof Map var2)) {
         return var1;
      } else {
         LinkedHashMap var3 = new LinkedHashMap();

         for (Entry var5 : (Iterable<Entry>) (var2.entrySet())) {

            var3.put(String.valueOf(var5.getKey()), this.Xqedii_gnyai36(var5.getValue()));
         }

         return var3;
      }
   }

   public YamlConfiguration Xqedii_255w5ti() {
      if (((-217908466 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var1 = new YamlConfiguration();

         for (Entry var3 : this.data.entrySet()) {
            if (!((Map)var3.getValue()).isEmpty()) {
               var1.createSection(Xqedii_1t2fhcem4d4u3(String.valueOf(var3.getKey())), this.Xqedii_r38f8rh((Map<String, Object>)var3.getValue()));
            }
         }

         synchronized (this.Xqedii_2gg9i2g) {
            if (!this.Xqedii_2gg9i2g.isEmpty()) {
               var1.createSection(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf("udoRNEgZduTEPlWq4ZvgKPtEIKpeQHJJe+/fP9cO4Bi9AYgX2oTzlQ=="), this.Xqedii_r38f8rh(this.Xqedii_2gg9i2g)
               );
            }

            return var1;
         }
      }
   }

   public Map<String, Object> Xqedii_r38f8rh(Map<String, Object> var1) {
      if ((1409835211 * (1409835211 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (int var2 = Xqedii_344dfpu.Xqedii_2w8hk59nkxd8r(-696898177, 29); var2 < Xqedii_344dfpu.Xqedii_23pkazknxxor3(-326966636, 24); var2++) {
            try {
               return (Map<String, Object>)Xqedii_z4wg071.Xqedii_3ujolw5(var1);
            } catch (ConcurrentModificationException var4) {
            }
         }

         return new LinkedHashMap<>();
      }
   }

   public void Xqedii_1dijqtn() {
      if ((1575007256 * 1575007256 - 1575007256 & 1) != 0) {
         throw new IllegalStateException();
      } else if (!this.data.isEmpty() || !this.Xqedii_2gg9i2g.isEmpty() || this.Xqedii_73sb6rc.exists()) {
         try {
            this.Xqedii_255w5ti().save(this.Xqedii_73sb6rc);
         } catch (IOException var2) {
            this.Xqedii_1bs4d2x.getLogger().warning(Xqedii_3bkbf3sf0gbil(var2.getMessage()));
         }
      }
   }

   public void Xqedii_2ux70w3() {
      if (((-87638339 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.data.isEmpty() || !this.Xqedii_2gg9i2g.isEmpty()) {
         YamlConfiguration var1 = this.Xqedii_255w5ti();
         Xqedii_38o2zes.Xqedii_u043a3q(this.Xqedii_1bs4d2x, () -> {
            if (((-2044513549 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               try {
                  var1.save(this.Xqedii_73sb6rc);
               } catch (IOException var3) {
                  this.Xqedii_1bs4d2x.getLogger().warning(Xqedii_ep70tsrdheuz(var3.getMessage()));
               }
            }
         });
      }
   }

   public CommandMap Xqedii_1cr6e10() {
      if ((-272208460 * -272208460 - -272208460 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var1 = Bukkit.getServer();
            return var1.getClass()
                  .getMethod(Xqedii_344dfpu.Xqedii_julonwejv4mf("0FlCalQ4x9YT69q10Zw1C02bXbw3g6sQqhu1vQBNtNfB8RUDEEgnKk7AR8bd3FQiZl16BaML"))
                  .invoke(var1) instanceof CommandMap var3
               ? var3
               : null;
         } catch (RuntimeException | ReflectiveOperationException var4) {
            return null;
         }
      }
   }

   public void Xqedii_2am6bju() {
      if ((-856937117 ^ -856937117) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_2u229x4.isEmpty()) {
         CommandMap var1 = this.Xqedii_1cr6e10();
         if (var1 == null) {
            this.Xqedii_1bs4d2x
               .getLogger()
               .warning(
                  Xqedii_344dfpu.Xqedii_julonwejv4mf(
                     "3aodJTw2Mc7jZMOLLy0QDAubtLKYQAo+4L+60HTC4c0trqaeEaBcsz0Rz7aYV17ptiLCbgcfY6VTKD+uw9najwhuivMlJi6Bib0wCRbB8hrgem1NWG80B0oQl38wYdGqEG8MxobwlOd0dj32gAG8jzoFOGwiNFHjGgX9Um4xyl6JD936GWu06B4Wa2lDRgxzjW9GZ6av2FzG3Gq3Lvu61UjF16M="
                  )
               );
         } else {
            for (Xqedii_bflxzg9 var3 : this.Xqedii_2u229x4.values()) {
               var1.register(Xqedii_344dfpu.Xqedii_julonwejv4mf("syizh/U2W+d+rMFETJQjxelH9lL98bLyF8X8Rb6OCx874APo0ELbzIKSlBCQxUuq"), var3);
            }

            this.syncCommands();
         }
      }
   }

   public void Xqedii_3d4ydyl() {
      if ((-483108812 ^ -483108812) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_2u229x4.isEmpty()) {
         CommandMap var1 = this.Xqedii_1cr6e10();

         for (Xqedii_bflxzg9 var3 : this.Xqedii_2u229x4.values()) {
            if (var1 == null) {
               break;
            }

            var3.unregister(var1);

            try {
               if (var1.getClass()
                  .getMethod(Xqedii_344dfpu.Xqedii_julonwejv4mf("jjxXXR5qwndNATlUMH+5jKgIzkPXa678QSohT3JPb8JhiHGT9D1RwDWVoVv4cz1cDL+v/0T3nCYj6XAB"))
                  .invoke(var1) instanceof Map var5) {
                  var5.values()
                     .removeIf(
                        var1x -> {
                           if ((-1632092235 * -1632092235 - -1632092235 & 1) != 0) {
                              throw new IllegalStateException();
                           } else {
                              return ((var1x == var3
                                 ? Xqedii_344dfpu.Xqedii_2aydf5dsbd1mk(748662456, 16)
                                 : Xqedii_344dfpu.Xqedii_23pkazknxxor3(1622713658, 30)) != 0);
                           }
                        }
                     );
               }
            } catch (RuntimeException | ReflectiveOperationException var6) {
            }
         }

         this.Xqedii_2u229x4.clear();
         this.syncCommands();
      }
   }

   public void syncCommands() {
      if (((-297438825 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var1 = Bukkit.getServer();
            var1.getClass()
               .getMethod(Xqedii_344dfpu.Xqedii_julonwejv4mf("q+gfgBbuHhkQlmEkppfgqFaqpay3VzDv1AsvQASt3/s4b98sHnojYBqP4Si/yuGURgQw8Q=="))
               .invoke(var1);
         } catch (RuntimeException | ReflectiveOperationException var5) {
         }

         for (Player var2 : Bukkit.getOnlinePlayers()) {
            try {
               var2.updateCommands();
            } catch (RuntimeException var4) {
            }
         }
      }
   }

   private static /* synthetic */ String Xqedii_2cpve3e2scybj(String string) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("MMQbnWSAS3GGcUbJEn8ZC9Esq7QaCqcYDzGffgQ6i6P14QkYiSH+ByXAflMWXbgPPa+gWcf9wnftyPTZKP/lD6wzCb9NIdrfQjkxCBEM") + string;
    }

    private static /* synthetic */ String Xqedii_tcfzmwdb4z5o(String string) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("l6ELSeG6CjYWERnSyQE1sSUSfiiTmnqUEVxzy1xJUMRSlMfOA91rhBF0JKPSN6jrkuEpbWgSklPgCIyt") + string;
    }

    private static /* synthetic */ String Xqedii_1e6i7in93boo2(String string, int n, String string2) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("GPjCx/bL4RpAWFxdLE+1fw2pbT57e/VYoZqZwffY") + string + Xqedii_344dfpu.Xqedii_julonwejv4mf("oEyIRuKncSwQFzmezqDgCa4gayu/0iRKA3QAWbQi") + n + Xqedii_344dfpu.Xqedii_julonwejv4mf("CsWMwDW3G5U8KDFiR+75AW0oxRCCxNM0W4M64IhlF70=") + string2;
    }

    private static /* synthetic */ String Xqedii_8pdvollsugc1(String string, int n, String string2) {
        return string + Xqedii_344dfpu.Xqedii_julonwejv4mf("oEyIRuKncSwQFzmezqDgCa4gayu/0iRKA3QAWbQi") + n + Xqedii_344dfpu.Xqedii_julonwejv4mf("oEyIRuKncSwQFzmezqDgCa4gayu/0iRKA3QAWbQi") + string2;
    }

    private static /* synthetic */ String Xqedii_a0xrmet1n0d8(String string, int n, String string2) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("hx+gzRoi0qlOQx0wdnGaqugZ9TIMrnJSTolxTUtuHuF5ouStQpMcwGpE5CsfM9JToSqzvwlVAhscsITM") + string + Xqedii_344dfpu.Xqedii_julonwejv4mf("X2fPZdhwz7ST4nHezMRMgyFm2sYIbjdsnixw50EWeft4VwdAJ4gGuQ==") + n + Xqedii_344dfpu.Xqedii_julonwejv4mf("BuobtT7SthfgoGzhhn2Y/4ynMQPRAp+gb2NrZjWJ4Zo=") + string2;
    }

    private static /* synthetic */ String Xqedii_2p5wcdd3xgzr5(int n) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("oEyIRuKncSwQFzmezqDgCa4gayu/0iRKA3QAWbQi") + n;
    }

    private static /* synthetic */ String Xqedii_2qf972rv0xc2m(String string, int n, String string2, String string3) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("hx+gzRoi0qlOQx0wdnGaqugZ9TIMrnJSTolxTUtuHuF5ouStQpMcwGpE5CsfM9JToSqzvwlVAhscsITM") + string + Xqedii_344dfpu.Xqedii_julonwejv4mf("X2fPZdhwz7ST4nHezMRMgyFm2sYIbjdsnixw50EWeft4VwdAJ4gGuQ==") + n + string2 + Xqedii_344dfpu.Xqedii_julonwejv4mf("BuobtT7SthfgoGzhhn2Y/4ynMQPRAp+gb2NrZjWJ4Zo=") + string3;
    }

    private static /* synthetic */ String Xqedii_1t2fhcem4d4u3(String string) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("Rlo6JwifZHpLg1ZUGLzC3B9wY4W70D20+d2O1Y5KqWD4DbQhQglXOTwH+LQ=") + string;
    }

    private static /* synthetic */ String Xqedii_3bkbf3sf0gbil(String string) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("i4KKMQcZaeoqaX/bK3OENE7A0gEDGUF16fs7omZORGu6eALUNlD5vbBNdDBCZL7X4G25mL0YqFKuaqVe1PtqVh6Cm6RBTlFiSigXo/lFtqGtiyeRKLCZjaCeSVM=") + string;
    }

    private static /* synthetic */ String Xqedii_ep70tsrdheuz(String string) {
        return Xqedii_344dfpu.Xqedii_julonwejv4mf("i4KKMQcZaeoqaX/bK3OENE7A0gEDGUF16fs7omZORGu6eALUNlD5vbBNdDBCZL7X4G25mL0YqFKuaqVe1PtqVh6Cm6RBTlFiSigXo/lFtqGtiyeRKLCZjaCeSVM=") + string;
    }
}
