package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3dh0qpb {
   private static final ConcurrentHashMap<String, String> Xqedii_1dnwtlx0k7k75 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_coztrjjvleun = -172385524;
   private static volatile int Xqedii_2hykzc3yjibtn = 1873988525;
   private static volatile int Xqedii_3j6dnx8iuhkt5 = -1552456128;
   private static volatile int Xqedii_31qmsn3mlj5gh = -1791264679;
   private static volatile long Xqedii_353xbf0yxm7lj = 8519008300715754844L;
   private static volatile long Xqedii_1wr4xo0kizci7 = 5180718311809160188L;
   private static volatile long Xqedii_3vx75jh3t7oaa = 4993307165953681460L;
   private static volatile long Xqedii_1oyavhtpdt1vb = 5257992949159906140L;

   public static int Xqedii_3jbi5x65kqcmq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_coztrjjvleun, var1);
   }

   public static int Xqedii_3dgwl9pt9wu7b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2hykzc3yjibtn;
   }

   public static int Xqedii_fuiyvqgwb3af(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3j6dnx8iuhkt5;
   }

   public static int Xqedii_3gmd5xcxpqkkc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_31qmsn3mlj5gh, var1);
   }

   public static long Xqedii_3koijw1umc6ho(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_353xbf0yxm7lj, var2);
   }

   public static long Xqedii_2syutxgkz1spc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1wr4xo0kizci7;
   }

   public static long Xqedii_2uwtt9tq4wdez(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3vx75jh3t7oaa;
   }

   public static long Xqedii_2iald7m4y870o(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1oyavhtpdt1vb, var2);
   }

   public static String Xqedii_1fh8x1hpo02vx(String var0) {
      String var1 = Xqedii_1dnwtlx0k7k75.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("56URG/Kx9xS9/eatayIL+QwTFZMojdvg1oCDfXS99OA=");
            int var3 = 1178363723;

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
            String var9 = Xqedii_1dnwtlx0k7k75.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2dp02xoj4bist() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1dk3bgoo1psww() {
   }

   private static int Xqedii_3c1y9a60z2272(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_270lndotehueu(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
