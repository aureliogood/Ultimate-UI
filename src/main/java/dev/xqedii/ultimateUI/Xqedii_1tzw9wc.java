package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1tzw9wc {
   private static final ConcurrentHashMap<String, String> Xqedii_o26wzp8bt4xx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_21hm5orhzqkkx = -988168326;
   private static volatile int Xqedii_iwzp3gthiy8i = -2101545699;
   private static volatile int Xqedii_4hj3fzp0e26o = 678302459;
   private static volatile int Xqedii_5bisv7nlpua2 = 2084910962;
   private static volatile long Xqedii_38m3igmjg2qnw = -5787045457332805139L;
   private static volatile long Xqedii_19embv0t3x2cd = 6371727739401140426L;
   private static volatile long Xqedii_3ftx48nic0me3 = -8014306289081886370L;
   private static volatile long Xqedii_3ract39i1j13k = -4246241135447445204L;

   public static int Xqedii_4hoya06578pk(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_21hm5orhzqkkx, var1);
   }

   public static int Xqedii_lf55gqjjhgol(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_iwzp3gthiy8i;
   }

   public static int Xqedii_2j3glw5wi80h4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_4hj3fzp0e26o;
   }

   public static int Xqedii_2ka1kmldgpzfe(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_5bisv7nlpua2, var1);
   }

   public static long Xqedii_11kp46g1mna2a(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38m3igmjg2qnw, var2);
   }

   public static long Xqedii_3ukoimtlz0uuz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_19embv0t3x2cd;
   }

   public static long Xqedii_zz8e8utk1bm0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3ftx48nic0me3;
   }

   public static long Xqedii_2f7c3of5rbcnv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ract39i1j13k, var2);
   }

   public static String Xqedii_1o3c0pu2uful4(String var0) {
      String var1 = Xqedii_o26wzp8bt4xx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("m6JC9tmLa1uI7FTrF5w+1vlmfi1kOnlLJ9eHetH6YZc=");
            int var3 = 133260125;

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
            String var9 = Xqedii_o26wzp8bt4xx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2q2u547kcxg0k() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2x7f40yzuu2h() {
   }

   private static int Xqedii_gofwg9aq3vki(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1wvo57ygq5v2f(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
