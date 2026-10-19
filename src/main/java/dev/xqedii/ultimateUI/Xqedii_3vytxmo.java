package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3vytxmo {
   private static final ConcurrentHashMap<String, String> Xqedii_aia48334gj2n = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2k1otibe53hku = -131097449;
   private static volatile int Xqedii_1m9d3i0z6mz0f = 1337382860;
   private static volatile int Xqedii_3kycalw5x4nud = -1027317937;
   private static volatile int Xqedii_rxw0jbzi0jou = 742918397;
   private static volatile long Xqedii_2nq09ls0olbo5 = -1006161357226668115L;
   private static volatile long Xqedii_190j1k9fp3432 = -7831245056676664682L;
   private static volatile long Xqedii_2yae9nylt4vop = -2615027367893986372L;
   private static volatile long Xqedii_2lkyfsv9m3pfy = -6578567238951145293L;

   public static int Xqedii_b1oztc41ds5o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2k1otibe53hku, var1);
   }

   public static int Xqedii_2o5jvy7o7d59l(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1m9d3i0z6mz0f;
   }

   public static int Xqedii_qoh5lomn3ea1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3kycalw5x4nud;
   }

   public static int Xqedii_3dhvcdyscx08i(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_rxw0jbzi0jou, var1);
   }

   public static long Xqedii_3nryw8vg0seoa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2nq09ls0olbo5, var2);
   }

   public static long Xqedii_tm6cpdwaz7wa(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_190j1k9fp3432;
   }

   public static long Xqedii_3q8lmwoygcpgu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2yae9nylt4vop;
   }

   public static long Xqedii_242zkmr6ewidk(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2lkyfsv9m3pfy, var2);
   }

   public static String Xqedii_3cvcix2fpj4g6(String var0) {
      String var1 = Xqedii_aia48334gj2n.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xRlAChlBUNZ7O2tunEvXUR0Zx3JhgN80fssgfBa8qpA=");
            int var3 = -1313362419;

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
            String var9 = Xqedii_aia48334gj2n.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2buqtjlgtdmna() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2q8zm3langfwr() {
   }

   private static int Xqedii_56zm2metpago(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3w1xaimvre61e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
