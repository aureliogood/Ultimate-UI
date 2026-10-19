package dev.xqedii.ultimateUI;

import java.lang.runtime.ObjectMethods;
import org.bukkit.configuration.ConfigurationSection;

public record Xqedii_2r2mv4l(boolean enabled, int updateTicks) {
   public static final String Xqedii_3g2ipw7nwdykr = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public static final Xqedii_2r2mv4l DISABLED;
   public static final Xqedii_2r2mv4l EDITOR;

   public static Xqedii_2r2mv4l editor(boolean var0) {
      if ((760451657 ^ 760451657) != 0) {
         throw new IllegalStateException();
      } else {
         return var0 ? EDITOR : DISABLED;
      }
   }

   public static Xqedii_2r2mv4l read(ConfigurationSection var0) {
      if ((-2004692693 ^ -2004692693) != 0) {
         throw new IllegalStateException();
      } else if (var0 == null) {
         return DISABLED;
      } else {
         ConfigurationSection var1 = var0.getConfigurationSection(
            Xqedii_k3rk7q2.Xqedii_3qg51vyv601bi("CUQ4KYhna4OB1Cujt+jE1khdxpFx5zkaYjFuRgIkxoInTXEFX+XwXcZ7KyZKibq26ABmuQ4dAvEN+z988GE=")
         );
         if (var1 != null) {
            int var2 = Xqedii_30g0ulj.Xqedii_2o877gp(
               var1.getInt(
                  Xqedii_k3rk7q2.Xqedii_3qg51vyv601bi("PYRAxnZX7nZfci3eJCr7vbOmh9d6nvGXBo/VdXNrIIa/xA3sqpnD3Q=="),
                  Xqedii_k3rk7q2.Xqedii_3iyee3v0uy4og(-2022613928, 2)
               )
            );
            return new Xqedii_2r2mv4l(
               var1.getBoolean(
                  Xqedii_k3rk7q2.Xqedii_3qg51vyv601bi("O9fbXcG0aMf/arIdrJKEJD8abmxzXsN49eTr3E6i/yzHje8tlzu25RNk"),
                  (Xqedii_k3rk7q2.Xqedii_3bftlb98tzkne(-665785692, 20) != 0)
               ),
               var2
            );
         } else {
            return var0.getBoolean(
                  Xqedii_k3rk7q2.Xqedii_3qg51vyv601bi("CUQ4KYhna4OB1Cujt+jE1khdxpFx5zkaYjFuRgIkxoInTXEFX+XwXcZ7KyZKibq26ABmuQ4dAvEN+z988GE="),
                  (Xqedii_k3rk7q2.Xqedii_19uqrlw7l2xtz(1092314126, 25) != 0)
               )
               ? new Xqedii_2r2mv4l((Xqedii_k3rk7q2.Xqedii_1t7yqc31m5xvn(87490584, 30) != 0), Xqedii_k3rk7q2.Xqedii_19uqrlw7l2xtz(239147876, 17))
               : DISABLED;
         }
      }
   }

   @Override

   public int updateTicks() {
      if ((-1720456912 * -1720456912 + -1720456912 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.updateTicks;
      }
   }

   static {
      if ((1927665212 * (1927665212 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         DISABLED = new Xqedii_2r2mv4l((Xqedii_k3rk7q2.Xqedii_3bftlb98tzkne(650250069, 15) != 0), Xqedii_k3rk7q2.Xqedii_19uqrlw7l2xtz(459542081, 1));
         EDITOR = new Xqedii_2r2mv4l((Xqedii_k3rk7q2.Xqedii_3bftlb98tzkne(1419446813, 9) != 0), Xqedii_k3rk7q2.Xqedii_19uqrlw7l2xtz(-1237261295, 5));
      }
   }
}
