package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_lameitb {
   private static final ConcurrentHashMap<String, String> Xqedii_26jdiwxh3aezu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_95vl6gjaijuo = -739508443;
   private static volatile int Xqedii_1alcdbp0ntszm = 1311202768;
   private static volatile int Xqedii_19kk82kxo1qm7 = 2144346405;
   private static volatile int Xqedii_1nut3rdqhw9qg = -2027989570;
   private static volatile long Xqedii_ii6tkab07jtm = 8711694749420711321L;
   private static volatile long Xqedii_3ufm93hfawk1d = 1960106372860315733L;
   private static volatile long Xqedii_ibmd3v8a5cfw = 7343352746163601507L;
   private static volatile long Xqedii_biwvmwozaubi = 6243729677531671143L;

   public static int Xqedii_2df7q3bcfm9uc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_95vl6gjaijuo, var1);
   }

   public static int Xqedii_pm01awaifeh4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1alcdbp0ntszm;
   }

   public static int Xqedii_3i9ie8tczt2oa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_19kk82kxo1qm7;
   }

   public static int Xqedii_jot0j7jkmf5j(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1nut3rdqhw9qg, var1);
   }

   public static long Xqedii_23780oki24r5b(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ii6tkab07jtm, var2);
   }

   public static long Xqedii_2nz2ib4bnzyr5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3ufm93hfawk1d;
   }

   public static long Xqedii_2n81hldncla8p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ibmd3v8a5cfw;
   }

   public static long Xqedii_1egnr6tcyubl2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_biwvmwozaubi, var2);
   }

   public static String Xqedii_1dnv7lfu9l7es(String var0) {
      String var1 = Xqedii_26jdiwxh3aezu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/izPgMbOrU6S8RjZW1Jr8tMzyFOorUo4oE3mCsuF/Fc=");
            int var3 = 757750969;

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
            String var9 = Xqedii_26jdiwxh3aezu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3vqaahrcib8im() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2kx0bshttm89() {
   }

   private static int Xqedii_1w1mcqbuzfjf1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1jxj83cxxslla(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
