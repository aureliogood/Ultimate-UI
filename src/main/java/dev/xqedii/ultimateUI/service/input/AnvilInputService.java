package dev.xqedii.ultimateUI.service.input;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1ig2hdv;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import dev.xqedii.ultimateUI.Xqedii_3alg69t;
import dev.xqedii.ultimateUI.Xqedii_3te89ca;
import dev.xqedii.ultimateUI.service.camera.CameraService;
import dev.xqedii.ultimateUI.service.gui.GuiService;
import dev.xqedii.ultimateUI.util.PlatformCompat;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.ItemStack;

public final class AnvilInputService {
   public static final String Xqedii_ocy44z95rff0 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final UltimateUI Xqedii_24c4lhf;
   public final Map<UUID, AnvilInputSession> Xqedii_2ex3kpo = new ConcurrentHashMap<>();
   public final Map<UUID, PlatformCompat.CancellableTask> Xqedii_1pufgqp = new ConcurrentHashMap<>();
   public final Set<UUID> Xqedii_cckmm0f = ConcurrentHashMap.newKeySet();
   public Xqedii_3alg69t Xqedii_3f98vvz;

   public AnvilInputService(UltimateUI var1) {
      this.Xqedii_24c4lhf = var1;
   }

   public void enable() {
      if ((1957842220 ^ 1957842220) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_3f98vvz == null) {
         if (!Xqedii_1ig2hdv.Xqedii_2y78c8j()) {
            this.Xqedii_24c4lhf
               .getLogger()
               .warning(
                  Xqedii_3te89ca.Xqedii_3uattssdovopu(
                     "2L2ykT6f8gqA6UzyjedD2pYXhk1bz8R3a+mCt7cir6gIjZqX2W/dDVvxCStN4/dkEndfjOhnRiTHYL6V1Zm1ONT++K0TEQvqst+ZQ4QvUD1AiaGiniAmMJQLnQ+1JhJOlLZZdm/4KkI+n3/ySD0GLsdnUEmIA0ldMOYZAD3AcYT//mPVPPr0m6Q76r5c2vbgU3t88AuLIHFLdeaBGVkJBGza3chYzbkW"
                  )
               );
         } else {
            this.Xqedii_3f98vvz = new Xqedii_3alg69t(this);

            try {
               this.Xqedii_24c4lhf.getServer().getPluginManager().registerEvents(this.Xqedii_3f98vvz, this.Xqedii_24c4lhf);
            } catch (Throwable var2) {
               this.Xqedii_3f98vvz = null;
               this.Xqedii_24c4lhf.getLogger().warning(Xqedii_2ffv9guf5u3fb(var2.getMessage()));
            }
         }
      }
   }

