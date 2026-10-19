package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_17ncz4d {
   private static final ConcurrentHashMap<String, String> Xqedii_1zxz08flzdua = new ConcurrentHashMap<>();
   private static volatile int Xqedii_14bqpkufg005q = -546691728;
   private static volatile int Xqedii_3hznf27pc3w31 = 1017937490;
   private static volatile int Xqedii_2i7my4zmrkehu = -456588281;
   private static volatile int Xqedii_1yuqvne8uh16s = -514650536;
   private static volatile long Xqedii_3188tpptdktdl = 5576222344359898066L;
   private static volatile long Xqedii_9igkspqmpd03 = -7996564558482126411L;
   private static volatile long Xqedii_16sbarppzyinw = -3733606641445214855L;
   private static volatile long Xqedii_zp2qzkjkpn8s = 4582199190491611083L;

   public static int Xqedii_2ixprpdxl1ynm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_14bqpkufg005q, var1);
   }

   public static int Xqedii_324upauxco8oy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3hznf27pc3w31;
   }

   public static int Xqedii_1zsnvdi5cxwkh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2i7my4zmrkehu;
   }

   public static int Xqedii_182y2vfu6e3q0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1yuqvne8uh16s, var1);
   }

   public static long Xqedii_19mlsu8j77fz3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3188tpptdktdl, var2);
   }

   public static long Xqedii_29evl6xsmalfh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_9igkspqmpd03;
   }

   public static long Xqedii_x6de3zw73zgn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_16sbarppzyinw;
   }

   public static long Xqedii_4ed5gmhrdrxy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_zp2qzkjkpn8s, var2);
   }

   public static String Xqedii_snaj4e3nezvm(String var0) {
      String var1 = Xqedii_1zxz08flzdua.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OokyhVyIAmNDfXo9Kqt0q3CfW6BfZ9WZqFv14ZRJDvY=");
            int var3 = -1270115261;

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
            String var9 = Xqedii_1zxz08flzdua.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2qrot64qmkr8s() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_scegjyqob8bh() {
   }

   private static int Xqedii_3uawy383y9bwe(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tw6xiz4ic0xo(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
