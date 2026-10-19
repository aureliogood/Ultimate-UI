package dev.xqedii.ultimateUI.service.camera;

import dev.xqedii.ultimateUI.UltimateUI;
import dev.xqedii.ultimateUI.Xqedii_2w209rc;
import dev.xqedii.ultimateUI.service.hud.HudService;
import dev.xqedii.ultimateUI.service.npc.CursorNpcService;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEvents;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.PacketEventsAPI;
import dev.xqedii.ultimateui.libs.packetevents.packetevents.wrapper.play.server.WrapperPlayServerCamera;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public abstract class CameraSpectate extends CameraPlacement {
   public static final String Xqedii_1ie4v72qfkpo8 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public CameraSpectate(UltimateUI var1, HudService var2, CursorNpcService var3) {
      super(var1, var2, var3);
   }

   public void spectate(Player var1, Entity var2) {
      if (((1957645922 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null) {
         if (!this.Xqedii_3lm1lfu(var1)) {
            this.Xqedii_nb4f4ce(var1, var2);
         } else {
            try {
               Object var3 = this.Xqedii_pz5jtze.invoke(var1);
               if (var3 == null) {
                  return;
               }

               Object var4 = this.Xqedii_ta19eaj.get(var3);
               if (var4 == null) {
                  return;
               }

               Object var5 = var2 == null ? var3 : this.Xqedii_1rg1z5m(var2);
               if (var5 == null) {
                  return;
               }

               Constructor var10000 = this.Xqedii_9fc5a0x;
               Object[] var10001 = new Object[Xqedii_2w209rc.Xqedii_1t4sioo367pzv(1619131388, 14)];
               var10001[Xqedii_2w209rc.Xqedii_1t4sioo367pzv(-1619131389, 7)] = var5;
               Object var6 = var10000.newInstance(var10001);
               Method var8 = this.Xqedii_1uhp5aj;
               Object[] var10002 = new Object[Xqedii_2w209rc.Xqedii_31ok3t86y56l(566586484, 17)];
               var10002[Xqedii_2w209rc.Xqedii_3s6h52hn5jmzv(-1601514497, 28)] = var6;
               var8.invoke(var4, var10002);
            } catch (Exception var7) {
               this.Xqedii_11is6fi.getLogger().warning(Xqedii_3datyy6v76xts(var1.getName(), String.valueOf(var7)));
               this.Xqedii_nb4f4ce(var1, var2);
            }
         }
      }
   }

   public void Xqedii_nb4f4ce(Player var1, Entity var2) {
      if (((429907089 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         try {
            PacketEventsAPI var3 = PacketEvents.getAPI();
            if (var3 == null) {
               return;
            }

            int var4 = var2 == null ? var1.getEntityId() : var2.getEntityId();
            var3.getPlayerManager().sendPacket(var1, new WrapperPlayServerCamera(var4));
         } catch (Throwable var5) {
            this.Xqedii_11is6fi.getLogger().warning(Xqedii_voxrbxhbgpmd(var1.getName(), String.valueOf(var5)));
         }
      }
   }

   public boolean Xqedii_3lm1lfu(Player var1) {
      if ((-149132715 * -149132715 - -149132715 & 1) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_373ctmj) {
         return (Xqedii_2w209rc.Xqedii_2l26sdx9pu31a(-1932970947, 5) != 0);
      } else if (!this.Xqedii_2vntyan && var1 != null) {
         try {
            this.Xqedii_pz5jtze = var1.getClass()
               .getMethod(Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("bMNlLofUXFJFXFVeT3VzLVy5tzb3olweVviwlP5wYUKMq2EvFtb00vAQdADh/w=="));
            Object var2 = this.Xqedii_pz5jtze.invoke(var1);
            if (var2 == null) {
               return (Xqedii_2w209rc.Xqedii_1t4sioo367pzv(-1619131389, 24) != 0);
            } else {
               this.Xqedii_ta19eaj = var2.getClass()
                  .getField(Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("3EkzWlCjRmeaQh+RHnbypeLisUhtY5L3sxDRMHNnBl/X6iwvw/r4dUgVgjhGZwkP"));
               Object var3 = this.Xqedii_ta19eaj.get(var2);
               if (var3 == null) {
                  return (Xqedii_2w209rc.Xqedii_31ok3t86y56l(566717556, 24) != 0);
               } else {
                  Class var4 = Class.forName(
                     Xqedii_2w209rc.Xqedii_3v99ncf39ej1g(
                        "Mw7p4zCE+JPub9cvAl/VzEG+XbdULltMxpguO+mI0WZUoT9O4fjUQVTgwuZ3zgYAf52ert7uYN+SIE7cRlrrcvMldJHX78bk6zNvIvMaaecBQ79fs6w+9gOUu5aTPl80Mvb0HC0G"
                     )
                  );
                  Class var5 = Class.forName(
                     Xqedii_2w209rc.Xqedii_3v99ncf39ej1g(
                        "otyV4+AJDCSe21hDCT25L8PJyd3HgBnzn6obnBMLUM00MjXXaCp1tnKQ+6Uby1wF4wv9o9XwOj+W9vraODOkyoEp+bw7BWeQwfMJ2f7Jiti+bCg5LKUkT/57uJ2AvA=="
                     )
                  );
                  Class var10001 = var3.getClass();
                  String var10002 = Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("CnD5AO/LY/TKAj3OxFlKJx7lVknOVzyKhHzEEiC4ZssUctfB");
                  Class[] var10003 = new Class[Xqedii_2w209rc.Xqedii_3s6h52hn5jmzv(-1333079041, 28)];
                  var10003[Xqedii_2w209rc.Xqedii_31ok3t86y56l(566717556, 14)] = var4;
                  this.Xqedii_1uhp5aj = var10001.getMethod(var10002, var10003);
                  var10001 = Class.forName(
                     Xqedii_2w209rc.Xqedii_3v99ncf39ej1g(
                        "O1ZUjv9QoiyFaWEd8kjuF/O0uzLz4LWCLcfdx+A9rnYd6zfF/OS7vX3cvzkVemOw0uxRdChabjPuU84TU5c3O8Lu2/Cc5ZbjBEwopqw32vACFIFMmzSxmgHsSAeQjA6k8r2DtBeXqzvvIYuGCDX8l7rMldKhxoZ2HYRP7tYSJBO6yd77jG6KXWI/bXvzMWJeUNkVVfeRoi8="
                     )
                  );
                  Class[] var8 = new Class[Xqedii_2w209rc.Xqedii_3s6h52hn5jmzv(-83317441, 24)];
                  var8[Xqedii_2w209rc.Xqedii_3s6h52hn5jmzv(1073350829, 16)] = var5;
                  this.Xqedii_9fc5a0x = var10001.getConstructor(var8);
                  this.Xqedii_373ctmj = (Xqedii_2w209rc.Xqedii_31ok3t86y56l(566750324, 15) != 0);
                  return (Xqedii_2w209rc.Xqedii_31ok3t86y56l(566750324, 15) != 0);
               }
            }
         } catch (Throwable var6) {
            this.Xqedii_2vntyan = (Xqedii_2w209rc.Xqedii_2l26sdx9pu31a(-1578342839, 24) != 0);
            this.Xqedii_11is6fi.getLogger().info(Xqedii_3n9o3qclkmwha(Bukkit.getName(), var6.getClass().getSimpleName()));
            return (Xqedii_2w209rc.Xqedii_2l26sdx9pu31a(1983063248, 31) != 0);
         }
      } else {
         return (Xqedii_2w209rc.Xqedii_1t4sioo367pzv(-1619131389, 26) != 0);
      }
   }

   public Object Xqedii_1rg1z5m(Entity var1) throws ReflectiveOperationException {
      if (((1705517150 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 == null) {
         return null;
      } else {
         Class var2 = var1.getClass();
         Method var3 = this.Xqedii_aybwy8p.get(var2);
         if (var3 == null) {
            var3 = var2.getMethod(Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("bMNlLofUXFJFXFVeT3VzLVy5tzb3olweVviwlP5wYUKMq2EvFtb00vAQdADh/w=="));
            this.Xqedii_aybwy8p.put(var2, var3);
         }

         return var3.invoke(var1);
      }
   }

   private static /* synthetic */ String Xqedii_3datyy6v76xts(String string, String string2) {
        return Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("nqdv8BW9lkxT/i6uC84wGanA1iWVy1fY1n/Wx1/Uk8KWAo1nuTx/0DKGdUb86ecnaNzp6GLIJVq2Jihhmbqjzj8cT8DAbmqb") + string + Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("9zF9jS0TJefmEB3EObyzD/zd3UF30G9pJvnJeEWpKFHIDomQ6Cue0I4U+Y96fUis") + string2;
    }

    private static /* synthetic */ String Xqedii_voxrbxhbgpmd(String string, String string2) {
        return Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("nqdv8BW9lkxT/i6uC84wGanA1iWVy1fY1n/Wx1/Uk8KWAo1nuTx/0DKGdUb86ecnaNzp6GLIJVq2Jihhmbqjzj8cT8DAbmqb") + string + Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("6Lll4fh1GDxR6ZV8NIGHIw0R17cDKUbkNTGkQoxEdiG5+gvJv1EWnjyIdt306nn6W623R+AUhUwqGQvtJdHq0Nl0A7mmQcEZZfudQq6FjFw=") + string2;
    }

    private static /* synthetic */ String Xqedii_3n9o3qclkmwha(String string, String string2) {
        return Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("Qv3t0EafvBxDHDqEldssxPXPc5wZRDrdXLGoqDip1E7qxEcaLJIU0oHzDS7DCl8Uzcc1XoYMT1PT67DoSLh3fgPuKQ6bvRwKesw/mUVp85XXTF8ly5fkCvI7PH3++wod3xo12C2B4+PVSF/lHm5WVTqHxBbfVcWSXPAXKcS/C6Tgoq99KT5Z28fCUSqrsYqiIr+tsVrn") + string + Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("2R5NgqxB9fEp+z18JVrJvFsjzLeeNDQ4/9AHCvgYIMrlpKUXFZcypqmHaIbFnnm4THD2IL01xe5MSec5rz0LGv8z90ZntrdQ7BSwyT6ulw6cuSsKi/XroQrcTy7+RB/hkWtCtCtN3IRf44dxowUGeA==") + string2 + Xqedii_2w209rc.Xqedii_3v99ncf39ej1g("p7fOahyzT2EeV1RFP2VQzX5U59dLQf2qBAgsASQnO1w=");
    }
}
