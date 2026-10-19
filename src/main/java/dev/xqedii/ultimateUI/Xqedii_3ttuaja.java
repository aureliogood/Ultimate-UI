package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ttuaja {
   private static final ConcurrentHashMap<String, String> Xqedii_3q56i389p4k90 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2tektqbltkg7h = -1351569601;
   private static volatile int Xqedii_2ckl02ojq0bs2 = 1842486668;
   private static volatile int Xqedii_374o16ycfdr2g = 1517973489;
   private static volatile int Xqedii_hclgjwc85ex = 1131480012;
   private static volatile long Xqedii_37p6b96injypl = -4431448657631675126L;
   private static volatile long Xqedii_1511ndy9jg51g = 9189177398493593282L;
   private static volatile long Xqedii_1bdl6asi220on = -6728565803713617830L;
   private static volatile long Xqedii_10a006xs378yq = -4072746038063732818L;

   public static int Xqedii_25uokmtcxle3w(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2tektqbltkg7h, var1);
   }

   public static int Xqedii_z2q13a7xmv4g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ckl02ojq0bs2;
   }

   public static int Xqedii_8508dod8u6m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_374o16ycfdr2g;
   }

   public static int Xqedii_1mnkcat5luh1p(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_hclgjwc85ex, var1);
   }

   public static long Xqedii_1aocyzngnbrd(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_37p6b96injypl, var2);
   }

   public static long Xqedii_3ocfdqmppxyyx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1511ndy9jg51g;
   }

   public static long Xqedii_3uz4aq1gciosy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1bdl6asi220on;
   }

   public static long Xqedii_177rk62zmzt82(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_10a006xs378yq, var2);
   }

   public static String Xqedii_24u7eco6n9vpx(String var0) {
      String var1 = Xqedii_3q56i389p4k90.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Rv7xDL8586KTRfM9OM1bemSWCEgLhY8KxX3U5UIkUGA=");
            int var3 = 619674359;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_3q56i389p4k90.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_t8d53sfcqjcy() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_27npt82aiy54h() {
   }

   private static int Xqedii_1pwczifs0m7mg(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_phnt91xa9uav(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
