package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2s0rgns {
   private static final ConcurrentHashMap<String, String> Xqedii_1o4m8zf9gc3tp = new ConcurrentHashMap<>();
   private static volatile int Xqedii_382nippv1yy8m = 1565219224;
   private static volatile int Xqedii_1klf1acmdml0n = -180433691;
   private static volatile int Xqedii_2pw9s19og490q = -730361263;
   private static volatile int Xqedii_3d1xpw7uzdi9o = 1947327858;
   private static volatile long Xqedii_2vgnoutbbyg9y = -7260620827443488877L;
   private static volatile long Xqedii_z7p7d26p3kbs = -3182490629727232637L;
   private static volatile long Xqedii_1zxfkxwgc9rep = -3968169001049213464L;
   private static volatile long Xqedii_3ab2l30np9wjb = -2033005215989734409L;

   public static int Xqedii_2ku9s9yfkcunx(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_382nippv1yy8m, var1);
   }

   public static int Xqedii_2yb2tstif1goa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1klf1acmdml0n;
   }

   public static int Xqedii_1pi6qwxd62esa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2pw9s19og490q;
   }

   public static int Xqedii_hsrg898fwgx3(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3d1xpw7uzdi9o, var1);
   }

   public static long Xqedii_17jpzbykna8gy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2vgnoutbbyg9y, var2);
   }

   public static long Xqedii_3mfj0wvysavk5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_z7p7d26p3kbs;
   }

   public static long Xqedii_1hpkwunp7syui(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1zxfkxwgc9rep;
   }

   public static long Xqedii_gdgzynq0w7o2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ab2l30np9wjb, var2);
   }

   public static String Xqedii_2cz5stwo2kj7j(String var0) {
      String var1 = Xqedii_1o4m8zf9gc3tp.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("QEuIwEHvzzdKyn3dI+kmEX6iSbV3ptQAKsVwST6KcuQ=");
            int var3 = -2141588259;

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
            String var9 = Xqedii_1o4m8zf9gc3tp.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_15cn3w9n1x3hl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2r4lfvivmw8gu() {
   }

   private static int Xqedii_2inqr7z534ah3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_34m8evl8paz3c(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
