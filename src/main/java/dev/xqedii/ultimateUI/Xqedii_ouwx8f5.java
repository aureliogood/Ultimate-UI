package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ouwx8f5 {
   private static final ConcurrentHashMap<String, String> Xqedii_irvg91s80ps5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_263yn53zaws8c = -142209045;
   private static volatile int Xqedii_1if6rknbzkkbm = -1991814913;
   private static volatile int Xqedii_nyjowt6onup2 = 1942608728;
   private static volatile int Xqedii_15iq6jps81mdr = 1271776043;
   private static volatile long Xqedii_327v8yjs9ilht = -4748379017883594939L;
   private static volatile long Xqedii_3sw1ojw07dry9 = -1797100400222758575L;
   private static volatile long Xqedii_e6yogzqrl2ge = -1131731753357732975L;
   private static volatile long Xqedii_276p5vb17r9mx = 3839904848290556014L;

   public static int Xqedii_2np1wsv6gxd1o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_263yn53zaws8c, var1);
   }

   public static int Xqedii_32n4keekqtife(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1if6rknbzkkbm;
   }

   public static int Xqedii_138atkd0h4hyy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_nyjowt6onup2;
   }

   public static int Xqedii_23j885uh1cxoh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_15iq6jps81mdr, var1);
   }

   public static long Xqedii_19a977yqnchj1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_327v8yjs9ilht, var2);
   }

   public static long Xqedii_1om4g3di5fpnq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3sw1ojw07dry9;
   }

   public static long Xqedii_e9h1dp1ak4cm(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_e6yogzqrl2ge;
   }

   public static long Xqedii_354zf2vja7u6o(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_276p5vb17r9mx, var2);
   }

   public static String Xqedii_1tl3q7b0fdd4c(String var0) {
      String var1 = Xqedii_irvg91s80ps5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("2jrcH/LUc9hiNGF7bZpx35etLDEJ8p7wKjtC4/YPDhQ=");
            int var3 = -606781439;

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
            String var9 = Xqedii_irvg91s80ps5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3e4udlirhxcmv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_35q8i94v47veg() {
   }

   private static int Xqedii_284zv5b9ipc6i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_p0ixz10ryd8e(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
