package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1ino5c0 {
   private static final ConcurrentHashMap<String, String> Xqedii_1nore5xxlzfkk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_25efb8s08098v = 1865797744;
   private static volatile int Xqedii_2tru917tmnid7 = -1048036479;
   private static volatile int Xqedii_1c3i6666d73hh = 770639321;
   private static volatile int Xqedii_qvqu1o3rglhu = 1532793509;
   private static volatile long Xqedii_3djrxmco3xy45 = 8254235334576840420L;
   private static volatile long Xqedii_2clv1nvcs5gx0 = 7925795030003529477L;
   private static volatile long Xqedii_1e8mfjuyoqcjw = 7686765917972399958L;
   private static volatile long Xqedii_1sf6x3vrmwnei = 2414436559913266013L;

   public static int Xqedii_dku2we86xfqb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_25efb8s08098v, var1);
   }

   public static int Xqedii_2ajizx00etb0b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2tru917tmnid7;
   }

   public static int Xqedii_2smplobxkxptv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1c3i6666d73hh;
   }

   public static int Xqedii_2w6fuvtdhtkdh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_qvqu1o3rglhu, var1);
   }

   public static long Xqedii_b4vefeokp070(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3djrxmco3xy45, var2);
   }

   public static long Xqedii_3p7j6na9w09z8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2clv1nvcs5gx0;
   }

   public static long Xqedii_2xgpnapbvtb1n(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1e8mfjuyoqcjw;
   }

   public static long Xqedii_7kpwicvro229(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1sf6x3vrmwnei, var2);
   }

   public static String Xqedii_2df1de1vt0vwb(String var0) {
      String var1 = Xqedii_1nore5xxlzfkk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6S2EVkp6zuUjbKnn+APZUt2KxNE2T3EoSvtfrPxSPrg=");
            int var3 = -969025479;

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
            String var9 = Xqedii_1nore5xxlzfkk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2n84iu0klf7k7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_otbbls15pbiz() {
   }

   private static int Xqedii_g65c1qm8wjhw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3vth2bro3m5yq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
