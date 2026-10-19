package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1liiawt {
   private static final ConcurrentHashMap<String, String> Xqedii_90ui1k0cjx1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_29k3rt398d6dh = 230770773;
   private static volatile int Xqedii_39pcy27bxkzoa = 1080952693;
   private static volatile int Xqedii_229tl6wd4blua = 2081411538;
   private static volatile int Xqedii_jyf7ro5z20yg = -805035912;
   private static volatile long Xqedii_3lucztyhzs72a = 5803552601382262020L;
   private static volatile long Xqedii_58462j9q3q49 = 3891565270905952443L;
   private static volatile long Xqedii_1bzo9e7fkg8sm = -8342060032256138559L;
   private static volatile long Xqedii_32zb0smtdfllo = -7620009249941089978L;

   public static int Xqedii_2c7tw4u2gkyhn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_29k3rt398d6dh, var1);
   }

   public static int Xqedii_xraklyz8sd7k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_39pcy27bxkzoa;
   }

   public static int Xqedii_3j7xpnt1yfqtv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_229tl6wd4blua;
   }

   public static int Xqedii_rtjuoo2vrkry(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_jyf7ro5z20yg, var1);
   }

   public static long Xqedii_1fztciter3xed(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3lucztyhzs72a, var2);
   }

   public static long Xqedii_2cewieztmrrd5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_58462j9q3q49;
   }

   public static long Xqedii_2s5kivaycuwbi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1bzo9e7fkg8sm;
   }

   public static long Xqedii_1vfhgoql3mc33(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_32zb0smtdfllo, var2);
   }

   public static String Xqedii_23bci2sic49et(String var0) {
      String var1 = Xqedii_90ui1k0cjx1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("36nqwFLzX8HAOcAkWTs7FxMHhjaPAg6lmetQY6nfiHI=");
            int var3 = 1810380076;

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
            String var9 = Xqedii_90ui1k0cjx1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3gor87zv43lsk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1wly7c7zgsub0() {
   }

   private static int Xqedii_1hfxwue45lt0d(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2teplew9pgcex(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
