package dev.xqedii.ultimateUI.api;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2145d2v;
import dev.xqedii.ultimateUI.Xqedii_38o2zes;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public final class UltimateUIAPI {
   public static final String Xqedii_2wq6dgh2eruxd = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static volatile UltimateUIAPI Xqedii_3ciyj2u;
   public final UltimateUI Xqedii_2x4yj4w;

   public UltimateUIAPI(UltimateUI var1) {
      this.Xqedii_2x4yj4w = Objects.requireNonNull(var1, Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("FdOFNLThwr7MVG22mhNs07Pg36Zje3tJvEmKZFwJDfBBPlwSFyyqdg=="));
   }

   public static void init(UltimateUI var0) {
      if (((2095249571 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3ciyj2u = new UltimateUIAPI(var0);
      }
   }

   public static void shutdown() {
      if (((1048134360 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3ciyj2u = null;
      }
   }

   public static UltimateUIAPI get() {
      if ((1665231644 * 1665231644 - 1665231644 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var0 = Xqedii_3ciyj2u;
         if (var0 == null) {
            throw new IllegalStateException(
               Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w(
                  "t77c1yfU6rn5Ul94i6zHvptp5uAIy571Sfyp+ofcq3zraxbv3V8OY30gy1MejjdQe7FW5LscKsy3J4II4PEM309GKiBVz44ddwsE5gJQ6gIfho+Hw9RrlflshIyelBxRcCL4MA+VJptXZ+F4fQYiNr94vbyhk80BohV0I0IaaHhEIGYGaXhjVgk593JzItC6Wwc4cG9M8Fv6SemyHNrbJFeNYZoKiGnVBnZ/6ebCYv96BLncDoCGX49UMX1rcZLxP/b/LvMv"
               )
            );
         } else {
            return var0;
         }
      }
   }

   public boolean isMainThreadFor(Player var1) {
      if ((-1415954507 * (-1415954507 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_38o2zes.Xqedii_269v6yv(var1);
      }
   }

   public boolean Xqedii_1b21zja(Player var1, BooleanSupplier var2) {
      if ((43554041 ^ 43554041) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null || var2 == null) {
         return (Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 28) != 0);
      } else if (Xqedii_38o2zes.Xqedii_269v6yv(var1)) {
         return var2.getAsBoolean();
      } else {
         Xqedii_38o2zes.Xqedii_1avvt9e(this.Xqedii_2x4yj4w, var1, () -> {
            if (((2068045660 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               if (var1.isOnline()) {
                  var2.getAsBoolean();
               }
            }
         });
         return (Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1325859081, 21) != 0);
      }
   }

   public static boolean isAvailable() {
      if ((-1828448186 * -1828448186 - -1828448186 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((Xqedii_3ciyj2u != null ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 10) : Xqedii_2145d2v.Xqedii_avh8pklonqq4(1863691714, 31)) != 0);
      }
   }

   public boolean openGui(Player var1, String var2) {
      if (((1426269061 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(
            var1, var2, (Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 1) != 0), (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1229515145, 19) != 0)
         );
      }
   }

   public boolean openGui(Player var1, String var2, boolean var3, boolean var4) {
      if ((709864191 ^ 709864191) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1b21zja(var1, () -> {
            if ((534013216 * 534013216 + 534013216 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.openUiForPlayer(var1, var2, var3, var4);
            }
         });
      }
   }

   public boolean openGui(Player var1, String var2, boolean var3) {
      if (((-1046309945 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(var1, var2, (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1229515145, 19) != 0), var3);
      }
   }

   public boolean openGuiHud(Player var1, String var2) {
      if ((230292635 * 230292635 + 230292635 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(
            var1, var2, (Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 10) != 0), (Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 7) != 0)
         );
      }
   }

   public boolean openGuiHud(Player var1, String var2, boolean var3) {
      if ((-1596492312 ^ -1596492312) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(var1, var2, (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-753757535, 4) != 0), var3);
      }
   }

   public int openGui(Iterable<? extends Player> var1, String var2) {
      if ((-1958917861 * (-1958917861 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(
            var1, var2, (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1649562170, 9) != 0), (Xqedii_2145d2v.Xqedii_avh8pklonqq4(1846769837, 18) != 0)
         );
      }
   }

   public int openGui(Iterable<? extends Player> var1, String var2, boolean var3) {
      if ((977550456 * (977550456 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(var1, var2, (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1902603116, 31) != 0), var3);
      }
   }

   public int openGuiHud(Iterable<? extends Player> var1, String var2) {
      if ((-608196923 ^ -608196923) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(
            var1, var2, (Xqedii_2145d2v.Xqedii_avh8pklonqq4(-567583867, 0) != 0), (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1229515145, 19) != 0)
         );
      }
   }

   public int openGuiHud(Iterable<? extends Player> var1, String var2, boolean var3) {
      if ((-489821267 * -489821267 + -489821267 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.openGui(var1, var2, (Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1246208542, 12) != 0), var3);
      }
   }

   public int openGui(Iterable<? extends Player> var1, String var2, boolean var3, boolean var4) {
      if ((860952045 ^ 860952045) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 22);
      } else {
         int var5 = Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 3);

         for (Player var7 : var1) {
            if (var7 != null && var7.isOnline() && this.openGui(var7, var2, var3, var4)) {
               var5++;
            }
         }

         return var5;
      }
   }

   public UiBuilder createGui(String var1) {
      if ((-1350717448 * (-1350717448 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return new UiBuilder(var1);
      }
   }

   public boolean saveGui(UiBuilder var1) {
      if ((73152998 ^ 73152998) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().saveBuiltGui(var1)
            ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1250380874, 22)
            : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1848438126, 28)) != 0);
      }
   }

   public boolean openGui(Player var1, UiBuilder var2) {
      if ((-1134510115 ^ -1134510115) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 != null && this.saveGui(var2) && this.openGui(var1, var2.getName())
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1144689808, 29)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 9)) != 0);
      }
   }

   public boolean openGui(Player var1, UiBuilder var2, boolean var3) {
      if ((-401455777 ^ -401455777) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 != null && this.saveGui(var2) && this.openGui(var1, var2.getName(), var3)
            ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1246398284, 14)
            : Xqedii_2145d2v.Xqedii_avh8pklonqq4(1454836156, 9)) != 0);
      }
   }

   public boolean openGuiHud(Player var1, UiBuilder var2) {
      if (((-1628792978 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 != null && this.saveGui(var2) && this.openGuiHud(var1, var2.getName())
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1535499819, 16)
            : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 3)) != 0);
      }
   }

   public boolean openGuiHud(Player var1, UiBuilder var2, boolean var3) {
      if (((502838319 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 != null && this.saveGui(var2) && this.openGuiHud(var1, var2.getName(), var3)
            ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 8)
            : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 24)) != 0);
      }
   }

   public void closeGui(Player var1) {
      if ((1518408507 ^ 1518408507) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_1b21zja(var1, () -> {
            if (((-1555204687 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               this.Xqedii_2x4yj4w.closeUiForPlayer(var1);
               return (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1250380874, 22) != 0);
            }
         });
      }
   }

   public boolean closeGui(Player var1, String var2) {
      if ((61591839 ^ 61591839) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_1b21zja(var1, () -> {
            if ((1094975539 * 1094975539 - 1094975539 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.closeUiForPlayer(var1, var2);
            }
         });
      }
   }

   public int closeGui(Iterable<? extends Player> var1) {
      if ((-1393106150 ^ -1393106150) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 2);
      } else {
         int var2 = Xqedii_2145d2v.Xqedii_avh8pklonqq4(653351644, 27);

         for (Player var4 : var1) {
            if (var4 != null && var4.isOnline() && this.isGuiOpen(var4)) {
               this.closeGui(var4);
               var2++;
            }
         }

         return var2;
      }
   }

   public int closeGui(Iterable<? extends Player> var1, String var2) {
      if ((146969901 ^ 146969901) != 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 17);
      } else {
         int var3 = Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 6);

         for (Player var5 : var1) {
            if (var5 != null && var5.isOnline() && this.closeGui(var5, var2)) {
               var3++;
            }
         }

         return var3;
      }
   }

   public boolean setElementValue(Player var1, String var2, String var3, Object var4) {
      if ((-1579603886 * -1579603886 - -1579603886 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((1050457596 * (1050457596 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementValue(var1, var2, var3, var4);
            }
         }));
      }
   }

   public boolean setElementText(Player var1, String var2, String var3) {
      if (((-1775581187 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((2108551228 ^ 2108551228) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementText(var1, var2, var3);
            }
         }));
      }
   }

   public boolean setElementColor(Player var1, String var2, String var3) {
      if ((1787425071 * 1787425071 - 1787425071 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1081997717 * -1081997717 + -1081997717 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementColor(var1, var2, var3);
            }
         }));
      }
   }

   public boolean setElementPosition(Player var1, String var2, double var3, double var5) {
      if ((1499826847 ^ 1499826847) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-856520942 * -856520942 - -856520942 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementPosition(var1, var2, var3, var5);
            }
         }));
      }
   }

   public boolean setElementScale(Player var1, String var2, double var3, double var5) {
      if (((1228267522 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((2102352539 * 2102352539 - 2102352539 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementScale(var1, var2, var3, var5);
            }
         }));
      }
   }

   public boolean setElementItem(Player var1, String var2, String var3) {
      if (((1722256780 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1629622393 ^ -1629622393) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementItem(var1, var2, var3);
            }
         }));
      }
   }

   public boolean setElementItem(Player var1, String var2, Material var3) {
      if (((629874613 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if (((-1900454183 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiElementItem(var1, var2, var3);
            }
         }));
      }
   }

   public boolean setElementVisible(Player var1, String var2, boolean var3) {
      if ((1703441463 * (1703441463 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if (((-1145358894 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setApiElementVisible(var1, var2, var3);
            }
         }) ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1144689808, 29) : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 29)) != 0);
      }
   }

   public boolean showElement(Player var1, String var2) {
      if ((-478588891 * (-478588891 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.setElementVisible(var1, var2, (Xqedii_2145d2v.Xqedii_avh8pklonqq4(1891353963, 21) != 0));
      }
   }

   public boolean hideElement(Player var1, String var2) {
      if (((480645658 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return this.setElementVisible(var1, var2, (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(311595475, 12) != 0));
      }
   }

   public boolean isElementVisible(Player var1, String var2) {
      if ((919154183 * 919154183 + 919154183 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().isApiElementVisible(var1, var2)
            ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(824781341, 8)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 5)) != 0);
      }
   }

   public boolean setElementOpacity(Player var1, String var2, int var3) {
      if ((-290012239 ^ -290012239) != 0) {
         throw new IllegalStateException();
      } else {
         return this.setElementValue(
            var1,
            var2,
            Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("AD8QFX7c+jv0QtW2XmS/zkZSVOOazr4+vN0e2hgZvvHGC5jv3cGgTKMD"),
            Math.max(Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1965629129, 6), Math.min(Xqedii_2145d2v.Xqedii_2j3evkyoicz03(625279910, 13), var3))
         );
      }
   }

   public boolean setElementRotation(Player var1, String var2, double var3) {
      if ((890751656 ^ 890751656) != 0) {
         throw new IllegalStateException();
      } else {
         return this.setElementValue(var1, var2, Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("RYHgHzKNLyVcTRyp130Fl0g2s0DUgdwxmF1QTn7Ua+lknxdZwbHq9Ez0sJ8="), var3);
      }
   }

   public boolean setElementLayer(Player var1, String var2, double var3) {
      if ((-496235237 * -496235237 - -496235237 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.setElementValue(var1, var2, Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("oPlm3DczqNQBFJ+JXCtHdhjpNzxsXCBYAdrG7gJz5PaPsMLyK0Q="), var3);
      }
   }

   public boolean setElementDraggable(Player var1, String var2, boolean var3) {
      if ((1206221358 * 1206221358 - 1206221358 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1222437284 * -1222437284 + -1222437284 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setApiElementDraggable(var1, var2, var3);
            }
         }) ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(-982814533, 5) : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 13)) != 0);
      }
   }

   public boolean isElementDraggable(Player var1, String var2) {
      if ((1211445823 * 1211445823 - 1211445823 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().isApiElementDraggable(var1, var2)
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1847031981, 18)
            : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1902603116, 31)) != 0);
      }
   }

   public boolean hasElement(Player var1, String var2) {
      if ((1359360059 * 1359360059 - 1359360059 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().hasApiElement(var1, var2)
            ? Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1294401801, 25)
            : Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1965629129, 6)) != 0);
      }
   }

   public List<String> getElementIds(Player var1) {
      if (((-1183613457 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? Collections.unmodifiableList(this.Xqedii_2x4yj4w.getGuiService().getApiElementIds(var1))
            : Collections.emptyList();
      }
   }

   public Object getElementValue(Player var1, String var2, String var3) {
      if (((216479534 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiElementValue(var1, var2, var3) : null;
      }
   }

   public String getElementText(Player var1, String var2) {
      if ((1830126772 * 1830126772 - 1830126772 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Object var3 = this.getElementValue(var1, var2, Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("VhT9q2ykThSngVh9JFZKKJsHkPFQ5F5Zys426X4qJWV6KB1w"));
         return var3 == null ? null : String.valueOf(var3);
      }
   }

   public double[] getElementPosition(Player var1, String var2) {
      if ((-1234731751 * (-1234731751 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiElementPosition(var1, var2) : null;
      }
   }

   public double[] getElementAbsolutePosition(Player var1, String var2) {
      if ((-1536708737 * -1536708737 + -1536708737 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiElementAbsolutePosition(var1, var2)
            : null;
      }
   }

   public boolean applyElementWrites(Player var1, List<UiElementWrite> var2) {
      if (((273049031 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isEmpty() && this.Xqedii_2x4yj4w.getGuiService() != null) {
         List var3 = List.copyOf(var2);
         return this.Xqedii_1b21zja(var1, () -> {
            if ((-341919315 * -341919315 - -341919315 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().applyApiElementWrites(var1, var3);
            }
         });
      } else {
         return (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-995842956, 10) != 0);
      }
   }

   public String resolvePlaceholders(Player var1, String var2) {
      if ((-1767264831 * -1767264831 + -1767264831 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && var2 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().resolveApiPlaceholders(var1, var2)
            : var2;
      }
   }

   public double[] getElementSize(Player var1, String var2) {
      if ((-121401920 * -121401920 - -121401920 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiElementSize(var1, var2) : null;
      }
   }

   public boolean removeElement(Player var1, String var2) {
      if ((1453459329 * (1453459329 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-782327545 ^ -782327545) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().removeApiElement(var1, var2);
            }
         }) ? Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1596391689, 28) : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1959044260, 2)) != 0);
      }
   }

   public boolean addElement(Player var1, Map<String, Object> var2) {
      if ((-2052611190 * -2052611190 - -2052611190 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.addElement(var1, null, var2, Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(1327956232, 29));
      }
   }

   public boolean addElement(Player var1, String var2, Map<String, Object> var3) {
      if ((-1792393618 * (-1792393618 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.addElement(var1, var2, var3, Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1735093234, 7));
      }
   }

   public boolean addElement(Player var1, String var2, Map<String, Object> var3, int var4) {
      if ((935068637 * 935068637 - 935068637 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if (((71956142 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().addApiElement(var1, var2, var3, var4);
            }
         }) ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1847031981, 18) : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 17)) != 0);
      }
   }

   public boolean applyElementStructure(Player var1, List<String> var2, List<UiElementCreate> var3) {
      if ((1647180893 ^ 1647180893) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null) {
         List var4 = var2 == null ? List.of() : List.copyOf(var2);
         List var5 = var3 == null ? List.of() : List.copyOf(var3);
         if (var4.isEmpty() && var5.isEmpty()) return false;
         return this.Xqedii_1b21zja(var1, () -> {
            if ((-1990238881 * (-1990238881 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().applyApiStructure(var1, var4, var5);
            }
         });
      } else {
         return (Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 21) != 0);
      }
   }

   public boolean moveElement(Player var1, String var2, String var3) {
      if ((1692846314 * 1692846314 + 1692846314 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.moveElement(var1, var2, var3, Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1246365516, 14));
      }
   }

   public boolean moveElement(Player var1, String var2, String var3, int var4) {
      if ((1028846510 * 1028846510 - 1028846510 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-713310486 * -713310486 + -713310486 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().moveApiElement(var1, var2, var3, var4);
            }
         }) ? Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(819527415, 31) : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1649562170, 9)) != 0);
      }
   }

   public boolean cloneElement(Player var1, String var2, String var3) {
      if ((-2140364504 ^ -2140364504) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1579408695 * (-1579408695 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().cloneApiElement(var1, var2, var3, null, Xqedii_2145d2v.Xqedii_avh8pklonqq4(1385294983, 10));
            }
         }) ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 16) : Xqedii_2145d2v.Xqedii_avh8pklonqq4(-982814565, 5)) != 0);
      }
   }

   public boolean cloneElement(Player var1, String var2, String var3, String var4) {
      if ((-665243617 * -665243617 - -665243617 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.cloneElement(
            var1,
            var2,
            var3,
            var4 == null ? Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("ua+MaSqlBuMFRcd5mkgeAdr5bN7l1mtB3MSeSA==") : var4,
            Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1089046857, 27)
         );
      }
   }

   public boolean cloneElement(Player var1, String var2, String var3, String var4, int var5) {
      if ((-1832676076 * (-1832676076 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null
               && this.Xqedii_2x4yj4w.getGuiService() != null
               && this.Xqedii_1b21zja(
                  var1,
                  () -> {
                     if ((-1834184695 * -1834184695 - -1834184695 & 1) != 0) {
                        throw new IllegalStateException();
                     } else {
                        return this.Xqedii_2x4yj4w
                           .getGuiService()
                           .cloneApiElement(
                              var1, var2, var3, var4 == null ? Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("ua+MaSqlBuMFRcd5mkgeAdr5bN7l1mtB3MSeSA==") : var4, var5
                           );
                     }
                  }
               )
            ? Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327694089, 18)
            : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(689778985, 24)) != 0);
      }
   }

   public String getElementParent(Player var1, String var2) {
      if (((1880065489 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiElementParent(var1, var2) : null;
      }
   }

   public List<String> getElementChildren(Player var1, String var2) {
      if ((269468688 * (269468688 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? Collections.unmodifiableList(this.Xqedii_2x4yj4w.getGuiService().getApiElementChildren(var1, var2))
            : Collections.emptyList();
      }
   }

   public int getElementIndex(Player var1, String var2) {
      if (((-772419170 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiElementIndex(var1, var2)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634470, 1);
      }
   }

   public String getListContainer(Player var1, String var2) {
      if ((-2050104523 * (-2050104523 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiListContainer(var1, var2) : null;
      }
   }

   public boolean setListLayout(Player var1, String var2, String var3, Object var4) {
      if ((-962935314 * (-962935314 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var3 != null && !var3.isBlank() && this.setElementValue(var1, var2, Xqedii_hieusq75w3ap(var3.trim()), var4);
      }
   }

   public String getInputValue(Player var1, String var2) {
      if ((440975803 ^ 440975803) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getOpenUiInputValue(var1, var2)
            : Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("ua+MaSqlBuMFRcd5mkgeAdr5bN7l1mtB3MSeSA==");
      }
   }

   public boolean setInputValue(Player var1, String var2, String var3) {
      if ((1878696267 * 1878696267 - 1878696267 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1285125855 * -1285125855 - -1285125855 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiInputValue(var1, var2, var3);
            }
         }));
      }
   }

   public boolean openInput(Player var1, String var2) {
      if (((-299930218 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-734746121 * -734746121 - -734746121 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().openOpenUiInput(var1, var2);
            }
         }));
      }
   }

   public String getFocusedInput(Player var1) {
      if ((-878200781 * -878200781 - -878200781 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null) {
         String var2 = this.Xqedii_2x4yj4w.getGuiService().getFocusedInputElement(var1);
         return var2 == null ? Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("ua+MaSqlBuMFRcd5mkgeAdr5bN7l1mtB3MSeSA==") : var2;
      } else {
         return Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("ua+MaSqlBuMFRcd5mkgeAdr5bN7l1mtB3MSeSA==");
      }
   }

   public boolean isTypingIntoInput(Player var1) {
      if ((-1972233668 ^ -1972233668) != 0) {
         throw new IllegalStateException();
      } else {
         return ((!this.getFocusedInput(var1).isEmpty()
            ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 10)
            : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 31)) != 0);
      }
   }

   public boolean scrollBox(Player var1, String var2, double var3, double var5) {
      if (((-1003421992 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if (((-866705760 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().scrollOpenUiBox(var1, var2, var3, var5);
            }
         }) ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 17) : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 14)) != 0);
      }
   }

   public boolean setScroll(Player var1, String var2, double var3, double var5) {
      if ((1463042581 * (1463042581 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-407484798 * -407484798 + -407484798 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().setOpenUiScroll(var1, var2, var3, var5);
            }
         }) ? Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1294401801, 25) : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 12)) != 0);
      }
   }

   public boolean scrollToTop(Player var1, String var2) {
      if ((2056592994 * 2056592994 + 2056592994 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.setScroll(
            var1,
            var2,
            Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_xcx5eouxau92(-4978753785760169274L, 48)),
            Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3opj8tagrapy9(3307869958283318582L, 35))
         );
      }
   }

   public boolean scrollToBottom(Player var1, String var2) {
      if ((-1395273505 * -1395273505 - -1395273505 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = this.getScroll(var1, var2);
         return ((var3 != null
               && this.setScroll(var1, var2, var3[Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956265, 4)], var3[Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956329, 5)])
            ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 0)
            : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 25)) != 0);
      }
   }

   public boolean scrollToElement(Player var1, String var2, String var3) {
      if ((-476535781 * -476535781 + -476535781 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-1993196713 * (-1993196713 + 1) & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().scrollOpenUiBoxToElement(var1, var2, var3);
            }
         }) ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1468742492, 26) : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 17)) != 0);
      }
   }

   public double[] getScroll(Player var1, String var2) {
      if (((-2016756649 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getOpenUiScroll(var1, var2) : null;
      }
   }

   public double getScrollY(Player var1, String var2) {
      if (((1759218859 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = this.getScroll(var1, var2);
         return var3 == null
            ? Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_1bruli5ewg7a(5253018634826864481L, 39))
            : var3[Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956234, 0)];
      }
   }

   public double getScrollX(Player var1, String var2) {
      if ((771512933 * (771512933 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = this.getScroll(var1, var2);
         return var3 == null
            ? Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3jfqiqxdqnu1q(5006700341177825839L, 12))
            : var3[Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 19)];
      }
   }

   public boolean isScrollable(Player var1, String var2) {
      if ((-1578572456 ^ -1578572456) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var3 = this.getScroll(var1, var2);
         return ((var3 == null
               || !(
                     var3[Xqedii_2145d2v.Xqedii_2j3evkyoicz03(1230563721, 19)]
                        > Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3opj8tagrapy9(-785384089541994765L, 50))
                  )
                  && !(
                     var3[Xqedii_2145d2v.Xqedii_avh8pklonqq4(1895548267, 21)]
                        > Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_1bruli5ewg7a(1481235169283526006L, 35))
                  )
            ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-995842956, 10)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 2)) != 0);
      }
   }

   public boolean clickElement(Player var1, String var2) {
      if ((-1481421934 * (-1481421934 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((337641449 ^ 337641449) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().clickApiElement(var1, var2);
            }
         }) ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 14) : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 10)) != 0);
      }
   }

   public boolean runActions(Player var1, List<Map<String, Object>> var2) {
      if ((668473611 ^ 668473611) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if (((1336776608 << 1 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().runApiActions(var1, var2);
            }
         }) ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 12) : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 4)) != 0);
      }
   }

   public boolean runAction(Player var1, String var2, Object var3) {
      if (((1048626281 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var2 != null && !var2.isBlank()) {
         LinkedHashMap var4 = new LinkedHashMap();
         var4.put(Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("psee6Y98X7FelwSa4pd5NUsmirfT1UiVZOLzxvFeKPf7tVTP"), var2.trim());
         if (var3 != null) {
            var4.put(Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("cNv24qb2UHurlUax0LCS2gMRfYButWp+Qy3aBk2UbyyBuxp3Q9U="), var3);
         }

         return this.runActions(var1, List.of(var4));
      } else {
         return (Xqedii_2145d2v.Xqedii_avh8pklonqq4(653351644, 27) != 0);
      }
   }

   public boolean runAction(Player var1, Map<String, Object> var2) {
      if ((-355667292 * (-355667292 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var2 != null && !var2.isEmpty() && this.runActions(var1, List.of(var2))
            ? Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(-515634469, 22)
            : Xqedii_2145d2v.Xqedii_avh8pklonqq4(727418078, 8)) != 0);
      }
   }

   public boolean pressKey(Player var1, String var2) {
      if ((1886087168 ^ 1886087168) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_1b21zja(var1, () -> {
            if ((-684872648 * -684872648 - -684872648 & 1) != 0) {
               throw new IllegalStateException();
            } else {
               return this.Xqedii_2x4yj4w.getGuiService().pressApiKey(var1, var2);
            }
         }) ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1802550213, 13) : Xqedii_2145d2v.Xqedii_avh8pklonqq4(653351644, 27)) != 0);
      }
   }

   public double getCursorX(Player var1) {
      if ((1101472533 * 1101472533 - 1101472533 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiCursorX(var1)
            : Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3jfqiqxdqnu1q(5006735516959980079L, 46));
      }
   }

   public double getCursorY(Player var1) {
      if ((-744295455 * -744295455 + -744295455 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiCursorY(var1)
            : Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3jfqiqxdqnu1q(5006700341211372079L, 26));
      }
   }

   public double getCursorPageX(Player var1) {
      if (((-2037648346 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiCursorPageX(var1)
            : Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3jfqiqxdqnu1q(4718469965026114159L, 7));
      }
   }

   public double getCursorPageY(Player var1) {
      if (((839521572 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null
            ? this.Xqedii_2x4yj4w.getGuiService().getApiCursorPageY(var1)
            : Double.longBitsToDouble(Xqedii_2145d2v.Xqedii_3opj8tagrapy9(1391235914444788156L, 6));
      }
   }

   public String getHoveredElement(Player var1) {
      if ((1823005766 * 1823005766 + 1823005766 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiHoveredElement(var1) : null;
      }
   }

   public boolean isHovering(Player var1, String var2) {
      if ((224302047 * (224302047 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         String var3 = this.getHoveredElement(var1);
         return ((var3 != null && var2 != null && var3.equals(var2.trim())
            ? Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-2025043382, 30)
            : Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 31)) != 0);
      }
   }

   public boolean isLeftMouseHeld(Player var1) {
      if ((-193901874 * -193901874 - -193901874 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().isApiLeftMouseHeld(var1)
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1454836668, 9)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 27)) != 0);
      }
   }

   public boolean isDragging(Player var1) {
      if ((-914302713 * (-914302713 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().isApiDragging(var1)
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1379733739, 15)
            : Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-376878776, 3)) != 0);
      }
   }

   public String getDraggedElement(Player var1) {
      if ((-641210820 * -641210820 + -641210820 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getApiDraggedElement(var1) : null;
      }
   }

   public boolean isGuiOpen(Player var1) {
      if (((-649032317 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return (Xqedii_2145d2v.Xqedii_2zwq8nxkaxwy(-1327956233, 15) != 0);
      } else {
         return ((this.Xqedii_2x4yj4w.getGuiService() != null && this.Xqedii_2x4yj4w.getGuiService().hasOpenSession(var1)
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(393784686, 26)
            : Xqedii_2145d2v.Xqedii_avh8pklonqq4(2024631827, 2)) != 0);
      }
   }

   public boolean isGuiOpen(Player var1, String var2) {
      if ((346335329 * 346335329 - 346335329 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && !var2.isBlank()) {
         String var3 = this.getOpenGuiName(var1);
         return ((var3 != null && var3.equalsIgnoreCase(var2.trim())
            ? Xqedii_2145d2v.Xqedii_avh8pklonqq4(1802550213, 13)
            : Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 22)) != 0);
      } else {
         return (Xqedii_2145d2v.Xqedii_2j3evkyoicz03(-1532726076, 18) != 0);
      }
   }

   public String getOpenGuiName(Player var1) {
      if ((1052708142 ^ 1052708142) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getActiveGuiName(var1) : null;
      }
   }

   public UiSession getSession(Player var1) {
      if ((-1347800032 * -1347800032 + -1347800032 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1 != null && this.Xqedii_2x4yj4w.getGuiService() != null ? this.Xqedii_2x4yj4w.getGuiService().getUiSession(var1) : null;
      }
   }

   public List<String> listGuis() {
      if ((-1168978289 ^ -1168978289) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2x4yj4w.getGuiService() == null
            ? Collections.emptyList()
            : Collections.unmodifiableList(this.Xqedii_2x4yj4w.getGuiService().getGuiNames());
      }
   }

   public boolean guiExists(String var1) {
      if ((1506582839 * 1506582839 - 1506582839 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && this.Xqedii_2x4yj4w.getGuiService() != null) {
         String var2 = var1.trim().toLowerCase();

         for (String var4 : this.Xqedii_2x4yj4w.getGuiService().getGuiNames()) {
            if (var4.equalsIgnoreCase(var2)) {
               return (Xqedii_2145d2v.Xqedii_avh8pklonqq4(1535499819, 16) != 0);
            }
         }

         return (Xqedii_2145d2v.Xqedii_avh8pklonqq4(-1202855243, 20) != 0);
      } else {
         return (Xqedii_2145d2v.Xqedii_2vk8f73vxfamb(515634468, 3) != 0);
      }
   }

   private static /* synthetic */ String Xqedii_hieusq75w3ap(String string) {
        return Xqedii_2145d2v.Xqedii_1srgjgjeaaf0w("6LWWAso9BhTF8J3nSxWG/ArJmbJKqOT5y4sSYN2j/PLIHE0+RHsU3jKNtfMLtMfE4Iw=") + string;
    }
}
