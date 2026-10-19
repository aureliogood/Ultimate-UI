package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ktetqb {
   private static final ConcurrentHashMap<String, String> Xqedii_2pyd5koeo55k0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1l1784u4sorvk = -362739499;
   private static volatile int Xqedii_l1oxueh7alny = 692506678;
   private static volatile int Xqedii_1y9fo9u5ab8xj = -1365515202;
   private static volatile int Xqedii_3psodzbzpq4ku = -1731007314;
   private static volatile long Xqedii_206j9isik2t8 = 3037762892234620234L;
   private static volatile long Xqedii_2utcxll74m4hs = 6082552062278301135L;
   private static volatile long Xqedii_148zi2mae198t = 3642511807963172145L;
   private static volatile long Xqedii_2c3wv4l5f1ypx = -6676539260649951785L;

   public static int Xqedii_f9mstm2kr9uu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1l1784u4sorvk, var1);
   }

   public static int Xqedii_wrlpfeh7jlr6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_l1oxueh7alny;
   }

   public static int Xqedii_3fmvcal9jhrh2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1y9fo9u5ab8xj;
   }

   public static int Xqedii_fqro98j37s23(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3psodzbzpq4ku, var1);
   }

   public static long Xqedii_1egowoiikra4l(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_206j9isik2t8, var2);
   }

   public static long Xqedii_4ys2x4ltjf3(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2utcxll74m4hs;
   }

   public static long Xqedii_20vjv3kbdneg3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_148zi2mae198t;
   }

   public static long Xqedii_224hfom97gdrm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2c3wv4l5f1ypx, var2);
   }

   public static String Xqedii_3ezjedrjwaeeb(String var0) {
      String var1 = Xqedii_2pyd5koeo55k0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2Me+P4p6hvpXI9InflQsCRG3mbUbGYWZOwuSMOCcV+U=");
            int var3 = 1862223181;

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
            String var9 = Xqedii_2pyd5koeo55k0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_49hg357l58fv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_w8n9mpie88b1() {
   }

   private static int Xqedii_2r242qbq5z8fb(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3r86210hfasuq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
