package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3bqjxan {
   private static final ConcurrentHashMap<String, String> Xqedii_3rdpr6qpvccua = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3gz5lg72nsoui = -656398105;
   private static volatile int Xqedii_2le5youpn9xoo = 1180245916;
   private static volatile int Xqedii_3j3fv36gzeawn = 1618490163;
   private static volatile int Xqedii_3sqa7vi0niy0s = -863324678;
   private static volatile long Xqedii_1ttbftmw0pxpg = -4339171001037434133L;
   private static volatile long Xqedii_2lan24flbd6by = -6509398964835723887L;
   private static volatile long Xqedii_2bro0cqsw56u = 6895354167022178056L;
   private static volatile long Xqedii_10a0ir0sqy0gz = -8629954106117530932L;

   public static int Xqedii_19nnv10tfjody(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3gz5lg72nsoui, var1);
   }

   public static int Xqedii_2y60b6jppmgai(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2le5youpn9xoo;
   }

   public static int Xqedii_1rhk4xxvca17z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3j3fv36gzeawn;
   }

   public static int Xqedii_4gpni6uudfku(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3sqa7vi0niy0s, var1);
   }

   public static long Xqedii_8sdantmtvxyr(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ttbftmw0pxpg, var2);
   }

   public static long Xqedii_3cmpwa44v7r4b(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2lan24flbd6by;
   }

   public static long Xqedii_3slz38o6z63wi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2bro0cqsw56u;
   }

   public static long Xqedii_i7dyvqnm4phw(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_10a0ir0sqy0gz, var2);
   }

   public static String Xqedii_1k9a8mnffug3u(String var0) {
      String var1 = Xqedii_3rdpr6qpvccua.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("8nxzvujCr7qHNhGzwEmYZJSXYc7a01MH4Het0sOKrcE=");
            int var3 = -891694672;

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
            String var9 = Xqedii_3rdpr6qpvccua.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1d8dg53z0vsr1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_28owmve26uy1k() {
   }

   private static int Xqedii_2ygll9fw945cq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_s0y0lielxgzv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
