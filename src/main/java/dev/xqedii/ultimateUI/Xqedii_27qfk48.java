package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_27qfk48 {
   private static final ConcurrentHashMap<String, String> Xqedii_lomj8fno0jya = new ConcurrentHashMap<>();
   private static volatile int Xqedii_uf26gyfk96ci = -187618069;
   private static volatile int Xqedii_n0xr27e45h46 = -619620737;
   private static volatile int Xqedii_scqh5aclee0o = -766884963;
   private static volatile int Xqedii_2czapzwxnur5j = -1041536156;
   private static volatile long Xqedii_1g7n4o46ovac8 = 3413053833132026479L;
   private static volatile long Xqedii_2121qnamrqiqf = 3475841007585259491L;
   private static volatile long Xqedii_1vicoxu0ana16 = -8502647910354692811L;
   private static volatile long Xqedii_3jlllg3m78ix9 = 854858406225074689L;

   public static int Xqedii_5qgsmqdk30iq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_uf26gyfk96ci, var1);
   }

   public static int Xqedii_2qxcv8q5fdarj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_n0xr27e45h46;
   }

   public static int Xqedii_mkcbeiln176k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_scqh5aclee0o;
   }

   public static int Xqedii_inj5wb5xpz73(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2czapzwxnur5j, var1);
   }

   public static long Xqedii_2ua6r0odlw2sp(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1g7n4o46ovac8, var2);
   }

   public static long Xqedii_3990hxl07vr18(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2121qnamrqiqf;
   }

   public static long Xqedii_3fyl397scwb0r(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1vicoxu0ana16;
   }

   public static long Xqedii_1bcddxko0jng3(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3jlllg3m78ix9, var2);
   }

   public static String Xqedii_3k5tk64llw2tl(String var0) {
      String var1 = Xqedii_lomj8fno0jya.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("4iA4aKj68CVHii5Fu4JBesSWJuxhHNsRo49/EvPA2R0=");
            int var3 = -704692853;

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
            String var9 = Xqedii_lomj8fno0jya.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2wyj8tapqmj0p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1cjom3dwalair() {
   }

   private static int Xqedii_253fyycsn3exa(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2xgts312f472f(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
