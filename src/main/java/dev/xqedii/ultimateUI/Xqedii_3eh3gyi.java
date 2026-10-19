package dev.xqedii.ultimateUI;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import dev.xqedii.ultimateUI.api.UltimateUIAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public final class Xqedii_3eh3gyi extends Effect {
   public static final String Xqedii_x87e94jjlrm3 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public Expression<String> Xqedii_35isgox;
   public Expression<String> Xqedii_10anufm;
   public Expression<String> Xqedii_2rfh5ra;
   public Expression<Number> Xqedii_2zs91zt;
   public Expression<Number> Xqedii_3a8jg9j;
   public Expression<Boolean> Xqedii_1esq729;
   public Expression<Player> Xqedii_1sf1bv2;
   public int Xqedii_2fzlmqs;

   public boolean init(Expression<?>[] var1, int var2, Kleenean var3, ParseResult var4) {
      if ((-766985902 * (-766985902 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.Xqedii_2fzlmqs = var2;
         this.Xqedii_35isgox = (Expression) var1[Xqedii_154a8mr.Xqedii_101falllz4gex(-68002666, 8)];
         switch (var2) {
            case 0:
            case 1:
            case 4:
               this.Xqedii_10anufm = (Expression) var1[Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(-1674298428, 25)];
               this.Xqedii_1sf1bv2 = (Expression) var1[Xqedii_154a8mr.Xqedii_qaok5yug7q0l(-549215917, 30)];
               break;
            case 2:
            case 3:
               this.Xqedii_2zs91zt = (Expression) var1[Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(1752664376, 2)];
               this.Xqedii_3a8jg9j = (Expression) var1[Xqedii_154a8mr.Xqedii_qaok5yug7q0l(1598234963, 14)];
               this.Xqedii_1sf1bv2 = (Expression) var1[Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(-249164530, 15)];
               break;
            case 5:
               this.Xqedii_2rfh5ra = (Expression) var1[Xqedii_154a8mr.Xqedii_101falllz4gex(68002665, 16)];
               this.Xqedii_10anufm = (Expression) var1[Xqedii_154a8mr.Xqedii_qaok5yug7q0l(1594073427, 21)];
               this.Xqedii_1sf1bv2 = (Expression) var1[Xqedii_154a8mr.Xqedii_j7jyq59879uu(-1017298376, 12)];
               break;
            case 6:
               this.Xqedii_2rfh5ra = (Expression) var1[Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(-498197987, 16)];
               this.Xqedii_2zs91zt = (Expression) var1[Xqedii_154a8mr.Xqedii_j7jyq59879uu(1685161658, 29)];
               this.Xqedii_1sf1bv2 = (Expression) var1[Xqedii_154a8mr.Xqedii_j7jyq59879uu(-2072934726, 29)];
               break;
            case 7:
               this.Xqedii_2rfh5ra = (Expression) var1[Xqedii_154a8mr.Xqedii_j7jyq59879uu(476163729, 3)];
               this.Xqedii_1esq729 = (Expression) var1[Xqedii_154a8mr.Xqedii_qaok5yug7q0l(1598284115, 13)];
               this.Xqedii_1sf1bv2 = (Expression) var1[Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(-789638560, 3)];
               break;
            default:
               return (Xqedii_154a8mr.Xqedii_uk6s25rt6ioo(-1136008381, 13) != 0);
         }

         return (Xqedii_154a8mr.Xqedii_qaok5yug7q0l(1598271827, 12) != 0);
      }
   }

   public void execute(Event var1) {
      if ((553365405 ^ 553365405) != 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_35isgox != null && this.Xqedii_1sf1bv2 != null) {
         UltimateUIAPI var2 = Xqedii_1uy3j6u.api();
         if (var2 != null) {
            String var3 = (String)this.Xqedii_35isgox.getSingle(var1);
            if (var3 != null && !var3.isBlank()) {
               String var4 = this.Xqedii_10anufm == null ? null : (String)this.Xqedii_10anufm.getSingle(var1);
               String var5 = this.Xqedii_2rfh5ra == null ? null : (String)this.Xqedii_2rfh5ra.getSingle(var1);
               Number var6 = this.Xqedii_2zs91zt == null ? (Number)null : (Number)this.Xqedii_2zs91zt.getSingle(var1);
               Number var7 = this.Xqedii_3a8jg9j == null ? (Number)null : (Number)this.Xqedii_3a8jg9j.getSingle(var1);
               Boolean var8 = this.Xqedii_1esq729 == null ? null : (Boolean)this.Xqedii_1esq729.getSingle(var1);
               Player[] var9 = (Player[])this.Xqedii_1sf1bv2.getArray(var1);
               int var10 = var9.length;

               for (int var11 = Xqedii_154a8mr.Xqedii_qaok5yug7q0l(1598267731, 0); var11 < var10; var11++) {
                  Player var12 = var9[var11];
                  if (var12 != null && var12.isOnline()) {
                     switch (this.Xqedii_2fzlmqs) {
                        case 0:
                           var2.setElementText(var12, var3, var4);
                           break;
                        case 1:
                           var2.setElementColor(var12, var3, var4);
                           break;
                        case 2:
                           if (var6 != null && var7 != null) {
                              var2.setElementPosition(var12, var3, var6.doubleValue(), var7.doubleValue());
                           }
                           break;
                        case 3:
                           if (var6 != null && var7 != null) {
                              var2.setElementScale(var12, var3, var6.doubleValue(), var7.doubleValue());
                           }
                           break;
                        case 4:
                           var2.setElementItem(var12, var3, var4);
                           break;
                        case 5:
                           if (var5 != null && !var5.isBlank()) {
                              var2.setElementValue(var12, var3, var5, var4);
                           }
                           break;
                        case 6:
                           if (var5 != null && !var5.isBlank() && var6 != null) {
                              var2.setElementValue(var12, var3, var5, var6.doubleValue());
                           }
                           break;
                        case 7:
                           if (var5 != null && !var5.isBlank() && var8 != null) {
                              var2.setElementValue(var12, var3, var5, var8);
                           }
                           break;
                        default:
                           return;
                     }
                  }
               }
            }
         }
      }
   }

   public String toString(Event var1, boolean var2) {
      if ((122248243 * 122248243 - 122248243 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return Xqedii_154a8mr.Xqedii_1gn0pb2lmuicc("nIf8y83hplVRD2VKcPSGeAQzSOTMqexaLOng9vXkMOyGfHuq08JKOZWuBbLbti+1xs1NFdUtBZb/MuJ8o/GrrDpxj8+b2w==");
      }
   }
}
