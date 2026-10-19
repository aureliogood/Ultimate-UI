package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_elrxld2 {
   private static final ConcurrentHashMap<String, String> Xqedii_18kj8jfhmzuaq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2nubqrvjnbdcg = -1360131733;
   private static volatile int Xqedii_1g7ymx27nv5uw = -1666377808;
   private static volatile int Xqedii_fkjf3tgnxsoe = 977950347;
   private static volatile int Xqedii_2yjnn8h1x4gw7 = 1559893141;
   private static volatile long Xqedii_2hm0u72o1i0e2 = 5100546471680300692L;
   private static volatile long Xqedii_2lwyiurt7zyyj = -376979949822511429L;
   private static volatile long Xqedii_2668xf1fcby7x = 7700929659379959611L;
   private static volatile long Xqedii_4gkz580y4ecd = -1803671980341256600L;

   public static int Xqedii_3hz5c4inp35v5(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2nubqrvjnbdcg, var1);
   }

   public static int Xqedii_1e7cym7nd2mub(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1g7ymx27nv5uw;
   }

   public static int Xqedii_27mw9882xj5yz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_fkjf3tgnxsoe;
   }

   public static int Xqedii_32ezzkll5egl4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2yjnn8h1x4gw7, var1);
   }

   public static long Xqedii_3untjror075i7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2hm0u72o1i0e2, var2);
   }

   public static long Xqedii_3i5zke8qymi1g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2lwyiurt7zyyj;
   }

   public static long Xqedii_mbzptgwfmvq(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2668xf1fcby7x;
   }

   public static long Xqedii_1c2wkl3nltp05(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_4gkz580y4ecd, var2);
   }

   public static String Xqedii_2vm7vm90nfdvj(String var0) {
      String var1 = Xqedii_18kj8jfhmzuaq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("yHisNgJDLB8Q8JFjN+nKTlBTJXJ9YCcvNcrXLZ+IuLI=");
            int var3 = -942408608;

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
            String var9 = Xqedii_18kj8jfhmzuaq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_rwkna2zlibf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3snia078ecasp() {
   }

   private static int Xqedii_28xr2aja6z1jy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_34wehk358xvle(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
