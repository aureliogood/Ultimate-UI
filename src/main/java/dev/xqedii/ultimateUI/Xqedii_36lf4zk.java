package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_36lf4zk {
   private static final ConcurrentHashMap<String, String> Xqedii_2ywbpp47riq7x = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2khvbrn2rv9rb = 1839949175;
   private static volatile int Xqedii_1i3j7xsci2d8s = -1722100486;
   private static volatile int Xqedii_2g5lpp09uwmr9 = 383029341;
   private static volatile int Xqedii_3rd1bdyiban8s = -323366199;
   private static volatile long Xqedii_7o5cdcq93grr = -9008287039899097441L;
   private static volatile long Xqedii_jb1noe84ak6x = -3849176334799271590L;
   private static volatile long Xqedii_34bhxxeda3h71 = 7928663490947945913L;
   private static volatile long Xqedii_3vr37aurmgt30 = -3807787473366234306L;

   public static int Xqedii_2kxc1djl7qabk(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2khvbrn2rv9rb, var1);
   }

   public static int Xqedii_179y1heb0r3ht(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1i3j7xsci2d8s;
   }

   public static int Xqedii_q80ns1ua80cg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2g5lpp09uwmr9;
   }

   public static int Xqedii_1q3fwjr6cxh6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3rd1bdyiban8s, var1);
   }

   public static long Xqedii_2n7u3922o9kzz(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_7o5cdcq93grr, var2);
   }

   public static long Xqedii_f6bpnwdrx4p8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_jb1noe84ak6x;
   }

   public static long Xqedii_gry5iidk45s1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_34bhxxeda3h71;
   }

   public static long Xqedii_2a5emubfyf004(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3vr37aurmgt30, var2);
   }

   public static String Xqedii_3ei7defas199(String var0) {
      String var1 = Xqedii_2ywbpp47riq7x.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("rAILb45YDJ7b2kEEeVLJ0xG3Aum+KVXLTtiyvS9b0Y0=");
            int var3 = -272351646;

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
            String var9 = Xqedii_2ywbpp47riq7x.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3e38f618l4rw4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_gw6kl7vtr7al() {
   }

   private static int Xqedii_1964wo41cqbx2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3lz1z8397blue(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
