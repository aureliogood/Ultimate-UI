package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2itpe68 {
   private static final ConcurrentHashMap<String, String> Xqedii_z699py1a3np7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1mg4ta1r2izx1 = 420299041;
   private static volatile int Xqedii_ylgqaimjsa85 = 149180348;
   private static volatile int Xqedii_t2fm0z8w7ivq = 182053436;
   private static volatile int Xqedii_2totsab7bxpdz = 1901176991;
   private static volatile long Xqedii_294w9e501nwkb = -2128455368030625090L;
   private static volatile long Xqedii_3hu38swgv99k8 = -5027250561086923033L;
   private static volatile long Xqedii_15ji0cqerqm54 = -6406176755148912312L;
   private static volatile long Xqedii_32vv511qhzjel = 2886307434282261061L;

   public static int Xqedii_kjqvpq2ldafx(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1mg4ta1r2izx1, var1);
   }

   public static int Xqedii_3iugeeeo59kwm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ylgqaimjsa85;
   }

   public static int Xqedii_2qndzss3kq924(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_t2fm0z8w7ivq;
   }

   public static int Xqedii_rvkchjyukg36(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2totsab7bxpdz, var1);
   }

   public static long Xqedii_mp1cdp9fyyq3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_294w9e501nwkb, var2);
   }

   public static long Xqedii_3a8ffzri11joh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3hu38swgv99k8;
   }

   public static long Xqedii_3gqsqzwzb15gl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_15ji0cqerqm54;
   }

   public static long Xqedii_2j0a2anvxqa5v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_32vv511qhzjel, var2);
   }

   public static String Xqedii_2a46zfnvqsfcp(String var0) {
      String var1 = Xqedii_z699py1a3np7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("96EQdQY6RwVF4fPetxXfP9Fd+Tfk7lw/JaAfM13gsAc=");
            int var3 = 2083028705;

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
            String var9 = Xqedii_z699py1a3np7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1jfjzcjjd4cto() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3b8yw7kyl3ev5() {
   }

   private static int Xqedii_3anp61rq3pwcf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3n5w0vjrg4n3m(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
