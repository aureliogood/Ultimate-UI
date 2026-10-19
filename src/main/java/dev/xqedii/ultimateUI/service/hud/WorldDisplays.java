package dev.xqedii.ultimateUI.service.hud;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_1ll4b8f;
import dev.xqedii.ultimateUI.Xqedii_3ugzpcv;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.entity.data.EntityData;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.entity.data.EntityDataTypes;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.entity.type.EntityTypes;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Quaternion4f;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.util.SpigotConversionUtil;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Vector3d;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerDestroyEntities;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerEntityTeleport;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerSpawnEntity;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay.TextAlignment;
import org.bukkit.inventory.ItemStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public abstract class WorldDisplays extends HudReanchoring {
   public static final String Xqedii_2ub7nt6wje1zq = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final int Xqedii_31ulhsv = 10;
   public static final int Xqedii_7w98ucj = 23;
   public static final int Xqedii_1x7s1r3 = 24;
   public static final int Xqedii_sd651tc = 8;
   public static final int Xqedii_24jk422 = 9;
   public static final int Xqedii_32sw13y = 10;

   public WorldDisplays(UltimateUI var1) {
      super(var1);
   }

   public int spawnWorldDisplay(Player var1, Location var2, WorldDisplays.WorldElementSpec var3, int var4) {
      if (((248145050 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var3 != null) {
         int var5 = this.Xqedii_1lphdnr();
         WrapperPlayServerSpawnEntity var6 = new WrapperPlayServerSpawnEntity(
            var5,
            UUID.randomUUID(),
            var3.isItem() ? EntityTypes.ITEM_DISPLAY : EntityTypes.TEXT_DISPLAY,
            new dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.world.Location(
               var2.getX(), var2.getY(), var2.getZ(), var2.getYaw(), var2.getPitch()
            ),
            var2.getYaw(),
            Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 9),
            null
         );
         this.Xqedii_202hfuk(var1, var6);
         this.Xqedii_202hfuk(var1, new WrapperPlayServerEntityMetadata(var5, this.Xqedii_2891t3c(var3, var4)));
         return var5;
      } else {
         return Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-482704411, 22);
      }
   }

   public void updateWorldDisplay(Player var1, int var2, WorldDisplays.WorldElementSpec var3, WorldDisplays.WorldElementSpec var4, int var5) {
      if (((463429416 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 >= 0 && var4 != null) {
         ArrayList var6 = new ArrayList();
         int var7 = var3 != null
               && Objects.equals(var3.translation(), var4.translation())
               && Objects.equals(var3.scale(), var4.scale())
               && Objects.equals(var3.leftRotation(), var4.leftRotation())
            ? Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 3)
            : Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172501948, 15);
         if (var7 != 0) {
            Vector3f var8 = var4.translation() == null ? new Vector3f() : var4.translation();
            Vector3f var9 = var4.scale() == null
               ? new Vector3f(
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-80827101, 27)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-323308401, 29)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(175582140, 24))
               )
               : var4.scale();
            Quaternionf var10 = var4.leftRotation() == null ? new Quaternionf() : var4.leftRotation();
            var6.add(new EntityData(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1286293774, 1), EntityDataTypes.INT, Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 31)));
            var6.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172527548, 10),
                  EntityDataTypes.INT,
                  Math.max(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 3), Math.min(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1265154870, 13), var5))
               )
            );
            var6.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(1256143775, 19),
                  EntityDataTypes.VECTOR3F,
                  new dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Vector3f(var8.x, var8.y, var8.z)
               )
            );
            var6.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1825910203, 31),
                  EntityDataTypes.VECTOR3F,
                  new dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Vector3f(var9.x, var9.y, var9.z)
               )
            );
            var6.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-767159510, 15), EntityDataTypes.QUATERNION, new Quaternion4f(var10.x, var10.y, var10.z, var10.w)
               )
            );
         }

         if (var3 == null || var3.blockLight() != var4.blockLight() || var3.skyLight() != var4.skyLight()) {
            var6.add(new EntityData(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(242695828, 28), EntityDataTypes.INT, this.Xqedii_3s0zynw(var4)));
         }

         if (var3 == null || var3.billboard() != var4.billboard()) {
            var6.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1910090332, 24),
                  EntityDataTypes.BYTE,
                  (byte)Math.max(
                     Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 23), Math.min(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-205917015, 31), var4.billboard())
                  )
               )
            );
         }

         if (var4.isItem()) {
            if (var3 == null || !Objects.equals(var3.item(), var4.item())) {
               var6.add(
                  new EntityData(
                     Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478498842, 9), EntityDataTypes.ITEMSTACK, SpigotConversionUtil.fromBukkitItemStack(var4.item())
                  )
               );
            }
         } else {
            if (var3 == null || !Objects.equals(var3.text(), var4.text())) {
               var6.add(new EntityData(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534752, 2), EntityDataTypes.COMPONENT, this.Xqedii_25s48un(var4.text())));
            }

            if (var3 == null || var3.opacity() != var4.opacity()) {
               var6.add(new EntityData(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1826305356, 21), EntityDataTypes.BYTE, (byte)this.Xqedii_3clos9k(var4.opacity())));
            }

            if (var3 == null || var3.lineWidth() != var4.lineWidth()) {
               var6.add(
                  new EntityData(
                     Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1839425194, 18),
                     EntityDataTypes.INT,
                     var4.lineWidth() > 0 ? var4.lineWidth() : Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-1503420977, 18)
                  )
               );
            }

            if (var3 == null || var3.alignment() != var4.alignment()) {
               var6.add(
                  new EntityData(
                     Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1235379546, 20), EntityDataTypes.BYTE, this.Xqedii_1n1qloj(null, this.Xqedii_3r2d8xo(var4.alignment()))
                  )
               );
            }
         }

         if (!var6.isEmpty()) {
            this.Xqedii_202hfuk(var1, new WrapperPlayServerEntityMetadata(var2, var6));
         }
      }
   }

   public int Xqedii_3s0zynw(WorldDisplays.WorldElementSpec var1) {
      if ((-24169865 * (-24169865 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return var1.blockLight() < 0
            ? Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(-172534717, 18)
            : Math.min(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1534187947, 16), var1.blockLight()) << Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(189311932, 22)
               | Math.max(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-1794214082, 20), Math.min(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-379590797, 16), var1.skyLight()))
                  << Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-381360269, 16);
      }
   }

   public void updateWorldDisplayText(Player var1, int var2, String var3) {
      if ((656180042 ^ 656180042) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 >= 0) {
         ArrayList var4 = new ArrayList(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478510106, 28));
         var4.add(new EntityData(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172846012, 14), EntityDataTypes.COMPONENT, this.Xqedii_25s48un(var3)));
         this.Xqedii_202hfuk(var1, new WrapperPlayServerEntityMetadata(var2, var4));
      }
   }

   public int spawnWorldInteraction(Player var1, Location var2, float var3, float var4) {
      if (((46576388 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         int var5 = this.Xqedii_1lphdnr();
         this.Xqedii_202hfuk(
            var1,
            new WrapperPlayServerSpawnEntity(
               var5,
               UUID.randomUUID(),
               EntityTypes.INTERACTION,
               new dev.xqedii.ultimateui.libs.packetevents.packetevents.protocol.world.Location(
                  var2.getX(),
                  var2.getY(),
                  var2.getZ(),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 19)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 29))
               ),
               Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 25)),
               Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-95143460, 14),
               null
            )
         );
         ArrayList var6 = new ArrayList(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(206089148, 25));
         var6.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478518298, 13),
               EntityDataTypes.FLOAT,
               Math.max(Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-1298725795, 17)), var3)
            )
         );
         var6.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1216505178, 20),
               EntityDataTypes.FLOAT,
               Math.max(Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(-87558252, 2)), var4)
            )
         );
         var6.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(1015381019, 29),
               EntityDataTypes.BOOLEAN,
               Boolean.valueOf((Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478510106, 25) != 0))
            )
         );
         this.Xqedii_202hfuk(var1, new WrapperPlayServerEntityMetadata(var5, var6));
         return var5;
      } else {
         return Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-1250376608, 19);
      }
   }

   public void teleportWorldEntity(Player var1, int var2, Location var3) {
      if (((1264594222 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 >= 0 && var3 != null) {
         this.Xqedii_202hfuk(
            var1,
            new WrapperPlayServerEntityTeleport(
               var2,
               new Vector3d(var3.getX(), var3.getY(), var3.getZ()),
               var3.getYaw(),
               var3.getPitch(),
               (Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1452407961, 10) != 0)
            )
         );
      }
   }

   public void destroyWorldEntities(Player var1, int[] var2) {
      if ((-131078577 * -131078577 + -131078577 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null && var2.length != 0) {
         this.Xqedii_202hfuk(var1, new WrapperPlayServerDestroyEntities(var2));
      }
   }

   public String Xqedii_25s48un(String var1) {
      if (((135736461 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return (String)Xqedii_3a0pbug.serialize(
            Xqedii_174tdpp.deserialize(
               this.Xqedii_wgkgkwo(var1 == null ? Xqedii_1ll4b8f.Xqedii_e7m7vl9xym69("GaEPK3zPR74VJrqNDrCk8MPpeAY9pm/MnRbFOQ==") : var1)
            )
         );
      }
   }

   public List<EntityData<?>> Xqedii_2891t3c(WorldDisplays.WorldElementSpec var1, int var2) {
      if (((1205687309 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Vector3f var3 = var1.translation() == null ? new Vector3f() : var1.translation();
         Vector3f var4 = var1.scale() == null
            ? new Vector3f(
               Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478770203, 20)),
               Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-380577549, 16)),
               Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(-163009603, 3))
            )
            : var1.scale();
         Quaternionf var5 = var1.leftRotation() == null ? new Quaternionf() : var1.leftRotation();
         int var6 = this.Xqedii_3s0zynw(var1);
         ArrayList var7 = new ArrayList();
         var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1864054092, 21), EntityDataTypes.INT, Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-761147673, 17)));
         var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(1944672743, 8), EntityDataTypes.INT, Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 24)));
         var7.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-1668973538, 31),
               EntityDataTypes.INT,
               Math.max(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 20), Math.min(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478507674, 6), var2))
            )
         );
         var7.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-759705881, 17),
               EntityDataTypes.VECTOR3F,
               new dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Vector3f(var3.x, var3.y, var3.z)
            )
         );
         var7.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478530586, 12),
               EntityDataTypes.VECTOR3F,
               new dev.xqedii.ultimateui.libs.packetevents.packetevents.util.Vector3f(var4.x, var4.y, var4.z)
            )
         );
         var7.add(
            new EntityData(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(1257192351, 19), EntityDataTypes.QUATERNION, new Quaternion4f(var5.x, var5.y, var5.z, var5.w))
         );
         var7.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-405619250, 9),
               EntityDataTypes.QUATERNION,
               new Quaternion4f(
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 7)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-293787108, 5)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 29)),
                  Float.intBitsToFloat(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172536956, 15))
               )
            )
         );
         var7.add(
            new EntityData(
               Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534364, 5),
               EntityDataTypes.BYTE,
               (byte)Math.max(Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 22), Math.min(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1286293764, 1), var1.billboard()))
            )
         );
         var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1265507126, 13), EntityDataTypes.INT, var6));
         if (var1.isItem()) {
            var7.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478509466, 6), EntityDataTypes.ITEMSTACK, SpigotConversionUtil.fromBukkitItemStack(var1.item())
               )
            );
            var7.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-823668079, 1),
                  EntityDataTypes.BYTE,
                  Byte.valueOf((byte)Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172534716, 23))
               )
            );
            return var7;
         } else {
            TextAlignment var8 = this.Xqedii_3r2d8xo(var1.alignment());
            var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478419994, 12), EntityDataTypes.COMPONENT, this.Xqedii_25s48un(var1.text())));
            var7.add(
               new EntityData(
                  Xqedii_1ll4b8f.Xqedii_2nd4srw9ua8mw(172567484, 12),
                  EntityDataTypes.INT,
                  var1.lineWidth() > 0 ? var1.lineWidth() : Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(1250839723, 17)
               )
            );
            var7.add(
               new EntityData(Xqedii_1ll4b8f.Xqedii_qlyptkcxe126(-1828402508, 21), EntityDataTypes.INT, Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(-478510107, 16))
            );
            var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_3cgrum3jpxx6i(478510120, 1), EntityDataTypes.BYTE, (byte)this.Xqedii_3clos9k(var1.opacity())));
            var7.add(new EntityData(Xqedii_1ll4b8f.Xqedii_3b5h0kv1nj529(-205917019, 31), EntityDataTypes.BYTE, this.Xqedii_1n1qloj(null, var8)));
            return var7;
         }
      }
   }

   public record WorldElementSpec(
      String text,
      ItemStack item,
      Vector3f translation,
      Vector3f scale,
      Quaternionf leftRotation,
      int opacity,
      int lineWidth,
      TextAlignment alignment,
      int blockLight,
      int skyLight,
      int billboard
   ) {
      public static final String Xqedii_2cgd1mdj06flb = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

      public boolean isItem() {
         if (((1334664298 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return ((this.item != null ? Xqedii_3ugzpcv.Xqedii_1dzvlaowbyxkw(821243293, 23) : Xqedii_3ugzpcv.Xqedii_1dzvlaowbyxkw(483092300, 29)) != 0);
         }
      }

      @Override

      public ItemStack item() {
         if ((-685953573 * -685953573 + -685953573 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.item;
         }
      }

      public Vector3f translation() {
         if ((933972833 * 933972833 + 933972833 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.translation;
         }
      }

      public Vector3f scale() {
         if (((58201361 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.scale;
         }
      }

      public Quaternionf leftRotation() {
         if ((-1105122503 * (-1105122503 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.leftRotation;
         }
      }

      public int opacity() {
         if ((-584752967 * -584752967 - -584752967 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.opacity;
         }
      }

      public int lineWidth() {
         if (((-851686496 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.lineWidth;
         }
      }

      public TextAlignment alignment() {
         if (((1099108705 << 1 | 1) & 1) == 0) {
            throw new IllegalStateException();
         } else {
            return this.alignment;
         }
      }

      public int blockLight() {
         if ((-959317967 * -959317967 + -959317967 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.blockLight;
         }
      }

      public int skyLight() {
         if ((1239335805 * 1239335805 + 1239335805 & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.skyLight;
         }
      }

      public int billboard() {
         if ((-257075288 * (-257075288 + 1) & 1) != 0) {
            throw new IllegalStateException();
         } else {
            return this.billboard;
         }
      }
   }
}
