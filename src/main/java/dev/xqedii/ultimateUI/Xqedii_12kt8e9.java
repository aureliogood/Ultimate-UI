package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_12kt8e9 {
   private static final ConcurrentHashMap<String, String> Xqedii_11rv4ns9vv0sb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3t0whkxgbl1n6 = 301762184;
   private static volatile int Xqedii_dkahdeqeo3i0 = 1849285504;
   private static volatile int Xqedii_3d5m92wlh2w86 = 897467088;
   private static volatile int Xqedii_196dlg2b3hfep = -640811585;
   private static volatile long Xqedii_1mqhle8v9odaw = -3165293314162590349L;
   private static volatile long Xqedii_213dvsicmqjex = -4937296048853627705L;
   private static volatile long Xqedii_3tbf1ziz7sza8 = 4873389950918876245L;
   private static volatile long Xqedii_w86e2o745ol0 = -2009961637684249780L;

   public static int Xqedii_21c2oznsvrz3o(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3t0whkxgbl1n6, var1);
   }

   public static int Xqedii_18g2hmg92k3tb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_dkahdeqeo3i0;
   }

   public static int Xqedii_28nnyi02wo2gk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3d5m92wlh2w86;
   }

   public static int Xqedii_17rzkqp835gtm(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_196dlg2b3hfep, var1);
   }

   public static long Xqedii_3vecv5dehy63h(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1mqhle8v9odaw, var2);
   }

   public static long Xqedii_115ikx1jktv3g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_213dvsicmqjex;
   }

   public static long Xqedii_p8l2lhil3d4j(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3tbf1ziz7sza8;
   }

   public static long Xqedii_39xg758cbttv0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_w86e2o745ol0, var2);
   }

   public static String Xqedii_134pe7scu5i1t(String var0) {
      String var1 = Xqedii_11rv4ns9vv0sb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("tNtKGaOmr9K/thuce6g4/9lDBkYpGrdDrdcvLYfVMII=");
            int var3 = -1370896106;

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
            String var9 = Xqedii_11rv4ns9vv0sb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_36alsn1eay7jv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1pynb8ul5w5md() {
   }

   private static int Xqedii_2dz68mavu8ut9(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_34fiwgj6o2oul(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
