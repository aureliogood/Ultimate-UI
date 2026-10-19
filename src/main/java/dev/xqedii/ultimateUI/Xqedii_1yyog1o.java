package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1yyog1o {
   private static final ConcurrentHashMap<String, String> Xqedii_zgbdsxanl4gn = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2hyh7oijq9r9t = -2002483126;
   private static volatile int Xqedii_3ribi0oljl836 = 1125511509;
   private static volatile int Xqedii_2v5fpy4mqrm6n = 731528825;
   private static volatile int Xqedii_2rcqfybtb6q3o = -2097761908;
   private static volatile long Xqedii_2l92eera5pwuf = 4910123159187460788L;
   private static volatile long Xqedii_47hgdcpzr7e6 = 4087841327439025779L;
   private static volatile long Xqedii_18fz4y6mb76t6 = -5778720657725937974L;
   private static volatile long Xqedii_3j1pln4mlbioq = -4099648341517549257L;

   public static int Xqedii_9w4szztik3zy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2hyh7oijq9r9t, var1);
   }

   public static int Xqedii_350loa8x6zuyv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ribi0oljl836;
   }

   public static int Xqedii_1awbx0qsqgh3n(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2v5fpy4mqrm6n;
   }

   public static int Xqedii_16il13xo4zjsk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2rcqfybtb6q3o, var1);
   }

   public static long Xqedii_2fn8d3pf37m0d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2l92eera5pwuf, var2);
   }

   public static long Xqedii_2w73jy18fhr0l(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_47hgdcpzr7e6;
   }

   public static long Xqedii_3ou7327spsw39(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_18fz4y6mb76t6;
   }

   public static long Xqedii_29lgpfcqqcid7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3j1pln4mlbioq, var2);
   }

   public static String Xqedii_1nhp1t5pudt9d(String var0) {
      String var1 = Xqedii_zgbdsxanl4gn.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("QMzh/rJIJys1ezrOSk4tDKGP8VUpqRdCHjDhiV+xIIw=");
            int var3 = 1392377080;

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
            String var9 = Xqedii_zgbdsxanl4gn.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_310834p7kszze() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_h1lxi8ehlaoe() {
   }

   private static int Xqedii_1rkh7x6zj1rzg(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_y3agegvei236(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
