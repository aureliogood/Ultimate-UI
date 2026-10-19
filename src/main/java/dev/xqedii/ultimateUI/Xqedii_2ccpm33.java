package dev.xqedii.ultimateUI;

import ch.njol.skript.classes.Changer.ChangeMode;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_2ccpm33 extends SimpleExpression<String> {
   public static final String Xqedii_1aoh2izxoxqe0 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_3u9nmco;
   public Expression<Player> Xqedii_1g4eukl;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((267147428 * 267147428 + 267147428 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_3u9nmco = (Expression) var1[Xqedii_3cixi4a.Xqedii_3ka92ug4ul8ro(59123631, 7)];
         this.Xqedii_1g4eukl = (Expression) var1[Xqedii_3cixi4a.Xqedii_3ka92ug4ul8ro(-2117921897, 6)];
         return (Xqedii_3cixi4a.Xqedii_3ka92ug4ul8ro(-1058960949, 5) != 0);
      }
   }

   public String[] get(Event var1) {
      if (((1050867716 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         Player var3 = this.Xqedii_1g4eukl == null ? null : (Player)this.Xqedii_1g4eukl.getSingle(var1);
         String var4 = this.Xqedii_3u9nmco == null ? null : (String)this.Xqedii_3u9nmco.getSingle(var1);
         if (var2 != null && var3 != null && var4 != null && !var4.isBlank()) {
            String[] var10000 = new String[Xqedii_3cixi4a.Xqedii_msf85l6knrw(1117424373, 21)];
            var10000[Xqedii_3cixi4a.Xqedii_3gzocs2yb67db(1230921982, 13)] = var2.getInputValue(var3, var4);
            return var10000;
         } else {
            return null;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Class<?>[] acceptChange(ChangeMode var1) {
      if ((-478780303 * -478780303 - -478780303 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Class[] var10000;
         switch (dev.xqedii.ultimateUI.Xqedii_173fyam.Xqedii_1kv4g94[var1.ordinal()]) {
            case 1:
            case 2:
            case 3:
               var10000 = new Class[Xqedii_3cixi4a.Xqedii_3gzocs2yb67db(2047080741, 23)];
               var10000[Xqedii_3cixi4a.Xqedii_3gzocs2yb67db(615460991, 12)] = String.class;
               break;
            default:
               var10000 = null;
         }

         return var10000;
      }
   }

   public void change(Event var1, Object[] var2, ChangeMode var3) {
      if ((971021454 * (971021454 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UltimateUIAPI var4 = Xqedii_1uy3j6u.api();
         Player var5 = this.Xqedii_1g4eukl == null ? null : (Player)this.Xqedii_1g4eukl.getSingle(var1);
         String var6 = this.Xqedii_3u9nmco == null ? null : (String)this.Xqedii_3u9nmco.getSingle(var1);
         if (var4 != null && var5 != null && var6 != null && !var6.isBlank()) {
            String var7 = Xqedii_3cixi4a.Xqedii_1enshhypuzwuf("4TXR0pC0QUwgKj0YkVl+CjkFLU0UU13vPgqxxw==");
            if (var3 == ChangeMode.SET && var2 != null && var2.length > 0 && var2[Xqedii_3cixi4a.Xqedii_3gzocs2yb67db(-28746144, 5)] != null) {
               var7 = String.valueOf(var2[Xqedii_3cixi4a.Xqedii_msf85l6knrw(1119521525, 17)]);
            }

            var4.setInputValue(var5, var6, var7);
         }
      }
   }

   public boolean isSingle() {
      if ((1569488591 * (1569488591 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (Xqedii_3cixi4a.Xqedii_3euxbxh3rbfby(-1117172659, 23) != 0);
      }
   }

   public Class<? extends String> getReturnType() {
      if ((-931187286 * -931187286 - -931187286 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return String.class;
      }
   }

   public String toString(Event var1, boolean var2) {
      if (((471572710 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_3cixi4a.Xqedii_1enshhypuzwuf("7viImragGb9DApmJ3ffWVwrY8mdphotcxVkl1mtnVFqxzQJN/r+46lBvcAAgthovo4gXn2CE1y3ISZIbEh6xsXcCkuweUkQ+");
      }
   }
}
