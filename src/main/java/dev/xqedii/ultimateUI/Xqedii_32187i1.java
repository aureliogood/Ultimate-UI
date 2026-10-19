package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_32187i1 {
   private static final ConcurrentHashMap<String, String> Xqedii_2ehtabfqs1be4 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_q2481y8mo32n = 858877054;
   private static volatile int Xqedii_2b77hp889sw33 = -1200222876;
   private static volatile int Xqedii_37v9o79xcuz0q = 954914548;
   private static volatile int Xqedii_4n5k4ne9swpm = 667605202;
   private static volatile long Xqedii_2fkkzm5ceg7p3 = 6156787159861764675L;
   private static volatile long Xqedii_333h9wpqs546l = 5930567663876627303L;
   private static volatile long Xqedii_if826qxiddhd = 6873435834338806753L;
   private static volatile long Xqedii_2rky458uji034 = 3619381789657912053L;

   public static int Xqedii_3mzp007twld3k(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_q2481y8mo32n, var1);
   }

   public static int Xqedii_r6k4rw9pbc3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2b77hp889sw33;
   }

   public static int Xqedii_1qg0vullhzji8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_37v9o79xcuz0q;
   }

   public static int Xqedii_3g1eyu38ks45p(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_4n5k4ne9swpm, var1);
   }

   public static long Xqedii_17c1qg5mg4aho(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2fkkzm5ceg7p3, var2);
   }

   public static long Xqedii_1enpcs6scpjmr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_333h9wpqs546l;
   }

   public static long Xqedii_18ds51vv2cir2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_if826qxiddhd;
   }

   public static long Xqedii_1tu4upt3wudbf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2rky458uji034, var2);
   }

   public static String Xqedii_3s0lohwdqbjct(String var0) {
      String var1 = Xqedii_2ehtabfqs1be4.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Xk3LMJx1fR+aKZ1PkKXCTmF2hBpEhw6D969GwsdZ71M=");
            int var3 = -1218258166;

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
            String var9 = Xqedii_2ehtabfqs1be4.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2h6vixdnnpvzs() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_q7kv6p83pq0t() {
   }

   private static int Xqedii_7m9jce1oudds(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_pzi9ui6g0lu1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
