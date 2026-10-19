package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1jypuw7 {
   private static final ConcurrentHashMap<String, String> Xqedii_1rulr6dtlnk3r = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1qljos0xwlqw5 = -306600990;
   private static volatile int Xqedii_3bmw0s61kjwv2 = 1863441498;
   private static volatile int Xqedii_1ubpateznoxt8 = 204382405;
   private static volatile int Xqedii_2zorv9dp2zpk0 = -237079490;
   private static volatile long Xqedii_1o24074a1boyg = 7722915658050768094L;
   private static volatile long Xqedii_3lu7u1ugmsfs1 = -3676608982679487180L;
   private static volatile long Xqedii_1yz07kglrbmws = 7112485433751068573L;
   private static volatile long Xqedii_r05td1gailnf = -6099981204854901627L;

   public static int Xqedii_q8oq049zzpns(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1qljos0xwlqw5, var1);
   }

   public static int Xqedii_xc6x94xdsmr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3bmw0s61kjwv2;
   }

   public static int Xqedii_2xsgorolisfmu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ubpateznoxt8;
   }

   public static int Xqedii_p5x9946o7jxr(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2zorv9dp2zpk0, var1);
   }

   public static long Xqedii_1zsdzk5qe6wsa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1o24074a1boyg, var2);
   }

   public static long Xqedii_3nqhjhfpllp7e(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3lu7u1ugmsfs1;
   }

   public static long Xqedii_2oaino0azycqd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1yz07kglrbmws;
   }

   public static long Xqedii_1b89r5ep6yny0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_r05td1gailnf, var2);
   }

   public static String Xqedii_2kfz1768hk58v(String var0) {
      String var1 = Xqedii_1rulr6dtlnk3r.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("tdIuFEuLupJoll4Hq7brmPs8GFaaMoTH5rkzkToFNa8=");
            int var3 = 978432291;

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
            String var9 = Xqedii_1rulr6dtlnk3r.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3hkws6dcu2szf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2yqwiw6pnfein() {
   }

   private static int Xqedii_3reqojyqzelx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3flebmo4a9kzx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
