package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_oipc0fl {
   private static final ConcurrentHashMap<String, String> Xqedii_11ghfpdjnnd01 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2dbty84kb55r2 = 1236691575;
   private static volatile int Xqedii_2mp6981mggdwf = 1485257602;
   private static volatile int Xqedii_2ak9145z9avbv = 1967754856;
   private static volatile int Xqedii_1trx9rv7wndgp = 1730302561;
   private static volatile long Xqedii_i394qkf34a4v = -6657009465750616060L;
   private static volatile long Xqedii_23cpprijbs21z = -3340175445394266213L;
   private static volatile long Xqedii_1tj9x3pyyt28m = -6618126207096784297L;
   private static volatile long Xqedii_24o4ujcaimwir = -4196966490329742460L;

   public static int Xqedii_2d0juc8pnw5js(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2dbty84kb55r2, var1);
   }

   public static int Xqedii_1utdmk10rd8h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mp6981mggdwf;
   }

   public static int Xqedii_18ye8r6to4ufp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ak9145z9avbv;
   }

   public static int Xqedii_eg27ut5plazj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1trx9rv7wndgp, var1);
   }

   public static long Xqedii_1qs17kjj89mgd(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_i394qkf34a4v, var2);
   }

   public static long Xqedii_20k9mejfekqz7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_23cpprijbs21z;
   }

   public static long Xqedii_bwmy5165i9gf(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1tj9x3pyyt28m;
   }

   public static long Xqedii_1u9qkt6ftrawb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_24o4ujcaimwir, var2);
   }

   public static String Xqedii_3vk777ma30rov(String var0) {
      String var1 = Xqedii_11ghfpdjnnd01.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("m6DfjOF6/0TdtpaYqz0uZ5yzvyFvoJnXDFS98eZU1+U=");
            int var3 = 1220334297;

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
            String var9 = Xqedii_11ghfpdjnnd01.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_29i7vipaqbnwq() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1swrlcit10c2e() {
   }

   private static int Xqedii_gsugqdy68em6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3czrwjdfsuygp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
