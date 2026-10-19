package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vnt7ty {
   private static final ConcurrentHashMap<String, String> Xqedii_2smm3eevk0svq = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3eme4ijupor8w = 1255151237;
   private static volatile int Xqedii_1rl8wi5owwlo7 = 1956203358;
   private static volatile int Xqedii_1vpefwh1e364u = -898865293;
   private static volatile int Xqedii_1wgx8fddkhuz3 = -1221943460;
   private static volatile long Xqedii_3yggwbm5ip0q = -3253870164073971372L;
   private static volatile long Xqedii_2jk0dd549tnrz = 6428131037958169809L;
   private static volatile long Xqedii_3l3s53bbth8tr = -509599751410882479L;
   private static volatile long Xqedii_19piti6qoqqxg = -3520453804985891355L;

   public static int Xqedii_2lxhpelzhkkhp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3eme4ijupor8w, var1);
   }

   public static int Xqedii_2s9apjgnq2ifa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1rl8wi5owwlo7;
   }

   public static int Xqedii_3arhnoznnak6s(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1vpefwh1e364u;
   }

   public static int Xqedii_oqtqupt08ak5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1wgx8fddkhuz3, var1);
   }

   public static long Xqedii_13gwbz29c38ip(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3yggwbm5ip0q, var2);
   }

   public static long Xqedii_1lxgnzillacm4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2jk0dd549tnrz;
   }

   public static long Xqedii_3aak23l8rw2kx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3l3s53bbth8tr;
   }

   public static long Xqedii_3lgkr7t1ru4tz(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_19piti6qoqqxg, var2);
   }

   public static String Xqedii_13v5apgvaykhp(String var0) {
      String var1 = Xqedii_2smm3eevk0svq.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("t71kMGVMasdjEOpMSEetHOPeDrVzpTsR9urYqhz1XlE=");
            int var3 = 1440957046;

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
            String var9 = Xqedii_2smm3eevk0svq.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_pnxrbpho8yj5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_7e2eu4xj4v8f() {
   }

   private static int Xqedii_us4qyqw5ula2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1msjefadq9p8o(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
