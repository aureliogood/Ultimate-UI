package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_mc6ksnu {
   private static final ConcurrentHashMap<String, String> Xqedii_39fpoyvxgq0cm = new ConcurrentHashMap<>();
   private static volatile int Xqedii_dxs58x57lvg3 = 1817906916;
   private static volatile int Xqedii_2h7zdsnncehuf = -1527864072;
   private static volatile int Xqedii_1do1338k0deyy = 1620480586;
   private static volatile int Xqedii_28ujystqofyjm = 849811165;
   private static volatile long Xqedii_86q9iviei85s = -3194179784111243089L;
   private static volatile long Xqedii_1u60ynbty014c = -1521487986962580092L;
   private static volatile long Xqedii_q04l291jblgu = 5359338329764246659L;
   private static volatile long Xqedii_2dcn1qbv96pb = -5556070488933807967L;

   public static int Xqedii_1qge2eo6rs0k2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_dxs58x57lvg3, var1);
   }

   public static int Xqedii_21wqt5d2a4trs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2h7zdsnncehuf;
   }

   public static int Xqedii_28vlcpvam8hln(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1do1338k0deyy;
   }

   public static int Xqedii_1rentop525117(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_28ujystqofyjm, var1);
   }

   public static long Xqedii_8zn3nucybs35(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_86q9iviei85s, var2);
   }

   public static long Xqedii_m63gsundtknv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1u60ynbty014c;
   }

   public static long Xqedii_18y3lyqknid6z(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_q04l291jblgu;
   }

   public static long Xqedii_1zk9vp5csngoy(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2dcn1qbv96pb, var2);
   }

   public static String Xqedii_2mbafbsx9g9ag(String var0) {
      String var1 = Xqedii_39fpoyvxgq0cm.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/D2mMBiv+FkkVVCVHUo8VbNwM29KjPMxQHwkeHz6wqA=");
            int var3 = 1999074145;

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
            String var9 = Xqedii_39fpoyvxgq0cm.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_259c39wctk8id() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1dv1paij8j3oq() {
   }

   private static int Xqedii_b1sl0owmfp71(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_bx8tuvm2kssl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
