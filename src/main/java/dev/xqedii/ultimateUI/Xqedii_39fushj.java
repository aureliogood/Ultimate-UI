package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_39fushj {
   private static final ConcurrentHashMap<String, String> Xqedii_3brf2v9zkihye = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1zqy86rf8uzbz = -1779869971;
   private static volatile int Xqedii_32jcearsgp73u = 2086692750;
   private static volatile int Xqedii_1mw93vt5p3umc = -683612806;
   private static volatile int Xqedii_2jgwvabckr0fp = -2046624298;
   private static volatile long Xqedii_1h4rvmkzb1me0 = 4040191964418067331L;
   private static volatile long Xqedii_14l08jmlv3a44 = 944719879366809483L;
   private static volatile long Xqedii_36o9hwtyj7huo = 1173859073328063863L;
   private static volatile long Xqedii_10q36bptl74j8 = -7774236973321066582L;

   public static int Xqedii_3tlyg4peol0ds(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1zqy86rf8uzbz, var1);
   }

   public static int Xqedii_2sehom94kjl4a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_32jcearsgp73u;
   }

   public static int Xqedii_j7gpcsxxbd6r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mw93vt5p3umc;
   }

   public static int Xqedii_35ex41kf78ku4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2jgwvabckr0fp, var1);
   }

   public static long Xqedii_2e3n0pkjm3qdl(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1h4rvmkzb1me0, var2);
   }

   public static long Xqedii_13qt875ezvgs7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_14l08jmlv3a44;
   }

   public static long Xqedii_29a0of7nc8ed8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_36o9hwtyj7huo;
   }

   public static long Xqedii_1bfk5wlly9uwv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_10q36bptl74j8, var2);
   }

   public static String Xqedii_3cajkvzh0u2e2(String var0) {
      String var1 = Xqedii_3brf2v9zkihye.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xKWYcoljHyls5eEDzGhMBhvyxdgcRlrYN5G2ULQzPzg=");
            int var3 = 1495432457;

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
            String var9 = Xqedii_3brf2v9zkihye.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1y2zy53u1g2ea() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_31tn5fp7tdoor() {
   }

   private static int Xqedii_2mic5401qbmbr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1e8pz59a9f2sl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
