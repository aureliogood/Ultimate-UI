package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2bhd6x9 {
   private static final ConcurrentHashMap<String, String> Xqedii_2k8h5e8bdx49o = new ConcurrentHashMap<>();
   private static volatile int Xqedii_pvm3zvycu7xn = 1318408286;
   private static volatile int Xqedii_30umpq1t482sa = -481437250;
   private static volatile int Xqedii_wsxpyo6yobz7 = 482845251;
   private static volatile int Xqedii_2orf8wtjzpv3g = 1480362669;
   private static volatile long Xqedii_2j80h2t7zd1n5 = 7648762599578386563L;
   private static volatile long Xqedii_30w9wqaum9etp = -7248645273746812406L;
   private static volatile long Xqedii_1b1ba43vpyzy2 = 101996904293022241L;
   private static volatile long Xqedii_1uymppjbra3pc = 9144583859136088356L;

   public static int Xqedii_4awrilewxx6b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_pvm3zvycu7xn, var1);
   }

   public static int Xqedii_3p0f39pok1hjb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_30umpq1t482sa;
   }

   public static int Xqedii_33j32b6vy1mz4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_wsxpyo6yobz7;
   }

   public static int Xqedii_sf81lqhkeit7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2orf8wtjzpv3g, var1);
   }

   public static long Xqedii_5134x8dyzi0l(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2j80h2t7zd1n5, var2);
   }

   public static long Xqedii_2dtm45evgkluc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_30w9wqaum9etp;
   }

   public static long Xqedii_32suuh6w3ucw7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1b1ba43vpyzy2;
   }

   public static long Xqedii_3tydg3b1ir9eu(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1uymppjbra3pc, var2);
   }

   public static String Xqedii_1inp6d4af5fkm(String var0) {
      String var1 = Xqedii_2k8h5e8bdx49o.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("iPoweNo6vYZZ4g24vxBCNYDIW6J8fM99gCDr4SRin04=");
            int var3 = 496218009;

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
            String var9 = Xqedii_2k8h5e8bdx49o.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2ob2ano5cvp1x() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3atuximzq9ik5() {
   }

   private static int Xqedii_21f92k6xs8nnr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1vwq94t0ki5cb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
