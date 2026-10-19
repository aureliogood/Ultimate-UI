package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_jzshcst {
   private static final ConcurrentHashMap<String, String> Xqedii_27lb32tly81d = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1kuvri60cbubf = -1084009253;
   private static volatile int Xqedii_15o2qqpancahu = 968226389;
   private static volatile int Xqedii_ds74lma0nes3 = -569718790;
   private static volatile int Xqedii_19wz7sf2ny9dy = 1004107226;
   private static volatile long Xqedii_11hc5mnwn2jks = 269935824792214055L;
   private static volatile long Xqedii_2ce6pfpim4nkd = -7748063067172408653L;
   private static volatile long Xqedii_sazbkncwvdm4 = 7315183737458630688L;
   private static volatile long Xqedii_3su1t1t5jpxhg = 1394370511862776100L;

   public static int Xqedii_266jr12ln8xoo(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1kuvri60cbubf, var1);
   }

   public static int Xqedii_3f76oc8ujmg3a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_15o2qqpancahu;
   }

   public static int Xqedii_3cwof896utse7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ds74lma0nes3;
   }

   public static int Xqedii_23sf0xzqoqny6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_19wz7sf2ny9dy, var1);
   }

   public static long Xqedii_3lp8u1azpmhpa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_11hc5mnwn2jks, var2);
   }

   public static long Xqedii_3gkfc7i6w6rom(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ce6pfpim4nkd;
   }

   public static long Xqedii_3g3o50bd5u1tf(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_sazbkncwvdm4;
   }

   public static long Xqedii_2xs85iagrpatu(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3su1t1t5jpxhg, var2);
   }

   public static String Xqedii_yxmngvv3prh8(String var0) {
      String var1 = Xqedii_27lb32tly81d.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("TC6TgIXMXpAG/Q62oeaNWVXxdtCnEzxYeQBx7m4KnIw=");
            int var3 = -570658197;

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
            String var9 = Xqedii_27lb32tly81d.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_em5alc820m15() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_24xj5vvau7hj6() {
   }

   private static int Xqedii_3kweebjqsmlse(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1m5se5tdizc07(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
