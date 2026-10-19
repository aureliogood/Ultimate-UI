package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_6pzg5gm {
   private static final ConcurrentHashMap<String, String> Xqedii_1mhp9vmtqdf9t = new ConcurrentHashMap<>();
   private static volatile int Xqedii_pgcwd58bheh = -1331063097;
   private static volatile int Xqedii_758o7oyzls2j = 1329037552;
   private static volatile int Xqedii_dj8kbk1adghc = -2739401;
   private static volatile int Xqedii_3krwxgoyffqxx = -1495270702;
   private static volatile long Xqedii_2yhvol42lhehh = -819585692222027879L;
   private static volatile long Xqedii_1h1ofsdpllv4x = -6423865732475723175L;
   private static volatile long Xqedii_1k6lr8qpk7huj = 4540153275265716521L;
   private static volatile long Xqedii_37cf98c1bfxk4 = 34396804574460379L;

   public static int Xqedii_37ntovgqenvbk(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_pgcwd58bheh, var1);
   }

   public static int Xqedii_9u3lnutfw1ir(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_758o7oyzls2j;
   }

   public static int Xqedii_21gwr6qurptdm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_dj8kbk1adghc;
   }

   public static int Xqedii_2ekap1mf7smk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3krwxgoyffqxx, var1);
   }

   public static long Xqedii_xv2376eywbr7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2yhvol42lhehh, var2);
   }

   public static long Xqedii_61mrou2h1b7k(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1h1ofsdpllv4x;
   }

   public static long Xqedii_1cstb8rs09iid(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1k6lr8qpk7huj;
   }

   public static long Xqedii_2wybq4bnwyaxf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_37cf98c1bfxk4, var2);
   }

   public static String Xqedii_2mb5ncu7h4pfr(String var0) {
      String var1 = Xqedii_1mhp9vmtqdf9t.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Rh3H2TTeop4cGzyOTBgZXw9LE6Vw7ATC7175xWCElt4=");
            int var3 = -2085654725;

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
            String var9 = Xqedii_1mhp9vmtqdf9t.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_veauwzczeokw() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_27masabh68kdm() {
   }

   private static int Xqedii_1b92spo7soyf9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_tkowui831n6r(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
