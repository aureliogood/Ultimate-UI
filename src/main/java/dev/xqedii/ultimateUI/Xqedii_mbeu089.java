package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_mbeu089 {
   private static final ConcurrentHashMap<String, String> Xqedii_y2pyv8jtf6fv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_31pv3cilo7lk7 = -674298316;
   private static volatile int Xqedii_1nxvoqbsj737r = 692246224;
   private static volatile int Xqedii_370c83ypmqi00 = -625132560;
   private static volatile int Xqedii_14o3sfzilvwz4 = -53938435;
   private static volatile long Xqedii_1u5rfqimbefgp = -8792339401409059740L;
   private static volatile long Xqedii_2h1evr74hjbb1 = 4555152517220428834L;
   private static volatile long Xqedii_11yb7ipcjbzre = -3551316492403842163L;
   private static volatile long Xqedii_2u7wqq1rwrhl7 = 2632496005979610306L;

   public static int Xqedii_2k2zastcbaqfc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_31pv3cilo7lk7, var1);
   }

   public static int Xqedii_57urrhmsv3ff(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1nxvoqbsj737r;
   }

   public static int Xqedii_37dem9dkrwqay(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_370c83ypmqi00;
   }

   public static int Xqedii_276oiw4a0ik20(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_14o3sfzilvwz4, var1);
   }

   public static long Xqedii_2azqp9s8n7uah(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1u5rfqimbefgp, var2);
   }

   public static long Xqedii_2dtb9de0tyilv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2h1evr74hjbb1;
   }

   public static long Xqedii_lk98gu92058r(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_11yb7ipcjbzre;
   }

   public static long Xqedii_1ejz4hi7obhdm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2u7wqq1rwrhl7, var2);
   }

   public static String Xqedii_1p7fwokzu46ad(String var0) {
      String var1 = Xqedii_y2pyv8jtf6fv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("aJrPrNuCc9vVTOVQwgm3tUxHzPox+ZNyD+OQ82uVArw=");
            int var3 = 1883828262;

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
            String var9 = Xqedii_y2pyv8jtf6fv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2mcaixsj5ngfv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2zsyvt6t230d() {
   }

   private static int Xqedii_1w14ckdv4gdag(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1914cpoq45l58(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
