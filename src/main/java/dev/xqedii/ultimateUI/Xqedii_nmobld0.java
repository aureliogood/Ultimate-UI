package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_nmobld0 {
   private static final ConcurrentHashMap<String, String> Xqedii_3myjm9gd0utff = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1eo3j4yfghrf4 = 294158446;
   private static volatile int Xqedii_2hpap0m6vajsp = 1393098896;
   private static volatile int Xqedii_3f43vym2tye2g = -1331789033;
   private static volatile int Xqedii_2qmvclvgftyey = 1050632368;
   private static volatile long Xqedii_4a59yeal5h5o = -865551460064069560L;
   private static volatile long Xqedii_1q2lydbvm0s5v = -6728622401566645050L;
   private static volatile long Xqedii_2ob5wes2f3v8m = 164367516084793037L;
   private static volatile long Xqedii_j2fam4581yza = 169994163456037487L;

   public static int Xqedii_3629ve2ou1w32(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1eo3j4yfghrf4, var1);
   }

   public static int Xqedii_109t7q357urhc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2hpap0m6vajsp;
   }

   public static int Xqedii_6glvbaqqem6u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3f43vym2tye2g;
   }

   public static int Xqedii_nscxbdzt34d6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qmvclvgftyey, var1);
   }

   public static long Xqedii_1ip8rwlzd7jar(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_4a59yeal5h5o, var2);
   }

   public static long Xqedii_1oky2bjbuwilx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1q2lydbvm0s5v;
   }

   public static long Xqedii_1oih7995y2005(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ob5wes2f3v8m;
   }

   public static long Xqedii_13v44mrxvo11p(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_j2fam4581yza, var2);
   }

   public static String Xqedii_3an818njlvhm8(String var0) {
      String var1 = Xqedii_3myjm9gd0utff.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HbQwDKMRK+Qj5orlTE4EnuaK93FJfNMS/LutDTPgvTo=");
            int var3 = 1750351552;

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
            String var9 = Xqedii_3myjm9gd0utff.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_28zue16pda9fo() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_8x0yvmedo978() {
   }

   private static int Xqedii_jcbf5y0tmepm(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_238djk9120t5m(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
