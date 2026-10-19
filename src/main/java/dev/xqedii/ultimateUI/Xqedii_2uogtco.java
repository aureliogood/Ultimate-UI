package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2uogtco {
   private static final ConcurrentHashMap<String, String> Xqedii_283fkh49f1ff7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1lpcia8ygqhak = -1954155801;
   private static volatile int Xqedii_3bkmqlte9giqj = -2080316835;
   private static volatile int Xqedii_1ki6xau1980ui = 770506042;
   private static volatile int Xqedii_l1p2v2k11v42 = -1739152774;
   private static volatile long Xqedii_3i5jbvdp06uib = -6580641293084444342L;
   private static volatile long Xqedii_37owpb9h98g5n = -1761055905092996961L;
   private static volatile long Xqedii_1nlaq3615gtoc = 2227725940288067769L;
   private static volatile long Xqedii_189pzq5wa2hd3 = -8078461398104277244L;

   public static int Xqedii_33vm0xsrgzdzz(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1lpcia8ygqhak, var1);
   }

   public static int Xqedii_zi1l3m88esjs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3bkmqlte9giqj;
   }

   public static int Xqedii_2pjjbfphdroi3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1ki6xau1980ui;
   }

   public static int Xqedii_2su99qqwo80v8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_l1p2v2k11v42, var1);
   }

   public static long Xqedii_3e9nfc4h9ygpb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3i5jbvdp06uib, var2);
   }

   public static long Xqedii_1ys7wgvcy3ufw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_37owpb9h98g5n;
   }

   public static long Xqedii_2rtuoviw6g7zb(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1nlaq3615gtoc;
   }

   public static long Xqedii_2j35djvs1yrm0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_189pzq5wa2hd3, var2);
   }

   public static String Xqedii_2u24vl6li6wkt(String var0) {
      String var1 = Xqedii_283fkh49f1ff7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("z0LYVLktzNh5GNpePgPUuEjAjg/h/bAtobZ56wkba4o=");
            int var3 = -1381049941;

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
            String var9 = Xqedii_283fkh49f1ff7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_u7cr1c75x6uu() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_y71hmheauu6u() {
   }

   private static int Xqedii_21qm6p7tukdku(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2r63c0txr8wf5(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
