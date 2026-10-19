package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1hxci1i {
   private static final ConcurrentHashMap<String, String> Xqedii_37tfie17tl2ns = new ConcurrentHashMap<>();
   private static volatile int Xqedii_146c8jhdq40kk = 923574121;
   private static volatile int Xqedii_3sgx5z1xsqqat = -1192311846;
   private static volatile int Xqedii_38rlhexm4sgke = 618699927;
   private static volatile int Xqedii_1niqe52t2ln8g = -1821192590;
   private static volatile long Xqedii_1ltylshtec3b8 = -2721300392872489198L;
   private static volatile long Xqedii_2ixrmg7uc69n4 = -5680133314421219622L;
   private static volatile long Xqedii_2dlnw3i16zbdi = -7403398946365747017L;
   private static volatile long Xqedii_e5vfhseo4zfx = 5573035348713048400L;

   public static int Xqedii_17w1sac0f8eur(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_146c8jhdq40kk, var1);
   }

   public static int Xqedii_3sxumdwfb5qpz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3sgx5z1xsqqat;
   }

   public static int Xqedii_nsnj660oyo7u(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_38rlhexm4sgke;
   }

   public static int Xqedii_1jpxntclf4bv8(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1niqe52t2ln8g, var1);
   }

   public static long Xqedii_3n5xnl192v9yu(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ltylshtec3b8, var2);
   }

   public static long Xqedii_ni38fzvlhqc3(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ixrmg7uc69n4;
   }

   public static long Xqedii_qd8q8zgeok1c(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2dlnw3i16zbdi;
   }

   public static long Xqedii_2r0o9fibdx8mg(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_e5vfhseo4zfx, var2);
   }

   public static String Xqedii_2cprjahvxz1ug(String var0) {
      String var1 = Xqedii_37tfie17tl2ns.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("eO68ib+nbrV3Qxka/VdTGD4m4EGAKlz+P2hnwdQDxJc=");
            int var3 = 1131443;

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
            String var9 = Xqedii_37tfie17tl2ns.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_29repe0jmbfm7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_10edruoep2sd7() {
   }

   private static int Xqedii_2bvok7kse0nxt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_tnai0cfa4391(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
