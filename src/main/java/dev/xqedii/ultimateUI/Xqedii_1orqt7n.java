package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1orqt7n {
   private static final ConcurrentHashMap<String, String> Xqedii_3fyqjsvnq5m5p = new ConcurrentHashMap<>();
   private static volatile int Xqedii_buvu5zzm3rxl = -790529981;
   private static volatile int Xqedii_1d54ufly8gryo = -91137292;
   private static volatile int Xqedii_3e7rosigrr8j9 = -2066490415;
   private static volatile int Xqedii_3mslfxv0k5box = 931942661;
   private static volatile long Xqedii_11hp0a0x67thq = 7364491361518123133L;
   private static volatile long Xqedii_j3y889j6t884 = -125617713765871991L;
   private static volatile long Xqedii_3j85p9k9m3a9k = 4531307919864402334L;
   private static volatile long Xqedii_2e9g0r8mix9sm = -2318219962834893868L;

   public static int Xqedii_11pz5x0f8rnck(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_buvu5zzm3rxl, var1);
   }

   public static int Xqedii_1bzrknuqoni3p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1d54ufly8gryo;
   }

   public static int Xqedii_1c13z6xgnk4hb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3e7rosigrr8j9;
   }

   public static int Xqedii_3ns545cu9s93f(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3mslfxv0k5box, var1);
   }

   public static long Xqedii_231mv7qno0ds1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_11hp0a0x67thq, var2);
   }

   public static long Xqedii_3bp4myonr867u(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_j3y889j6t884;
   }

   public static long Xqedii_330f2ipw2w8d9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3j85p9k9m3a9k;
   }

   public static long Xqedii_2w4ep0su6oda8(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2e9g0r8mix9sm, var2);
   }

   public static String Xqedii_22qj1ag3xo9rr(String var0) {
      String var1 = Xqedii_3fyqjsvnq5m5p.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hXdlgsIOfRIoUs0jVkAjuZYOOs+LlOka8zbn56atr+I=");
            int var3 = -283728046;

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
            String var9 = Xqedii_3fyqjsvnq5m5p.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_140ort7y431fu() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_34zlc9xub2vrm() {
   }

   private static int Xqedii_1dfa6l0x0ep1y(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3no0rfshvgp5k(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
