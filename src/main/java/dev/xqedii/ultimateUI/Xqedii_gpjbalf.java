package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_gpjbalf {
   private static final ConcurrentHashMap<String, String> Xqedii_2xiu9zbr0b0y3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_9mnfpdb9m4kv = -1035332318;
   private static volatile int Xqedii_br5xvuotb1sw = -264367495;
   private static volatile int Xqedii_g535wydb49d6 = -989965196;
   private static volatile int Xqedii_2h1ngh8jz05ss = -198778487;
   private static volatile long Xqedii_2s9papds4rwdo = 6466355135644525055L;
   private static volatile long Xqedii_djapwch1hp0g = -8927990397305019454L;
   private static volatile long Xqedii_dq03xh9qazwh = -2905055770403315129L;
   private static volatile long Xqedii_13tv648dnisiw = -4376301133890261513L;

   public static int Xqedii_1zcyohn3xhxee(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_9mnfpdb9m4kv, var1);
   }

   public static int Xqedii_2k5u9ot112o1o(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_br5xvuotb1sw;
   }

   public static int Xqedii_1u3gzkmhi5o04(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_g535wydb49d6;
   }

   public static int Xqedii_xymrprjm9mn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2h1ngh8jz05ss, var1);
   }

   public static long Xqedii_jcapunh97ll4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2s9papds4rwdo, var2);
   }

   public static long Xqedii_3o0tuacfeljpb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_djapwch1hp0g;
   }

   public static long Xqedii_34k96npz4q7kw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_dq03xh9qazwh;
   }

   public static long Xqedii_3e8erh9ryf6f2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_13tv648dnisiw, var2);
   }

   public static String Xqedii_1oawjb6cvjj1p(String var0) {
      String var1 = Xqedii_2xiu9zbr0b0y3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+zNjrswLbtsafRwSidwCyI2WFgYeiC6XOrDCC5ntJGo=");
            int var3 = -1988464095;

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
            String var9 = Xqedii_2xiu9zbr0b0y3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_9nastkg8bs2o() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2g1wy6wzhzr9h() {
   }

   private static int Xqedii_1peudy8sjitpe(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_278qzzy1go5mv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
