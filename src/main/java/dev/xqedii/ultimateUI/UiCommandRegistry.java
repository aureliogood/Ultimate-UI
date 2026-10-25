package dev.xqedii.ultimateUI;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandMap;
import org.bukkit.entity.Player;

public abstract class UiCommandRegistry extends UiOpenClose {
   public static final String Xqedii_3q989i7e2yu2w = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final String Xqedii_iais8rd = Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("gJ2v/N/0ko/+vLK+5szsNFOemGQrYGW4ylKfGH2u5C4YYF0jrED5TeFL6CvPwjAE");
   public static final long Xqedii_39vn2j5 = 20L;
   public final Map<String, Xqedii_2pfc09n> Xqedii_o381gdw = new LinkedHashMap<>();
   public final AtomicBoolean Xqedii_1qwyzpk = new AtomicBoolean((Xqedii_27qfk48.Xqedii_2qxcv8q5fdarj(-1611217835, 22) != 0));

   public void scheduleUiCommandRefresh() {
      if ((-1788564415 ^ -1788564415) != 0) {
         throw new IllegalStateException();
      } else if (this.isEnabled()
         && this.Xqedii_1qwyzpk
            .compareAndSet((Xqedii_27qfk48.Xqedii_5qgsmqdk30iq(-187618069, 12) != 0), (Xqedii_27qfk48.Xqedii_inj5wb5xpz73(1041536155, 18) != 0))) {
         Xqedii_38o2zes.Xqedii_3npx6fi(this, () -> {
            if (((-594569435 | 1) & 1) == 0) {
               throw new IllegalStateException();
            } else {
               this.Xqedii_1qwyzpk.set((Xqedii_27qfk48.Xqedii_inj5wb5xpz73(-1041536156, 23) != 0));
               this.refreshUiCommands();
            }
         }, Xqedii_27qfk48.Xqedii_3990hxl07vr18(-39683802650341970L, 52));
      }
   }

   public void refreshUiCommands() {
      if ((-11070249 ^ -11070249) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_2k1vujp != null && this.isEnabled()) {
         CommandMap var1 = this.resolveCommandMap();
         if (var1 != null) {
            Map var2;
            try {
               var2 = this.Xqedii_2k1vujp.collectPageCommands();
            } catch (Throwable var10) {
               this.getLogger().warning(Xqedii_2aonjtgi1lt4v(var10.getMessage()));
               return;
            }

            int var3 = Xqedii_27qfk48.Xqedii_mkcbeiln176k(688813897, 10);
            Iterator var4 = this.Xqedii_o381gdw.entrySet().iterator();

            while (var4.hasNext()) {
               Entry var5 = (Entry)var4.next();
               String[] var6 = (String[])var2.get(var5.getKey());
               Xqedii_2pfc09n var7 = (Xqedii_2pfc09n)var5.getValue();
               if (var6 != null && var6[Xqedii_27qfk48.Xqedii_mkcbeiln176k(1227427447, 2)].equals(var7.Xqedii_25yofvo)) {
                  String[] var10001 = new String[Xqedii_27qfk48.Xqedii_inj5wb5xpz73(1041536155, 2)];
                  var10001[Xqedii_27qfk48.Xqedii_2qxcv8q5fdarj(1163525996, 10)] = var6[Xqedii_27qfk48.Xqedii_mkcbeiln176k(567240997, 15)];
                  String var10000 = this.firstNonBlank(var10001);
                  String[] var10002 = new String[Xqedii_27qfk48.Xqedii_mkcbeiln176k(-1265463065, 30)];
                  var10002[Xqedii_27qfk48.Xqedii_inj5wb5xpz73(-1041536156, 14)] = var7.getPermission();
                  if (!Objects.equals(var10000, this.firstNonBlank(var10002))) {
                     var7.setPermission(var10000);
                  }

                  continue;
               }

               // Evita mutar el arbol de comandos de Brigadier durante /uui reload: Paper 1.21.11
               // reconstruye ese arbol de forma asincrona y lanza ConcurrentModificationException.
               // El comando eliminado se limpia al deshabilitar el plugin o al reiniciar el servidor.
               continue;
            }

            for (Entry var12 : (Iterable<Entry>) (var2.entrySet())) {

               if (!this.Xqedii_o381gdw.containsKey(var12.getKey())) {
                  Xqedii_2pfc09n var13 = new Xqedii_2pfc09n(
                     this,
                     (String)var12.getKey(),
                     ((String[])var12.getValue())[Xqedii_27qfk48.Xqedii_inj5wb5xpz73(-1041536156, 8)],
                     ((String[])var12.getValue())[Xqedii_27qfk48.Xqedii_mkcbeiln176k(1034196103, 25)]
                  );

                  try {
                     var1.register(Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("gJ2v/N/0ko/+vLK+5szsNFOemGQrYGW4ylKfGH2u5C4YYF0jrED5TeFL6CvPwjAE"), var13);
                     this.Xqedii_o381gdw.put((String)var12.getKey(), var13);
                     var3 = Xqedii_27qfk48.Xqedii_2qxcv8q5fdarj(718265186, 13);
                  } catch (Throwable var9) {
                     this.getLogger().warning(Xqedii_23xvvj98q2yyl((String)var12.getKey(), var9.getMessage()));
                  }
               }
            }

            if (var3 != 0) {
               this.syncServerCommands();
            }
         }
      }
   }

