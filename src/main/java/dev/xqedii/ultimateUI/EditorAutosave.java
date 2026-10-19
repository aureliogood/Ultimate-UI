package dev.xqedii.ultimateUI;

public abstract class EditorAutosave extends PlayerSessions {
   public static final String Xqedii_1trbmfrczuofp = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public void scheduleEditorAutosaveTask() {
      if ((-389482100 * (-389482100 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.cancelEditorAutosaveTask();
         if (this.Xqedii_2k1vujp != null) {
            if (this.getConfig()
               .getBoolean(
                  Xqedii_occlz1p.Xqedii_3i4yt85ngcryy("dVrzBtG4kuFgDlTlbE68pkWGGb1hJXx9GvgrScsFm9/o9+khtLa1p7rJ8g6/IRIQCvuZ2ZIalHk2LgzjluRzMqcRjB/ZcfoNqYE="),
                  (Xqedii_occlz1p.Xqedii_37rvufq3ldvgw(1040988952, 18) != 0)
               )) {
               long var1 = this.resolveAutosaveIntervalTicks();
               this.Xqedii_1fzr9sp = Xqedii_38o2zes.Xqedii_uplb4zf(this, var1, var1, () -> {
                  if ((-1970683601 ^ -1970683601) != 0) {
                     throw new IllegalStateException();
                  } else {
                     try {
                        this.Xqedii_2k1vujp.runEditorAutosave();
                     } catch (Throwable var2) {
                        this.getLogger().warning(Xqedii_itnzm9extu1a(var2.getMessage()));
                     }
                  }
               });
            }
         }
      }
   }

   public void cancelEditorAutosaveTask() {
      if (((-628734468 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         if (this.Xqedii_1fzr9sp != null) {
            this.Xqedii_1fzr9sp.cancel();
            this.Xqedii_1fzr9sp = null;
         }
      }
   }

   public long resolveAutosaveIntervalTicks() {
      if (((450276117 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         long var1 = Math.max(
            Xqedii_occlz1p.Xqedii_273uubk89xhns(-1175045628869740605L, 11),
            this.getConfig()
               .getLong(
                  Xqedii_occlz1p.Xqedii_3i4yt85ngcryy(
                     "ga1ikD8tPzFl92ifKubnwK5bGnAJ31+87i4SMSfzdItSgT827NHt7pBQ4lB+woEof4nf5ygTAZtGCyy5fZ4FxBWIPd07+RHEssTj+t16JJesOC5tULmsWyQ5290="
                  ),
                  Xqedii_occlz1p.Xqedii_1pi3ma8wqaory(-7097463197158047465L, 41)
               )
         );
         return Math.max(Xqedii_occlz1p.Xqedii_1pi3ma8wqaory(4252978763672388143L, 42), var1 * Xqedii_occlz1p.Xqedii_1pi3ma8wqaory(9150330481336831699L, 9));
      }
   }

   private static /* synthetic */ String Xqedii_itnzm9extu1a(String string) {
        return Xqedii_occlz1p.Xqedii_3i4yt85ngcryy("jLn8GTwJ9jmx+CqPtX4iNINaBTUXvQTT+lB3GR7E/CXuTNfZiRyRX4EnzjhAUIE9232iOylfD66MX4A9OESJc5NNzuZUdHQrhWtY8mOiJn5SBDMUOll/EwDckBTnIg/vsQNK4SEbSmocOjoWbjc9xA==") + string;
    }
}
