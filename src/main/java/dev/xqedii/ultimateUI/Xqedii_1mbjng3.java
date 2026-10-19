package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1mbjng3 {
   private static final ConcurrentHashMap<String, String> Xqedii_23jg5xs12to61 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2xuc8p62yovel = 1249642276;
   private static volatile int Xqedii_3jchy2ctffys0 = 19549625;
   private static volatile int Xqedii_3epou2bbj1em2 = 1343257446;
   private static volatile int Xqedii_32lg9bt520gxo = -1616833229;
   private static volatile long Xqedii_ekwlioxe7vy = 7669628542938608900L;
   private static volatile long Xqedii_2di1tkvnfebps = 1612813698129922309L;
   private static volatile long Xqedii_7qrbw25rhue0 = 5420545606271811319L;
   private static volatile long Xqedii_1qmcnooaf2u72 = -7842774540466972001L;

   public static int Xqedii_10evafa1ljm3z(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2xuc8p62yovel, var1);
   }

   public static int Xqedii_13zk4yenwt60k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3jchy2ctffys0;
   }

   public static int Xqedii_2nrzpafhdxs5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3epou2bbj1em2;
   }

   public static int Xqedii_3oyrgapfh5p4d(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_32lg9bt520gxo, var1);
   }

   public static long Xqedii_2c0zcxgxdajhw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ekwlioxe7vy, var2);
   }

   public static long Xqedii_38n9256522reh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2di1tkvnfebps;
   }

   public static long Xqedii_1dm3nhno73sj2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_7qrbw25rhue0;
   }

   public static long Xqedii_3p6f0fpozsagd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1qmcnooaf2u72, var2);
   }

   public static String Xqedii_36h13y20ogf2g(String var0) {
      String var1 = Xqedii_23jg5xs12to61.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("jnYtZRReEB44tutKWw1upzqqXETRubhD1E+CePgwtno=");
            int var3 = -725566850;

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
            String var9 = Xqedii_23jg5xs12to61.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3puf95md0wczm() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3ec0r1mb1fido() {
   }

   private static int Xqedii_18epodqw4taf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_9qlfdu99ls26(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
