package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_e49t38l {
   private static final ConcurrentHashMap<String, String> Xqedii_e1iozs9dbn6x = new ConcurrentHashMap<>();
   private static volatile int Xqedii_304ps6pyeoqem = -1439988427;
   private static volatile int Xqedii_foz7g19xryzy = 1708457066;
   private static volatile int Xqedii_2i5plhtqibdk3 = 926268293;
   private static volatile int Xqedii_2ojquh9c1z1ct = 1304989184;
   private static volatile long Xqedii_22aggl2paghtb = -3544630343482634775L;
   private static volatile long Xqedii_2ajlghkeqdq3z = -4478712588198983306L;
   private static volatile long Xqedii_t1s2ajvhh6bp = -8081741070970128841L;
   private static volatile long Xqedii_2enyfiipr4knw = 6471491337273921547L;

   public static int Xqedii_3tb2me6sed285(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_304ps6pyeoqem, var1);
   }

   public static int Xqedii_2xc2cw2gjd0w1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_foz7g19xryzy;
   }

   public static int Xqedii_qsys6atqw7a2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2i5plhtqibdk3;
   }

   public static int Xqedii_1xuzwcon1arzc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2ojquh9c1z1ct, var1);
   }

   public static long Xqedii_14ytzophmjj62(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_22aggl2paghtb, var2);
   }

   public static long Xqedii_tzsn3xi6g2yx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ajlghkeqdq3z;
   }

   public static long Xqedii_wxkt9v2b0jve(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_t1s2ajvhh6bp;
   }

   public static long Xqedii_2aq1nzc057jyp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2enyfiipr4knw, var2);
   }

   public static String Xqedii_27uz0iajqdwxy(String var0) {
      String var1 = Xqedii_e1iozs9dbn6x.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CUaSfru6KgoBY0QA0C2YnpCqkUPLCcGjcFuFvAFkPko=");
            int var3 = 834638247;

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
            String var9 = Xqedii_e1iozs9dbn6x.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3buuojyhcfyr9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2oyb28kcg4mr1() {
   }

   private static int Xqedii_ulhmcvx0i56n(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2xm11ef0bpccs(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
