package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ybtgvo {
   private static final ConcurrentHashMap<String, String> Xqedii_2wpem3r0msypk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_5s51xjdekssr = -1057192487;
   private static volatile int Xqedii_24f4osf7w8a11 = -1338723844;
   private static volatile int Xqedii_jyom287lmgok = 277576143;
   private static volatile int Xqedii_39kyl6jsnn7u5 = -897012075;
   private static volatile long Xqedii_26pgryosj842 = 7252364042703214773L;
   private static volatile long Xqedii_1krmw3cog3el1 = 8653819231911340096L;
   private static volatile long Xqedii_18y4y47w3987o = -5501253680760367559L;
   private static volatile long Xqedii_ho9lwuqoqf3x = 5024772902189528572L;

   public static int Xqedii_1d67bvumttnat(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_5s51xjdekssr, var1);
   }

   public static int Xqedii_34sv3mwl82reu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_24f4osf7w8a11;
   }

   public static int Xqedii_25oxam6932jel(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_jyom287lmgok;
   }

   public static int Xqedii_1n4un3y8wzouz(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_39kyl6jsnn7u5, var1);
   }

   public static long Xqedii_2ul46zbwicwjx(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_26pgryosj842, var2);
   }

   public static long Xqedii_3qxo9b891cy15(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1krmw3cog3el1;
   }

   public static long Xqedii_31xntvj3cz11j(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_18y4y47w3987o;
   }

   public static long Xqedii_12ctv8al0c61j(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ho9lwuqoqf3x, var2);
   }

   public static String Xqedii_nrffsj2e8epc(String var0) {
      String var1 = Xqedii_2wpem3r0msypk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ykIf+1TqEyM4IpNkvNtEApAYShAYKnV/Zv+Y/2cj844=");
            int var3 = -710512716;

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
            String var9 = Xqedii_2wpem3r0msypk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3vneh76f3494c() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1t8dzhtar3u4i() {
   }

   private static int Xqedii_21zqh2titpgjt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_25ebama3295hd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
