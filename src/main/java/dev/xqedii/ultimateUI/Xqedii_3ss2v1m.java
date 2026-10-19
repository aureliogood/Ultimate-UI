package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.bossbar.BossbarAssets;
import dev.xqedii.ultimateUI.service.bossbar.BossbarHudSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.format.Style.Merge.Strategy;
import net.kyori.adventure.text.format.TextDecoration.State;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

public final class Xqedii_3ss2v1m {
   public static final String Xqedii_1r84upltrsjo5 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final MiniMessage Xqedii_7wvmt1t;
   public static final int Xqedii_1gcofrs = 10;
   public static final int Xqedii_10fke03 = -9;
   public static final int Xqedii_107lbcy = 200;
   public static final double Xqedii_1dsw8p9 = 4.0;
   public static final double Xqedii_2cvzrj0 = 1.0E-4;
   public static final int Xqedii_20ag3bx = 8192;
   public static final String Xqedii_3tvqlb5 = Xqedii_3b3f8mg.Xqedii_2lgz74o263zjo("v3Dk4XwM5tJAd8jrykJDSJlaPD3yEeEuQSB2U+DXgjRSR3EklJ7qnA==");
   public static final int Xqedii_3j180m9 = -1;
   public static final int Xqedii_1dbfctg = 0;
   public static final int Xqedii_34a21yo = 1;
   public static final int Xqedii_30mugo0 = 2;
   public static final int Xqedii_r9e4x3i = 3;
   public static final int Xqedii_12nofu9 = 4;
   public static final int Xqedii_291m0xk = 0;
   public static final int Xqedii_2no6ghv = 1;
   public static final int Xqedii_3v4hv3t = 2;
   public static final int Xqedii_33f303l = 3;
   public static final int Xqedii_3pkith0 = 4;
   public static final int Xqedii_3m92yuk = 16777215;
   public final BossbarAssets Xqedii_2oupt0w;
   public final Map<String, List<Xqedii_2q1o8r1>> Xqedii_wlo6exy = new ConcurrentHashMap<>();

   public Xqedii_3ss2v1m(BossbarAssets var1) {
      this.Xqedii_2oupt0w = var1;
   }

   public List<Xqedii_1il8kkh> Xqedii_1fbh4q0(List<BossbarHudSnapshot> var1, double var2) {
      if ((-466620230 ^ -466620230) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_21bfw7p(var1, var2).Xqedii_2p2y2tq;
      }
   }

