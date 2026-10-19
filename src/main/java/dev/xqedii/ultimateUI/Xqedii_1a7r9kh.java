package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1a7r9kh {
   private static final ConcurrentHashMap<String, String> Xqedii_3ahji0815h54o = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3uaktanmq8y8j = -1570099021;
   private static volatile int Xqedii_2ykbgmmec8cxq = 1476566502;
   private static volatile int Xqedii_5m3qzz0jjiyy = -954380654;
   private static volatile int Xqedii_8fmoejegeh10 = 1445858977;
   private static volatile long Xqedii_bu5lzoi39ooz = 2734169783617143309L;
   private static volatile long Xqedii_11bvko6ec5ngd = 7747387980141469859L;
   private static volatile long Xqedii_26d8sgyzytw8z = -5879889302355924372L;
   private static volatile long Xqedii_2s6fh1rtgbxzw = -4985911351281378563L;

   public static int Xqedii_3nedfwon4tshv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3uaktanmq8y8j, var1);
   }

   public static int Xqedii_n6cutfbq1w6c(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ykbgmmec8cxq;
   }

   public static int Xqedii_15cy0mt3n0j33(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_5m3qzz0jjiyy;
   }

   public static int Xqedii_2y15ksucdarif(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_8fmoejegeh10, var1);
   }

   public static long Xqedii_1xc84t8q9qiea(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_bu5lzoi39ooz, var2);
   }

   public static long Xqedii_3q0agubcotdpb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_11bvko6ec5ngd;
   }

   public static long Xqedii_1wrdjxdxogkeh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_26d8sgyzytw8z;
   }

   public static long Xqedii_37iyps8ldqui5(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2s6fh1rtgbxzw, var2);
   }

   public static String Xqedii_10edz8ivl5zbg(String var0) {
      String var1 = Xqedii_3ahji0815h54o.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JymdemQ7i5+yZ0mWBM6VmdBABtlHh2gFOgevp6boobc=");
            int var3 = 792934518;

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
            String var9 = Xqedii_3ahji0815h54o.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_317rvi0hd6g0p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1n73h0mu3b2h7() {
   }

   private static int Xqedii_2boxocvd8cgp6(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_d3fhpw0qbdmv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
