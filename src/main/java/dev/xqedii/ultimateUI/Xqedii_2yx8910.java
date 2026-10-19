package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2yx8910 {
   private static final ConcurrentHashMap<String, String> Xqedii_227xgpczo8nh5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3rs8mzkvbchvx = 1452716316;
   private static volatile int Xqedii_19ox9kb6qlfjj = 791628350;
   private static volatile int Xqedii_1yxcnfccebh9y = 1123704611;
   private static volatile int Xqedii_37wqmxmtztd97 = 1231198736;
   private static volatile long Xqedii_1j7hmb9751v80 = -2803753451783439431L;
   private static volatile long Xqedii_3j5vib7gll9ok = -1245635223971809220L;
   private static volatile long Xqedii_2zin7t0j95vls = -8391834293409354541L;
   private static volatile long Xqedii_28bq7y7qxevw = -8870127886614503199L;

   public static int Xqedii_3jffohw4bhb4m(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3rs8mzkvbchvx, var1);
   }

   public static int Xqedii_embrlqflclbb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_19ox9kb6qlfjj;
   }

   public static int Xqedii_ad9jkb7r3the(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1yxcnfccebh9y;
   }

   public static int Xqedii_3gvpm1ul97gne(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_37wqmxmtztd97, var1);
   }

   public static long Xqedii_2lqld9hkysbla(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1j7hmb9751v80, var2);
   }

   public static long Xqedii_2lqt0iszmhuhg(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3j5vib7gll9ok;
   }

   public static long Xqedii_neqw8u9nuu3p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2zin7t0j95vls;
   }

   public static long Xqedii_3pt4z91ef4b9d(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_28bq7y7qxevw, var2);
   }

   public static String Xqedii_1dnp5fzgvc2wm(String var0) {
      String var1 = Xqedii_227xgpczo8nh5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("VeJrk2p1Qq6agGtJ8hGE3y/6t1HHGWA9S7meEJeCmF4=");
            int var3 = -1768765120;

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
            String var9 = Xqedii_227xgpczo8nh5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2h2f37p5cvof5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3ihfo8elnzeg7() {
   }

   private static int Xqedii_21wly8xpn7ka4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1yo8h71za4bhl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
