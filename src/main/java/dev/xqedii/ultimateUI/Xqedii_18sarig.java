package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_18sarig {
   private static final ConcurrentHashMap<String, String> Xqedii_s3wb90hsro9a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3h7tl7e47khlm = -481518174;
   private static volatile int Xqedii_2a5ko2jf31msf = -1107469870;
   private static volatile int Xqedii_1n8n2r2g6hqi4 = -2078395131;
   private static volatile int Xqedii_numlpffohzy7 = 1222311980;
   private static volatile long Xqedii_2vtapujzi06zj = -8223321447639593834L;
   private static volatile long Xqedii_19j3r8b1cg975 = -4789040975581221444L;
   private static volatile long Xqedii_2hk7et346tvax = -1207234756130920016L;
   private static volatile long Xqedii_3jo4zjspykxsr = 7022751223427341390L;

   public static int Xqedii_30djgkjhttsyc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3h7tl7e47khlm, var1);
   }

   public static int Xqedii_34cfigl5xo9nj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2a5ko2jf31msf;
   }

   public static int Xqedii_1uw03klf5x4kr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1n8n2r2g6hqi4;
   }

   public static int Xqedii_3rq15eb56u26k(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_numlpffohzy7, var1);
   }

   public static long Xqedii_3op3nem7eq3yf(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2vtapujzi06zj, var2);
   }

   public static long Xqedii_1f4pa8y5vk366(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_19j3r8b1cg975;
   }

   public static long Xqedii_d0htj1kjtjop(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2hk7et346tvax;
   }

   public static long Xqedii_2b4q36kt6cbl2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3jo4zjspykxsr, var2);
   }

   public static String Xqedii_2iz3oxngvq2h2(String var0) {
      String var1 = Xqedii_s3wb90hsro9a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6YgvnQbUqRnP/pL0lb7ALMB6HrpEY2/U/4BlFIoFVzo=");
            int var3 = 647093216;

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
            String var9 = Xqedii_s3wb90hsro9a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2a74edek9ppvg() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3a0kz1azreo8v() {
   }

   private static int Xqedii_gibmxqieucaf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_rr4twavu20d0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