   public void disable() {
      if ((263023662 * 263023662 + 263023662 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.closeAll(InputCloseReason.PROGRAMMATIC);
         if (this.Xqedii_3f98vvz != null) {
            try {
               HandlerList.unregisterAll(this.Xqedii_3f98vvz);
            } catch (Throwable var2) {
            }

            this.Xqedii_3f98vvz = null;
         }
      }
   }

   public AnvilInputSession open(Player var1, AnvilInputRequest var2) {
      if (((1218322429 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null || !var1.isOnline()) {
         return null;
      } else if (!Xqedii_1ig2hdv.Xqedii_2y78c8j()) {
         return null;
      } else {
         this.close(var1, InputCloseReason.PROGRAMMATIC);
         String var3 = Xqedii_1zf15x9(var2.filter().sanitize(var2.initial()), var2.maxLength());
         AnvilInputSession var4 = new AnvilInputSession(var1.getUniqueId(), var2, var3);
         this.Xqedii_2ex3kpo.put(var1.getUniqueId(), var4);
         if (Xqedii_38o2zes.Xqedii_269v6yv(var1)) {
            if (!this.Xqedii_c830bul(var1, var4, (Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 22) != 0))) {
               return null;
            }
         } else {
            Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_24c4lhf, var1, () -> {
               if (((-257971099 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  this.Xqedii_c830bul(var1, var4, (Xqedii_3te89ca.Xqedii_3brssdb5ozwph(1609066991, 12) != 0));
               }
            });
         }

         return var4;
      }
   }

   public boolean open(Player var1, String var2, String var3, Consumer<String> var4, Runnable var5) {
      if ((1838262101 * (1838262101 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.open(var1, var2, var3, null, var4, var5);
      }
   }

   public boolean open(Player var1, String var2, String var3, Consumer<String> var4, Consumer<String> var5, Runnable var6) {
      if ((1034258151 * (1034258151 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.open(
            var1,
            var2,
            var3,
            Xqedii_3te89ca.Xqedii_wlthnvnubk8z(899280754, 15),
            null,
            (Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642352, 1) != 0),
            var4,
            var5,
            var6
         );
      }
   }

   public boolean open(Player var1, String var2, String var3, int var4, String var5, boolean var6, Consumer<String> var7, Consumer<String> var8, Runnable var9) {
      if ((-175706631 * -175706631 + -175706631 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputRequest.Builder var10 = AnvilInputRequest.builder().title(var2).initial(var3).maxLength(var4).filter(var5).allowEmpty(var6);
         if (var7 != null) {
            var10.onChange(var7);
         }

         if (var8 != null) {
            var10.onCommit(var8);
         }

         if (var9 != null) {
            var10.onCancel(var9);
         }

         return ((this.open(var1, var10.build()) != null
            ? Xqedii_3te89ca.Xqedii_1l0rrcbr5k7l4(-345658796, 18)
            : Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 25)) != 0);
      }
   }

   public boolean Xqedii_c830bul(Player var1, AnvilInputSession var2, boolean var3) {
      if ((1568967778 * 1568967778 + 1568967778 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1.isOnline() && this.Xqedii_2ex3kpo.get(var1.getUniqueId()) == var2) {
         this.Xqedii_cckmm0f.add(var1.getUniqueId());
         this.Xqedii_1szlurw(var1);

         boolean var4;
         try {
            ItemStack var5 = Xqedii_1ig2hdv.Xqedii_35vh4et(var2.value());
            var4 = Xqedii_1ig2hdv.Xqedii_3uhcrgn(var1, var2.request().title(), var5);
         } catch (Throwable var9) {
            var4 = (Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 3) != 0);
         } finally {
            this.Xqedii_cckmm0f.remove(var1.getUniqueId());
         }

         if (!var4) {
            this.Xqedii_2ex3kpo.remove(var1.getUniqueId(), var2);
            this.Xqedii_2htagpw(var1);
            if (var3) {
               this.Xqedii_2ux18gd(var1, var2, var2.value(), InputCloseReason.PROGRAMMATIC, (Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 30) != 0));
            }

            return (Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 10) != 0);
         } else {
            var2.Xqedii_3md9ie3((Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897773426, 17) != 0));
            var2.Xqedii_308m5bt((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(119610444, 23) != 0));
            this.Xqedii_2hogh59(var1, var2, var2.value());
            Xqedii_1ig2hdv.Xqedii_mucytq3(var1);
            this.Xqedii_11si0av(var1);
            Xqedii_38o2zes.Xqedii_2sj63w1(this.Xqedii_24c4lhf, var1, () -> {
               if ((1233631008 * 1233631008 - 1233631008 & 1) != 0) {
                  throw new IllegalStateException();
               } else {
                  if (var1.isOnline() && this.Xqedii_2ex3kpo.get(var1.getUniqueId()) == var2) {
                     this.Xqedii_11si0av(var1);
                  }
               }
            }, Xqedii_3te89ca.Xqedii_k31kmgochq91(5127738211357199344L, 14));
            this.Xqedii_2uz6ig4(var1, var2);
            return (Xqedii_3te89ca.Xqedii_1l0rrcbr5k7l4(-1487196846, 13) != 0);
         }
      } else {
         return (Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 8) != 0);
      }
   }

   public Optional<AnvilInputSession> session(Player var1) {
      if ((1034467317 * 1034467317 - 1034467317 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 == null ? Optional.empty() : Optional.ofNullable(this.Xqedii_2ex3kpo.get(var1.getUniqueId()));
      }
   }

   public boolean isActive(Player var1) {
      if (((-2005664836 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2ex3kpo.containsKey(var1.getUniqueId())
            ? Xqedii_3te89ca.Xqedii_py6cl95r1rzg(-2132532343, 20)
            : Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 10)) != 0);
      }
   }

   public String value(Player var1) {
      if ((754320775 * (754320775 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputSession var2 = var1 == null ? null : this.Xqedii_2ex3kpo.get(var1.getUniqueId());
         return var2 == null ? null : var2.value();
      }
   }

   public boolean setText(Player var1, String var2) {
      if ((702786418 * 702786418 + 702786418 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputSession var3 = var1 == null ? null : this.Xqedii_2ex3kpo.get(var1.getUniqueId());
         if (var3 != null && var3.isWritable()) {
            String var4 = Xqedii_1zf15x9(var3.request().filter().sanitize(var2), var3.request().maxLength());
            if (var4.equals(var3.value())) {
               return (Xqedii_3te89ca.Xqedii_py6cl95r1rzg(807175281, 17) != 0);
            } else {
               var3.Xqedii_14p58hk(var4);
               var3.Xqedii_3f5pgij();
               this.Xqedii_2hogh59(var1, var3, var4);
               this.Xqedii_1us29ci(var1, var3, var4);
               return (Xqedii_3te89ca.Xqedii_wlthnvnubk8z(629206898, 28) != 0);
            }
         } else {
            return (Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 16) != 0);
         }
      }
   }

   public void cancel(Player var1) {
      if ((-445050195 ^ -445050195) != 0) {
         throw new IllegalStateException();
      } else {
         this.close(var1, InputCloseReason.PROGRAMMATIC);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void close(Player var1, InputCloseReason var2) {
      if ((-2096649589 * (-2096649589 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         AnvilInputSession var3 = this.Xqedii_2ex3kpo.remove(var1.getUniqueId());
         if (var3 != null) {
            var3.Xqedii_308m5bt((Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 2) != 0));
            var3.Xqedii_3md9ie3((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(63999526, 22) != 0));
            this.Xqedii_23no5xe(var1.getUniqueId());
            var3.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(474744609, 7) != 0));
            boolean var14 = false /* VF: Semaphore variable */;

            label124: {
               label123: {
                  try {
                     var14 = true;
                     Xqedii_1ig2hdv.Xqedii_ycmvisi(var1);
                     var14 = false;
                     break label123;
                  } catch (Throwable var16) {
                     var14 = false;
                  } finally {
                     if (var14) {
                        var3.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_1l0rrcbr5k7l4(1251830837, 7) != 0));
                     }
                  }

                  var3.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(-198997632, 28) != 0));
                  break label124;
               }

               var3.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 24) != 0));
            }

            String var4 = var3.value();
            AnvilInputRequest var5 = var3.request();
            int var6 = var2 == InputCloseReason.ESCAPE && var5.commitEditsOnEscape() && !var4.equals(var3.Xqedii_2qoba9h())
               ? Xqedii_3te89ca.Xqedii_3brssdb5ozwph(1609066991, 26)
               : Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 2);
            int var7 = !var2.isCommit() && var6 == 0 || !var5.allowEmpty() && var4.isBlank()
               ? Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 31)
               : Xqedii_3te89ca.Xqedii_py6cl95r1rzg(-2132532343, 20);
            this.Xqedii_2ux18gd(var1, var3, var4, var2, (var7 != 0));
            if (var2 != InputCloseReason.DISCONNECT && var1.isOnline()) {
               boolean var8 = (var2 != InputCloseReason.ESCAPE
                  ? Xqedii_3te89ca.Xqedii_py6cl95r1rzg(119610444, 23)
                  : Xqedii_3te89ca.Xqedii_py6cl95r1rzg(-795990525, 30)) != 0;
               Runnable var9 = () -> {
                  if ((-428612774 * -428612774 - -428612774 & 1) != 0) {
                     throw new IllegalStateException();
                  } else if (var1.isOnline() && !this.Xqedii_2ex3kpo.containsKey(var1.getUniqueId())) {
                     if (var8) {
                        this.Xqedii_3nda0do(var1);
                     }

                     this.Xqedii_2htagpw(var1);
                     var1.updateInventory();
                     this.Xqedii_11si0av(var1);
                  }
               };

               try {
                  Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_24c4lhf, var1, var9);
               } catch (Throwable var15) {
                  var9.run();
               }
            } else {
               this.Xqedii_2htagpw(var1);
            }
         }
      }
   }

   public void Xqedii_1szlurw(Player var1) {
      if ((914952860 * 914952860 + 914952860 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         CameraService var2 = this.Xqedii_24c4lhf.getCameraService();
         if (var2 != null) {
            var2.holdAnvilScreenMask(var1);
         }
      }
   }

   public void Xqedii_11si0av(Player var1) {
      if (((403328505 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         CameraService var2 = this.Xqedii_24c4lhf.getCameraService();
         GuiService var3 = this.Xqedii_24c4lhf.getGuiService();
         if (var2 != null && var3 != null && var2.isCameraActive(var1)) {
            var3.reapplyClientHotbarAir(var1);
         }
      }
   }

   public void Xqedii_2htagpw(Player var1) {
      if (((1009945709 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         CameraService var2 = this.Xqedii_24c4lhf.getCameraService();
         if (var2 != null) {
            var2.releaseAnvilScreenMask(var1);
         }
      }
   }

   public void closeAll(InputCloseReason var1) {
      if ((-1723824524 * (-1723824524 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UUID[] var2 = this.Xqedii_2ex3kpo.keySet().toArray(new UUID[Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 11)]);
         int var3 = var2.length;

         for (int var4 = Xqedii_3te89ca.Xqedii_1l0rrcbr5k7l4(987261589, 16); var4 < var3; var4++) {
            UUID var5 = var2[var4];
            Player var6 = Bukkit.getPlayer(var5);
            if (var6 == null) {
               this.Xqedii_2ex3kpo.remove(var5);
               this.Xqedii_23no5xe(var5);
            } else {
               this.close(var6, var1);
            }
         }
      }
   }

   public void Xqedii_3nda0do(Player var1) {
      if ((203741615 * (203741615 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_cckmm0f.add(var1.getUniqueId());

         try {
            if (Xqedii_1ig2hdv.Xqedii_19p728w(var1)) {
               var1.closeInventory();
            }
         } catch (Throwable var6) {
         } finally {
            this.Xqedii_cckmm0f.remove(var1.getUniqueId());
         }
      }
   }

   public void Xqedii_2ux18gd(Player var1, AnvilInputSession var2, String var3, InputCloseReason var4, boolean var5) {
      if ((1573313863 * 1573313863 - 1573313863 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputRequest var6 = var2.request();

         try {
            if (var5) {
               if (var6.onCommit() != null) {
                  var6.onCommit().accept(var1, var3, var4);
               }
            } else if (var6.onCancel() != null) {
               var6.onCancel().accept(var1, var3, var4);
            }
         } catch (Throwable var8) {
            this.Xqedii_24c4lhf.getLogger().warning(Xqedii_19rzg87s9hu62(String.valueOf(var8)));
         }
      }
   }

   public void Xqedii_1bipawd(Player var1, InventoryEvent var2) {
      if ((-1521756507 ^ -1521756507) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputSession var3 = this.Xqedii_2ex3kpo.get(var1.getUniqueId());
         if (var3 != null && var3.isWritable() && !var3.Xqedii_2epgyl0()) {
            String var4 = Xqedii_1ig2hdv.Xqedii_1pw5jey(var2);
            if (var4 != null) {
               AnvilInputRequest var5 = var3.request();
               String var6 = var5.filter().sanitize(var4);
               int var7 = var6.length() > var5.maxLength()
                  ? Xqedii_3te89ca.Xqedii_py6cl95r1rzg(29902611, 21)
                  : Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 21);
               String var8 = var7 != 0 ? var6.substring(Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 27), var5.maxLength()) : var6;
               int var9 = var6.equals(var4) && var7 == 0
                  ? Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 29)
                  : Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642338, 4);
               var3.Xqedii_3f5pgij();
               if (!var8.equals(var3.value())) {
                  var3.Xqedii_14p58hk(var8);
                  this.Xqedii_1us29ci(var1, var3, var8);
               }

               if (var9 != 0) {
                  this.Xqedii_2hogh59(var1, var3, var8);
                  this.Xqedii_1rlh75q(var1, var3);
               }

               if (var7 != 0 && var5.closeOnMax()) {
                  this.close(var1, InputCloseReason.MAX_LENGTH);
               }
            }
         }
      }
   }

   public void Xqedii_3ajrsnu(Player var1) {
      if ((-1943228280 ^ -1943228280) != 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputSession var2 = this.Xqedii_2ex3kpo.get(var1.getUniqueId());
         if (var2 != null) {
            if (var2.request().closeOnClick()) {
               this.close(var1, InputCloseReason.CLICK);
            }
         }
      }
   }

   public void Xqedii_1uiqlej(Player var1, InputCloseReason var2) {
      if ((-894355730 ^ -894355730) != 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_cckmm0f.contains(var1.getUniqueId())) {
         this.close(var1, var2);
      }
   }

   public void Xqedii_3ss3yna(Player var1) {
      if (((1683231342 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         AnvilInputSession var2 = this.Xqedii_2ex3kpo.get(var1.getUniqueId());
         if (var2 != null) {
            this.close(var1, InputCloseReason.DISCONNECT);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void Xqedii_2hogh59(Player var1, AnvilInputSession var2, String var3) {
      if (((1752106214 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         ItemStack var4 = Xqedii_1ig2hdv.Xqedii_35vh4et(var3);
         var2.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897641330, 10) != 0));
         boolean var9 = false /* VF: Semaphore variable */;

         label49: {
            try {
               var9 = true;
               Xqedii_1ig2hdv.Xqedii_3n9en78(var1, var4);
               var9 = false;
               break label49;
            } catch (Throwable var10) {
               var9 = false;
            } finally {
               if (var9) {
                  var2.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(-1743830472, 16) != 0));
               }
            }

            var2.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_py6cl95r1rzg(1898978948, 9) != 0));
            return;
         }

         var2.Xqedii_2x5elu3((Xqedii_3te89ca.Xqedii_3brssdb5ozwph(-1609066992, 8) != 0));
      }
   }

   public void Xqedii_1us29ci(Player var1, AnvilInputSession var2, String var3) {
      if ((885498968 * 885498968 + 885498968 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         BiConsumer var4 = var2.request().onChange();
         if (var4 != null) {
            try {
               var4.accept(var1, var3);
            } catch (Throwable var6) {
               this.Xqedii_24c4lhf.getLogger().warning(Xqedii_dv0q8m6cj2wr(String.valueOf(var6)));
            }
         }
      }
   }

   public void Xqedii_1rlh75q(Player var1, AnvilInputSession var2) {
      if ((-842321467 ^ -842321467) != 0) {
         throw new IllegalStateException();
      } else {
         Consumer var3 = var2.request().onReject();
         if (var3 != null) {
            try {
               var3.accept(var1);
            } catch (Throwable var5) {
            }
         }
      }
   }

   public void Xqedii_2uz6ig4(Player var1, AnvilInputSession var2) {
      if (((1374280111 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var3 = var2.request().idleTimeoutTicks();
         if (var3 > 0) {
            UUID var4 = var1.getUniqueId();
            PlatformCompat.CancellableTask var5 = Xqedii_38o2zes.Xqedii_j3mggbv(
               this.Xqedii_24c4lhf,
               var1,
               Xqedii_3te89ca.Xqedii_fejpqrlimrws(4660342247912878445L, 33),
               Xqedii_3te89ca.Xqedii_ysfqr6z4yoha(3439671210953055879L, 26),
               var5x -> {
                  if (((-1115132272 << 1 | 1) & 1) == 0) {
                     throw new IllegalStateException();
                  } else if (this.Xqedii_2ex3kpo.get(var4) == var2 && var1.isOnline()) {
                     if (var2.Xqedii_ajuydy5() >= var3) {
                        var5x.cancel();
                        this.Xqedii_1pufgqp.remove(var4, var5x);
                        this.close(var1, InputCloseReason.TIMEOUT);
                     }
                  } else {
                     var5x.cancel();
                     this.Xqedii_1pufgqp.remove(var4, var5x);
                  }
               }
            );
            this.Xqedii_1pufgqp.put(var4, var5);
         }
      }
   }

   public void Xqedii_23no5xe(UUID var1) {
      if ((-1914432514 ^ -1914432514) != 0) {
         throw new IllegalStateException();
      } else {
         PlatformCompat.CancellableTask var2 = this.Xqedii_1pufgqp.remove(var1);
         if (var2 != null) {
            try {
               var2.cancel();
            } catch (Throwable var4) {
            }
         }
      }
   }

   public static String Xqedii_1zf15x9(String var0, int var1) {
      if (((343803827 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return Xqedii_3te89ca.Xqedii_3uattssdovopu("ZFUErgDp36y0PClgzIoXlt9JAmSdjuo6A3TVsQ==");
      } else {
         return var0.length() <= var1 ? var0 : var0.substring(Xqedii_3te89ca.Xqedii_wlthnvnubk8z(897642354, 20), var1);
      }
   }

   private static /* synthetic */ String Xqedii_2ffv9guf5u3fb(String string) {
        return Xqedii_3te89ca.Xqedii_3uattssdovopu("lk1DfC3WPbMqTaRIKeiYTCQXk1FYH59jVVw58kprQ4Frz+a2ekt3ZJyoI5XBhe5hCYe7Br7LMtq663ubQ+okHeln01RY9a0a38Ant5rl1HzcQY2qOoOcoZ0RMX18ykOGqPecuh1CqmxrjeUfYWMq5HTfmIZyzsoENXbLZIsGWArMaEw4bbGgSQ==") + string;
    }

    private static /* synthetic */ String Xqedii_19rzg87s9hu62(String string) {
        return Xqedii_3te89ca.Xqedii_3uattssdovopu("r33EB1/p8AxQYff2iHOiiQhra6mk8dXP/SqK7ruh6RjBaY0AC4qBOzKgccAX1g39PFb3q+/P73logJA3+fAbzfasgtXeOWc/duvmPEIA3pXwbEn6BL+CUaPoH3xDM9HJwKarZcC1Ui4GJxOMxhhFVQ==") + string;
    }

    private static /* synthetic */ String Xqedii_dv0q8m6cj2wr(String string) {
        return Xqedii_3te89ca.Xqedii_3uattssdovopu("JDEnaKOjKwwMKv6YMJx7aEPZ4uxTbqcxH6fN4cYvpez1Y5C2GugeCb2dd3jR0lB6mTGInvAhGxqcU2hMW8/oyoW5Vj8Ylzdwf2Eeg6V3a1dwjVsph6MTpvaGcsYLd26NPvrpTWYHDm2EjwThH4NSWTimybADpMKIgxF7oLo6") + string;
    }
}