   public void unregisterAllUiCommands() {
      if (((-1689132961 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (!this.Xqedii_o381gdw.isEmpty()) {
         CommandMap var1 = this.resolveCommandMap();
         if (var1 != null) {
            for (Xqedii_2pfc09n var3 : this.Xqedii_o381gdw.values()) {
               this.unregisterUiCommand(var1, var3);
            }
         }

         this.Xqedii_o381gdw.clear();
         this.syncServerCommands();
      }
   }

   public void unregisterUiCommand(CommandMap var1, Xqedii_2pfc09n var2) {
      if ((-612020716 * -612020716 - -612020716 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && var2 != null) {
         try {
            var2.unregister(var1);
         } catch (Throwable var7) {
         }

         try {
            Method var3 = var1.getClass()
               .getMethod(Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("l5huKLd9HWDib1RLMP5I3yy6H9mBj/Vd7OwqRolHUhsv+K6ij4b/UVNQhaIbfGX2c3mR6rrsLKnPThtC"));
            if (var3.invoke(var1) instanceof Map var5) {
               var5.values().removeIf(var1x -> {
                  if ((-1297987176 ^ -1297987176) != 0) {
                     throw new IllegalStateException();
                  } else {
                     return ((var1x == var2 ? Xqedii_27qfk48.Xqedii_2qxcv8q5fdarj(1743630613, 20) : Xqedii_27qfk48.Xqedii_mkcbeiln176k(1955762407, 30)) != 0);
                  }
               });
            }
         } catch (Throwable var6) {
         }
      }
   }

   public CommandMap resolveCommandMap() {
      if ((2104122422 ^ 2104122422) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var1 = Bukkit.getServer();
            Method var2 = var1.getClass()
               .getMethod(Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("YnSZbbXNkEhNVniz15r2iDKM2AJNPCMIJu1e8rVUEcBxAuQQndI5G975uBgB8/w94Imy14qD"));
            return var2.invoke(var1) instanceof CommandMap var4 ? var4 : null;
         } catch (Throwable var5) {
            return null;
         }
      }
   }

   public void syncServerCommands() {
      if ((1732837933 * (1732837933 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         try {
            Server var1 = Bukkit.getServer();
            var1.getClass()
               .getMethod(Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("2u3iPcXOpMB+Sdfw4ZaMe3pHErK2RYOf+35OuZPO2aBefGxEYnqVLVi9Wnu3GgiQCQ+X3w=="))
               .invoke(var1);
         } catch (Throwable var5) {
         }

         for (Player var2 : Bukkit.getOnlinePlayers()) {
            try {
               var2.updateCommands();
            } catch (Throwable var4) {
            }
         }
      }
   }

   private static /* synthetic */ String Xqedii_2aonjtgi1lt4v(String string) {
        return Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("MaQFxVYerBWaokZa8bKAwOA5BpawKSUYUkg+74e/x+XGMR/+U9uEbcRFFvjV09JJlyzFH3x6ZVEF+uJ+5xNHaozuEbyb2SCYy1TTmV4mmadkOAQLMSVq5ZlAaNANuBSyjQ+BhbelJ+Q7NKJbvFIKdo2Hi4a5NL72IX0GvQ6RlOH61xpW8WryyDMVk8cvAv1KdDstBA==") + string;
    }

    private static /* synthetic */ String Xqedii_23xvvj98q2yyl(String string, String string2) {
        return Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("RtTlx44fkQAJ/NXkek6ohBGk4rf0VqqFmoVr3WNNIJHcU0Ed9EyrW4wFTZzmPF86hS/tNrTPfyJl//B6CMpOZX2VJrUO2lp28TysIwgfy1nYRFh0VngOlIyx9MAElbOyclVQNZeK/dms0dsqN4ISRE2L3q8vup2KDczsDg==") + string + Xqedii_27qfk48.Xqedii_3k5tk64llw2tl("QAPRAGDlZeSzwhYHv4Yb4EYZbXsnz4Ayw65YtN+nlVg=") + string2;
    }
}
