package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3uek68f {
   private static final ConcurrentHashMap<String, String> Xqedii_286u8zyhl18r4 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3jvl4tgt4ja3j = -1135121926;
   private static volatile int Xqedii_3skbhrmsoajia = 994262701;
   private static volatile int Xqedii_ppgpabeqeb7a = -2042963317;
   private static volatile int Xqedii_10zhc0xnnebby = 915383373;
   private static volatile long Xqedii_2bsigq0eyp1mk = 2346621876011834692L;
   private static volatile long Xqedii_2f6nfse02k5k2 = 631568060944504363L;
   private static volatile long Xqedii_krxuzry9bgx7 = -8694963291035381009L;
   private static volatile long Xqedii_1r70rzf4oa1c3 = 1884454833426274535L;

   public static int Xqedii_yjkfjyqcsynr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3jvl4tgt4ja3j, var1);
   }

   public static int Xqedii_1qlua1qlsenda(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3skbhrmsoajia;
   }

   public static int Xqedii_2zlgl7s31ruus(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ppgpabeqeb7a;
   }

   public static int Xqedii_3jrgpw2hdga4x(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_10zhc0xnnebby, var1);
   }

   public static long Xqedii_o74adjca7ei5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2bsigq0eyp1mk, var2);
   }

   public static long Xqedii_1esf3vv56y5wk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2f6nfse02k5k2;
   }

   public static long Xqedii_2aok3qr7bgd0v(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_krxuzry9bgx7;
   }

   public static long Xqedii_3ngxdq53j49u7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1r70rzf4oa1c3, var2);
   }

   public static String Xqedii_2239o1jmlp1qu(String var0) {
      String var1 = Xqedii_286u8zyhl18r4.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("K6ptkfh4DRAczY/O0O1MlL4k3SYVJu17FAs3upHLowM=");
            int var3 = 673365019;

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
            String var9 = Xqedii_286u8zyhl18r4.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3724dolg28isf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3jz795ap8ubsv() {
   }

   private static int Xqedii_1eu31pea5t2sx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_32hapyqbvfxs2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
