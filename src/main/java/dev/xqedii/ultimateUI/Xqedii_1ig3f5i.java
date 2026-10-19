package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_1ig3f5i extends Effect {
   public static final String Xqedii_3co7stog2grcg = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_3jsjghv;
   public Expression<String> Xqedii_33s251c;
   public Expression<String> Xqedii_20coy2e;
   public Expression<Number> Xqedii_3pkie0t;
   public Expression<Player> Xqedii_2duch9h;
   public int Xqedii_347pt65;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if (((836972544 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_347pt65 = var2;
         this.Xqedii_3jsjghv = (Expression) var1[Xqedii_epkgldw.Xqedii_1cztk1iq7jqod(913652937, 3)];
         switch (var2) {
            case 1:
            case 3:
               this.Xqedii_33s251c = (Expression) var1[Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-2132541824, 29)];
               this.Xqedii_2duch9h = (Expression) var1[Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-1595703680, 14)];
               break;
            case 2:
            default:
               this.Xqedii_2duch9h = (Expression) var1[Xqedii_epkgldw.Xqedii_2trga3zmvh52l(551812736, 31)];
               break;
            case 4:
               this.Xqedii_33s251c = (Expression) var1[Xqedii_epkgldw.Xqedii_1cztk1iq7jqod(-913652938, 28)];
               this.Xqedii_20coy2e = (Expression) var1[Xqedii_epkgldw.Xqedii_2trga3zmvh52l(551812736, 30)];
               this.Xqedii_2duch9h = (Expression) var1[Xqedii_epkgldw.Xqedii_sqjnmfast8ek(-207637955, 31)];
               break;
            case 5:
            case 6:
               this.Xqedii_20coy2e = (Expression) var1[Xqedii_epkgldw.Xqedii_sqjnmfast8ek(-1636567481, 28)];
               this.Xqedii_3pkie0t = (Expression) var1[Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-1595670896, 3)];
               this.Xqedii_2duch9h = (Expression) var1[Xqedii_epkgldw.Xqedii_26ygu9b39ptwf(2138189762, 13)];
         }

         return (Xqedii_epkgldw.Xqedii_1cztk1iq7jqod(-913652938, 0) != 0);
      }
   }

   public void execute(Event var1) {
      if ((28419112 * 28419112 + 28419112 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         String var3 = this.Xqedii_3jsjghv == null ? null : (String)this.Xqedii_3jsjghv.getSingle(var1);
         if (var2 != null && var3 != null && !var3.isBlank() && this.Xqedii_2duch9h != null) {
            String var4 = this.Xqedii_33s251c == null ? null : (String)this.Xqedii_33s251c.getSingle(var1);
            String var5 = this.Xqedii_20coy2e == null ? null : (String)this.Xqedii_20coy2e.getSingle(var1);
            Number var6 = this.Xqedii_3pkie0t == null ? null : (Number)this.Xqedii_3pkie0t.getSingle(var1);
            int var7 = var6 == null
               ? Xqedii_epkgldw.Xqedii_26ygu9b39ptwf(1837231108, 24)
               : Math.max(Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-1595670912, 1), var6.intValue());
            Map var8 = this.Xqedii_347pt65 == Xqedii_epkgldw.Xqedii_1cztk1iq7jqod(-913651402, 9) ? Xqedii_36e4obe(var3) : null;
            if (this.Xqedii_347pt65 != Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-1595670900, 1) || var8 != null) {
               Player[] var9 = (Player[])this.Xqedii_2duch9h.getArray(var1);
               int var10 = var9.length;

               for (int var11 = Xqedii_epkgldw.Xqedii_2trga3zmvh52l(-1595670912, 29); var11 < var10; var11++) {
                  Player var12 = var9[var11];
                  if (var12 != null && var12.isOnline()) {
                     switch (this.Xqedii_347pt65) {
                        case 0:
                           var2.removeElement(var12, var3);
                           break;
                        case 1:
                           if (var4 != null) {
                              var2.moveElement(var12, var3, var4);
                           }
                           break;
                        case 2:
                           var2.moveElement(var12, var3, Xqedii_epkgldw.Xqedii_a4ezlnvd9ocy("TrqGUoo0zv4k/SpA9/usxuDZTA+clVuTo4Jyow=="));
                           break;
                        case 3:
                           if (var4 != null) {
                              var2.cloneElement(var12, var3, var4);
                           }
                           break;
                        case 4:
                           if (var4 != null && var5 != null) {
                              var2.cloneElement(var12, var3, var4, var5);
                           }
                           break;
                        case 5:
                           if (var5 != null) {
                              var2.moveElement(var12, var3, var5, var7);
                           }
                           break;
                        case 6:
                           var2.addElement(var12, var5, var8, var7);
                     }
                  }
               }
            }
         }
      }
   }

   public static Map<String, Object> Xqedii_36e4obe(String var0) {
      if (((1937009375 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         YamlConfiguration var1 = new YamlConfiguration();

         try {
            var1.loadFromString(var0);
         } catch (InvalidConfigurationException var3) {
            if (Xqedii_1uy3j6u.Xqedii_1xlslkp() != null) {
               Xqedii_1uy3j6u.Xqedii_1xlslkp().getLogger().warning(Xqedii_16ksdjotq4qkh(var3.getMessage()));
            }

            return null;
         }

         Map var2 = Xqedii_2zwsujj(var1);
         return var2.isEmpty() ? null : var2;
      }
   }

   public static Map<String, Object> Xqedii_2zwsujj(ConfigurationSection var0) {
      if ((1330756903 * 1330756903 - 1330756903 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         LinkedHashMap var1 = new LinkedHashMap();

         for (String var3 : var0.getKeys((Xqedii_epkgldw.Xqedii_sqjnmfast8ek(-1304661089, 15) != 0))) {
            var1.put(var3, Xqedii_3e3ujas(var0.get(var3)));
         }

         return var1;
      }
   }

   public static Object Xqedii_3e3ujas(Object var0) {
      if ((1836298952 * (1836298952 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else if (var0 instanceof ConfigurationSection var6) {
         return Xqedii_2zwsujj(var6);
      } else if (var0 instanceof List var5) {
         ArrayList var7 = new ArrayList(var5.size());

         for (Object var9 : var5) {
            var7.add(Xqedii_3e3ujas(var9));
         }

         return var7;
      } else if (!(var0 instanceof Map var1)) {
         return var0;
      } else {
         LinkedHashMap var2 = new LinkedHashMap();

         for (Entry var4 : (Iterable<Entry>) (var1.entrySet())) {

            var2.put(String.valueOf(var4.getKey()), Xqedii_3e3ujas(var4.getValue()));
         }

         return var2;
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((-797311948 * (-797311948 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_50yr4kaa610m(this.Xqedii_347pt65);
      }
   }

   private static /* synthetic */ String Xqedii_16ksdjotq4qkh(String string) {
        return Xqedii_epkgldw.Xqedii_a4ezlnvd9ocy("yREoFLFISWB/WxGwTaisYvBItzGuCVB9U+owgyBs79pNQi8XdvkHPMW1TxSqT7NohIevY50Yk06ypZTNB6ZVB+pE70rfTEhYeQwy37Ca8XPskNh5F3bWe0NOaxy0FUys6/ReDL+mXShaGVe4TLbwAQ==") + string;
    }

    private static /* synthetic */ String Xqedii_50yr4kaa610m(int n) {
        return Xqedii_epkgldw.Xqedii_a4ezlnvd9ocy("hmyRntaQls/zE+lO3cZZ5IOqTWADkOjqfx4rn9iTkZsvnT4YabYR9FFw507Tr9Y0oGk6vySNu3m7bYz9mFTkUqYh+Z842S/87s77WQ==") + n;
    }
}
