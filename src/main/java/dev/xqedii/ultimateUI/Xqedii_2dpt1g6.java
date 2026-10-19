package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2dpt1g6 {
   private static final ConcurrentHashMap<String, String> Xqedii_16yms3clyixjy = new ConcurrentHashMap<>();
   private static volatile int Xqedii_p5rmp3u1alxn = 939750120;
   private static volatile int Xqedii_1ch4er4eyte38 = 1958199625;
   private static volatile int Xqedii_3ifii1cw7p4vn = -720153749;
   private static volatile int Xqedii_23smudfkbfrx9 = 48994955;
   private static volatile long Xqedii_hc3452uuik6x = 8742899381314326157L;
   private static volatile long Xqedii_3d84bzxt42830 = 5078292468778439931L;
   private static volatile long Xqedii_2asjoddexyivf = 223769760556144475L;
   private static volatile long Xqedii_6illz4l8lyrn = 9149218274510808063L;

   public static int Xqedii_17usjtnasnsl1(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_p5rmp3u1alxn, var1);
   }

   public static int Xqedii_2pzgpgg3m8ipm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ch4er4eyte38;
   }

   public static int Xqedii_1rbreklz7qid4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3ifii1cw7p4vn;
   }

   public static int Xqedii_2asg3plwldyo(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_23smudfkbfrx9, var1);
   }

   public static long Xqedii_2y7lu0mju288d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_hc3452uuik6x, var2);
   }

   public static long Xqedii_1axdf1ip9274k(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3d84bzxt42830;
   }

   public static long Xqedii_2d5y922il2r3f(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2asjoddexyivf;
   }

   public static long Xqedii_3ou30bk8bmbvc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_6illz4l8lyrn, var2);
   }

   public static String Xqedii_38uxc0ptaj1v2(String var0) {
      String var1 = Xqedii_16yms3clyixjy.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("9lfDFM73eNOZnaohv3vZ3Hc2VJDni2pj+F7kiB/u67I=");
            int var3 = 1256914049;

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
            String var9 = Xqedii_16yms3clyixjy.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1yv702qto8ayp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_16kao0vtj65ov() {
   }

   private static int Xqedii_1nizgcpzsdr5z(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2d1ukis1ps0ol(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
