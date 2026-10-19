package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2qvptst {
   private static final ConcurrentHashMap<String, String> Xqedii_1mgn8mlwalfqb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3cwqvtj1auzwc = 677120591;
   private static volatile int Xqedii_2vc0urxx4j7ao = 1112094060;
   private static volatile int Xqedii_l84kf29vuom8 = -614801189;
   private static volatile int Xqedii_341brksl14xvp = -105094379;
   private static volatile long Xqedii_1vanyaczjpadh = 1886398192266249884L;
   private static volatile long Xqedii_10fwixjt2kc91 = 1245954251250474385L;
   private static volatile long Xqedii_3gb8u6ajubs35 = 1135836521589218589L;
   private static volatile long Xqedii_dfskxq3cxcy3 = 2624023261882443596L;

   public static int Xqedii_3s49rkz5m1nld(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3cwqvtj1auzwc, var1);
   }

   public static int Xqedii_251sim8g0fdx2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2vc0urxx4j7ao;
   }

   public static int Xqedii_17it5mmdiuw7n(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_l84kf29vuom8;
   }

   public static int Xqedii_m7telh51slgq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_341brksl14xvp, var1);
   }

   public static long Xqedii_13cyz7sstsojy(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1vanyaczjpadh, var2);
   }

   public static long Xqedii_3qspvngduo05a(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_10fwixjt2kc91;
   }

   public static long Xqedii_n5hzjurp4vw6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3gb8u6ajubs35;
   }

   public static long Xqedii_22dv8bdhtkzv2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_dfskxq3cxcy3, var2);
   }

   public static String Xqedii_1zvobs0jc9dfg(String var0) {
      String var1 = Xqedii_1mgn8mlwalfqb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HDU1HLletNLnX/UshM4OHW3HLw7OWIl7ukDcWJiuFcI=");
            int var3 = 947000763;

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
            String var9 = Xqedii_1mgn8mlwalfqb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_kp7gho4uiwc5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_18y45c436nj7l() {
   }

   private static int Xqedii_16kpocgspx08v(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tzgvskyjd1kc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