   public Xqedii_2fhrc2q Xqedii_21bfw7p(List<BossbarHudSnapshot> var1, double var2) {
      if ((-207104323 ^ -207104323) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var4 = new ArrayList();
         HashMap var5 = new HashMap();
         if (var1 != null && !var1.isEmpty() && this.Xqedii_2oupt0w.isReady()) {
            ArrayList var6 = new ArrayList(var1.size());

            for (int var7 = Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820364, 26); var7 < var1.size(); var7++) {
               var6.add(var7);
            }

            var6.sort(Comparator.comparingDouble((Integer var1x) -> {
               if (((-47102383 << 1 | 1) & 1) == 0) {
                  throw new IllegalStateException();
               } else {
                  return ((BossbarHudSnapshot)var1.get(var1x)).layer;
               }
            }));

            for (int var8 : (Iterable<Integer>) (var6)) {

               this.Xqedii_317p83t(var8, (BossbarHudSnapshot)var1.get(var8), var2, var4, var5);
            }

            return new Xqedii_2fhrc2q(var4, var5);
         } else {
            return new Xqedii_2fhrc2q(var4, var5);
         }
      }
   }

   public void Xqedii_317p83t(int var1, BossbarHudSnapshot var2, double var3, List<Xqedii_1il8kkh> var5, Map<Integer, double[]> var6) {
      if ((-625038138 * -625038138 + -625038138 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double var7 = var2.scaleY / Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266770616023656L, 36));
         double var9 = var2.scaleX / Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(7155795595165801369L, 39));
         if (var7 > Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(-3376626159799641377L, 56))
            && var9 > Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(-7167346180551966023L, 19))) {
            if (var2.text != null && !var2.text.isEmpty()) {
               List var11 = this.Xqedii_16qvyx5(var2.text);
               if (!var11.isEmpty()) {
                  int var12 = var2.lineWidth > 0 ? var2.lineWidth : Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-679458764, 13);
                  List var13 = this.Xqedii_1ex2kko(var11, var12);
                  double var14 = this.Xqedii_emb7cp4(var12);

                  for (List var17 : (Iterable<List>) (var13)) {

                     var14 = Math.max(var14, this.Xqedii_3vlyygu(var17));
                  }

                  ArrayList var30 = new ArrayList();
                  int var31 = var13.size();

                  for (int var18 = Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1861755947, 11); var18 < var31; var18++) {
                     List var19 = (List)var13.get(var18);
                     double var20 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(6329289428450368376L, 56))
                        - (var31 - Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820363, 0) - var18)
                           * Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3138773083836086888L, 54));

                     double var22 = switch (var2.alignment) {
                        case 0 -> Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-8340566057168087623L, 7));
                        case 2 -> var14 - this.Xqedii_3vlyygu(var19);
                        default -> (var14 - this.Xqedii_3vlyygu(var19))
                           / Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143268986882062952L, 43));
                     };
                     double var24 = var22;

                     for (Xqedii_2q1o8r1 var27 : (Iterable<Xqedii_2q1o8r1>) (var19)) {

                        double var28 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(-1848494964960966042L, 29))
                           - var14 / Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787850418792L, 25))
                           + var24;
                        this.Xqedii_3t5btl1(var2, var27, var28, var20, var9, var7, var30);
                        var24 += var27.Xqedii_1q7ydj6;
                     }
                  }

                  int var32 = var2.quarterTurns & Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-728152012, 24);
                  if (var32 != 0) {
                     for (Xqedii_3tb6tlp var37 : (Iterable<Xqedii_3tb6tlp>) (var30)) {

                        if (var37.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1862018092, 17)
                           || var37.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1269307001, 14)
                           || var37.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861887020, 17)) {
                           var6.put(var1, Xqedii_1phsaxs(var30));
                           return;
                        }
                     }

                     for (Xqedii_3tb6tlp var38 : (Iterable<Xqedii_3tb6tlp>) (var30)) {

                        Xqedii_1rg6vy0(var38, var32, var2.anchorX, var2.anchorY);
                     }
                  }

                  for (Xqedii_3tb6tlp var39 : (Iterable<Xqedii_3tb6tlp>) (var30)) {

                     if (var39.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_120djxek0ngug(91485841, 5)
                        && !Xqedii_3c2h973(var39, Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1638729147, 4))) {
                        if (var32 != 0 || var39.Xqedii_2kjvjpk == null) {
                           var6.put(var1, Xqedii_1phsaxs(var30));
                           return;
                        }

                        var39.Xqedii_15q7uiy = Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1504058066, 24);
                        var39.Xqedii_afvuuz5 = var39.Xqedii_287sji6;
                        var39.Xqedii_toc5rf5 = var39.Xqedii_1vj9m67;
                        var39.Xqedii_2voqgr2 = var39.Xqedii_2rbzow1;
                        var39.Xqedii_6aej5v1 = var39.Xqedii_4dwpawt;
                     }

                     if (var39.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1164351596, 18)
                        && !Xqedii_3c2h973(var39, Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1846010924, 14))) {
                        var6.put(var1, Xqedii_1phsaxs(var30));
                        return;
                     }
                  }

                  int var36 = Xqedii_3b3f8mg.Xqedii_2lgz74o263zjo("v3Dk4XwM5tJAd8jrykJDSJlaPD3yEeEuQSB2U+DXgjRSR3EklJ7qnA==").equalsIgnoreCase(var2.id)
                     ? Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1855482693, 26)
                     : Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1861755947, 20);

                  for (Xqedii_3tb6tlp var21 : (Iterable<Xqedii_3tb6tlp>) (var30)) {

                     this.Xqedii_9lvb14k(var1, var2, var21, var36, var3, var5);
                  }
               }
            }
         }
      }
   }

   public void Xqedii_3t5btl1(BossbarHudSnapshot var1, Xqedii_2q1o8r1 var2, double var3, double var5, double var7, double var9, List<Xqedii_3tb6tlp> var11) {
      if (((163353580 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var12 = var1.anchorX + var3 * var7;
         double var14 = var1.anchorY + var5 * var9;
         switch (var2.Xqedii_2f1zu9z) {
            case 1:
               this.Xqedii_16vfeau(
                  var2,
                  var12,
                  var14,
                  var7,
                  var9,
                  (((var1.quarterTurns & Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677853132, 15)) != 0
                     ? Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677836748, 14)
                     : Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-224964052, 7)) != 0),
                  var11
               );
               break;
            case 2:
               this.Xqedii_133l7ng(var2, var12, var14, var7, var9, var11);
               break;
            case 3:
               this.Xqedii_2ohybb1(var2, var12, var14, var7, var9, var11);
         }
      }
   }

   public void Xqedii_16vfeau(Xqedii_2q1o8r1 var1, double var2, double var4, double var6, double var8, boolean var10, List<Xqedii_3tb6tlp> var11) {
      if ((1856789157 * 1856789157 - 1856789157 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         BossbarAssets.Sprite var12 = var1.Xqedii_2bcofvn;
         double var13 = var4 + (Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677810124, 11) - var12.ascent) * var8;
         double var15 = var12.quadWidthFont * var6;
         double var17 = var12.quadHeightFont * var8;
         Xqedii_3tb6tlp var19 = new Xqedii_3tb6tlp();
         var19.Xqedii_2q1klot = var1.Xqedii_xeufmmf;
         if (var12.fill) {
            var19.Xqedii_15q7uiy = Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-836718978, 26);
            var19.Xqedii_afvuuz5 = var2;
            var19.Xqedii_toc5rf5 = var13;
            var19.Xqedii_2voqgr2 = var2 + var15;
            var19.Xqedii_6aej5v1 = var13 + var17;
            var11.add(var19);
         } else {
            var19.Xqedii_2kjvjpk = var12;
            var19.Xqedii_287sji6 = var2;
            var19.Xqedii_1vj9m67 = var13;
            var19.Xqedii_2rbzow1 = var2 + var15 * var12.padScaleX;
            var19.Xqedii_4dwpawt = var13 + var17 * var12.padScaleY;
            var19.Xqedii_3q4hzk8 = var2 + var12.opaqueLeft * var15;
            var19.Xqedii_3olagji = var13 + var12.opaqueTop * var17;
            var19.Xqedii_h7shh3s = var2 + var12.opaqueRight * var15;
            var19.Xqedii_1xwisjg = var13 + var12.opaqueBottom * var17;
            BossbarAssets.Mask var20 = var12.mask();
            int var21 = (var1.Xqedii_xeufmmf & Xqedii_3b3f8mg.Xqedii_120djxek0ngug(628356689, 5)) != Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1965373226, 19)
               ? Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1436439274, 28)
               : Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1367421408, 10);
            if (var20 == null || !var20.builtin && var21 == 0 && !var10) {
               var19.Xqedii_15q7uiy = Xqedii_3b3f8mg.Xqedii_120djxek0ngug(274153323, 1);
               var19.Xqedii_afvuuz5 = var19.Xqedii_287sji6;
               var19.Xqedii_toc5rf5 = var19.Xqedii_1vj9m67;
               var19.Xqedii_2voqgr2 = var19.Xqedii_2rbzow1;
               var19.Xqedii_6aej5v1 = var19.Xqedii_4dwpawt;
            } else {
               var19.Xqedii_15q7uiy = Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677822412, 11);
               var19.Xqedii_afvuuz5 = var2 + var20.left * var15;
               var19.Xqedii_toc5rf5 = var13 + var20.top * var17;
               var19.Xqedii_2voqgr2 = var2 + var20.right * var15;
               var19.Xqedii_6aej5v1 = var13 + var20.bottom * var17;
               var19.Xqedii_1z62bwh = var20.set;
               var19.Xqedii_bpg2gyb = var20.rotation;
            }

            var11.add(var19);
         }
      }
   }

   public static int Xqedii_2lh3rqm(double var0, double var2) {
      if ((920539977 * 920539977 + 920539977 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return (int)Math.round(var2) - (int)Math.round(var0);
      }
   }

   public static boolean Xqedii_3c2h973(Xqedii_3tb6tlp var0, int var1) {
      if ((804739015 * 804739015 + 804739015 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return ((Xqedii_2lh3rqm(var0.Xqedii_afvuuz5, var0.Xqedii_2voqgr2) <= var1 && Xqedii_2lh3rqm(var0.Xqedii_toc5rf5, var0.Xqedii_6aej5v1) <= var1
            ? Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1788373830, 26)
            : Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-807812075, 15)) != 0);
      }
   }

   public void Xqedii_133l7ng(Xqedii_2q1o8r1 var1, double var2, double var4, double var6, double var8, List<Xqedii_3tb6tlp> var10) {
      if ((-1975512076 * (-1975512076 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         BossbarAssets.TextFace var11 = var1.Xqedii_3tj78o2;
         int var12 = var11.resolveClass(var11.providerSize * var8);
         if (var12 >= 0) {
            double var13 = var4
               + Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-5264515909524455722L, 41)) * var8
               - Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-8340566057167803751L, 19));
            double var15 = var2 + Math.max(Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(-6952318355501590317L, 53)), var1.Xqedii_1q7ydj6 * var6);
            double var17 = var4 + Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3071367523495279208L, 58)) * var8;
            String var19 = var11.fontKey(var12);
            this.Xqedii_5pfj2a2(
               var10,
               Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677853132, 15),
               var1,
               var19,
               Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1005203495, 31),
               var2,
               var13,
               var2 - Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(1472431326104353384L, 0)),
               var4,
               var15 + Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-3063207647209136619L, 62)),
               var17
            );
            if (var1.Xqedii_27itpdq) {
               double var20 = var2 + Math.max(Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-2677708743067743009L, 30)), (double)Math.round(var6));
               this.Xqedii_5pfj2a2(
                  var10,
                  Xqedii_3b3f8mg.Xqedii_120djxek0ngug(1064112215, 17),
                  var1,
                  var19,
                  Xqedii_3b3f8mg.Xqedii_120djxek0ngug(1560124481, 11),
                  var20,
                  var13,
                  var2 - Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-6034723047954394055L, 9)),
                  var4,
                  var15 + Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(5498995597741446585L, 0)),
                  var17
               );
            }
         }
      }
   }

   public void Xqedii_2ohybb1(Xqedii_2q1o8r1 var1, double var2, double var4, double var6, double var8, List<Xqedii_3tb6tlp> var10) {
      if (((1705088752 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         BossbarAssets.VanillaGlyph var11 = var1.Xqedii_27at3tw;
         int var12 = this.Xqedii_2oupt0w.resolveVanillaClass(var8);
         if (var12 >= 0) {
            int var13 = this.Xqedii_2oupt0w.vanillaClassHeight(var12);
            BossbarAssets.VanillaProvider var14 = var11.provider;
            double var15 = var4 + (Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-672577484, 20) - var14.ascent) * var8;
            double var17 = var15 - Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(8448853353669121430L, 6)) + var14.scaledAscent(var13);
            double var19 = var15 + var14.scaledHeight(var13);
            double var21 = var2 + var11.scaledWidth(var13);
            String var23 = Xqedii_30g0ulj.Xqedii_3u38bb9(var12);
            int var24 = var11.scaledAdvance(var13);
            this.Xqedii_5pfj2a2(var10, Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755944, 2), var1, var23, var24, var2, var17, var2, var15, var21, var19);
            if (var1.Xqedii_27itpdq) {
               double var25 = var2 + Math.max(Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(3658784354021823287L, 32)), (double)Math.round(var6));
               this.Xqedii_5pfj2a2(
                  var10,
                  Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1761092652, 25),
                  var1,
                  var23,
                  var24,
                  var25,
                  var17,
                  var2,
                  var15,
                  var21 + Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266788241013352L, 31)),
                  var19
               );
            }
         }
      }
   }

   public void Xqedii_5pfj2a2(
      List<Xqedii_3tb6tlp> var1,
      int var2,
      Xqedii_2q1o8r1 var3,
      String var4,
      int var5,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16
   ) {
      if (((898529924 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_3tb6tlp var18 = new Xqedii_3tb6tlp();
         var18.Xqedii_15q7uiy = var2;
         var18.Xqedii_2q1klot = var3.Xqedii_xeufmmf;
         var18.Xqedii_1tn3rkq = var3.Xqedii_2zyef1q;
         var18.Xqedii_2jbr678 = var3.Xqedii_3kr6lzk;
         var18.Xqedii_1kuf0l5 = var4;
         var18.Xqedii_qxqxmxp = var5;
         var18.Xqedii_31odcf6 = var6;
         var18.Xqedii_2ljrj1c = var8;
         var18.Xqedii_afvuuz5 = var10;
         var18.Xqedii_toc5rf5 = var12;
         var18.Xqedii_2voqgr2 = var14;
         var18.Xqedii_6aej5v1 = var16;
         var1.add(var18);
      }
   }

   public static double[] Xqedii_1phsaxs(List<Xqedii_3tb6tlp> var0) {
      if ((-1922919577 ^ -1922919577) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var1 = null;

         for (Xqedii_3tb6tlp var3 : var0) {
            if (var1 == null) {
               double[] var10000 = new double[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-711374796, 23)];
               var10000[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1855482694, 26)] = var3.Xqedii_afvuuz5;
               var10000[Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-769610114, 26)] = var3.Xqedii_toc5rf5;
               var10000[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1794647084, 26)] = var3.Xqedii_2voqgr2;
               var10000[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-788014124, 29)] = var3.Xqedii_6aej5v1;
               var1 = var10000;
            } else {
               var1[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820364, 11)] = Math.min(
                  var1[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1638733243, 4)], var3.Xqedii_afvuuz5
               );
               var1[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 3)] = Math.min(
                  var1[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1565176778, 17)], var3.Xqedii_toc5rf5
               );
               var1[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677689292, 16)] = Math.max(
                  var1[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820300, 5)], var3.Xqedii_2voqgr2
               );
               var1[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1393387693, 31)] = Math.max(
                  var1[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755916, 4)], var3.Xqedii_6aej5v1
               );
            }
         }

         return var1;
      }
   }

   public static void Xqedii_1rg6vy0(Xqedii_3tb6tlp var0, int var1, double var2, double var4) {
      if ((1890234733 ^ 1890234733) != 0) {
         throw new IllegalStateException();
      } else {
         double var6 = var0.Xqedii_afvuuz5;
         double var8 = var0.Xqedii_toc5rf5;
         double var10 = var0.Xqedii_2voqgr2;
         double var12 = var0.Xqedii_6aej5v1;
         switch (var1) {
            case 1:
               var0.Xqedii_afvuuz5 = var2 - (var12 - var4);
               var0.Xqedii_2voqgr2 = var2 - (var8 - var4);
               var0.Xqedii_toc5rf5 = var4 + (var6 - var2);
               var0.Xqedii_6aej5v1 = var4 + (var10 - var2);
               break;
            case 2:
               var0.Xqedii_afvuuz5 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-5927814996043382859L, 39)) * var2 - var10;
               var0.Xqedii_2voqgr2 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3107237990839843432L, 57)) * var2 - var6;
               var0.Xqedii_toc5rf5 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(5539386683072828801L, 14)) * var4 - var12;
               var0.Xqedii_6aej5v1 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(3707355751225085093L, 20)) * var4 - var8;
               break;
            case 3:
               var0.Xqedii_afvuuz5 = var2 + (var8 - var4);
               var0.Xqedii_2voqgr2 = var2 + (var12 - var4);
               var0.Xqedii_toc5rf5 = var4 - (var10 - var2);
               var0.Xqedii_6aej5v1 = var4 - (var6 - var2);
         }

         if (var0.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 23)) {
            var0.Xqedii_bpg2gyb = var0.Xqedii_bpg2gyb + var1 & Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-616294961, 23);
         }
      }
   }

   public void Xqedii_9lvb14k(int var1, BossbarHudSnapshot var2, Xqedii_3tb6tlp var3, int var4, double var5, List<Xqedii_1il8kkh> var7) {
      if (((993668260 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var8 = var2.anchor;
         switch (var3.Xqedii_15q7uiy) {
            case 0:
               this.Xqedii_1o5g7p9(var1, var2, var3, var8, var5, var7);
               break;
            case 1:
               if (!this.Xqedii_3lc09uv(var2.clip, var5, var3.Xqedii_afvuuz5, var3.Xqedii_toc5rf5, var3.Xqedii_2voqgr2, var3.Xqedii_6aej5v1)) {
                  return;
               }

               int var15 = (int)Math.round(var3.Xqedii_afvuuz5);
               int var17 = (int)Math.round(var3.Xqedii_toc5rf5);
               int var19 = (int)Math.round(var3.Xqedii_2voqgr2) - var15;
               int var21 = (int)Math.round(var3.Xqedii_6aej5v1) - var17;
               if (var19 <= 0 || var21 <= 0 || !Xqedii_30g0ulj.Xqedii_2mxnz7n(var15) || !Xqedii_30g0ulj.Xqedii_140bbt1(var17)) {
                  return;
               }

               var7.add(
                  Xqedii_1il8kkh.Xqedii_3o2rcrl(
                     var1,
                     var2.layer,
                     var4,
                     var15,
                     var17,
                     Math.min(Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1829231575, 26), var19),
                     Math.min(Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1862673452, 17), var21),
                     var3.Xqedii_2q1klot,
                     var2.opacity,
                     var3.Xqedii_bpg2gyb,
                     var3.Xqedii_1z62bwh,
                     var8
                  )
               );
               break;
            case 2:
               if (!this.Xqedii_3lc09uv(var2.clip, var5, var3.Xqedii_afvuuz5, var3.Xqedii_toc5rf5, var3.Xqedii_2voqgr2, var3.Xqedii_6aej5v1)) {
                  return;
               }

               int var14 = (int)Math.round(var3.Xqedii_afvuuz5);
               int var16 = (int)Math.round(var3.Xqedii_toc5rf5);
               int var18 = (int)Math.round(var3.Xqedii_2voqgr2) - var14;
               int var20 = (int)Math.round(var3.Xqedii_6aej5v1) - var16;
               if (var18 <= 0 || var20 <= 0 || !Xqedii_30g0ulj.Xqedii_2mxnz7n(var14) || !Xqedii_30g0ulj.Xqedii_140bbt1(var16)) {
                  return;
               }

               BossbarAssets.Sprite var13 = var3.Xqedii_2kjvjpk;
               var7.add(
                  Xqedii_1il8kkh.Xqedii_2669ep6(
                     var1,
                     var2.layer,
                     var4,
                     var14,
                     var16,
                     Math.min(Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861770188, 5), var18),
                     Math.min(Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677836748, 4), var20),
                     var2.opacity,
                     var13.codepoint,
                     Xqedii_30g0ulj.Xqedii_ss1kifv(var13.source),
                     var13.advance,
                     var8,
                     var3.Xqedii_3q4hzk8,
                     var3.Xqedii_3olagji,
                     var3.Xqedii_h7shh3s,
                     var3.Xqedii_1xwisjg
                  )
               );
               break;
            case 3:
            case 4:
               if (!this.Xqedii_3lc09uv(var2.clip, var5, var3.Xqedii_afvuuz5, var3.Xqedii_toc5rf5, var3.Xqedii_2voqgr2, var3.Xqedii_6aej5v1)) {
                  return;
               }

               int var9 = (int)Math.round(var3.Xqedii_31odcf6);
               int var10 = (int)Math.round(var3.Xqedii_2ljrj1c);
               if (var9 < Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(676415435, 12)
                  || var9 > Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1359488044, 19)
                  || var10 < Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1860707371, 11)
                  || var10 > Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-678516684, 10)) {
                  return;
               }

               int var11 = var4 == Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(729072474, 21)
                  ? Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1861821483, 16)
                  : Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1860639788, 11);
               int var12 = var3.Xqedii_15q7uiy == Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-682014668, 22)
                  ? Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820332, 5)
                  : Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677836748, 12);
               var7.add(
                  Xqedii_1il8kkh.Xqedii_1luk51d(
                     var1,
                     var2.layer,
                     var11,
                     var12,
                     var9,
                     var10,
                     var3.Xqedii_2q1klot,
                     var2.opacity,
                     var3.Xqedii_1tn3rkq,
                     var3.Xqedii_1kuf0l5,
                     var3.Xqedii_2jbr678,
                     var3.Xqedii_qxqxmxp,
                     var8,
                     var3.Xqedii_afvuuz5,
                     var3.Xqedii_toc5rf5,
                     var3.Xqedii_2voqgr2,
                     var3.Xqedii_6aej5v1
                  )
               );
         }
      }
   }

   public void Xqedii_1o5g7p9(int var1, BossbarHudSnapshot var2, Xqedii_3tb6tlp var3, int var4, double var5, List<Xqedii_1il8kkh> var7) {
      if ((-1870530346 * (-1870530346 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         double[] var8 = this.Xqedii_3dg24no(var2.clip, var5, var3.Xqedii_afvuuz5, var3.Xqedii_toc5rf5, var3.Xqedii_2voqgr2, var3.Xqedii_6aej5v1);
         if (var8 != null) {
            int var9 = Xqedii_30g0ulj.Xqedii_3s169nw(var4);
            int var10 = Math.max(Xqedii_30g0ulj.Xqedii_kq5v7n6(var4), (int)Math.round(var8[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1537612498, 24)]));
            int var11 = Math.max(Xqedii_3b3f8mg.Xqedii_120djxek0ngug(365877700, 7), (int)Math.round(var8[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-711374796, 25)]));
            int var12 = Math.min(
               var9 + Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1508189860, 0), (int)Math.round(var8[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-543602636, 26)])
            );
            int var13 = Math.min(Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-673796044, 11), (int)Math.round(var8[Xqedii_3b3f8mg.Xqedii_120djxek0ngug(91485905, 5)]));
            if (var12 > var10 && var13 > var11) {
               for (int var14 = var11; var14 < var13 && var14 <= Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(672745526, 23); var14 += 1024) {
                  int var15 = Math.min(Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-678344652, 9), var13 - var14);

                  for (int var16 = var10; var16 < var12 && var16 <= var9; var16 += 2048) {
                     int var17 = Math.min(Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1166329726, 12), var12 - var16);
                     var7.add(Xqedii_1il8kkh.Xqedii_y3daijy(var1, var2.layer, var16, var14, var17, var15, var3.Xqedii_2q1klot, var2.opacity, var4));
                  }
               }
            }
         }
      }
   }

   public boolean Xqedii_3lc09uv(int var1, double var2, double var4, double var6, double var8, double var10) {
      if ((-130972820 ^ -130972820) != 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_3dg24no(var1, var2, var4, var6, var8, var10) != null
            ? Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-1751562188, 30)
            : Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820364, 4)) != 0);
      }
   }

   public double[] Xqedii_3dg24no(int var1, double var2, double var4, double var6, double var8, double var10) {
      if (((-452375425 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var12 = var4;
         double var14 = var6;
         double var16 = var8;
         double var18 = var10;
         if (var1 > 0) {
            int var20 = var1 - Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1266144353, 24) & Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1359469099, 29);
            int var21 = var1 - Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-769610114, 26) >> Xqedii_3b3f8mg.Xqedii_120djxek0ngug(548306686, 2)
               & Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 13);
            int var22 = var20 >> Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(822598612, 28) & Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1266144353, 24);
            double var23 = var20 & Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1858591700, 21);
            if (var21 == 0) {
               double var25 = var23 + var2;
               if (var22 == 0) {
                  var14 = Math.max(var6, var25);
               } else {
                  var18 = Math.min(var10, var25);
               }
            } else if (var22 == 0) {
               var12 = Math.max(var4, var23);
            } else {
               var16 = Math.min(var8, var23);
            }
         }

         if (!(var16 - var12 <= Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-8340566057168087623L, 61)))
            && !(var18 - var14 <= Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(-2536904879835502260L, 26)))) {
            double[] var10000 = new double[Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-543602636, 25)];
            var10000[Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1965215529, 19)] = var12;
            var10000[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 21)] = var14;
            var10000[Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-788014124, 30)] = var16;
            var10000[Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1576343571, 30)] = var18;
            return var10000;
         } else {
            return null;
         }
      }
   }

   public double Xqedii_emb7cp4(int var1) {
      if (((415987371 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Math.floor(var1 / Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787850410600L, 25)))
            * Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787858282600L, 21));
         double var4 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787858840442L, 17));
         return Math.min(var4, Math.max(Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(7954919596945421478L, 25)), var2));
      }
   }

   public double Xqedii_3vlyygu(List<Xqedii_2q1o8r1> var1) {
      if ((-1981054828 ^ -1981054828) != 0) {
         throw new IllegalStateException();
      } else {
         double var2 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-8340566057168087623L, 18));

         for (Xqedii_2q1o8r1 var5 : var1) {
            var2 += var5.Xqedii_1q7ydj6;
         }

         return var2;
      }
   }

   public List<List<Xqedii_2q1o8r1>> Xqedii_1ex2kko(List<Xqedii_2q1o8r1> var1, int var2) {
      if ((1578417148 * 1578417148 - 1578417148 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var3 = new ArrayList();
         ArrayList var4 = new ArrayList();
         double var5 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787858807400L, 56));
         int var7 = Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(677820363, 18);
         double var8 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(7954919596937024678L, 25));

         for (Xqedii_2q1o8r1 var11 : var1) {
            if (var11.Xqedii_2zyef1q == Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-278787353, 22)) {
               var3.add(var4);
               var4 = new ArrayList();
               var5 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-4215003251909140971L, 62));
               var7 = Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1537612497, 24);
            } else {
               if (var5 + var11.Xqedii_1q7ydj6 > var2 && !var4.isEmpty()) {
                  if (var7 >= 0 && var7 < var4.size()) {
                     ArrayList var12 = new ArrayList(var4.subList(var7 + Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 6), var4.size()));
                     ArrayList var13 = new ArrayList(var4.subList(Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1017500811, 5), var7));
                     var3.add(var13);
                     var4 = var12;
                     var5 -= var8;
                  } else {
                     var3.add(var4);
                     var4 = new ArrayList();
                     var5 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_9u8aw59v2x5n(-2316302808992349876L, 22));
                  }

                  var7 = Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(2130191403, 28);
               }

               if (var11.Xqedii_2zyef1q == Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-675723212, 16)) {
                  var7 = var4.size();
                  var8 = var5 + var11.Xqedii_1q7ydj6;
               }

               var4.add(var11);
               var5 += var11.Xqedii_1q7ydj6;
            }
         }

         var3.add(var4);
         if (var3.size() > Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-543602636, 27)) {
            ArrayList var14 = new ArrayList();

            for (int var15 = Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1861755947, 23); var15 < var3.size(); var15++) {
               if (var15 != var3.size() - Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-726975323, 21) || !((List)var3.get(var15)).isEmpty()) {
                  var14.add((List)var3.get(var15));
               }
            }

            if (!var14.isEmpty()) {
               return var14;
            }
         }

         return var3;
      }
   }

   public List<Xqedii_2q1o8r1> Xqedii_16qvyx5(String var1) {
      if (((-4902350 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         List var2 = this.Xqedii_wlo6exy.get(var1);
         if (var2 != null) {
            return var2;
         } else {
            List var3 = Collections.unmodifiableList(this.Xqedii_1cb2n7m(var1));
            if (this.Xqedii_wlo6exy.size() >= Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820363, 19)) {
               this.Xqedii_wlo6exy.clear();
            }

            this.Xqedii_wlo6exy.put(var1, var3);
            return var3;
         }
      }
   }

   public List<Xqedii_2q1o8r1> Xqedii_1cb2n7m(String var1) {
      if ((1823757603 * 1823757603 + 1823757603 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         ArrayList var2 = new ArrayList();

         Object var3;
         try {
            var3 = Xqedii_7wvmt1t.deserialize(var1);
         } catch (Exception var5) {
            var3 = Component.text(var1);
         }

         this.Xqedii_2x2pei6((Component)var3, Style.empty(), var2);
         return var2;
      }
   }

   public void Xqedii_2x2pei6(Component var1, Style var2, List<Xqedii_2q1o8r1> var3) {
      if (((153553922 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         Style var4 = var1.style().merge(var2, Strategy.IF_ABSENT_ON_TARGET);
         if (var1 instanceof TextComponent var5) {
            this.Xqedii_27baddb(var5.content(), var4, var3);
         } else {
            String var6 = PlainTextComponentSerializer.plainText().serialize(var1.children(List.of()));
            this.Xqedii_27baddb(var6, var4, var3);
         }

         for (Component var8 : var1.children()) {
            this.Xqedii_2x2pei6(var8, var4, var3);
         }
      }
   }

   public void Xqedii_27baddb(String var1, Style var2, List<Xqedii_2q1o8r1> var3) {
      if (((1023254727 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isEmpty()) {
         TextColor var4 = var2.color();
         int var5 = var4 == null ? NamedTextColor.WHITE.value() : var4.value();
         int var6 = var2.decoration(TextDecoration.BOLD) == State.TRUE
            ? Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 10)
            : Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(695542479, 11);
         int var7 = var2.decoration(TextDecoration.ITALIC) == State.TRUE
            ? Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820108, 8)
            : Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820364, 9);
         Key var8 = var2.font();
         String var9 = var8 == null ? null : var8.asString();
         int var10 = Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-1164875884, 18);

         while (var10 < var1.length()) {
            int var11 = var1.codePointAt(var10);
            var10 += Character.charCount(var11);
            Xqedii_2q1o8r1 var12 = new Xqedii_2q1o8r1();
            var12.Xqedii_2zyef1q = var11;
            var12.Xqedii_xeufmmf = var5;
            var12.Xqedii_27itpdq = (var6 != 0);
            var12.Xqedii_3kr6lzk = (var7 != 0);
            this.Xqedii_g4hwjd7(var12, var9);
            var3.add(var12);
         }
      }
   }

   public void Xqedii_g4hwjd7(Xqedii_2q1o8r1 var1, String var2) {
      if (((-1182113784 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         int var3 = var1.Xqedii_2zyef1q;
         double var4 = var1.Xqedii_27itpdq
            ? Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2p5ci3d7bw25m(-8349582052515850823L, 55))
            : Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_1wdnslrxg2u8z(3707355751224822949L, 20));
         if (var3 == Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(1555286621, 25)) {
            var1.Xqedii_2f1zu9z = Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(1861755947, 18);
            var1.Xqedii_1q7ydj6 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787858807400L, 50));
         } else {
            BossbarAssets.Sprite var6 = this.Xqedii_2oupt0w.sprite(var2, var3);
            if (var6 != null) {
               var1.Xqedii_2f1zu9z = Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1861755948, 12);
               var1.Xqedii_2bcofvn = var6;
               var1.Xqedii_1q7ydj6 = var6.layoutAdvance + var4;
            } else {
               boolean var7 = BossbarAssets.isDefaultFont(var2);
               BossbarAssets.TextFace var8 = var7 ? null : this.Xqedii_2oupt0w.face(var2);
               if (var8 != null && var8.ttf.hasCodepoint(var3)) {
                  var1.Xqedii_2f1zu9z = var3 == Xqedii_3b3f8mg.Xqedii_nx6cuuvq3r1d(-1862263852, 14)
                     ? Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1174701950, 12)
                     : Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-694597580, 23);
                  var1.Xqedii_3tj78o2 = var8;
                  var1.Xqedii_1q7ydj6 = var8.advanceFont(var3) + var4;
               } else {
                  if (var7 || var8 == null) {
                     Double var9 = this.Xqedii_2oupt0w.vanillaSpace(var3);
                     if (var9 != null) {
                        var1.Xqedii_2f1zu9z = Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820368, 0);
                        var1.Xqedii_1q7ydj6 = var9 + var4;
                        return;
                     }

                     BossbarAssets.VanillaGlyph var10 = this.Xqedii_2oupt0w.vanillaGlyph(var3);
                     if (var10 != null) {
                        var1.Xqedii_2f1zu9z = Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-1270784771, 27);
                        var1.Xqedii_27at3tw = var10;
                        var1.Xqedii_1q7ydj6 = var10.layoutAdvance() + var4;
                        return;
                     }
                  }

                  BossbarAssets.TextFace var11 = this.Xqedii_2oupt0w.fallbackFace();
                  if (var11 != null && var11.ttf.hasCodepoint(var3)) {
                     var1.Xqedii_2f1zu9z = var3 == Xqedii_3b3f8mg.Xqedii_120djxek0ngug(1310764671, 26)
                        ? Xqedii_3b3f8mg.Xqedii_27zuecxii6v5a(-368730542, 20)
                        : Xqedii_3b3f8mg.Xqedii_120djxek0ngug(-624683569, 23);
                     var1.Xqedii_3tj78o2 = var11;
                     var1.Xqedii_1q7ydj6 = var11.advanceFont(var3) + var4;
                  } else {
                     var1.Xqedii_2f1zu9z = Xqedii_3b3f8mg.Xqedii_2rcnntl7pzihq(-677820364, 29);
                     var1.Xqedii_1q7ydj6 = Double.longBitsToDouble(Xqedii_3b3f8mg.Xqedii_2spn3h8f00fnt(3143266787858807400L, 14));
                  }
               }
            }
         }
      }
   }

   static {
      if ((1901492833 * (1901492833 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         Xqedii_7wvmt1t = MiniMessage.miniMessage();
      }
   }
}
