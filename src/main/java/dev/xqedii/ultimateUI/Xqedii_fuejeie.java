package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_fuejeie {
   private static final ConcurrentHashMap<String, String> Xqedii_18rdg4fjf5y4j = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1otavrxiii7aw = -1915424989;
   private static volatile int Xqedii_2mmrgjmvlpble = 10350208;
   private static volatile int Xqedii_2jrzvcjyfwtbg = 1308618903;
   private static volatile int Xqedii_3m4yooc8seyzn = 2095512237;
   private static volatile long Xqedii_2o9bpgc18iaqb = -4580185880777588565L;
   private static volatile long Xqedii_3b6ekoke681x1 = 5346738945268211141L;
   private static volatile long Xqedii_39vxv5m8cybio = -1016105374016889447L;
   private static volatile long Xqedii_3aj757p8fejit = 4761480853234109385L;

   public static int Xqedii_2ub5agghdrhdy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1otavrxiii7aw, var1);
   }

   public static int Xqedii_33vhllcc55hyh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2mmrgjmvlpble;
   }

   public static int Xqedii_paca3100m4sa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2jrzvcjyfwtbg;
   }

   public static int Xqedii_algiw82j2kpb(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3m4yooc8seyzn, var1);
   }

   public static long Xqedii_3dh04ag00paa6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2o9bpgc18iaqb, var2);
   }

   public static long Xqedii_3s7ouzyjay0oz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3b6ekoke681x1;
   }

   public static long Xqedii_1jn02qh6epnyh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39vxv5m8cybio;
   }

   public static long Xqedii_3hrf46mp5qy3p(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3aj757p8fejit, var2);
   }

   public static String Xqedii_2zsf30sklkb9f(String var0) {
      String var1 = Xqedii_18rdg4fjf5y4j.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("UIj/rq2lILyptr+a5XL0sM+kiscJmnJCYwzftNqG6RY=");
            int var3 = -1819643181;

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
            String var9 = Xqedii_18rdg4fjf5y4j.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1cwrwqbse0hpn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2imfqqqy5vph3() {
   }

   private static int Xqedii_1v1nh7h4dp28d(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1mvzetllhfo65(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
